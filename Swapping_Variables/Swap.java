import java.util.Scanner;

public class Swap{
	public static void main(String[] args){
	int firstNumber;
	int secondNumber;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter First Number: ");
	firstNumber = input.nextInt();

	System.out.print("Enter Second Number: ");
	secondNumber = input.nextInt();

	//Using Temporary Variable to Swap the numbers
	int temp;
	temp = firstNumber;
	firstNumber = secondNumber;
	secondNumber = temp;

	System.out.println("First Number after swapping is " +firstNumber);
	System.out.println("Second Number after swapping is " +secondNumber);

	}

}