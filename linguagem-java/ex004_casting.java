public class ex004_casting {
    public static void main(String[] args) {
        int numA, numB; 
        double resultado;

        numA = 5;
        numB = 2;

        //mesmo o resultado sendo double, não vai mostra o numero double pois os numero são inteiros, e pra mostra double precisa converte um dos numeros pra double
        resultado = (double)numA / numB;

        System.out.println(resultado);
    }

}