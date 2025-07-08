import java.util.Scanner;
class twolargesmallnum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
         arr[i]=sc.nextInt();
            }int temp=0;
          for(int i=0;i<a;i++){a
              for(int j=0;j<a;j++){
                  if(arr[i]>arr[j]){
                      temp=arr[i];
                      arr[i]=arr[j];
                      arr[j]=temp;
                  }
              
          }
          } 
         System.out.println("First two smallest "+arr[a-1]+","+arr[a-2]);
         System.out.println("First two largest "+arr[0]+","+arr[1]);
          }
    }
