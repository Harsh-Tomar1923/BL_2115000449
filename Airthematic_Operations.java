package BL;
import java.util.*;
public class Airthematic_Operations {
    public static void main(String[] args) {
        int a, b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=Integer.parseInt(s.nextLine());
        System.out.println("Enter Second Number: ");
        b=Integer.parseInt(s.nextLine());
        System.out.println("Select an Option...");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mult");
        System.out.println("Divide");
        System.out.println("Exit");
        System.out.println("Type your selection here: ");
        String choice = s.nextLine();
        switch (choice) {
                case "Add":
                    System.out.println("Sum = " + (a + b));
                    break;
                case "Sub":
                    System.out.println("Difference = " + (a - b));
                    break;
                case "Mult":
                    System.out.println("Product = " + (a * b));
                    break;
                case "Divide":
                    System.out.println("Division = " + (a / b));
                    break;
                case "Exit":
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice!!");
                    break;
            }
    }
}
