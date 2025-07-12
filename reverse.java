import java.util.Scanner;
public class reverse {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your number :");
        int number =input.nextInt();
        int reversed =0;
        while (number!=0){
            int digit =number%10;
            reversed=reversed*10+digit;
            number=number/10;
        }
        System.out.println("reverse number ="+reversed);
    }
}