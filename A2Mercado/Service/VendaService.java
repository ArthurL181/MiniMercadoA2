package minimarket.modelo.A2Mercado.Service;


import minimarket.modelo.A2Mercado.Molde.Cliente;
import minimarket.modelo.A2Mercado.Molde.Produto;
import minimarket.modelo.A2Mercado.Molde.Venda;

import java.util.*;

    public class VendaService {
        private ArrayList<Venda> vendas = new ArrayList<>();
        private int nextId = 1;

        public void fazerVenda(Scanner scan, ProdutoService produtoService, ClienteService clienteService) {
            System.out.println("--- REALIZAR COMPRA ---");

            Cliente cliente = null;
            System.out.print("ID do cliente (0 para não cadastrado): ");
            int idCliente = scan.nextInt();
            if(idCliente != 0) {
                cliente = clienteService.buscarCliente(idCliente);
                if(cliente == null) {
                    System.out.println("Cliente não encontrado! Continuando sem cadastro.");
                }
            }

            Venda venda = new Venda(nextId++, cliente);

            // Adicionar itens
            while(true) {
                produtoService.listarProdutos();
                System.out.print("ID do produto (0 para finalizar): ");
                int idProduto = scan.nextInt();
                if(idProduto == 0) {
                    break;
                }

                System.out.print("Quantidade: ");
                int quantidade = scan.nextInt();

                Produto produto = produtoService.buscarProduto(idProduto);
                if(produto != null && produto.estoque >= quantidade) {
                    venda.adicionarItem(produto, quantidade);
                    produtoService.atualizarEstoque(idProduto, -quantidade);
                    System.out.println("Produto adicionado: " + produto.nome);
                } else {
                    System.out.println("Produto não encontrado ou estoque insuficiente!");
                }
            }

            if(!venda.itens.isEmpty()) {
                vendas.add(venda);
                System.out.println(" COMPRA REALIZADA COM SUCESSO!");
                System.out.println("Venda #" + venda.id);
                System.out.println("Itens: " + venda.itens.size());
                System.out.println("Subtotal: R$ " + venda.valorTotal);
                System.out.println("Desconto: R$ " + venda.desconto);
                System.out.println("TOTAL: R$ " + (venda.valorTotal - venda.desconto));
            } else {
                System.out.println("Nenhum item adicionado. Venda cancelada.");
            }
        }

        public void listarVendas() {
            System.out.println("--- VENDAS ---");
            if(vendas.isEmpty()) {
                System.out.println("Nenhuma venda registrada.");
                return;
            }

            for(Venda venda : vendas) {
                System.out.println(venda);
            }
        }
    }
