import java.util.Scanner;

public class TaskShowMenu {

	public Boolean auth(String pass) {
		return pass.equals("Mahesh");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Authentication au = new Authentication();

		boolean authenticated = false;

		for (int i = 0; i < 3; i++) {// Allow up to 3 attempts for password input

			System.out.print("Enter password: ");
			String Userpass = sc.nextLine();

			if (au.auth(Userpass)) {

				System.out.println("Password Correct");
				authenticated = true;
				break;
			} else {
				System.out.println("Wrong password");

				if (i == 2) {
					System.out.println(
							"Maximum attempts reached. Please reRun the program and Enter the correct password");
					return;
				}
			}
		}

		if (authenticated) { // If the password is correct, run program
			System.err.println("Enter into Program Menu");
			StartProgram(sc);
		}
	}

	public static void StartProgram(Scanner scanner) {
		String yn;
		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("\nMenu:");
			System.out.println("1. Factorial Calculation");
			System.out.println("2. Fibonacci Sequence");
			System.out.println("3. Prime Number Check");
			System.out.println("4. Sum of Digits");
			System.out.println("5. Reverse Number");

			String sys = sc.next();

			switch (sys) {
			case "1":

				System.out.println("Factorial Calculator Program: ");

				System.out.print("Enter a Factorial number ");
				int factno = sc.nextInt();

				int factorial = 1;
				for (int i = 1; i <= factno; i++) {
					factorial = factorial * i;
				}
				System.out.println("Factorial of " + factno + " is: " + factorial);
				break;

			case "2":
				System.out.println("Fibonacci sequence Program: ");

				System.out.print("Enter the number of terms for the Fibonacci sequence: ");
				int noOfInteration = sc.nextInt();

				int a = 0, b = 1;
				System.out.print(a + ", " + b);

				for (int i = 3; i <= noOfInteration; i++) {// This is because the first two terms (0 and 1) are already
															// // printed.
					int c = a + b;
					System.out.print(", " + c);
					a = b;
					b = c;
				}
				System.out.println(); // Print a new line after the Fibonacci sequence
				break;

			case "3":
				System.out.println("Prime Number Program: ");

				System.out.print("Enter a number to check if it is prime: ");
				int primeno = sc.nextInt();

				int temp = 0;
				for (int i = 2; i <= primeno - 1; i++) {
					if (primeno % i == 0) {
						temp = temp + 1;
					}
				}
				if (temp == 0) {
					System.out.println(primeno + " is a prime number");
				} else {
					System.out.println(primeno + " is Not a prime number");
				}
				break;

			case "4":
				System.out.println("Sum Of Digit Program:");

				System.out.println("Enter First Number");
				int no1 = sc.nextInt();

				System.out.println("Enter Second Number");
				int no2 = sc.nextInt();

				int sum = no1 + no2;

				System.out.println("Addition is: " + sum);
				break;

			case "5":
				System.out.println("Reverse Number Program: ");

				System.out.print("Enter a number to reverse ");
				int revno = sc.nextInt();

				int reverse = 0;

				while (revno != 0) {
					int remainder = revno % 10; // Get the last digit of the number
					reverse = reverse * 10 + remainder; // Append the last digit to the reverse number
					revno = revno / 10; // Remove the last digit from the number
				}
				System.out.println("The reverse of the given number is: " + reverse);
				break;

			default:
				System.out.println("Invalid Enter Number;");
			}
			System.out.println("Do u want continue Program (Press y for Yes and n for No)");
			yn = sc.next();

		} while (yn.equals("y") || yn.equals("Y"));

	}
}
