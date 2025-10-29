package minimarket.modelo.A2Mercado.Molde;

public class Cliente {
        public int id;
        public String nome;
        public String telefone;
        public String categoria;

        public Cliente(int id, String nome, String telefone, String categoria) {
            this.id = id;
            this.nome = nome;
            this.telefone = telefone;
            this.categoria = categoria;
        }

        public double calcularDesconto(double valor) {
            switch(categoria.toUpperCase()) {
                case "BRONZE": return valor * 0.05;
                case "PRATA": return valor * 0.10;
                case "OURO": return valor * 0.15;
                case "DIAMANTE": return valor * 0.20;
                default: return 0;
            }
        }
    }

