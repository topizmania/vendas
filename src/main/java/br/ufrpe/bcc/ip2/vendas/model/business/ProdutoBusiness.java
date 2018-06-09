package br.ufrpe.bcc.ip2.vendas.model.business;

import br.ufrpe.bcc.ip2.vendas.model.beans.Produto;

import br.ufrpe.bcc.ip2.vendas.model.persistence.ProdutoDAO;

import java.util.List;

public class ProdutoBusiness {
    private static ProdutoBusiness instance = new ProdutoBusiness();

    public static ProdutoBusiness getInstance() {
        return instance;
    }

    private ProdutoBusiness() {
//        Codigo para teste

   //     Produto pSal = new Produto();
     //   pSal.setNome("Sal");
    //    pSal.setEstoqueAtual(10);
    //    pSal.setEstoqueMinimo(5);
    //    pSal.setPeso(1.0);
    //    pSal.setPreco(2.5);
    }

    public void salvar(Produto produto) {
        // verificar se o produto ja existe, etc
        // ...

        // outras verificacoes


        // adicionar o produto
        ProdutoDAO.getInstance().salvar(produto);
    }

    public List listarTodos() {
        return ProdutoDAO.getInstance().listarTodos();
    }
}
