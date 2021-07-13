import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String str = input.nextLine();//Reads string
        method(str);

    }

    public static void method(String str) {
        int length = str.length();
        int count = 0;
        char ch[] = str.toCharArray();
        for(int i = 0; i <= length -1; i++) {
            char isConsonant = ch[i];
            if (isConsonant != 'a' && isConsonant != 'e' && isConsonant != 'i' && isConsonant != 'o' && isConsonant != 'u') {
                count++;
                ch[i] = '*';

            }
        }

        System.out.println("There are " + count + " consonants.");

        System.out.print("Replacing Consonant with stars ");
        for (int i = 0; i< ch.length; i++)
            {
                System.out.print(ch[i]);
            }




    }

    }

