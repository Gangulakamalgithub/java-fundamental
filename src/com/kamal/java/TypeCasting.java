package com.kamal.java;

public class TypeCasting {
    public static void main(String[] args) {
        byte age;
        age = 40;

        int ageValue;
        ageValue = (int)age;

        float value;
        value = 234556.23f;

        int intValue;
        intValue = (int)value;
        System.out.println("Value : " + intValue);

        ageValue = 130;
        age = (byte)ageValue;
        System.out.println("Age : " + age);


    }
}
