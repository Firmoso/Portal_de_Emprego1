package Controller.Helper;

import DAO.BDconexao;
import DAO.UsuarioDAO;
import Model.Usuario;
import View.CadastroUsuario;
import java.sql.Connection;
import java.sql.SQLException;


public class CadastrousuarioHelper {
    
    private final CadastroUsuario View;
   private int contEmergencia;
   private int contacto;
   private String tipodoc;
   public CadastrousuarioHelper(CadastroUsuario View) {
        this.View = View;
    }
    
    public Usuario AddUsuario() throws ClassNotFoundException{
        
      //  String nacionalidade= View.getJcNacionalidade().getSelectedItem().toString();
        String residencia=View.getJcResidencia().getSelectedItem().toString();
        String formacao=View.getJcFormAcademica().getSelectedItem().toString();
        String experiencia= View.getJcExper().getSelectedItem().toString();
        String nome= View.getJtnomeCompl().getText();
        String id= View.getJtnumDoc().getText();
        String dia=View.getJtDataNasc().getText().substring(0, 2);
        String mes = View.getJtDataNasc().getText().substring(3,5);
        String ano = View.getJtDataNasc().getText().substring(6);
        String data=ano+"-"+mes+"-"+dia;
       String nacionalidade=View.getJcNacionalidade().getSelectedItem().toString();
       if(View.getJrBI().isSelected()){
           tipodoc="BI";}
       if(View.getJrDIRE().isSelected()){
           tipodoc="DIRE";
       }
       if(View.getJrPASSAPORTE().isSelected()){
           tipodoc="PASSAPORTE";
       }
       
       try{
       contEmergencia=Integer.parseInt(View.getJtContSec().getText());
       } catch(NumberFormatException jr){
           contEmergencia= 33456;
       }
       String areaformacao=View.getJcFormAcademica().getToolTipText();
       String curso=View.getJtCurso().getText();
       String recomendacao=View.getJtCartRec().getText();
       String cv=View.getJtCarCv().getText();
try{
     contacto=Integer.parseInt(View.getJtContPrinc().getText());
} catch(NumberFormatException jjt){
jjt.printStackTrace();
}

       String localformacao=View.getJtLocUltForm().getText();
       String emailRecuperacao=View.getEmailRecuperacao();
       System.out.println(" recuperacao  "+emailRecuperacao);
       String nomeUsuario=View.getNomeUsuario();
       String email=View.getEmail();
       String passe=View.getPasse();
         
             
       Usuario usuario= new Usuario(nacionalidade,tipodoc,residencia,formacao,experiencia,contEmergencia,areaformacao,curso,recomendacao,cv,data,nome,id,contacto,localformacao,email,passe,nomeUsuario,emailRecuperacao);
       String jj="";
        try{
            Connection conex= new BDconexao().getConnection();
            UsuarioDAO usu= new UsuarioDAO(conex);
            jj= usu.inserir(usuario);
            this.View.exibirMensagem(jj);
        }catch(SQLException ex){
             this.View.exibirMensagem(jj);
            ex.printStackTrace();
        }
       return usuario;
    }
    
        public String[][] mostraUsuario() throws ClassNotFoundException{
            String array[][] = null;
        try{
            Connection conex= new BDconexao().getConnection();
            UsuarioDAO usudao= new UsuarioDAO(conex);
            Usuario usu = null;
            int i=usudao.contar();
            System.out.println(i+"ujhbkj");
            array  = new String[i][6];
            array= usudao.CarregarUsuario(usu,i);
            return array;
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        
       return array;
    }
    
        public static void main(String[] args) throws ClassNotFoundException {
    }
    
}
