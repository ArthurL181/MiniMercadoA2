package minimarket.modelo.A2Mercado.Molde;

public class PessoaCnpj extends Cliente {
        public String cnpj;

        public PessoaCnpj(int id, String nome, String telefone, String categoria, String cnpj) {
            super(id, nome, telefone, categoria);
            this.cnpj = cnpj;
        }

        @Override
        public String toString() {
            return id + " - " + nome + " | " + telefone + " | " + categoria + " | CNPJ: " + cnpj;
        }
    }
