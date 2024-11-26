package org.example;

//შექმნით ახალი კლასი სახელად While და while ციკლით
//დაბეჭდეთ String -ში არსებული ყოველი მესამე სიმბოლო,
//ანუ 3 პოზიციაზე მდგომი, შემდეგ 6 მდგომი, შემდეგ 9
//მდგომი … თუ რომელიმე მესამე სიმბოლო იქნება პატარა z ასო, მაშინ ციკლი შეწყდეს

public class While {
    public static void main(String[] args) {

        String text = "Testing zone";
        int x = 2;

        while (x < text.length()) {
            char currentChar = text.charAt(x);
            if (currentChar == 'z')  break;

            System.out.println(currentChar);
            x += 3;
        }
    }
}
