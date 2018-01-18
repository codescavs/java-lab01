/* Simple Java program to display the uses of
*  Scanner functionality with split, and delimiters
*  Author: Kayson Scavarelli */

import java.util.Scanner;
import java.util.regex.Pattern;

public class stringsplit {
    public static void main(String[] args) {
        System.out.println("Question 1 - Part 1");
        System.out.println("Enter the String: ");
        Scanner inputstring = new Scanner(System.in);
        String strinput = inputstring.nextLine();

        for (String splitstring: strinput.split(" ")) {
            System.out.println(splitstring);
        }

        System.out.println();

        inputstring.close();

        System.out.println("Question 1 - Part 2\n");

        System.out.println("Original String: There are fifty-five dogs in the garden.\n");
        System.out.println("String after custom delimiter through useDelimiter() => -\n");

        String input = "There are fifty-five dogs in the garden.";
        Scanner s = new Scanner(input).useDelimiter(Pattern.compile("-"));


        while(s.hasNext()) {
            System.out.println(s.next());
        }

        System.out.println();

        s.close();
    }
}
