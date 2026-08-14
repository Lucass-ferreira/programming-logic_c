import java.util.Scanner;
import java.util.Locale;

public class ex006_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int numDigitado = sc.nextInt();

        double[] vet = new double[numDigitado];


        for(int ind = 0; ind < numDigitado; ind++){
            System.out.print("Digite o " + (ind + 1) + "° numero: ");
            vet[ind] = sc.nextDouble();
        }

        for(int ind = 0; ind < numDigitado; ind++){
            System.out.println("VALORES DO VETOR: ");
            System.out.println(vet[ind]);
        }

        sc.close();
        
    }
}
