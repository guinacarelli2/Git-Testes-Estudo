import java.util.Scanner;

public class AqlTeste {
    public static void main(String[] args) {
        int contaBasica;
        contaBasica = 301 + 77*4;
        
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.println("Digite o seu nome:");
        nome = input.nextLine();

        System.out.println("Seu nome é "+nome+" .");
    }
}
