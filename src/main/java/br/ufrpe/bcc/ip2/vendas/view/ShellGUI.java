package br.ufrpe.bcc.ip2.vendas.view;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;
import br.ufrpe.bcc.ip2.vendas.model.beans.Produto;
import br.ufrpe.bcc.ip2.vendas.model.beans.Venda;
import br.ufrpe.bcc.ip2.vendas.model.beans.Vendedor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShellGUI {
    Scanner in;

    public ShellGUI() {
        this.in = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("\n\n");
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----------------------------");
        System.out.println("(1) Cadastrar Cliente");
        System.out.println("(2) Listar Clientes");
        System.out.println("(3) Cadastrar Vendedor");
        System.out.println("(4) Listar Vendedores");
        System.out.println("(5) Cadastrar Produto");
        System.out.println("(6) Listar Produtos");
        System.out.println("(7) Registrar Venda");
        System.out.println("(8) Relatório de Vendas");
        System.out.println("(x) Sair");
        System.out.println("----------------------------");
    }

    public Map<String, String> cadastrarCliente() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Cliente ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados.put("nome", this.in.nextLine());

        System.out.println("Email: ");
        dados.put("email", this.in.nextLine());

        System.out.println("Telefone: ");
        dados.put("telefone", this.in.nextLine());

        System.out.println("Endereço: ");
        dados.put("endereco", this.in.nextLine());

        System.out.println("CPF: ");
        dados.put("cpf", this.in.nextLine());

        System.out.println("Data de Aniversario (dd/mm/aaaa): ");
        dados.put("dataAniversario", this.in.nextLine());

        System.out.println("Limite de crédito: ");
        dados.put("limiteCredito", this.in.nextLine());

        return dados;
    }

    public String lerComando(String prompt) {
        System.out.print(prompt);
        return in.nextLine();
    }

    public void listarClientes(List<Cliente> list) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar  Clientes  ----");
        System.out.println("----------------------------");

        for (Cliente c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Email: \t" + c.getEmail());
            System.out.println("Telefone: \t" + c.getTelefone());
            System.out.println("Endereco: \t" + c.getEndereco());
            System.out.println("CPF: \t" + c.getCpf());
            System.out.println("Data de Aniversario: \t" + c.getDataAniversario());
            System.out.println("Limite de Credito: \t" + c.getLimiteCredito());
        }
    }

    public Map<String, String> cadastrarVendedor() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Vendedor ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados.put("nome", this.in.nextLine());

        System.out.println("Email: ");
        dados.put("email", this.in.nextLine());

        System.out.println("Telefone: ");
        dados.put("telefone", this.in.nextLine());

        System.out.println("Endereço: ");
        dados.put("endereco", this.in.nextLine());

        System.out.println("CPF: ");
        dados.put("cpf", this.in.nextLine());

        System.out.println("Data de Aniversario (dd/mm/aaaa): ");
        dados.put("dataAniversario", this.in.nextLine());

        System.out.println("Matricula: ");
        dados.put("matricula", this.in.nextLine());

        System.out.println("Data de Contratacao ");
        dados.put("dataContratacao", this.in.nextLine());
        return dados;
    }

    public void listarVendedor(List<Vendedor> list) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar  Vendedores  ----");
        System.out.println("----------------------------");

        for (Vendedor c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Email: \t" + c.getEmail());
            System.out.println("Telefone: \t" + c.getTelefone());
            System.out.println("Endereco: \t" + c.getEndereco());
            System.out.println("CPF: \t" + c.getCpf());
            System.out.println("Data de Aniversario: \t" + c.getDataAniversario());
            System.out.println("Matricula: \t" + c.getMatricula());
            System.out.println("Data de Contratacao \t" + c.getDataContratacao());

        }
    }

    public Map<String, String> cadastrarProduto() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Cadastrar Produto ----");
        System.out.println("----------------------------");
        System.out.println("Nome: ");
        dados.put("nome", this.in.nextLine());

        System.out.println("Preco: ");
        dados.put("preco", this.in.nextLine());

        System.out.println("Peso: ");
        dados.put("peso", this.in.nextLine());

        System.out.println("Estoque Minimo: ");
        dados.put("estoqueMinimo", this.in.nextLine());

        System.out.println("Estoque Atual: ");
        dados.put("estoqueAtual", this.in.nextLine());
         return dados;
    }

    public void listarProduto(List<Produto> list) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Listar  Produtos  ----");
        System.out.println("----------------------------");

        for (Produto c : list) {
            System.out.println("Nome: \t" + c.getNome());
            System.out.println("Preco: \t" + c.getPreco());
            System.out.println("Peso: \t" + c.getPeso());
            System.out.println("Estoque Minimo: \t" + c.getEstoqueMinimo());
            System.out.println("Estoque Atual: \t" + c.getEstoqueAtual());
        }
    }
    public Map<String, String> registrarVenda() {
        Map<String, String> dados = new HashMap<String, String>();

        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Registrar Venda ----");
        System.out.println("----------------------------");
        System.out.println("Data da Venda: ");
        dados.put("dataVenda", this.in.nextLine());

        System.out.println("Produto: ");
        dados.put("produto", this.in.nextLine());

        System.out.println("Quantidade: ");
        dados.put("quantidade", this.in.nextLine());

        System.out.println("Cliente: ");
        dados.put("cliente", this.in.nextLine());

        System.out.println("Vendedor: ");
        dados.put("vendedor", this.in.nextLine());
        return dados;
    }
    public void RelatoriodeVendas(List<Venda> list) {
        System.out.println("----------------------------");
        System.out.println("----- SISTEMA DE VENDAS ----");
        System.out.println("----- Relatorio de Vendas  ----");
        System.out.println("----------------------------");

        for (Venda c : list) {
            System.out.println("Data da Venda: \t" + c.getDataVenda());
            System.out.println("Produto: \t" + c.getProduto());
            System.out.println("Quantidade: \t" + c.getQuantidade());
            System.out.println("Cliente: \t" + c.getCliente());
            System.out.println("Vendedor: \t" + c.getVendedor());
        }
    }

}
