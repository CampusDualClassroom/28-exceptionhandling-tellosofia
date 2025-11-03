package com.campusdual.classroom;

public class Exercise {
    public static void main(String[] args) {
        String myString = "five";
        String myInt = "5";

        try {
            System.out.println(Integer.parseInt(myInt));
            System.out.println(Integer.parseInt(myString));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program successfully finished");
        }
    }
}
