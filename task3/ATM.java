import java.util.*;

public class ATM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bankAccount = new Bank(1000);
        String exit = "a";
        while (exit != "q") {

            System.out.println("Welcome to the ATM");
            System.out.println("Press 1: Withdraw");
            System.out.println("Press 2: Deposit");
            System.out.println("Press 3: Check Balance");
            int userInput = -1;
            while (userInput < 1 || userInput > 3) {
                System.out.print("User Input: ");
                userInput = scanner.nextInt();
                switch (userInput) {
                    case 1:
                        int currentBalance = bankAccount.getBalance();
                        System.out.println("Current balance:" + currentBalance);
                        System.out.print("Enter amount to withdraw:");
                        int withdrawAmount = scanner.nextInt();
                        if (withdrawAmount > currentBalance) {
                            System.out.println("Can't withdraw this amount!");
                            break;
                        }
                        bankAccount.Withdraw(withdrawAmount);
                        System.out.println("Remaining balance: " + bankAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit:");
                        bankAccount.deposit(scanner.nextInt());
                        System.out.println("Updated balance: " + bankAccount.getBalance());
                        break;
                    case 3:
                        System.out.println(bankAccount.getBalance());
                        break;
                    default:
                        System.out.println("Please enter valid input!");
                }
            }

            System.out.println("To exit press 'q' or press other key to continue");
            exit = scanner.next();

        }
        scanner.close();
    }
}
