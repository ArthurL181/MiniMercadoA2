package minimarket.modelo.A2Mercado.Molde;

public class PessoaCpf extends Cliente {
        public String cpf;

        public PessoaCpf(int id, String nome, String telefone, String categoria, String cpf) {
            super(id, nome, telefone, categoria);
            this.cpf = cpf;
        }

        @Override
        public String toString() {
            return id + " - " + nome + " | " + telefone + " | " + categoria + " | CPF: " + cpf;
        }
    }

