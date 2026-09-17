import java.util.Scanner;

public class ex010_menorTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numDig = new double[3];
        double menorNum;
        
        for(int ind = 0; ind < 3; ind++){
            System.out.print("Digite " + (ind + 1) + "° valor: ");
            numDig[ind] = sc.nextDouble();
        }

        menorNum = numDig[0];

        for(int ind = 1; ind < 3; ind++){
            if(numDig[ind] < menorNum){
                menorNum = numDig[ind];
            } 
        }

        System.out.println("Menor Numero: " + menorNum);

        sc.close();
    }
}
