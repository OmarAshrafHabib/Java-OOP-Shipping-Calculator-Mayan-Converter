
/**
 * prompts the user for an arabic number and then prints 
 * out the equivalent number in Mayan numerals. 
 * @author Omar Habib ID:3742418
 */
import java.util.Scanner;
import java.lang.Math;

public class MayanNumerals {
    public static void main(String[] args) {
        System.out.print("Enter an Arabic number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input < 0) {
            System.out.println("Invalid input. You must enter a non-negative number.");
            System.out.print("Please enter another Arabic number now: ");
            input = sc.nextInt();
        }
        System.out.println("The Maya number for " + input + " is: ");
        int i = 0;
        while (input >= Math.pow(20, i)) {
            i++;
        }
        i--;
        while (i >= 0) {
            int quatiant = (int) (input / (Math.pow(20, i)));
            input = (int) (input % (Math.pow(20, i)));
            if (quatiant == 0) {
                System.out.print("U");
            }

            else if (quatiant == 1) {
                System.out.print("O");
            }

            else if ((quatiant > 1) && (quatiant < 5)) {
                while ((quatiant > 1) && (quatiant < 5)) {
                    System.out.print("O");
                    quatiant--;
                }
            }

            else if (quatiant == 5) {
                System.out.print("_");

            }

            else if (quatiant > 5) {
                int quatiant2 = quatiant / 5;
                int remainder2 = quatiant % 5;
                while (quatiant2 != 0) {
                    System.out.print("_");
                    quatiant2--;
                }
                while (remainder2 != 0) {
                    System.out.print("O");
                    remainder2--;
                }
            }
            i--;
            System.out.println();
        }
    }
}
