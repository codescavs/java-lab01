/* Simple asterisk bar char generation by taking
   user inputted integers governing the size of the bar.

   Author: Kayson Scavarelli */

import java.util.Scanner;

public class asteriskbarchart {
    public static void main(String[] args){
        int bar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five numbers between 1 and 30: \n");

        for (int i = 0; i < 5; i++){
            bar = input.nextInt();

            for (int j = 0; j < bar; j++)
                System.out.print('*');

            System.out.println();
        }
        System.out.println();
    }
}
