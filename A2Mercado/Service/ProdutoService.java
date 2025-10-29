package minimarket.modelo.A2Mercado.Service;

import minimarket.modelo.A2Mercado.Molde.Produto;

import java.util.*;
public class ProdutoService {

        private ArrayList<Produto> produtos = new ArrayList<>();
        private int nextId = 1;

        public void cadastrarProduto(Scanner scan) {
            System.out.println("--- CADASTRAR PRODUTO ---");
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Preço: ");
            double preco = scan.nextDouble();
            System.out.print("Estoque: ");
            int estoque = scan.nextInt();
            scan.nextLine();

            String codigo = "COD" + nextId;
            Produto produto = new Produto(nextId++, nome, codigo, preco, estoque);
            produtos.add(produto);
            System.out.println("Produto cadastrado! ID: " + produto.id);
        }

        public void listarProdutos() {
            System.out.println("--- PRODUTOS ---");
            if(produtos.isEmpty()) {
                System.out.println("Nenhum produto cadastrado.");
                return;
            }

            for(Produto produto : produtos) {
                System.out.println(produto);
            }
        }

        public Produto buscarProduto(int id) {
            for(Produto produto : produtos) {
                if(produto.id == id) {
                    return produto;
                }
            }
            return null;
        }

        public void atualizarEstoque(int id, int quantidade) {
            Produto produto = buscarProduto(id);
            if(produto != null) {
                produto.estoque += quantidade;
            }
        }

        public void carregarDadosExemplo() {
            produtos.add(new Produto(nextId++, "Arroz 5kg", "123456", 25.90, 100));
            produtos.add(new Produto(nextId++, "Feijão 1kg", "654321", 8.50, 50));
            produtos.add(new Produto(nextId++, "Óleo 1L", "111222", 7.90, 80));
        }

        public ArrayList<Produto> getProdutos() {
            return produtos;
        }
    }

