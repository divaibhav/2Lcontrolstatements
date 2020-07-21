import java.util.Scanner;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 21-Jul-20
 *  Time: 4:21 PM
 */
//print table of given number
//output: 17 X 1 = 17
public class ForDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}
