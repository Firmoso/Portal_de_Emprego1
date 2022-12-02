package Controller;

import Controller.Helper.CadastroAdministradorHelper;
import Model.Administrador;
import View.LoginAdmin;
import java.sql.SQLException;


public class CadastroAdministradorController {
    
    private final LoginAdmin View;
    private final CadastroAdministradorHelper helper;
    private Administrador admin;

    public CadastroAdministradorController(LoginAdmin View) {
        this.View = View;
        this.helper= new CadastroAdministradorHelper(View);
    }
    
    public void obterAdmin() throws SQLException, ClassNotFoundException{
        
        helper.autenticar();
    }
    
    
}
