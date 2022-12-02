package Controller;

import Controller.Helper.CadastrousuarioHelper;
import Controller.Helper.LoginUsuarioHelper;
import Model.Usuario;
import View.CadastroUsuario;
import java.awt.image.BufferedImage;

public class CadastroUsuarioController {
  
    private final CadastroUsuario View;
    private final CadastrousuarioHelper helper;

    public CadastroUsuarioController(CadastroUsuario View) {
        this.View = View;
        this.helper = new CadastrousuarioHelper(View);
    }
    
    
    public void adicionarusuario() throws ClassNotFoundException{
        //PegarUsuario
        Usuario usuario=helper.AddUsuario();
    }
    
    public String[][] mostraUsuario2() throws ClassNotFoundException{
       String [][]array;
      int i=helper.mostraUsuario().length;
      array= new String[i][6];
      array=helper.mostraUsuario();
      
      return array;
    }
   

    
}
