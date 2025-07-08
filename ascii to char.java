import java.util.Scanner;
class asciitochar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
         System.out.println("Give ASCII value");
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
            } 
          for(int i=0;i<a;i++){
              System.out.print((char)arr[i]+" ");
          }
          }
    }
