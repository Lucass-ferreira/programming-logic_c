import java.util.Locale;
import java.util.Scanner;

public class ex005_entradaDados {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario1, salario2;
        String nome1, nome2;
        int idade;
        char sexo;

        System.out.print("Digite o nome da primeiro pessoa: ");
        nome1 = sc.nextLine();
        System.out.print("Digite o salario da primeira pessoa: ");
        salario1 = sc.nextDouble();

        System.out.print("Digite o nome da segundo pessoa: ");
        sc.nextLine(); //limpando o buffer
        nome2 = sc.nextLine();
        System.out.print("Digite o salario da segunda pessoa: ");
        salario2 = sc.nextDouble();

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();
        System.out.print("Digite o sexo F/M: ");
        sexo = sc.next().charAt(0);

        System.out.println("------------------------");
        System.out.println("Primeiro nome: " + nome1);
        System.out.println("Primeiro salario: " + String.format("%.2f", salario1));
        System.out.println("Segundo nome: " + nome2);
        System.out.println("Segundo salario: " + String.format("%.2f", salario2));
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);

        sc.close();

    }

}