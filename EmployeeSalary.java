public class EmployeeSalary {

    public static double amountEarned(double hoursPerWeek, double amountPerHour) {
        return (hoursPerWeek < 0 || amountPerHour < 0 ) ? 0 : (hoursPerWeek * amountPerHour * 52);}

    public static void main(String[] args) {

        double hoursPerWeek = 85.5;
        double amountPerHour = 35;

        double totalSalary = amountEarned( hoursPerWeek,amountPerHour );
        System.out.println(totalSalary);
    }

}
