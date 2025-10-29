package minimarket.modelo.A2Mercado;

import minimarket.modelo.A2Mercado.Service.ClienteService;
import minimarket.modelo.A2Mercado.Service.ProdutoService;
import minimarket.modelo.A2Mercado.Service.VendaService;

import java.util.Scanner;


public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static ProdutoService produtoService = new ProdutoService();
    private static ClienteService clienteService = new ClienteService();
    private static VendaService vendaService = new VendaService();

    public static void main(String[] args) {
                produtoService.carregarDadosExemplo();
                clienteService.carregarDadosExemplo();

                System.out.println("--- SISTEMA MINI MERCADO ---");

                while(true) {
                    System.out.println("\n1. Modo Gerente");
                    System.out.println("2. Modo Cliente");
                    System.out.println("0. Sair");
                    System.out.print("Escolha: ");

                    int opcao = scan.nextInt();
                    scan.nextLine();

                    switch(opcao) {
                        case 1:
                            modoGerente();
                        break;
                        case 2:
                            modoCliente();
                        break;
                        case 0:
                            System.out.println("Saindo...");
                            return;
                        default:
                            System.out.println("Opção inválida!");
                    }
                }
            }

            static void modoGerente() {
                while(true) {
                    System.out.println("\n--- MODO GERENTE ---");
                    System.out.println("1. Cadastrar Produto");
                    System.out.println("2. Listar Produtos");
                    System.out.println("3. Cadastrar Cliente");
                    System.out.println("4. Listar Clientes");
                    System.out.println("5. Ver Vendas");
                    System.out.println("0. Voltar");
                    System.out.print("Opção: ");

                    int opcao = scan.nextInt();
                    scan.nextLine();

                    switch(opcao) {
                        case 1:
                            produtoService.cadastrarProduto(scan);
                        break;
                        case 2:
                            produtoService.listarProdutos();
                        break;
                        case 3:
                            clienteService.cadastrarCliente(scan);
                        break;
                        case 4:
                            clienteService.listarClientes();
                        break;
                        case 5:
                            vendaService.listarVendas();
                        break;
                        case 0:
                            return;
                        default: System.out.println("Opção inválida!");
                    }
                }
            }

            static void modoCliente() {
                while(true) {
                    System.out.println("--- MODO CLIENTE ---");
                    System.out.println("1. Ver Produtos");
                    System.out.println("2. Fazer Compra");
                    System.out.println("0. Voltar");
                    System.out.print("Opção: ");

                    int opcao = scan.nextInt();
                    scan.nextLine();

                    switch(opcao) {
                        case 1:
                            produtoService.listarProdutos();
                            break;
                        case 2:
                            vendaService.fazerVenda(scan, produtoService, clienteService);
                            break;
                        case 0:
                            return;
                        default: System.out.println("Opção inválida!");
                    }
                }
            }
        }
