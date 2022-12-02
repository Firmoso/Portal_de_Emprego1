
package DAO;
import Model.Empresa;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpresaDAO {
    private Connection conexao;
    private Empresa empresa;
    public EmpresaDAO(Connection conex){
        try {
            this.conexao = BDconexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private EmpresaDAO() {
    }

    public void inserir(Empresa empresa){
        String sql = "insert into empresa (idempresa,nomeempresa,emailinstitucional,nuit,contacto1,areainteresse,ppasse_empresa) values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, empresa.getId());
            ps.setString(2, empresa.getNome());
            ps.setString(3, empresa.getEmail());
            ps.setInt    (4, empresa.getNuit());
            ps.setInt    (5, empresa.getContacto());
            ps.setString(6, empresa.getArea());
            ps.setString(7, empresa.getPasse());
           
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
          //  Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void CarregarEmpresa(Empresa empresa) throws SQLException{
                String sql = "select * from empresa;";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet res= ps.executeQuery();
            
            while(res.next()){
                String id=res.getString("idempresa");
                String nome=res.getString("nomeempresa");
                String email=res.getString("emailinstitucional");
                int nuit=res.getInt("nuit");
                int contacto=res.getInt("contacto1");
                String interesse=res.getString("areainteresse");
                
                System.out.println(id+"-"+nome+"-"+email+"-"+nuit+"-"+contacto+"-"+interesse);
                

            }
            }
        

  /*  public void actualizar(Estudante estudante) {
        try {
            String sql = "UPDATE estudante SET nome = ?, apelido = ? WHERE cartao = ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, estudante.getNome());
            ps.setString(2, estudante.getApelido());
            ps.setInt(3, estudante.getCartao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void apagar (Estudante e){
        String sql = "DELETE FROM estudante WHERE cartao = ?";
        try{ 
         PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, e.getCartao());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Estudante> todos(){
        try {
            String sql = "SELECT * from estudante";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Estudante> lista = new ArrayList<>();
            while(rs.next()){
                Estudante e = new Estudante();
                e.setApelido(rs.getString("apelido"));
                e.setCartao(rs.getInt("cartao"));
                e.setNome(rs.getString("nome"));
                lista.add(e);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(EstudanteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }*/
    
    public static void main(String[] args) {
        
    }
   


    }

