package br.ufrpe.bcc.ip2.vendas.model.persistence;

import br.ufrpe.bcc.ip2.vendas.model.beans.Venda;

import java.util.ArrayList;
import java.util.List;

public class VendaDAO {
    private List<Venda> repositorio;
    private static VendaDAO instance = new VendaDAO();
    private VendaDAO()
    {
        this.repositorio = new ArrayList<Venda>();
    }
    public static VendaDAO getInstance() {
        return instance;
    }
    public void salvar(Venda venda) {
        // adicionar o venda
        this.repositorio.add(venda);
    }
    public List listarTodos() {
        return this.repositorio;
    }
}
