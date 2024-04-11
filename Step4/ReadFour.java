package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args) {
            try {
                Scanner fileIn = new Scanner(new File("Step4/input.txt"));

                while (fileIn.hasNext()) {
                    // Print out a running total of all the
                    // values in the input file.
                    String lineIn = fileIn.nextLine();
                    int sum = 0;
                    sum += Integer.parseInt(lineIn);
                    System.out.println(sum);
                }
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
}