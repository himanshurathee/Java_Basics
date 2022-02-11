/** Discovering the area of the square
@Author- Himanshu Rathee
*/

import java.util.Scanner;
public class SquareMultiplier{
	public static void main(String[] args){

	//Declare the varibales required
	double area;
	double side;

	//Input the side of the square
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the side of the square: ");
	side=input.nextDouble();

	//Calculate the area of the square
	area=side*side;

	//Print the area of the square
	System.out.print("The are of the Square is:");
	System.out.println(area);


	}
}