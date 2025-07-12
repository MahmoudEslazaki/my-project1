import java.util.Scanner;
public class switchclass {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name of the day (1-7) :");
        int day =input.nextInt();
        switch (day){
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            case 7:
                System.out.println("friday");
                break;
            default:
                System.out.println("day is invalid");
        }
    }
}