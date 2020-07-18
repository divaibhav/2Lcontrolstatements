/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 18-Jul-20
 *  Time: 3:19 PM
 */
//2. Accepting age from user, and checking if user is eligible to vote

import java.util.Scanner;

public class SelectionDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age in Integer");
        int age = sc.nextInt();
        System.out.println("checking if you are eligible for voting....");
        if (age >= 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("not eligible to vote");
        }
    }
}
