import java.util.*;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=n;
        int palin=0,a;
        while(n>0){
         a=n%10;
            palin=palin*10+a;
            n=n/10;
        }
        if(b==palin){
            System.out.println("palindrome");}
            else
             System.out.println(" not palindrome");
    
    }
    
}