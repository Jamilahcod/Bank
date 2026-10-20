import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        boolean loop = true;
        double[] accountbalance = new double[100];
        String[] accountname = new String[100];
        int option, size = 10;

        while (loop) {
            System.out.println("------------------------------------");
            System.out.println("Welcome to Codingal banking serveses");
            System.out.println("Banking menu");
            System.out.println("1.add costumer");
            System.out.println("2.change costumer name");
            System.out.println("3.check account balance");
            System.out.println("4.update account balance");
            System.out.println("5.summery of all accounts");
            System.out.println("6.quit");

            Scanner s = new Scanner(System.in);
            System.out.println("Enter the option to move ahead");
            option = s.nextInt();

            if (option == 1) {
                System.out.println("add the costumer");
                s.nextLine();
                System.out.println("Enter the costumer name");
                String name = s.nextLine();
                accountname[size] = name;
                System.out.println("Enter the opening balance");
                double amount = s.nextDouble();
                accountbalance[size] = amount;
                System.out.println("account is created succesfully");

                System.out.println("Account Number: " + (size));
                System.out.println("Account Name:" + accountname[size]);
                System.out.println("Account Balance: " + accountbalance[size] + " Rs");
                size = size + 1;

            } else if (option == 2) {
                System.out.println("\nChange Customer Name Menu");
                System.out.print("\nEnter your Account Number: ");

                int accountIndex;

                String temp;

                accountIndex = s.nextInt();

                s.nextLine();

                if (accountIndex > size) {

                    System.out.println("Account does not exist.");

                    System.out.println("Terminating...");

                } else {

                    temp = accountname[accountIndex];

                    System.out.print("Enter the new name: ");

                    String name = s.nextLine();

                    accountname[accountIndex] = name;

                    System.out.println(

                            "Name is successfully updated from " + temp + " to " + name

                    );

                }
            }

            else if (option == 3) {
                System.out.println("\nCheck Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");
                int accountIndex;
                accountIndex = s.nextInt();
                if (accountIndex > size) {
                    System.out.println("Account does not exist.");

                } else {
                    System.out.println(
                            accountname[accountIndex] + " your balance is "
                                    + accountbalance[accountIndex] + "Rs."
                    );

                }

            } else if (option == 4) {
                System.out.println("\nUpdate Account Balance Menu");
                System.out.print("\nEnter your Account Number: ");
                int accountIndex;
                accountIndex = s.nextInt();
                if (accountIndex > size) {
                    System.out.println("Account does not exist.");

                } else {

                    System.out.print("Enter the amount to be deposited: ");
                    double amt = s.nextDouble();
                    accountbalance[accountIndex] += amt;
                    System.out.println(
                            accountname[accountIndex] + " your updated balance is : "
                                    + accountbalance[accountIndex] + " RS."

                    );

                }
            } else if (option == 5) {
                System.out.println("Accounts registered\n");
                for (int i = 10; i < size; i++) {
                    System.out.println(
                            "Account Number: " + i

                                    + ", Name: " + accountname[i]

                                    + ", Balance: " + accountbalance[i] + "Rs."

                    );
                }
            } else if (option == 6) {
                System.out.println("Terminating...");
                System.out.println("Developed & Managed by Jamila ");
                System.out.println("Built with ❤ in Azerbaijan");

                loop = false;
            }
        }
    }
}