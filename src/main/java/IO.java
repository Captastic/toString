import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by anthonycapriotti on 3/15/17.
 */
public class IO extends Exception {
    Scanner scanner = new Scanner(System.in);

    public int input() {
        try {
            System.out.println("please enter a full dollar amount");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Not and integer, one more time please");
            scanner.nextLine();
        }
        return input();
    }

    public void output(String number) {
        System.out.println(number + " dollars ");

    }
}
