package DAO;

import Model.Administrador;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdministradorDAO {

     private Connection conexao;
    private Usuario empresa;
    
    public AdministradorDAO(Connection conex){
        try {
            this.conexao = BDconexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        public boolean autenticar(Administrador adminstrador) throws SQLException  {
String sql = "select * from administrador where email= ? and passe=?;";
PreparedStatement ps = conexao.prepareStatement(sql);
try{
    
    ps.setString(1, adminstrador.getEmail());
    ps.setString(2, adminstrador.getPasse());
     ps.execute();
}catch(SQLException gg){
    
}

ResultSet res= ps.getResultSet();
 return res.next();}
}
