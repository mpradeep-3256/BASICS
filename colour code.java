
import java.util.Scanner;
public class colourcode {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        char colour = my.next().charAt(0);
        switch(colour){
        case 'R':
            System.out.println("Red");
            break;
        case 'B':
            System.out.println("Blue");
            break;
        case 'G':
            System.out.println("Green");
            break;
        case 'O':
            System.out.println("Orange");
            break;
        case 'Y':
            System.out.println("Yellow");
            break;
        case 'W':
            System.out.println("White");
            break;
        default:
            System.out.println("Invalid code");
            break;



        }
    }
    
}