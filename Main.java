public class Main {
    public static void main(String[] args) {
        Mercado mercado = new Mercado();

        mercado.adicionarProduto(new Produto("Arroz", 5.99));
        mercado.adicionarProduto(new Produto("Feijão", 7.50));
        mercado.adicionarProduto(new Produto("Leite", 4.20));
        mercado.adicionarProduto(new Produto("Pão", 8.00));

        mercado.listarProdutos();

        Produto produtoPesquisado = mercado.pesquisarProduto("Feijão");
        if (produtoPesquisado != null) {
            System.out.println("\nProduto encontrado: " + produtoPesquisado);
        } else {
            System.out.println("\nProduto não encontrado");
        }

        boolean removido = mercado.excluirProduto("Leite");
        if (removido) {
            System.out.println("\nProduto removido com sucesso");
        } else {
            System.out.println("\nProduto não encontrado para remoção");
        }

        System.out.println("\nProdutos após remoção:");
        mercado.listarProdutos();
    }
}