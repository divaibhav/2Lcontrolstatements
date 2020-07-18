/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 18-Jul-20
 *  Time: 3:43 PM
 */
/*
Create an application "Guess Magical Number". This application ask the user
to guess the magical number by entering any Integer,
If the user guess it correctly he will win, and to exit the game he can enter 0.

 */

import java.util.Scanner;

public class SelectionDemoDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Our Game ");
        System.out.println("Guess Magical Number");
        int magicalNumber = 549;
        int guess;
        do {
            System.out.println("Guess a  Integer Number or Enter 0 to exit");
            guess = sc.nextInt();
            if (guess == magicalNumber) {
                System.out.println("Congratulation you win");
                break;
            }
        } while (guess != 0);
    }
}
