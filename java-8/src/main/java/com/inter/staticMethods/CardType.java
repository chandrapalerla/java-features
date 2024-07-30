package com.inter.staticMethods;

public interface CardType {

  static String cardTye(String bankName) {
    if (bankName.equalsIgnoreCase("SBI")) {
      return "Rupay card";
    } else if (bankName.equalsIgnoreCase("HDFC")) {
      return "Visa card";
    } else {
      return "card not eligible for the bank";
    }
  }

  void bankCard(String card);

}
