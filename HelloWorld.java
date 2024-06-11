import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello world!\nStudent Info:\n");
        int studentAge = 26;
        double studentGPA = 4.0;
        boolean hasPerfectAttendance = true;
        String studentFirstName = "In Tae";
        String studentLastName = "Chung";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

        System.out.println("Student Age: " + studentAge);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Student Name: " + studentFirstName + ' ' + studentLastName + " (" + studentFirstInitial + '.' + studentLastInitial + ')');
        System.out.println("Student perfect attendance: " + hasPerfectAttendance);

        System.out.println("Update student GPA: ");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println("Student GPA is now: " + studentGPA);
    }
}
