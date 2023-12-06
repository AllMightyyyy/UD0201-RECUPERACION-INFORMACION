import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for INPUT of their Name
        System.out.println("Please Enter your Name: ");
        String name = scanner.nextLine();

        int age = 0; // Initialize age to 0

        boolean validAgeInput = false;//this is a boolean we will use to check if the user has inputted a valid age

        while (!validAgeInput) {
            try {
                System.out.println("Please Input your age: ");//Asking the user for age
                age = scanner.nextInt();//saves the age entered by the user
                if (age >= 0) {
                    validAgeInput = true;//if age is greater than or equal to 0, then the user has inputted a valid age
                } else {
                    System.out.println("Nice try, you have entered a negative number. Please try again.");//If the user enters a negative number, then the user has inputted an invalid age
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input for age. Please enter a valid integer.");//If the user enters a negative age, then the user has inputted an invalid age
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }

        // Clear the newline character from the previous input
        scanner.nextLine();

        System.out.println("Enter Your Street Address: ");//Asking the user for their street address
        String street = scanner.nextLine();

        System.out.println("What city do you live in ?");//Asking the user for their city
        String city = scanner.nextLine();

        char gender = 'o'; // Default to 'o' for other

        boolean validGenderInput = false;//this is a boolean we will use to check if the user has inputted a valid gender

        while (!validGenderInput) {
            try {
                System.out.println("What gender do you identify as (M/F) ?");//asking the user for their gender
                gender = scanner.nextLine().charAt(0);//retrieving the first character in the string that the user enters
                if (gender == 'M' || gender == 'F') {
                    validGenderInput = true;//if the user enters a valid gender, then the user has inputted a valid gender
                } else {
                    System.out.println("Invalid gender input. Please enter 'M' or 'F'.");//If the user enters an invalid gender, then the user has inputted an invalid gender
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Invalid input for gender. Please enter 'M' or 'F'.");//If the user enters an invalid gender, then the user has inputted an invalid gender
            }
        }

        System.out.println("Hi " + name + ", your age is " + age + " and your address is " + street + ", " + city
                + ", you identify as " + gender);//Displaying the user's information

        // Close the scanner when you're done with it
        scanner.close();
    }
}