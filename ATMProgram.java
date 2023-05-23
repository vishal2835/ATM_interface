import java.util.Scanner;

public class ATMProgram {
    private static double balance = 1000; // Initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayOptions();

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    withdrawMoney(scanner);
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void displayOptions() {
        System.out.println("ATM Options:");
        System.out.println("1. Withdraw Money");
        System.out.println("2. Deposit Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your option: ");
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Unable to withdraw.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        }
    }
    

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    private static void checkBalance() {
        System.out.println("Your current balance: $" + balance);
    }
}
