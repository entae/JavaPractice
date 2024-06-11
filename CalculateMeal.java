import java.util.Scanner;

public class CalculateMeal {

    public static double calculateTotalMealPrice(double listedPrice, double tipRate, double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
    }

    public static double individualTotalMealCost(double totalGroupMealPrice) {
        System.out.println("Please input the number of people to divide equally by");
        Scanner input = new Scanner(System.in);
        double groupMembers = input.nextInt();

        return totalGroupMealPrice / groupMembers;
    }

    public static void main(String[] args) {
        System.out.println("Please input the total from all the items: ");
        Scanner input = new Scanner(System.in);
        double listedPrice = input.nextDouble();

        System.out.println("Please input the rate of tax: ");
        double taxRate = input.nextDouble();

        System.out.println("Please input the rate you want to tip");
        double tipRate = input.nextDouble();

        double result = calculateTotalMealPrice(listedPrice, tipRate, taxRate);
        System.out.println("Your total meal price is " + result);
    }
}
