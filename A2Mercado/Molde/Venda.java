package minimarket.modelo.A2Mercado.Molde;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

    public class Venda {
        public int id;
        public LocalDateTime dataHora;
        public Cliente cliente;
        public List<Produto> itens;
        public List<Integer> quantidades;
        public double valorTotal;
        public double desconto;

        public Venda(int id, Cliente cliente) {
            this.id = id;
            this.dataHora = LocalDateTime.now();
            this.cliente = cliente;
            this.itens = new ArrayList<>();
            this.quantidades = new ArrayList<>();
            this.valorTotal = 0;
            this.desconto = 0;
        }

        public void adicionarItem(Produto produto, int quantidade) {
            itens.add(produto);
            quantidades.add(quantidade);
            valorTotal += produto.preco * quantidade;

            if(cliente != null) {
                desconto = cliente.calcularDesconto(valorTotal);
            }
        }

        @Override
        public String toString() {
            return "Venda " + id + "  Cliente: " +
                    (cliente != null ? cliente.nome : "Não cadastrado") +
                    " | Total: R$ " + (valorTotal - desconto) +
                    " | Desconto: R$ " + desconto;
        }
    }

