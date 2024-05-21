import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int randomNo = (int) (Math.random() * 100) + 1;
		System.out.println("Welcome to the number game!");
		System.out.println("A random number is generated!");
		int userNo = -1;

		while (userNo != randomNo) {
			System.out.print("Please enter your number: ");
			userNo = scanner.nextInt();
			if (userNo > randomNo) {
				System.out.println("too high");
			} else if (userNo < randomNo) {
				System.out.println("too low");
			} else {
				System.out.println("correct");
			}
		}

		scanner.close();
	}
}
