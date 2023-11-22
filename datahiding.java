//actually this is Encapsulation = DataHiding +  Abstraction


import java.util.Scanner;

public class datahiding {
    private static final double INITIAL_BALANCE = 10000;
    private static final String PASSWORD = "Harshal";

    private static double balance = INITIAL_BALANCE;

    public static void getBalance() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter password:");
            String enteredPassword = sc.nextLine();

            if (enteredPassword.equals(PASSWORD)) {
                System.out.println("Permission granted. Accessing balance...");
                System.out.println("Balance: " + balance);
            } else {
                System.out.println("Wrong password. Access denied.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getBalance();
    }
}
