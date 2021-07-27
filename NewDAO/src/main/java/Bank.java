import java.sql.SQLException;
import java.util.List;

public interface Bank {
    public List<BankAccount> getAllUsers();
    public BankAccount getUsers(int account);

    public void updateUsers(String name , String newName);
    public void updateUsers(int phone, int newphone);
    // public void deleteUsers(BankAccount account);
    public void deleteUsers(String bankAccount);
    public void deleteUsers(BankAccount bankAccount, int name);
    //public void Deposit(String name , float f) throws ClassNotFoundException, SQLException;
    public void Withdraw(String name , float f) ;
    public void CheckBalance(String name);
    public void Addaccount(BankAccount newAccount );
    public  void getAllAcount();
    public void Deposit(String name , float f);
}
