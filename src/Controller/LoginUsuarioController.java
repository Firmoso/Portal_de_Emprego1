package Controller;

import Controller.Helper.LoginUsuarioHelper;
import Model.Usuario;
import View.LoginAdmin;

public class LoginUsuarioController {
    private final LoginAdmin View;
    private final LoginUsuarioHelper helper;
    
    public LoginUsuarioController( LoginAdmin View){
        this.View=View;
        this.helper= new LoginUsuarioHelper(View);
    }
    
    public void EntrarSistema(){
        //PegarUsuario
     //  Usuario usuario= helper.;
        //PesquisarUsusarioNoBanco
    }

    
}
