/** Calculate the cost of carpeting the floor of a room
@Author - Himanshu Rathee
*/

import java.util.Scanner;

public class CarpetCost{
	public static void main(String[] args){
	double length;
	double width;
	double cost;
	double costPerMetre;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter the length of room: ");
	length = input.nextDouble();

	System.out.print("Enter the width of room: ");
	width = input.nextDouble();

	System.out.print("Enter the cost of carpeting per metre of room: ");
	costPerMetre = input.nextDouble();

	cost = length*width*costPerMetre;

	System.out.println("The Cost of carpeting the room of length " +length+ " and width " +width+ " at a cost per metre of " +costPerMetre+ " is EUROS: " +cost);






	}

}