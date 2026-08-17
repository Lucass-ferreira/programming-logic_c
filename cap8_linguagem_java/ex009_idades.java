import java.util.Scanner;
import java.util.Locale;

public class ex009_idades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[2];
        int[] idades = new int[2];
        double mediaIdades;

        for(int ind = 0; ind < idades.length; ind++){
            System.out.println("Dados da " + (ind + 1) + "° pessoa: ");
            System.out.print("Nome: ");
            nomes[ind] = sc.nextLine();
            System.out.print("Idade: ");
            idades[ind] = sc.nextInt();
            sc.nextLine();
        }
        
        mediaIdades = (idades[0] + idades[1])/idades.length;
       
        System.out.println("A idade media de " + nomes[0] + " e " + nomes[1] + "eh de " + mediaIdades + " anos.");

        sc.close();
    }
    
}

