public class ConversaoDeipos {
    public static void main(String[] args) {
       String nomeDoProduto = "Cadeira";
       double estoque = 150.5;

        int quantidadeEmEstoque = (int) estoque; // Conversão explícita de double para int
        System.out.println("Nome do Produto: " + nomeDoProduto);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);

    }
}
