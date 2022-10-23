import java.util.Scanner;
public class Main {
    static final int sentinel=-999;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number;
        int guess;
        boolean done;
        number=(int)(Math.random()*100);
        done=false;
        while (!done){
            System.out.println("Enter a number or integer greater than or equal to 0 and less than 100 ");
            guess=obj.nextInt();
            if(guess==number){
                System.out.println("You guess the correct number:");
                done=true;
            }
           else if(guess>number){
                System.out.println("To high");
            }
           else  {
                System.out.println("To low");
            }
        }
    }
}