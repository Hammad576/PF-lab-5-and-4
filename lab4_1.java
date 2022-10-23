import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year=obj.nextInt();
        boolean isleapyear=(year%4==0&&year%100!=0)||(year%400==0);
        System.out.println(year+" is a leap year?"+isleapyear);
    }
}