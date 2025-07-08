import java.util.Scanner;
class dividebythreenum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=2;i<=150;i++){
            if((i%5==0)&&(i%2==0)&&(i%3==0)){
                System.out.print(i+" ");
            }
            
        }
        
    }
}