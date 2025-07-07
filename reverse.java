import java.util.*;
public class reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0,a;
        while(n>0){
         a=n%10;
            reverse=reverse*10+a;
            n=n/10;
        }
            System.out.println(reverse);
    
    }
    
}