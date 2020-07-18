/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 18-Jul-20
 *  Time: 3:25 PM
 */
//3. Accepting a number from user and checking if the number is greater
//than 5 and smaller then 50

import java.util.Scanner;

public class SelectionDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer value");
        int number = sc.nextInt();
        /*if(number < 6){
            System.out.println("thanks exiting");
        }
        else if(number < 50){
            System.out.println("given number is greater than 5 and smaller than 50");
        }*/

        if (number > 5 && check()) {
            System.out.println("given number is greater than 5 and smaller than 50");
        }
    }

    static boolean check() {
        System.out.println("ehello");
        return true;
    }
}
