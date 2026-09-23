import java.util.Scanner;

public class InputOutput{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Integer Input
        System.out.print("Enter your enrollment Number: ");
        int enrollmentNumber = input.nextInt();
        System.out.println("This is your enrollment Number: " + enrollmentNumber);

        //Float Input
        System.out.print("Enter your CGPA: ");
        float cgpa = input.nextFloat();
        System.out.println("This is your CGPA: " + cgpa);
    }

}
