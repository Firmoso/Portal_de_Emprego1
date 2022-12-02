//Primeiro
package View;

import Controller.CadastroAdministradorController;
import Controller.Helper.CadastroAdministradorHelper;
import Controller.LoginUsuarioController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class LoginAdmin extends JFrame implements ActionListener{

    private final CadastroAdministradorController Controller;
    public void actionPerformed(ActionEvent e){
        
//         if(e.getSource()==novContaJb){
//            
//             new Cadastro_Usuario1();
//             setVisible(false);
             
         if(e.getSource()==entrar){
             try {
                 //Controller.EntrarSistema();
                 Controller.obterAdmin();
             } catch (SQLException ex) {
                 Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
    }
    
    //Menus
    
     JMenuBar menu= new JMenuBar();
    JMenu jj = new JMenu("Opções");
    JMenu jj2 = new JMenu("Serviços");
    JMenu jj3 = new JMenu("Sobre");
    JMenuItem item1= new JMenuItem("Sair");
    
     //Imagens
     ImageIcon portalempregoim= new ImageIcon(getClass().getResource("Portalemprego.png"));
     JLabel imgl= new JLabel(portalempregoim);
     ImageIcon ususarioimg= new ImageIcon(getClass().getResource("uemlogo.png"));
     JLabel usuarioimglb= new JLabel(ususarioimg);
    
    //Panels
    JPanel pnorte= new JPanel();
    JPanel pcentro= new JPanel();
//    JPanel pcentro= new JPanel(new FlowLayout(FlowLayout.LEADING));  
    JPanel poeste= new JPanel();  
    JPanel peste= new JPanel(new GridBagLayout());  
    //Buttons
    JButton entrar= new JButton("ENTRAR");
    
    //TextField
    
    JTextField temail= new JTextField(15);
    JTextField tpasse= new JTextField(15);
 
    //Label
    JLabel email= new JLabel("Email Institucional: ");
    JLabel passe= new JLabel("Palavra-Passe: ");
    
    //Fonte
     Font Tor = new Font ("Times new roman",Font.BOLD|Font.ROMAN_BASELINE ,15);
     
     LoginAdmin(){
        this.setLayout(new BorderLayout());
        //Criando objecto controller... .
        Controller = new CadastroAdministradorController(this);
        
        //Adiconando menus
         setJMenuBar(menu);
        menu.add(jj);
        menu.add(jj2);
        menu.add(jj3);
        jj.add(item1);
        
        //Accoes
        this.entrar.addActionListener(this);
        
        //PAINEL NORTE
        pnorte.add(imgl);
        this.add(pnorte, BorderLayout.NORTH);
        
        
        //PAINEL CENTRO
        pcentro.setLayout(new BoxLayout(pcentro, BoxLayout.Y_AXIS));
        pcentro.add(usuarioimglb);
        //Painel Este
         GridBagConstraints gd = new GridBagConstraints();
         gd.anchor = GridBagConstraints.LINE_END;
         gd.insets = new Insets(3,10,3,10);
         gd.gridx=0;    gd.gridy=0;     peste.add(email, gd);
         gd.gridx=1;    gd.gridy=0;     peste.add(temail, gd);
         gd.gridx=0;    gd.gridy=1;     peste.add(passe, gd);
         gd.gridx=1;    gd.gridy=1;     peste.add(tpasse, gd);
         gd.gridx=1;    gd.gridy=2;     peste.add(entrar, gd);
         
         entrar.setForeground(Color.white);
         entrar.setBackground(new Color(0x123456));
         
         pcentro.add(peste);
         this.add(pcentro, BorderLayout.CENTER);
         
         
       //Adicionando borda 
//      Jp1.setBorder(BorderFactory.createTitledBorder("USUÃ�RIO:  ") );
     
        // Dimensoes da janela.
        pcentro.setBackground(Color.white);
        peste.setBackground(Color.white);
        pnorte.setBackground(Color.white);
//        pnorte.setBackground(new Color(0x8bb1c4));
        this.setSize(500, 500);
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
}

    public JTextField getTemail() {
        return temail;
    }

    public void setTemail(JTextField temail) {
        this.temail = temail;
    }

    public JTextField getTpasse() {
        return tpasse;
    }

    public void setTpasse(JTextField tpasse) {
        this.tpasse = tpasse;
    }
    
     public void exibemensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
     
    public static void main(String[] args) {
        new LoginAdmin();
    }

}
