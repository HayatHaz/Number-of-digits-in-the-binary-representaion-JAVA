/*
 *Hayat Alzhrani
 *Lab Graded Work
 */
package binary;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Positive Number: ");
        int n = input.nextInt();

        int cnt = 1;
        while (n > 1) {
            cnt++;
            n /= 2;
        }
        System.out.print("Number of digits in the binary representaion: " + cnt +"\n");

    }

}
