import java.util.Scanner;

public class Vowels {

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter string: ");
        String str = input.nextLine();//Reads string
        method(str);

    }

public static void method (String str)
{
    int length = str.length();
    int count = 0;
    for(int i = 0; i <= length -1; i++)
    {
        char isVowel = str.charAt(i);
        if(isVowel == 'a'|| isVowel == 'e'|| isVowel =='i' || isVowel == 'o'|| isVowel == 'u')
            count++;
    }
    System.out.println("There are " + count + " vowels.");

}
}
