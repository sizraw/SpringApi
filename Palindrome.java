import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String str = input.nextLine();//Reads string
        String reverse = method(str);
        if(reverse.equals(str))
        {
            System.out.println("The string is a palindrome...");
        }
else {
            System.out.println("The string is not a palindrome");
        }



    }

    public static String method(String str) {
        StringBuilder input = new StringBuilder(str);
        String reverse = "";
        reverse = input.reverse().toString();
        System.out.println("Reversed String is : " + reverse);
        return reverse;
    }
}