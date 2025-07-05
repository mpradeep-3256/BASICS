
import java.util.Scanner;
public class charactervariables {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.println("Enter the first character");        
        char ch1 = my.next().charAt(0);
        System.out.println("Enter the second character");
        char ch2 = my.next().charAt(0);
        if(ch1<ch2){
            System.out.println(ch1+" "+ch2);
        }
        else {
            System.out.println(ch2+" "+ch1);
            
        }
       // else{
           // System.out.println("both are same" +ch1+ "letter");
        }


    }
    
