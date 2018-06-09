package br.ufrpe.bcc.ip2.vendas.model.persistence;

import br.ufrpe.bcc.ip2.vendas.model.beans.Vendedor;

import java.util.ArrayList;
import java.util.List;
public class VendedorDAO {
    private List<Vendedor> repositorio;
    private static VendedorDAO instance = new VendedorDAO();
    private VendedorDAO()
    {
        this.repositorio = new ArrayList<Vendedor>();
    }
    public static VendedorDAO getInstance() {
        return instance;
    }
    public void salvar(Vendedor vendedor) {
        // adicionar o vendedor
        this.repositorio.add(vendedor);
    }
    public List listarTodos() {
        return this.repositorio;
    }
}
