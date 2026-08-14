import java.util.Scanner;

public class ex007_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linhaMat, colunaMat;

        System.out.print("Quantas linhas vai ter a matriz? ");
        linhaMat = sc.nextInt();
        System.out.print("Quantas colunas vai ter a matriz? ");
        colunaMat = sc.nextInt();

        int[][] mat = new int[linhaMat][colunaMat];

        for (int ind = 0; ind < linhaMat; ind++) {
            for (int jInd = 0; jInd < colunaMat; jInd++) {
                System.out.print("Elemento [" + ind + "," + jInd + "]: ");
                mat[ind][jInd] = sc.nextInt();
            }
        }

        System.out.println("\nMATRIZ DIGITADA:");
        for (int ind = 0; ind < linhaMat; ind++) {
            for (int jInd = 0; jInd < colunaMat; jInd++) {
                System.out.print(mat[ind][jInd] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
} 
