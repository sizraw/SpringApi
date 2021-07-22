


import java.util.Scanner;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        Bank account = new BankAccountDaoImpl();



        do{
            System.out.println("**************************************");
            System.out.println("Please select the following option: ");
            System.out.println("d for Deposit");
            System.out.println("w for Withdraw");
            System.out.println("b to check Balance");
            System.out.println("e to Exit");
            System.out.println("u to update");
            System.out.println("a to add users");
            System.out.println("D to delete");
            System.out.print("p to print all users: ");
            Scanner inputt = new Scanner(System.in);
            char str = inputt.next().charAt(0);//Reads string

            switch(str) {

                //Deposit
                case 'd':
                    System.out.println("Please enter your Full Name: ");
                    Scanner AccountInput = new Scanner(System.in);
                    String InputAccount = AccountInput.nextLine();
                    System.out.println("Please enter amount to deposit ");
                    Scanner InputDeposit = new Scanner(System.in);
                    Float Deposit = InputDeposit.nextFloat();
                    account.Deposit(InputAccount, Deposit);
                    break;

                //Withdraw
                case 'w':

                    System.out.println("Please enter your Full Name: ");
                    Scanner AccounttInput = new Scanner(System.in);
                    String InputAccountt = AccounttInput.nextLine();
                    System.out.println("Please enter amount to withdraw ");
                    Scanner InputW = new Scanner(System.in);
                    Float withdraw = InputW.nextFloat();
                    account.Withdraw(InputAccountt, withdraw);
                    break;

                //check Balance
                case 'b':
                    System.out.println("Please enter your Full Name: ");
                    Scanner input = new Scanner(System.in);
                    String accountNumber = input.nextLine();
                    account.CheckBalance(accountNumber);

                    break;

                //exit
                case 'e':
                    System.exit(0);
                    System.out.println("Bye");
                    break;

                //update
                case 'u':

                    System.out.println("Please enter your Full Name or Email or Phone Number: ");
                    Scanner inputtt = new Scanner(System.in);
                    String number = inputtt.nextLine();
                    System.out.println("Please enter the update one: ");
                    Scanner Inputtt = new Scanner(System.in);
                    String newName = Inputtt.nextLine();
                    account.updateUsers(number, newName);

                    break;

                //delete
                case 'D':
                    System.out.println("Please enter your Full Name: ");
                    Scanner dinput = new Scanner(System.in);
                    int NameToDelete = dinput.nextInt();
                    account.deleteUsers(account.getUsers(NameToDelete), NameToDelete);
                    break;

                case 'a':
                    System.out.println("<<<<Creating new account>>>>>>");
                    System.out.println("Please enter your full name: ");
                    Scanner Newinput = new Scanner(System.in);
                    String NewName = Newinput.nextLine();
                    System.out.println("Please enter the amount to deposit: ");
                    Scanner newinput = new Scanner(System.in);
                    Float newBalance = newinput.nextFloat();
                    System.out.println("Please enter PhoneNumber: ");
                    Scanner Nnewinput = new Scanner(System.in);
                    int NewPhone = Nnewinput.nextInt();
                    System.out.println("Please enter your email address: ");
                    Scanner NNewinput = new Scanner(System.in);
                    String NewEmail =NNewinput.nextLine();
                    Random random = new Random();
                    int AccountNumber = random.nextInt();
                    BankAccount newAccount = new BankAccount(NewName, AccountNumber, newBalance, NewPhone, NewEmail);
                    account.Addaccount(newAccount);
                    break;

                case 'p':
                    //printing all users
                    for (BankAccount users : account.getAllUsers()) {
                        System.out.println("Users: Name : " + users.getCustomerName() + ", AccountNumber : " + users.getAccountnumber() + ", PhoneNumber : " + users.getPhoneNumber() +  ", Email: " + users.getEmail() + ", Balance: " + users.getBalance());
                    }
                    break;
            }



        }
        while(true);

    }
}

