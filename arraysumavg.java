import java.util.Scanner;

public class arraysumavg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        int sum=0,avg=0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
           
        }
         for(int i=0;i<5;i++){
            sum+=arr[i];
           
        }
        avg=sum/5;
        System.out.println("sum:"+sum);
        System.out.println("average:"+avg);
    }
    
}

