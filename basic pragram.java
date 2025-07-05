public class basicprogram{
    public static void main(String[] args) {
       // Scanner my = new Scanner(System.in);
        //int num1 = my.nextInt();
        //int num2 = my.nextInt();
        if(args.length<2){
            System.out.println("To accept the two integers");
            //return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = num1 + num2;
        System.out.println("Sum of number is"+sum);

    }
}