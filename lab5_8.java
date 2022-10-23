import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int sum=0;
        int number=0;
        while (number<20){
           number++;
            sum=sum+number;
            if(sum>=100){
                break;
            }
        }


    }
}