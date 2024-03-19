import java.util.Scanner;

public class AqlTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.println("Digite o seu nome:");
        nome = input.nextLine();

        System.out.println("Seu nome é "+nome+" .");
    }
}
