 import java.util.Scanner;
public class Main {
    static final int sentinel=-999;
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int number;
        int sum=0;
        int count=0;
        System.out.println("Enter positive numbers ends with "+sentinel);
        number=obj.nextInt();
      while (number!=sentinel) {
          sum=sum+number;
          count++;
          number=obj.nextInt();


        }
        System.out.println("The sum of "+count+" numbers are= "+sum);
      if (count!=0){
          System.out.println("The average of the "+count+" integers are:"+sum);
      }
      else {
          System.out.println("No input");
      }
    }
}  
    
 
