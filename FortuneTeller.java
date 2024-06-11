import java.util.Scanner;

public class FortuneTeller {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10, inclusive");
        Scanner input = new Scanner(System.in);
        int inputtedNum = input.nextInt();

        while ( inputtedNum > 10 || inputtedNum < 0 ) {

            System.out.println("The number must be between 1 and 10, inclusive");
            input = new Scanner(System.in);
            inputtedNum = input.nextInt();
        }

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you happy today");
        }
    }

}
