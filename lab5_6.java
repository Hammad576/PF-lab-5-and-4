import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int number, max;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = obj.nextInt();
        max = number;
        do {
            number = obj.nextInt();
            if (number > max) {
                max = number;
            }
        } while (number != 0);
        System.out.println("The maximum is "+max+" and number is:"+number);
    }
}