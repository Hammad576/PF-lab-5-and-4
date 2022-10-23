import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int limit;
        int number;
        int sum;
        int counter;
        System.out.println("Enter the number of integers in the list:");
        limit=obj.nextInt();
        sum=0;
        counter=0;
        System.out.println("Enter the "+limit+" integers:");
        while (counter<limit){
            number=obj.nextInt();
            sum=sum+number;
            counter++;
        }
        System.out.println("The sum of the "+limit+" numbers are:"+sum);
        if(counter!=0){
            System.out.println("The average of the numbers are:"+sum/counter);
        }
        else {
            System.out.println("No input");
        }
    }
}