import java.util.Scanner;

public class arrayminmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[5];
        int min,max;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
           
        }
        max=arr[0];
        min=arr[1];
         for(int i=0;i<5;i++){
            for(int j=1;j<5;j++){
            if(max<arr[j]){
                max=arr[j];
            } if(min>arr[j]){
                min=arr[j];
            }
           
        }
           
        }
        System.out.println(max+" "+min);
        
    }
    
}
