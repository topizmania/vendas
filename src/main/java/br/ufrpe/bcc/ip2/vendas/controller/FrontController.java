package br.ufrpe.bcc.ip2.vendas.controller;

import br.ufrpe.bcc.ip2.vendas.model.beans.Cliente;
import br.ufrpe.bcc.ip2.vendas.model.beans.Produto;
import br.ufrpe.bcc.ip2.vendas.model.beans.Venda;
import br.ufrpe.bcc.ip2.vendas.model.beans.Vendedor;
import br.ufrpe.bcc.ip2.vendas.model.business.ClienteBusiness;
import br.ufrpe.bcc.ip2.vendas.model.business.ProdutoBusiness;
import br.ufrpe.bcc.ip2.vendas.model.business.VendaBusiness;
import br.ufrpe.bcc.ip2.vendas.model.business.VendedorBusiness;

import br.ufrpe.bcc.ip2.vendas.model.persistence.ClienteDAO;
import br.ufrpe.bcc.ip2.vendas.model.persistence.VendedorDAO;
import br.ufrpe.bcc.ip2.vendas.model.persistence.ProdutoDAO;
import br.ufrpe.bcc.ip2.vendas.view.ShellGUI;

import java.util.List;
import java.util.Map;

public class FrontController {

    private final ShellGUI view;

    public FrontController(ShellGUI view) {
        this.view = view;
    }

    public void run() {
        String cmd;
        this.view.exibirMenu();

        while ((cmd = view.lerComando("DIGITE UMA OPÇÃO > ")) != null) {

            if ("1".equals(cmd)) {
                // cadastrar cliente
                Map<String, String> dados = this.view.cadastrarCliente();

                Cliente cliente = new Cliente();
                cliente.setNome(dados.get("nome"));
                cliente.setEmail(dados.get("email"));
                cliente.setTelefone(dados.get("telefone"));
                cliente.setEndereco(dados.get("endereco"));
                cliente.setCpf(dados.get("cpf"));
                cliente.setDataAniversario(dados.get("dataAniversario"));
                cliente.setLimiteCredito(Double.parseDouble(dados.get("limiteCredito")));
                ClienteBusiness.getInstance().salvar(cliente);

            } else if ("2".equals(cmd)) {

                // listar clientes
                this.view.listarClientes(ClienteBusiness.getInstance().listarTodos());


            }
            else if("3".equals(cmd)){
                //cadastrar vendedor
                Map<String, String> dados = this.view.cadastrarVendedor();
                Vendedor vendedor = new Vendedor();
                vendedor.setNome(dados.get("nome"));
                vendedor.setEmail(dados.get("email"));
                vendedor.setTelefone(dados.get("telefone"));
                vendedor.setEndereco(dados.get("endereco"));
                vendedor.setCpf(dados.get("cpf"));
                vendedor.setDataAniversario(dados.get("dataAniversario"));
                vendedor.setMatricula(dados.get("matricula"));
                vendedor.setDataContratacao(dados.get("dataContratacao"));

                VendedorBusiness.getInstance().salvar(vendedor);
            }
            else if("4".equals(cmd))
            {
                //listar vendedores
                this.view.listarVendedor(VendedorBusiness.getInstance().listarTodos());
            }
            else if("5".equals(cmd))
            {
                //cadastrar produto
                Map<String, String> dados = this.view.cadastrarProduto();
                Produto produto = new Produto();
                produto.setNome(dados.get("nome"));
                produto.setPreco(Double.parseDouble(dados.get("preco")));
                produto.setPeso(Double.parseDouble(dados.get("peso")));
                produto.setEstoqueAtual(Integer.parseInt(dados.get("estoqueAtual")));
                produto.setEstoqueMinimo(Integer.parseInt(dados.get("estoqueMinimo")));
                ProdutoBusiness.getInstance().salvar(produto);

            }
            else if("6".equals(cmd))
            {
                //listar produtos
                this.view.listarProduto(ProdutoBusiness.getInstance().listarTodos());
            }
            else if ("7".equals(cmd))
            {
                List<Cliente> listacliente = ClienteDAO.getInstance().listarTodos();
                List<Produto> listaproduto = ProdutoDAO.getInstance().listarTodos();
                List<Vendedor> listavendedor = VendedorDAO.getInstance().listarTodos();
                //registrar vendas
                Map<String, String> dados = this.view.registrarVenda();
                Venda venda = new Venda();

                venda.setDataVenda(dados.get("dataVenda"));

                venda.equals(dados.get("produto"));
                for(Produto c : listaproduto)
                {
                    if( c.equals(dados.get("produto")))
                    {
                        venda.setProduto(c);
                    }
                }

                venda.setQuantidade(Integer.parseInt(dados.get("quantidade")));

                venda.equals(dados.get("cliente"));
                for(Cliente c : listacliente)
                {
                    if( c.equals(dados.get("cliente")))
                    {
                        venda.setCliente(c);
                    }
                }
                venda.equals(dados.get("vendedor"));
                for(Vendedor c : listavendedor)
                {
                    if( c.equals(dados.get("vendedor")))
                    {
                        venda.setVendedor(c);
                    }
                }

               // venda.setDataVenda(dados.get("dataVenda"));
               // venda.setProduto(dados.get("produto"));
                VendaBusiness.getInstance().salvar(venda);

            }
            else if("8".equals(cmd))
            {
               //listar vendas
               this.view.RelatoriodeVendas(VendaBusiness.getInstance().listarTodos());
            }

            else if ("x".equals(cmd)) {

                System.exit(0);
            }

            this.view.exibirMenu();

        }

    }

}
