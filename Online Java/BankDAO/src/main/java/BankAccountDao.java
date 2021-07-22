import java.util.ArrayList;
import java.util.List;

class BankAccountDaoImpl implements Bank {
    ArrayList<BankAccount> users;

    public BankAccountDaoImpl() {
        users = new ArrayList<BankAccount>();
        BankAccount user1 = new BankAccount("Srijana Manandhar", 123456, 100.0f, 510811111, "abc@gmail.com");
        BankAccount user2 = new BankAccount("RajeebManandhar", 123457, 100.0f, 510811121, "abd@gmail.com");
        users.add(user1);
        users.add(user2);
    }

    @Override
    public List<BankAccount> getAllUsers() {
        return users;
    }

    @Override
    public BankAccount getUsers(int account) {
        return users.get(account);
    }

    @Override
    public void updateUsers(String name, String newName) {
        for (BankAccount user : users) {
            if (user.getCustomerName().equals(name) ) {
                user.setCustomerName(newName);
                System.out.println("Your name is updated");
            }
            else if(user.getEmail().equals(name))
            {
                user.setEmail(newName);
                System.out.println("*************************************");
                System.out.println("Congratulations Your Email is updated!!!");
            }

        }

    }

    public void updateUsers(int phone, int newphone) {
        for (BankAccount user : users) {
            if (user.getPhoneNumber() == phone) {
                user.setPhoneNumber(newphone);
                System.out.println("Your Phone is updated");
            }

        }

    }

    public void Deposit(String name, float f) {
        for (BankAccount user : users) {
            if (user.getCustomerName().equals(name)) {
                float newBalance = user.getBalance() + f;
                user.setBalance(newBalance);
                System.out.println("Your account is updated");
                System.out.println("Your new balance is " + newBalance);
            }

        }

    }

    public void Withdraw(String name, float f) {
        for (BankAccount user : users) {
            if (user.getCustomerName().equals(name)) {
                if (user.getBalance() > f) {
                    float newBalance = user.getBalance() - f;
                    user.setBalance(newBalance);
                    System.out.println("Your account is updated");
                    System.out.println("Your new balance is " + newBalance);
                } else if (user.getBalance() < f) {
                    System.out.println("Not enough balance .....");
                }

            }

        }
    }

    public void deleteUsers(BankAccount bankAccount, int name) {
        if(bankAccount.getAccountnumber() == name)
            users.remove(bankAccount);
        System.out.println("Account Deleted...");
    }

    public void CheckBalance(String name) {
        for (BankAccount user : users) {
            if (user.getCustomerName().equals(name)) {
                System.out.println(user.getCustomerName() + " Your balance is " + user.getBalance());

            }
        }


    }

    public void Addaccount(BankAccount newAccount ) {
        users.add(newAccount);
        System.out.println("Account created....");

    }




}