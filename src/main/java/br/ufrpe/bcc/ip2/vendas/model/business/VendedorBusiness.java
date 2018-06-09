package br.ufrpe.bcc.ip2.vendas.model.business;

import br.ufrpe.bcc.ip2.vendas.model.beans.Vendedor;
import br.ufrpe.bcc.ip2.vendas.model.persistence.VendedorDAO;
import java.util.List;

public class VendedorBusiness {
    private static VendedorBusiness instance = new VendedorBusiness();

    public static VendedorBusiness getInstance() {
        return instance;
    }

    private VendedorBusiness() {
//        Codigo para teste

       // Vendedor vendedor01 = new Vendedor();
       // vendedor01.setNome("maria");
      //  vendedor01.setEmail("maria@email.com");
      //  vendedor01.setCpf("000.222.111.333-33");
      //  vendedor01.setDataAniversario("1983-12-20");
     //   vendedor01.setEndereco("Rua Dom Manoel de Medeiros, S/N");
     //   vendedor01.setTelefone("(81) 3217-2244");
    //    vendedor01.setDataContratacao("2011-12-30");
     //   vendedor01.setMatricula("011222333");
    }

    public void salvar(Vendedor vendedor) {
        // verificar se o vendedor ja existe, etc
        // ...

        // outras verificacoes


        // adicionar o vendedor
        VendedorDAO.getInstance().salvar(vendedor);
    }

    public List listarTodos() {
        return VendedorDAO.getInstance().listarTodos();
    }
}
