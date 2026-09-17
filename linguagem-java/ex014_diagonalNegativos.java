import java.util.Scanner;
import java.util.Locale;

public class ex014_diagonalNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        int ordemMatriz = sc.nextInt();

        int[][] matriz = new int[ordemMatriz][ordemMatriz];
        int contNeg = 0;

        for(int ind = 0; ind < ordemMatriz; ind++){
            for(int indJ = 0; indJ < ordemMatriz; indJ++){
                System.out.print("Elemento [" + ind + "," + indJ + "]: ");
                matriz[ind][indJ] = sc.nextInt();

                if(matriz[ind][indJ] < 0){
                    contNeg++;
                }
            }
        }

        System.out.println("\nDiagonal Principal:");
        for(int ind = 0; ind < ordemMatriz; ind++){
            System.out.print(matriz[ind][ind] + " ");
        }
        System.out.println("\nQuantidade de negativos: " + contNeg);

        sc.close();
    }
}
