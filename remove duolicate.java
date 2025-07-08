import java.util.Scanner;
class removeduplicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
            }int dupe=sc.nextInt();
            int count=0;
          for(int i=0;i<a;i++){
              if(arr[i]==dupe){
                  count++;
                  }
                   if(count>1){
                       count=0;
                      continue;
                      }
            System.out.print(arr[i]+" ");          
          } 
          
          }
    }
