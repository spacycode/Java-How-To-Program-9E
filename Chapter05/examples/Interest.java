/*
 *       Filename:  Interest.java
 *
 *    Description:  5.6 - Compound interest calculations with for.
 *
 *        Created:  06/10/15 14:34:43
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class Interest{
    public static void main(String[] args){
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate

        System.out.printf("%s%20s\n", "YEAR", "Amount on deposit");

        for(int year=0; year<=10; year++){
            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f\n", year, amount);
        }
    }
}
