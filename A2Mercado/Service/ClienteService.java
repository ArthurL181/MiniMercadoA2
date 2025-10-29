package minimarket.modelo.A2Mercado.Service;

import minimarket.modelo.A2Mercado.Molde.Cliente;
import minimarket.modelo.A2Mercado.Molde.PessoaCnpj;
import minimarket.modelo.A2Mercado.Molde.PessoaCpf;

import java.util.*;

    public class ClienteService {
        private ArrayList<Cliente> clientes = new ArrayList<>();
        private int nextId = 1;

        public void cadastrarCliente(Scanner scan) {
            System.out.println("\n--- CADASTRAR CLIENTE ---");
            System.out.print("Tipo (1-Pessoa Física / 2-Pessoa Jurídica): ");
            int tipoPessoa = scan.nextInt();
            scan.nextLine();

            if(tipoPessoa == 1) {
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.print("Telefone: ");
                String telefone = scan.nextLine();
                System.out.print("Categoria (BRONZE/PRATA/OURO/DIAMANTE): ");
                String categoria = scan.nextLine();

                System.out.print("CPF: ");
                String cpf = scan.nextLine();
                clientes.add(new PessoaCpf(nextId++, nome, telefone, categoria, cpf));
                System.out.println("Cliente PF cadastrado!");
            } else if (tipoPessoa == 2){
                System.out.print("Nome: ");
                String nome = scan.nextLine();
                System.out.print("Telefone: ");
                String telefone = scan.nextLine();
                System.out.print("Categoria (BRONZE/PRATA/OURO/DIAMANTE): ");
                String categoria = scan.nextLine();

                System.out.print("CNPJ: ");
                String cnpj = scan.nextLine();
                clientes.add(new PessoaCnpj(nextId++, nome, telefone, categoria, cnpj));
                System.out.println("Cliente PJ cadastrado!");
            } else {
                System.out.println("Opção escolhida é inválida, tente novamente.");
            }




        }

        public void listarClientes() {
            System.out.println("--- CLIENTES ---");
            if(clientes.isEmpty()) {
                System.out.println("Nenhum cliente cadastrado.");
                return;
            }

            for(Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }

        public Cliente buscarCliente(int id) {
            for(Cliente cliente : clientes) {
                if(cliente.id == id) {
                    return cliente;
                }
            }
            return null;
        }

        public void carregarDadosExemplo() {
            clientes.add(new PessoaCpf(nextId++, "Arthur Lucas Dandolini", "11-9999-8888", "Diamante", "159.222.333-70"));
            clientes.add(new PessoaCnpj(nextId++, "2A Mercado", "11-7777-6666", "DIAMANTE", "12.345.678/0001-90"));
        }

        public ArrayList<Cliente> getClientes() {
            return clientes;
        }
    }

