package org.example;

public class Main {
    public static void main(String[] args) {
        // 4 ამოცანის გამოძახება

       /* checkNumber(5);
        checkNumber(-3);
        checkNumber(0);  */

        // 5 ამოცანის გამოძახება

        hasTeen(12, 15, 20); // True


       /* 1. Main კლასის main მეთოდში შექმენით მასივი რიცხვითი
        მნიშვნელობებით და თუ ამ მასივში არ არის ლუწი რიცხვი,
                მაშინ დაიბეჭდოს “მასივში არ არის ლუწი რიცხვი ”. თუ ამ
        მასივში არის ლუწი რიცხვი (მაგალითად 5 ლუწი რიცხვია)
        მაშინ დაბეჭდოს “ამ მასივში არის 5 ლუწი რიცხვი ”*/

        // While მეთოდი

               /* int[] numbers = {3, 7, 5, 12, 4};
                int count = 0;

                int i = 0;
                while (i < numbers.length) {
                    if (numbers[i] % 2 == 0) {
                        count++;
                    }
                    i++;
                }

                if (count == 0) {
                    System.out.println("მასივში არ არის ლუწი რიცხვი");
                } else {
                    System.out.println("ამ მასივში არის " + count + " ლუწი რიცხვი");
                }   */


        // For მეთოდი

        /*int[] numbers = {3, 7, 5, 12, 4};

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("მასივში არ არის ლუწი რიცხვი");
        } else {
            System.out.println("ამ მასივში არის " + count + " ლუწი რიცხვი");
        } */
    }


 // Main კლასში შექმენით void -იანი მეთოდი სახელად
//checkNumber, რომელიც პარამეტრად მიიღებს int ტიპის ცვლადს.
//მეთოდმა დაბეჭდოს “დადებითი” თუ დადებით რიცხვს გადავცემთ, დაბეჭდოს “უარყოფითი” თუ უარყოფით რიცხვს გადავცემთ და
//დაბეჭდოს “ნოლი” თუ 0 -ს გადავცემთ

        // 4 ამოცანის ტანი

        /*static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("დადებითი");
        } else if (number < 0) {
            System.out.println("უარყოფითი");
        } else {
            System.out.println("ნოლი");
        } */


        //   Main კლასსი შექმენით void -იანი მეთოდი სახელად hasTeen,
        //რომელიც პარამეტრად მიიღებს სამ ცალ int ტიპის ცვლადს.
        //მეთოდმა დაბეჭდოს “True” თუ რომელიმე პარამეტრი მაინც იქნება
        //მინიმუმ 13 და მაქსიმუმ 19. მეთოდმა დაბეჭდოს “False” თუ
        //არც ერთი პარამეტრი არ იქნება 13 - 19 დიაპაზონში

    static void hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }






}