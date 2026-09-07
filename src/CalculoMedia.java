import java.util.Scanner;

public class CalculoMedia {
    // Método de cálcular média (usado pela classe de Teste)
    public double calcularMediaFinal(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    // Método de Status (usado pela classe de Teste)
    public String verificarStatusMediaFinal(double mediaFinal) {
        if (mediaFinal >= 7.0) return "APROVADO";
        if (mediaFinal >= 5.0) return "EM RECUPERAÇÃO";
        if (mediaFinal < 0 || mediaFinal > 10) return "NOTA INVÁLIDA";
        return "REPROVADO";
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Instância do objeto criada para utilizar os métodos acima
        CalculoMedia app = new CalculoMedia();

        // Usuário INFORMA as notas
        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        // O main utiliza os métodos passando as notas que o usuário informa
        double mediaFinal = app.calcularMediaFinal(nota1, nota2, nota3);
        String statusMediaFinal = app.verificarStatusMediaFinal(mediaFinal);

        System.out.println("Média: " + mediaFinal + " | Status: " + statusMediaFinal);
        entrada.close();
    }
}