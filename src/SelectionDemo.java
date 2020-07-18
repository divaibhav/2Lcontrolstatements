/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 18-Jul-20
 *  Time: 3:13 PM
 */
// 1. Accepting a Number from user and checking whether the number is greater then 50.

import java.util.Scanner;

public class SelectionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer value");
        int number = sc.nextInt();
        if (number > 50) {
            System.out.println("Number is greater than 50");
        }
        System.out.println("Thanks");
    }
}
