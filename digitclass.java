import java.util.Scanner;
public class digitclass {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter end number :");
        int end =input.nextInt();
        int Count =1;
        while (Count <=end){
            int temp = Count;
            int digitCount=0;
            while (temp > 0){
                temp = temp/10;
                digitCount++;
            }
            System.out.println(" number :" +Count+ ",Digit : "+digitCount);
            Count++;
        }
    }
}