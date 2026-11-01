
import java.util.Scanner;

class ATM {
    double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero!");
        }

        if (amount > balance) {
            throw new ArithmeticException("Insufficient funds!");
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(5000);
        int choice;
        double amount;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        amount = Double.parseDouble(sc.nextLine());

                        try {
                            atm.deposit(amount);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        } finally {
                            System.out.println("Transaction completed.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        amount = Double.parseDouble(sc.nextLine());

                        try {
                            atm.withdraw(amount);
                        } catch (ArithmeticException |
                                 IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        } finally {
                            System.out.println("Transaction completed.");
                        }
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        throw new IllegalArgumentException(
                            "Invalid menu choice!"
                        );
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
                choice = 0;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                choice = 0;
            }

        } while (choice != 4);

        sc.close();
    }
}
