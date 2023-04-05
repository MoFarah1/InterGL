import java.util.Scanner;

public class CalcTest {

	//Methods
	
	//Add two numbers
	public static int addition(int firstNum, int secondNum) {
		int finalNumber = (firstNum + secondNum);
		return finalNumber;
	}
	
	//Multiply two numbers
	public static int multiply(int firstNum, int secondNum) {
		int finalNumber = (firstNum * secondNum);
		return finalNumber;
	}
	
	//Divide two numbers
	public static int divide(int firstNum, int secondNum) {
		int finalNumber = (firstNum / secondNum);
		return finalNumber;
	}
	
	//Subtract two numbers
	public static int minus(int firstNum, int secondNum) {
		int finalNumber = (firstNum - secondNum);
		return finalNumber;
	}
	
	//Method we are going to test - BIDMAS
	//Not used within the programme
	public static int bidmas(int firstNum, int secondNum, int thirdNum) {
		int finalNumber = (firstNum + secondNum * thirdNum );
		return finalNumber;
	}
	
	public static void main(String[] args) {
	
			
		Scanner sc = new Scanner(System.in); // Create a Scanner object
		
		//Asking user to input first number
		System.out.print("Enter your first number :");
		int firstNum = sc.nextInt();
		
		//Asking user for operator - there is no nextChar()
		System.out.print("Enter your operator: (+ - / * ) :");
		char operator = sc.next().charAt(0);
		
		//Asking user to input second number
		System.out.print("Enter your second number :");
		int secondNum = sc.nextInt();
		
	
			
		//Check operator to decide on which function to run
		if (operator == '+') {
			int addition = addition(firstNum, secondNum);
			System.out.println(addition);
		} else if (operator == '*') {
			int multiply = multiply(firstNum, secondNum);
			System.out.println(multiply);
		} else if (operator == '/') {
			int divide = divide(firstNum, secondNum);
			System.out.println(divide);
		} else if (operator == '-') {
			int minus = minus(firstNum, secondNum);
			System.out.println(minus);
		} else {
			System.out.println("You did not enter a valid operator");
		}

	}

}

