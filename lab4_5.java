import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number;
        System.out.println("Enter a number 1,2 or 3");
        number=obj.nextInt();
        switch (number){
            case (1):
                System.out.println("You Entered 1");
                break;
            case (2):
                System.out.println("You Entered 2");
                break;
            case (3):
                System.out.println("You Entered 3");
                break;
            default:
                System.out.println("You neither entered 1 ,2 neither 3");
        }
    }
}