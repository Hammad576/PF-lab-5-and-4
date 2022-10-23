import java.util.Scanner;
public class Main {
    static final int sentinel=-999;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number;
         int sum=0;
         int count;
         for (count=0;count<5;count++){
             number=obj.nextInt();
             sum=sum+number;
         }
        System.out.println("The sum is:"+sum);
    }
} {
    
}
