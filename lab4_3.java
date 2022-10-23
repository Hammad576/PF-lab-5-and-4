public import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double wages,rate,hours;
        System.out.println("Enter the working hours:");
        hours=obj.nextDouble();
        System.out.println("Enter the pay rate:");
        rate=obj.nextDouble();
        if(hours>40){
            wages=40*rate+1.5*rate*(hours-40);
        }
        else {
            wages=hours*rate;
        }
        System.out.println("The wages are "+wages);
    }
}
    
 
