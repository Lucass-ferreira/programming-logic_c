import java.util.Scanner;
import java.util.Locale;

public class ex012_somaImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2, numImpar = 0;

        System.out.println("Digite dois numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        sc.nextLine();

        if(num1 > num2) {
            int troca = num1;
            num1 = num2;
            num2 = troca;
        }

        for(int ind = (num1 + 1); ind < num2; ind++){
            if(ind % 2 != 0){
                numImpar += ind;
            }
        }

        System.out.println("SOMA DOS IMPARES: " + numImpar);

        sc.close();
    }
}
