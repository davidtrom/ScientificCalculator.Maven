package com.zipcodewilmington.scientificcalculator;

public class Arithmetic {

    //Once code is running as needed move "Console.println" to the "Intro" file
    public static Double addition (Double d, Double d2){
        Double output = d + d2;
        Console.println("\n" + output);
        return output;
    }

    public static Double subtraction (Double d, Double d2){
        Double output = d - d2;
        Console.println("\n" + output);
        return output;
    }

    public static Double division (Double d, Double d2) {
        Double output = d / d2;
        Console.println("\n" + output);
        return output;
    }

    public static Double multiplication (Double d, Double d2 ){
        Double output = d * d2;
        Console.println("\n" + output);
        return output;
    }
}
