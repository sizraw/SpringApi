import java.util.Scanner;

public class LastLetterCount {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String str = input.nextLine();//Reads string
        method(str);

    }

    public static void method(String str) {
        String words[] = str.split(" ");
        for (String token : words) {

            int length = token.length();
            char ch[] = token.toCharArray();
                char endsWiths = token.charAt(length-1);
                if(endsWiths == 's')
                {
                    ch[length-1] = 'y';
                    System.out.println(ch);
            }
                if(endsWiths == 'y')
                {
                    ch[length-1] = 's';
                    System.out.println(ch);
                }

        }


    }
}

