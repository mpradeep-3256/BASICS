import java.util.Scanner;
class findtargetvalue{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
            } int n=sc.nextInt();
            int count=0;
          for(int i=0;i<a;i++){
              if(arr[i]==n){
                System.out.println(i);
                count++;
              }
          }if(count==0){
              System.out.println(-1);
          }
    }
}