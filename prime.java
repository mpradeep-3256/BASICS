import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i =10; i <=n; i++){
            count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                count++;
                }
                }   
                if(count==0){
                System.out.print(i+" ");
            }
        }
    }
}
