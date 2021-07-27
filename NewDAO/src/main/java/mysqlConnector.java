import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class mysqlConnector implements Bank {
    static final String Driver = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://new.cohsxn6nmrml.us-east-2.rds.amazonaws.com/bankDB";
    static final String USER = "admin";
    static final String PASS = "testadmin";

    private static ArrayList<BankAccount> users = new ArrayList<>();

    @Override
    public List<BankAccount> getAllUsers() {
        return users;
    }


    @Override
    public BankAccount getUsers(int account) {
        for (BankAccount accounts : users) {
            if (accounts.getAccountnumber() == account) {
                return accounts;
            }
        }
        return null;

    }

    @Override
    public void updateUsers(String name, String newName) {

    }

    @Override
    public void updateUsers(int phone, int newphone) {

    }

    @Override
    public void deleteUsers(String bankAccount) {
        String sql = "DELETE FROM account WHERE CustomerName = ?";
        try {
            Class.forName(Driver);
            System.out.println("Connecting");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bankAccount);
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void deleteUsers(BankAccount bankAccount, int name) {

    }

    @Override
    public void Deposit(String name, float f)  {

        //String sql = "SELECT FROM account WHERE CustomerName = ?";
        try {
           // Class.forName(Driver);
            System.out.println("Connecting");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement( );
            PreparedStatement ps = conn.prepareStatement("SELECT FROM account WHERE CustomerName = ?");
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery("SELECT FROM account WHERE CustomerName = 'name'");
            float currentbalance = rs.getFloat("balance");
            float newbalance = currentbalance + f;
            String sqll = "UPDATE account WHERE CustomerName =" +name+ "SET balance = "+newbalance;
            stmt.executeUpdate(sqll);

//            String sql = "UPDATE `bankDB`.`account` "
//                    + "(`Accountid`, `CustomerName`, `email`, `phone`,`balance`)"
//                    + " VALUES ("
//                    + "'" + newAccount.getAccountnumber() + "', "
//                    + "'" + newAccount.getCustomerName() + "', "
//                    + "'" + newAccount.getEmail() + "', "
//                    + "'" + newAccount.getPhoneNumber() + "', "
//                    + "'" + newB + "');";
////            ps.setString(1, name);
////            ps.setFloat(2, f);
          //   ps.executeUpdate(sql);
       // System.out.println("deposit added");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    @Override
    public void Withdraw(String name, float f) {

    }

    @Override
    public void CheckBalance(String name) {

    }

    @Override
    public void Addaccount(BankAccount newAccount) {
        try {
            Class.forName(Driver);
            System.out.println("Connecting");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement ps = conn.createStatement();
            String sql = "INSERT INTO `bankDB`.`account` "
                    + "(`Accountid`, `CustomerName`, `email`, `phone`,`balance`)"
                    + " VALUES ("
                    + "'" + newAccount.getAccountnumber() + "', "
                    + "'" + newAccount.getCustomerName() + "', "
                    + "'" + newAccount.getEmail() + "', "
                    + "'" + newAccount.getPhoneNumber() + "', "
                    + "'" + newAccount.getBalance() + "');";
                ps.executeUpdate(sql);


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        users.add(newAccount);
        System.out.println("Created..");
    }
    @Override
    public void getAllAcount() {
        try {
            Class.forName(Driver);
            System.out.println("Connecting");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

//            not NULL PRIMARY KEY
            String sql = "CREATE TABLE account" +
                    "(Accountid INTEGER not NULL, " +
                    " CustomerName VARCHAR(255), " +
                    " email VARCHAR(255), " +
                    " phone LONG, " +
                    " balance FLOAT, "+
                    "PRIMARY KEY(Accounid)";

            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

