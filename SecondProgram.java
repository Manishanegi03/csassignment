//A sentence as input from the user and count the number of  vowels and words in it.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        s = s + " ";
        int i=0,v=0,w=0;
        for(i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c=='A' || c=='a'|| c=='E' || c=='e' || c=='I' || c=='i' || c=='O' || c=='o' || c=='U' || c=='u')
            {
                v++;
            }
            if(c == ' ')
            {
                w++;
            }
        }
        System.out.println("The number of vowels = " + v);
        System.out.println("The number of words = " + w);
    }
}