import java.util.Scanner;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		
		int userInput = input.nextInt();
		
		if (userInput % 15 == 0) {
				System.out.println("FizzBuzz");
		} else if (userInput % 5 == 0) {
			System.out.println("Buzz");
		} else if (userInput % 3 == 0){
			System.out.println("Fizz");
		} else
			System.out.println("Try again.");
	}
}


