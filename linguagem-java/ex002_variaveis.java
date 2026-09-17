import java.util.Locale;
public class ex002_variaveis {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 23;
        salario = 3200.0;
        altura = 1.78;
        genero = 'M';
        nome = "Lucas";

        System.out.println("IDADE = " + idade);
        System.out.println("Salario = " + String.format("%.2f", salario));
        System.out.println("Altura = " + String.format("%.2f", altura));
        System.out.println("Genero = " + genero);
        System.out.println("Nome = " + nome);

    }

}