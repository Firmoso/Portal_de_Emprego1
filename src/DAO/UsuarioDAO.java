package DAO;
import Model.Empresa;
import Model.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {
    private Connection conexao;
    private Usuario usuario;
    public UsuarioDAO(Connection conex){
        try {
            this.conexao = BDconexao.getConnection();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    public String inserir(Usuario usuario){
        String mensagem;
        String sql = "insert into usuario (idusuario,nomeusuario,datanascimento,tipodocumento,numdocumento,telprincipal,telsecundario,email,provinciaresidencia,formacaoacademica,palavra_passe,nomecompleto)values (?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,usuario.getId() );
            ps.setString(2, usuario.getNomeUsuario());
            ps.setString(3,usuario.getNascimento());
            ps.setString(4, usuario.getTipodoc());
            ps.setString(5, usuario.getId());
            ps.setInt(6, usuario.getContacto());
            ps.setInt(7, usuario.getContEmergencia());
            ps.setString(8, usuario.getEmail());
            ps.setString(9, usuario.getResidencia());
            ps.setString(10, usuario.getFormacao());
            ps.setString(11, usuario.getPasse());
            ps.setString(12, usuario.getNome());
           
            ps.executeUpdate();
            ps.close();
            mensagem="Adicionado com sucesso";
            
        } catch (SQLException ex) {
            Logger.getLogger(EmpresaDAO.class.getName()).log(Level.SEVERE, null, ex);
             mensagem="Não adicionado com sucesso";
        }
        return mensagem;
    }
    
    public int contar() throws SQLException{
                        String sql = "select * from usuario;";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet res= ps.executeQuery();
            int i=0;
            while(res.next()){
                i++;
            }
            return i;
    }
    
    public String[][] CarregarUsuario(Usuario usuario, int i) throws SQLException{
                String sql = "select * from usuario;";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet res= ps.executeQuery();
//int j= contar();
            String array[][]= new String [i][6];
                 int j=0;
            while(res.next()){
                String id=res.getString("idusuario");
                String nome=res.getString("nomeusuario");
                String email=res.getString("email");
                String nuit=res.getString("tipodocumento");
                int contacto=res.getInt("telprincipal");
               // int contacto2=res.getInt("telsecundario");
                String interesse=res.getString("formacaoacademica");
           
              //  System.out.println(id+"-"+nome+"-"+email+"-"+nuit+"-"+contacto+"-"+interesse);
                
                array[j][0]=id;         array[j][2]=email;    array[j][4]=contacto+"";  
                array[j][1]=nome;   array[j][3]=nuit;       array[j][5]=interesse;
                j++;
            }
              
            return array;
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
//        new EmpresaDAO();
  //      new EmpresaDAO().inserir();
                
    }
    }

