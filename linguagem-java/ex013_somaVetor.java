import java.util.Scanner;
import java.util.Locale;

public class ex013_somaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0, media = 0;
        
        System.out.print("Quantos numero voçe vai digitar: ");
        int numDig = sc.nextInt();

        double[] numeros = new double[numDig];

        for(int ind = 0; ind < numDig; ind++){
            System.out.print("Digite um numero: ");
            numeros[ind] = sc.nextDouble();

            soma += numeros[ind];
        }

        media = soma/numDig;

        System.out.print("\nVALORES: ");
        for(int ind = 0; ind < numDig; ind++){
            System.out.print(numeros[ind] + " ");
        }
        System.out.println("\nSOMA: " + soma);
        System.out.println("MEDIA: " + media);


        sc.close();
    }
}
