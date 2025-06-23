import java.util.Scanner;

public class Classificaçãoporcategori {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Classificação por categoria");
        System.out.println("====================================");
        double preco;

        System.out.println("Digite o preço do produto para classificar:");
        preco = scanner.nextDouble();

        if (preco == 50) {
            System.out.println("Produto Econômico");
        } else if (preco > 50 && preco <= 200) {
            System.out.println("Produto Intermediário");
        } else if (preco > 200) {
            System.out.println("Produto Premium");
        }

    }
}
