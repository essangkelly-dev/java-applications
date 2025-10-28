import java.util.Scanner;

public class UserInput{
    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		double bal = 5678.86;
		
		System.out.print("Enter your firstname: ");
		String firstName = input.nextLine();
		
		System.out.print("Enter lastname: ");
		String lastname = input.nextLine();
		 
		System.out.print("Enter your age: ");
		Short age = input.nextShort();
		
		System.out.printf("Welcome %s %s to Firstbank",firstName,lastname);
		System.out.printf("You are %d years old%n",age);
		System.out.printf("Your account balance is $%.2f%n",bal);
    }
}