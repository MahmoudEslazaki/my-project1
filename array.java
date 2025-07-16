import java.util.Scanner;
public class array {
    public static void main(String[]args){
        int[] scores ={85,92,78,96,88};
        int max =scores[0];
        for (int i=0;i< scores.length;i++){
            if (scores[i]>max){
                max=scores[i];
                System.out.println("maximum value "+max);
            }
        }
        int sum=0;
        for (int i=0;i<scores.length;i++){
            sum =sum + scores[i];
        }
        double average= (double) sum / scores.length;
        System.out.println("sum"+sum);
        System.out.println("average scores"+average);
        int searchvalue=92;
        boolean found=false;
        for (int i=0;i< scores.length;i++){
            if (searchvalue==scores[i]){
                System.out.println("value"+searchvalue+"display at found :"+i);
                found=true;
                break;
            }
            if (!found){
                System.out.println("value"+searchvalue+"display is not found .");
            }
        }
    }
}