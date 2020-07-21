/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 21-Jul-20
 *  Time: 4:07 PM
 */

/*
Create an application to print all the digits of a given number.
input : 12345
output: 5,4,3,2,1
 */

/*
WAP to print sum of all digits of a given number.

SumOfPowerOfDigits

 */

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        int reverse = 0;
        //loops
        while (number != 0) {
            int digit = number % 10;
            System.out.print(digit);
            System.out.print(", ");
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
