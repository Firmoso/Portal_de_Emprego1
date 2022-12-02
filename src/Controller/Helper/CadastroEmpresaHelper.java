package Controller.Helper;

import DAO.BDconexao;
import DAO.EmpresaDAO;
import Model.Empresa;
import Model.Registrou;
import View.CadastroEmpresa;
import java.sql.Connection;
import java.sql.SQLException;

public class CadastroEmpresaHelper {
       private final CadastroEmpresa View;

    public CadastroEmpresaHelper(CadastroEmpresa View) {
        this.View = View;
    }
    
    public Empresa adicionarEmpresa() throws ClassNotFoundException{
      String nomeEmpresa= View.getJtNomEmpresa().getText();
      String email= View.getJtE_mail().getText();
      String Id= View.getJtNuit().getText();
      String passe=View.getJtPalPasse().getText();
      int contacto= Integer.parseInt(View.getJtContacto().getText());
      String localizacao=View.getJcLocalizacao().getSelectedItem().toString();
      String caixa_postal=View.getJtCaixaPost().getText();
      String bairro= View.getJtBairro().getText();
      String avenida= View.getJtAvenida().getText();
      String  nomeReg= View.getJtNomreg().getText();
      String Cargo = View.getJtPosOcup().getText();
      int contactRegis = Integer.parseInt(View.getJtTelefonereg1().getText());
      String apelido= View.getJtApelido().getText();     
        int nuit=Integer.parseInt( View.getJtNuit().getText());
        String area = "Engenharia";
      Empresa empresa= new Empresa(localizacao,caixa_postal, bairro,avenida,nomeEmpresa,email,Id,passe,contacto,nuit,area);
      Registrou registante= new Registrou(Cargo, nomeReg, apelido,contactRegis);
    try{
            Connection conex= new BDconexao().getConnection();
            EmpresaDAO emp= new EmpresaDAO(conex);
            emp.inserir(empresa);
            this.View.exibirMensagem("Adicionado com sucesso");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
      
      return empresa;
 
    }
    
    public static void EliminarEmpresa() throws ClassNotFoundException{
        try{
            Connection conex= new BDconexao().getConnection();
            EmpresaDAO emp= new EmpresaDAO(conex);
            Empresa empresa = null;
            emp.CarregarEmpresa(empresa);
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    public static void main(String[] args) throws ClassNotFoundException {
        EliminarEmpresa();
    }
    
    
}
