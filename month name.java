
import java.util.Scanner;
public class monthname {

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int month = my.nextInt();
        switch(month){
        case 1:
            System.out.println("january");
            break;
        case 2:
            System.out.println("february");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        case 5:
            System.out.println("May");
            break;
        case 6:
            System.out.println("June");
            break;
        case 7:
            System.out.println("july");
            break;
        case 8:
            System.out.println("August");
            break;
        case 9:
            System.out.println("September");
            break;
        case 10:
            System.out.println("october");
            break;
        case 11:
            System.out.println("November");
            break;
        case 12:
            System.out.println("December");
            break;
        default:
            System.out.println("invalid");
            break;   



        }

    }
    
}