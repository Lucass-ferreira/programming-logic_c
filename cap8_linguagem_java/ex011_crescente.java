import java.util.Scanner;
import java.util.Locale;

public class ex011_crescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1 = 1, num2 = 2;

        while ( num1 != num2) {
            System.out.println("Digite dois numeros: ");
            num1 = sc.nextInt(); //5
            num2 = sc.nextInt(); //4

            if(num1 > num2){
                System.out.println("Decrescente");
            }
            if(num2 > num1) {
                System.out.println("Crescente");
            }
        }

        sc.close();
    }
}
