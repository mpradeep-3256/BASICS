
import java.util.Scanner;
public class datatypes {
    public static void main(String[] args) {
       Scanner my = new Scanner(System.in);
       System.out.println("Enter a value");
        char ch = my.next().charAt(0); 
       // System.out.println("Enter a value");
       // int a = my.nextInt();
        if(ch>='a'&& ch<='z'|| ch>='A'&&ch<='Z'){
            System.out.println("alaphbet");

        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special character");
        }

    }
    
    
}