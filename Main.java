import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Введите число x:");
         double x = in.nextDouble();
         System.out.println("Введите  предел n:");
         double n = in.nextDouble();
         double sum = 0;
         if ((x>0) && (x<=2)){
            for (double i = 0; i <= n; i++) {
                double b = (Math.pow(-1, i) * Math.pow((x - 1), (i + 1))) / (i + 1);
                sum += b;
            }
        }
        System.out.println(sum);
    }
}
