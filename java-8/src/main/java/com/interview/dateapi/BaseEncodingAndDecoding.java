package com.interview.dateapi;

import java.util.Base64;

public class BaseEncodingAndDecoding {
    public static void main(String[] args) {
        String encode = "chandu";
        String s = Base64.getEncoder().encodeToString(encode.getBytes());
        System.out.println(s);

        String decode = "Y2hhbmR1";
        String decodeString = new String(Base64.getDecoder().decode(decode));
        System.out.println(decodeString);
    }
}
