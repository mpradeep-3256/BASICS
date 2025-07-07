import java.util.Scanner;

class alpha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        // char s2=sc.next().charAt(0);
        if (s >= 'A' && s <= 'z' || s >= 'a' && s <= 'z') {
            System.out.println("Alphabhets");
        } else if (s >= 48 && s <= 57)
            System.out.print("Digits");
        else
            System.out.println("Special character");
    }
}
