import java.util.Scanner;
class alphabets{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s1=sc.next().charAt(0);
                char s2=sc.next().charAt(0);
                if(s1<s2){
                    System.out.println(s1+","+s2);}
                    else
                    System.out.println(s2+","+s1);
        

        
    }
}
