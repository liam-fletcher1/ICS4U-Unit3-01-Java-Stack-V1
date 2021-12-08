/*
 * The Mr.Coxall Stack Program
 *
 * @author  Liam Fletcher
 * @version 1.0
 * @since   2021-12-07
 */

// Import the Scanner class
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        try {

            System.out.println("Enter an integer to push onto the stack ");
            int numberChosen = userInput.nextInt();
            System.out.println();
            MrCoxallStack clasStack = new MrCoxallStack();
            clasStack.push(numberChosen);
            System.out.println("Pushed: " + clasStack.getNumber());

        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
