public class Calculator{

	public double result;

	public void addition(double num1,double num2){
		result = num1+num2;
	}

	public void subtraction(double num1, double num2){
		result = num1-num2;
	}

	public void multiplication(double num1, double num2){
			result = num1*num2;
	}

	public void division(double num1, double num2){
			result = num1-num2;
	}

	public void display(){
			System.out.println("The result is:" +result);
	}
}