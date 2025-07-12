import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = input.nextInt();
        if (number%2 == 0){
            System.out.println("even number ");
        }else {
            System.out.println("odd number ");
        }
    }
}