import java.util.Scanner;

public class floyds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(++a+" ");
            }System.out.println(" ");
        }
    }
    
}
