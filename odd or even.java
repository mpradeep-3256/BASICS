
import java.util.Scanner;
public class oddoreven {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }

    }
    
}