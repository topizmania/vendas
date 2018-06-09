package br.ufrpe.bcc.ip2.vendas.model.business;

import br.ufrpe.bcc.ip2.vendas.model.beans.Venda;
import br.ufrpe.bcc.ip2.vendas.model.persistence.VendaDAO;

import java.util.List;

public class VendaBusiness {
    private static VendaBusiness instance = new VendaBusiness();

    public static VendaBusiness getInstance() {
        return instance;
    }

    private VendaBusiness() {
//        Codigo para teste
//        Cliente cliente01 = new Cliente();
//        cliente01.setNome("jose");
//        cliente01.setEmail("jose@email.com");
//        cliente01.setCpf("000.111.222.333-33");
//        cliente01.setDataAniversario("1980-12-20");
//        cliente01.setEndereço("Rua Sem nome, 320");
//        cliente01.setLimiteCredito(1000.00);
//        cliente01.setTelefone("(81) 3333-2244");
//        ClienteDAO.getInstance().salvar(cliente01);
    }

    public void salvar(Venda venda) {
        // verificar se a venda ja existe, etc
        // ...

        // outras verificacoes


        // adicionar a venda
        VendaDAO.getInstance().salvar(venda);
    }

    public List listarTodos() {
        return VendaDAO.getInstance().listarTodos();
    }
}
