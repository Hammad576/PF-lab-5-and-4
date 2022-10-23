import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("      Multiplication Table       ");
        int i,j,k;
        System.out.print("   ");
        for(j=1;j<=9;j++) {
            System.out.print("   " + j);
        }
        System.out.println("\n--------------------------------------------");
            for(i=1;i<=9;i++) {
                System.out.print(i + " |");

                for (k = 1; k <= 9; k++) {
                    System.out.printf("%4d", i * k);
                }
                System.out.println("");
            }


    }
}
