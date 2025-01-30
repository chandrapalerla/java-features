package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int a[]  = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        //output:1 9 8 4 2 7 6 9 0 0 0 0

        int j=0;
        for(int i = 0; i<a.length; i++){

            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                j++;
            }

        }

        for (int a1 : a){
            System.out.println(a1);
        }
    }
}