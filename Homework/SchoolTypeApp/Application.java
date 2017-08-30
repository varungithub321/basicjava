import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the grade that you are currently in.");
		int x = scanner.nextInt();

		if (x <= 5) {
			System.out.println("Elementary School");
		}

		else if (x >= 6 && x <= 8) {
			System.out.println("Middle School");
		}

		else if (x >= 9 && x <= 12) {
			System.out.println("High School");
		}
		
		else {
			System.out.println("College");
		}

	}

}
