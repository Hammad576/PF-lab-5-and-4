import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int answer;
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);
        System.out.println("What is "+number1+"+"+number2);
        answer=obj.nextInt();
        while (answer!=number1+number2){
            System.out.println("Wrong answer try again . What is "+number1+"+"+number2);
            answer=obj.nextInt();
        }
        System.out.println("You got it");
    }
} 
  
