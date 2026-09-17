import java.util.Scanner;
import java.util.Locale;

public class ex008_retangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Base do retangulo: ");
        double baseRetangulo = sc.nextDouble();
        System.out.print("Altura do retangulo: ");
        double alturaRetangulo = sc.nextDouble();

        double area = baseRetangulo * alturaRetangulo;
        double perimetro = (2 * baseRetangulo) + (2 * alturaRetangulo); 
        double diagonal = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));

        System.out.println("\nAREA: " + String.format("%.2f", area));
        System.out.println("PERIMETRO: " + String.format("%.2f", perimetro));
        System.out.println("DIAGONAL: " + String.format("%.2f", diagonal));

        sc.close();
    }

    
}
