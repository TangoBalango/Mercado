public class Mercado {
   private Produto[] produtos;
   private int quantidade;

   public Mercado() {
       produtos = new Produto[20];
       quantidade = 0;
   }

   public boolean adicionarProduto(Produto p) {
       if (quantidade < 20) {
           produtos[quantidade] = p;
           quantidade++;
           return true;
       }
       return false;
   }

   public Produto pesquisarProduto(String nome) {
       for (int i = 0; i < quantidade; i++) {
           if (produtos[i].getNome().equalsIgnoreCase(nome)) {
               return produtos[i];
           }
       }
       return null;
   }

   public boolean excluirProduto(String nome) {
       for (int i = 0; i < quantidade; i++) {
           if (produtos[i].getNome().equalsIgnoreCase(nome)) {
               for (int j = i; j < quantidade - 1; j++) {
                   produtos[j] = produtos[j + 1];
               }
               produtos[quantidade - 1] = null;
               quantidade--;
               return true;
           }
       }
       return false;
   }

   public void listarProdutos() {
       System.out.println("Lista de produtos:");
       for (int i = 0; i < quantidade; i++) {
           System.out.println(produtos[i]);
       }
   }
}