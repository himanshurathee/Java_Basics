public class CalculatorApp{
	public static void main(String[] args){
		double add;

		Calculator cal = new Calculator();
		cal.addition(5,10);
		cal.display();
		cal.subtraction(10,5);
		cal.display();
		cal.multiplication(5,5);
		cal.display();
		cal.division(50,5);
		cal.display();
	}
}