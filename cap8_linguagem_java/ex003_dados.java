import java.util.Locale;
public class ex003_dados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        // //print na mesma linhas
        // System.out.print("Bom dia");
        // System.out.print("Boa noite, neymar");

        // //println saltando a linha no final
        // System.out.println("Bom dia");
        // System.out.println("Boa noite");

        // //imprimindo variaveis
        // int x, y;
        // x = 10;
        // y = 20;

        // System.out.println("valor X = " + x);
        // System.out.println("valor Y = " + y);

        // //variavel double/float formatada com duas casas decimais
        // //se eu quiser ponto, import java.util.Locale e adiciona no começo do codigo, Locale.setDefault(Locale.US)
        // double salario;
        // salario = 1600.00;
        // System.out.println("Salario = " + String.format("%.2f", salario));

        int idade;
        double salario;
        char sexo;
        String nome;

        idade = 32;
        salario = 1600.00;
        sexo = 'F';
        nome = "Maria souza";

        System.out.println("A funcionaria " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos");

    }

}