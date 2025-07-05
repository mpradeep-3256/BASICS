
import java.util.Scanner;
public class positiveornegative {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        if (a>0){
            System.out.println("The number is positive");
        }
        else if(a<0){
            System.out.println("The number is negative");
        }
        else if(a==0){
            System.out.println("zero");}

        else{
            System.out.println("invalid");
        }
    }

}