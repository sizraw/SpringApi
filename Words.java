import java.util.Scanner;

public class Words {
    public static void main(String[] arg)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String str = input.nextLine();//Reads string
        int length = method(str);
        System.out.println("There are " + length + " input string..");
    }
    public static int method(String str){
        if(str == null || str.isEmpty())
        {
            return 0;
        }
        String[] word = str.split ("\\s+");
        return word.length;
    }
}
