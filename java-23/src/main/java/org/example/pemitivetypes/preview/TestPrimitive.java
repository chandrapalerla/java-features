package org.example.pemitivetypes.preview;

public class TestPrimitive {
    public static void main(String[] args) {
        var obj = 10;
        if (obj instanceof Integer i) {
            System.out.println(i);
        }

        if (obj instanceof int i) {
            System.out.println(i);
        }

        switch (obj) {
            case Integer i -> System.out.println(i);
        }
    }
}
