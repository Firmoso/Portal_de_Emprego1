package Controller.Helper;

import Model.Usuario;
import View.CadastroUsuario;
import View.LoginAdmin;

public class LoginUsuarioHelper {
    
       private final LoginAdmin View;

    public LoginUsuarioHelper(LoginAdmin View) {
        this.View = View;
    }
   
    public Usuario ObterUsuario(){
        String usuario =View.getTemail().getText();
        String passe= View.getTpasse().getText();
        Usuario modelo= new Usuario(usuario, passe);
    return modelo;
    }
    
    public void SetUsuario(Usuario emp){
        String nome= emp.getNome();
        String passe= emp.getPasse();
        
      //  View.getUsuario().setText(nome);
        //View.getPasse().setText(passe);
    }
    
    public void LimpaTela(){
        //View.getUsuario().setText("");
        //View.getPasse().setText("");
    }
    
    
}
