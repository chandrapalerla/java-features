package org.unnamed.patterns.variables;

record Point(int x, int y) {
}

public class UnnamedPatternsExample {
    public static void main(String[] args) {
        Object obj = new Point(10, 20);

        if (obj instanceof Point(int x, int _)) {
            System.out.println("x: " + x);  // Only interested in 'x', ignoring 'y'
        }
    }
}

