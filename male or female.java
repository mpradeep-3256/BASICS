
import java.util.Scanner;
public class maleorfemale {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        String gender = my.nextLine();
        int age = my.nextInt();
        if(gender.equals("female") && age>=1 && age<=58){
            System.out.println("The percentage is 8.2%");
        }
        else if (gender.equals("female") && age>=59 && age<=100){
            System.out.println("The percentage is 9.2%");
        }
        else if (gender.equals("male") && age>=1 && age<=58){
            System.out.println("The percentage is 8.5%");
        }
        else if(gender.equals("male")&&age>=59 && age<=100){
            System.out.println("The percentage is 10.5%");

        }
        else{
            System.out.println("invalid");
        }
    }
    
}