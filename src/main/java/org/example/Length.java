package org.example;
// შექმენით Length კლასი და ამ კლასში შექმენით String ტიპის
//სტრიქონი. თუ არსებული სტრიქონის სიგრძე არის ლუწი დაწერეთ
//რომ ლუწია, თუ კენტია დაწერეთ რომ კენტია

public class Length {
    public static void main(String[] args) {

        String text = "Testing is intresting";
        int textLength = text.length();

        if (textLength % 2 == 0) {
            System.out.println("სტრიქონის სიგრძე არის ლუწი");
        } else {
            System.out.println("სტრიქონის სიგრძე არის კენტი");
        }
    }
}