package minimarket.modelo.A2Mercado.Molde;

public class Produto {
        public int id;
        public String nome;
        public String codigoBarras;
        public double preco;
        public int estoque;

        public Produto(int id, String nome, String codigoBarras, double preco, int estoque) {
            this.id = id;
            this.nome = nome;
            this.codigoBarras = codigoBarras;
            this.preco = preco;
            this.estoque = estoque;
        }

        @Override
        public String toString() {
            return id + " - " + nome + " | R$ " + preco + " | Estoque: " + estoque;
        }
    }

