/*
 *       Filename:  OddEven.java
 *
 *    Description:  2.25 - Write an application that reads an integer and
 *                  detrmines and prints whether it's odd or even.
 *
 *        Created:  26/09/15 01:02:02
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Enter an integer: ");
        x = input.nextInt();

        if(x % 2 == 0){
            System.out.printf("%d is even\n", x);
        }else{
            System.out.printf("%d is odd\n", x);
        }
    }
}
