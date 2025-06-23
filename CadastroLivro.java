import java.util.Scanner;

public class CadastroLivro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coleta de dados do livro
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o nome do autor: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o número de páginas: ");
        int numeroPaginas = scanner.nextInt();

        System.out.print("Digite o preço do livro: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer

        System.out.println("Categorias disponíveis:");
        System.out.println("F - Ficção");
        System.out.println("N - Não-ficção");
        System.out.println("T - Tecnologia");
        System.out.println("H - História");
        System.out.print("Escolha a categoria do livro (digite a letra): ");
        char categoria = scanner.nextLine().toUpperCase().charAt(0);

        String nomeCategoria;

        switch (categoria) {
            case 'F':
                nomeCategoria = "Ficção";
                break;
            case 'N':
                nomeCategoria = "Não-ficção";
                break;
            case 'T':
                nomeCategoria = "Tecnologia";
                break;
            case 'H':
                nomeCategoria = "História";
                break;
            default:
                nomeCategoria = "Categoria inválida";
        }

        // Exibe os dados do livro
        System.out.println("\n📚 Livro cadastrado com sucesso!");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Categoria: " + nomeCategoria);

        scanner.close();
    }
}
