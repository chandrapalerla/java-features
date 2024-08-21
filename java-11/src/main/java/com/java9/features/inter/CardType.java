package com.java9.features.inter;

//Adding private methods in interface
public interface CardType {

  static String cardTye(String bankName, String accountNumber) {
    if (bankName.equalsIgnoreCase("SBI")) {
      return getValidation(bankName, accountNumber);
    } else if (bankName.equalsIgnoreCase("HDFC")) {
      return getValidation(bankName, accountNumber);
    } else {
      return "card not eligible for the bank";
    }
  }

  private static String getValidation(String bankName, String accountNumber) {
    if (accountNumber.length() > 12) {
      validateBankName();
      return "valid account number with specific bank" + bankName;
    }
    return null;
  }

  private static String validateBankName() {
    return "valid bank";
  }

  void bankCard(String card);

  default void getMessage() {
    System.out.println("default methods");
  }

}
