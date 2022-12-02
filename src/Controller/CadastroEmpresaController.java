package Controller;

import Controller.Helper.CadastroEmpresaHelper;
import DAO.BDconexao;
import DAO.EmpresaDAO;
import Model.Empresa;
import View.CadastroEmpresa;
import java.sql.Connection;
import java.sql.SQLException;

public class CadastroEmpresaController {
    private final CadastroEmpresa View;
    private final CadastroEmpresaHelper helper;

    public CadastroEmpresaController(CadastroEmpresa View) {
        this.View = View;
        this.helper = new CadastroEmpresaHelper(View);
    }
    
    public void AdicionarEmpresa() throws ClassNotFoundException{
        //Adicionar empresa
        Empresa empresa= helper.adicionarEmpresa();
       
        
    }
      
}
