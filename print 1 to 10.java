
import java.util.Scanner;
public class print1to10 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int a = my.nextInt();
        for(int i = 1;i<=a;i++){
            System.out.print(i+" ");
        }

    }
}