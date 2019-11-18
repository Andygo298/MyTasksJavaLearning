package com.javalesson.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        byte b = 10;
        short c = 200;
        int a = b + 23;
        long myLongValue = 123_456_789_876_543_211_2L;

        float myFloatValue = 23.56f;
        double myDoubleValue = 56.45d;

        double sum = a + b + c + myLongValue + myFloatValue + myDoubleValue;
        System.out.println("sum = " + sum);

        float myFloatResult = myFloatValue / 3;
        System.out.println("myFloatResult =" + myFloatResult);

        double myNewDouble = 23.56;
        System.out.println("myDoubleResult =" + myNewDouble / 3);
        System.out.println("");

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';

        char char5 = '\u00B6';
        System.out.println("Characters");
        System.out.println("Char1 = " + char1);
        System.out.println("Char2 = " + char2);
        System.out.println("Char3 = " + char3);
        System.out.println("Char4 = " + char4);
        System.out.println("Char5 = " + char5);

        System.out.println("SUM of Characters");
        System.out.println("Chars " + char1 + char2 + char3 + char4 + char5);


        System.out.println("");
        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("int a = " + a);

        boolean b1 = true;
        boolean b2 = false;

        String s = "some string" + " some other string";
        System.out.println(s);

        short someShort = b;
        int someInt = someShort;

        someShort = (short) someInt;


        System.out.println("myLongValue =" + myLongValue);
        someInt = (int) myLongValue;
        System.out.println("someInt =" + someInt);

        double someIntToDouble = someInt;
        System.out.println("someIntToDouble =" + someIntToDouble);

        double someLongToDouble = myLongValue;
        System.out.println("someLongToDouble =" + someLongToDouble);

        long someDoubleToLong = (long) someLongToDouble;
        System.out.println("someDoubleToLong =" + someDoubleToLong);
    }
}
