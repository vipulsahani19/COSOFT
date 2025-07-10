import java.util.Scanner;

public class Task_3 {
    // Bank Account class
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            if (initialBalance < 0) {
                this.balance = 0;
            } else {
                this.balance = initialBalance;
            }
        }

        public double getBalance() {
            return balance;
        }

        public boolean deposit(double amount) {
            if (amount <= 0) return false;
            balance += amount;
            return true;
        }

        public boolean withdraw(double amount) {
            if (amount <= 0 || amount > balance) return false;
            balance -= amount;
            return true;
        }
    }

    // ATM logic
    static class ATM {
        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void start() {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("\n=== ATM MENU ===");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                String input = sc.nextLine();
                switch (input) {
                    case "1":
                        checkBalance();
                        break;
                    case "2":
                        deposit(sc);
                        break;
                    case "3":
                        withdraw(sc);
                        break;
                    case "4":
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

        private void checkBalance() {
            System.out.printf("Your current balance is: ₹%.2f\n", account.getBalance());
        }

        private void deposit(Scanner sc) {
            System.out.print("Enter amount to deposit: ₹");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // Clear buffer
                return;
            }

            double amount = sc.nextDouble();
            sc.nextLine();

            if (account.deposit(amount)) {
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Deposit failed. Enter a positive amount.");
            }
        }

        private void withdraw(Scanner sc) {
            System.out.print("Enter amount to withdraw: ₹");
            if (!sc.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // Clear buffer
                return;
            }

            double amount = sc.nextDouble();
            sc.nextLine();

            if (account.withdraw(amount)) {
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Withdrawal failed. Check your balance or enter a valid amount.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.00); // Starting balance
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
