package com.compleatable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

public class EmployeeService {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.printHiredEmployeesWithSalaries();
    }

    public CompletionStage<List<Employee>> hiredEmployees() {
        return CompletableFuture.supplyAsync(() -> List.of(
                new Employee(1, "mikel"),
                new Employee(2, "kevin"),
                new Employee(3, "smith")
        ));
    }

    public CompletionStage<Double> getSalary(int employeeId) {
        return CompletableFuture.supplyAsync(() -> switch (employeeId) {
            case 1 -> 505460.0;
            case 2 -> 600656.0;
            case 3 -> 7056567.0;
            default -> 0.0;
        });
    }

    public void printHiredEmployeesWithSalaries() {
        hiredEmployees().thenCompose(employees -> {
                    List<CompletionStage<Employee>> emCompletionStages = employees
                            .stream()
                            .map(employee -> getSalary(employee.getId())
                                    .thenApply(salary -> {
                                        employee.setSalary(salary);
                                        return employee;
                                    })).toList();
                    return CompletableFuture.allOf(emCompletionStages.toArray(new CompletableFuture[0]))
                            .thenApply(v -> emCompletionStages.stream()
                                    .map(CompletionStage::toCompletableFuture)
                                    .map(CompletableFuture::join)
                                    .collect(Collectors.toList())
                            );

                })
                .thenAccept(employees -> {
                    employees.forEach(e -> System.out.println(e.getName() + ": $" + e.getSalary()));
                });
    }
}
