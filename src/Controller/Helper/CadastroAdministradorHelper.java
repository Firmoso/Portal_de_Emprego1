package Controller.Helper;

import DAO.AdministradorDAO;
import DAO.BDconexao;
import DAO.UsuarioDAO;
import Model.Administrador;
import View.AccoesRapidas;
import View.LoginAdmin;
import View.Login_Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastroAdministradorHelper {

   
    private final LoginAdmin View;

     public void autenticar() throws SQLException, ClassNotFoundException {

String admin= View.getTemail().getText();
String passe= View.getTpasse().getText();
Administrador adminstrador= new Administrador(admin, passe);
      
Connection conex= new BDconexao().getConnection();
         AdministradorDAO admin2= new AdministradorDAO(conex);
        //Verifica se existe um usuario
        boolean existe= admin2.autenticar(adminstrador);
        if(existe){
            AccoesRapidas log= new AccoesRapidas();
            log.setVisible(true);
            View.setVisible(false);
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Usuário ou senha inválido");
        }
        
     }
    public CadastroAdministradorHelper(LoginAdmin View) {
        this.View = View;
    }
    
    public Administrador ObterAdmin(){
        String email= View.getTemail().getText();
        String passe= View.getTpasse().getText();
        
        Administrador admin= new Administrador(email,passe);
        return admin;
    }
}
