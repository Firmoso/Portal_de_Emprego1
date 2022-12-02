
package View;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoginEmpresa extends JFrame{
    
    //Menus
     JMenuBar menu= new JMenuBar();
    JMenu jj = new JMenu("Opções");
    JMenu jj2 = new JMenu("Serviços");
    JMenu jj3 = new JMenu("Sobre");
    JMenuItem item1= new JMenuItem("Sair");
    
     //Imagens
     ImageIcon portalempregoim= new ImageIcon(getClass().getResource("Portalemprego.png"));
     JLabel imgl= new JLabel(portalempregoim);
     ImageIcon fundoimg= new ImageIcon(getClass().getResource("FundoEmpresa2.png"));
     JLabel fundolb= new JLabel(fundoimg);
     ImageIcon ususarioimg= new ImageIcon(getClass().getResource("empresa.png"));
     JLabel usuarioimglb= new JLabel(ususarioimg);
    
    //Panels
    JPanel fundo= new JPanel();
    JPanel Jp1= new JPanel();  
    JPanel Jp2= new JPanel();
   
    //Buttons
    
    JButton entrarJb= new JButton("Entrar");
    JButton esqueceJb = new JButton("<html>Escquecí <br />a Senha</html>");
    JButton novContaJb = new JButton("<html>Adicionar <br />Empresa</html>");
    
    //TextField
    
    JTextField usuario= new JTextField();
    JTextField passe= new JTextField();
 
    //Label
    JLabel nomeusuarioJl= new JLabel("Nome da empresa/Email: ");
    JLabel PalavraPasseJl= new JLabel("Palavra-Passe: ");
    JLabel novContaJl= new JLabel("Ainda não adicionou a sua empresa?");
    
    //Fonte
     Font Tor = new Font ("Times new roman",Font.BOLD|Font.ROMAN_BASELINE ,15);
     
     
    public LoginEmpresa(){
        
        this.setLayout(null);
        this.Jp1.setLayout(null);
        this.fundo.setLayout(null);
        
        //Acções
        
        //Adicionando menus
         setJMenuBar(menu);
        menu.add(jj);
        menu.add(jj2);
        menu.add(jj3);
        jj.add(item1);
        
       //Adicionando borda 
      Jp1.setBorder(BorderFactory.createTitledBorder("EMPRESA:  ") );
     entrarJb.setBorder(BorderFactory.createRaisedBevelBorder());
     esqueceJb.setBorder(BorderFactory.createRaisedBevelBorder());
     novContaJb.setBorder(BorderFactory.createRaisedBevelBorder());
      
      //Tornando o painel de fundo opaco.
      Jp1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f)); 
      this.fundo.add(Jp1);
      
        
        //Dimensionando componentes.
        this.imgl.setBounds(70, 10, 250, 70);
        this.fundo.setBounds(0, 0, 400, 380);
        this.fundolb.setBounds(0, 0, 400, 380);
        Jp1.setBounds(10, 85,375, 260);
        this.usuarioimglb.setBounds(10, 40, 85, 100);
        this.nomeusuarioJl.setBounds(100, 40, 180, 20);
        this.usuario.setBounds(100,65,180,25);
        this.PalavraPasseJl.setBounds(100, 90, 180,20);
        this.passe.setBounds(100,109,180,25);
        this.entrarJb.setBounds(100,139,80,30);
        this.esqueceJb.setBounds(190,135,100,40);
        this.novContaJl.setBounds(10,170,260,30);
        this.novContaJb.setBounds(130,205,150,50);
        
        //Editando fontes
        this.nomeusuarioJl.setFont(Tor);
        this.usuario.setFont(Tor);
        this.PalavraPasseJl.setFont(Tor);
        this.passe.setFont(Tor);
        this.entrarJb.setFont(Tor);
        this.esqueceJb.setFont(Tor);
        this.novContaJl.setFont(Tor);
        this.novContaJb.setFont(Tor);
        

        //Adicionando Componentes
        this.Jp1.add(fundolb);
        this.Jp1.add(usuarioimglb);
        this.Jp1.add(nomeusuarioJl);
        this.Jp1.add(usuario);
        this.Jp1.add(PalavraPasseJl);
        this.Jp1.add(passe);
        this.Jp1.add(entrarJb);
        this.Jp1.add(esqueceJb);
        this.Jp1.add(novContaJl);
        this.Jp1.add(novContaJb);
        //Adicionando Fundo
        this.fundo.add(imgl);
        this.fundo.add(fundolb);
        this.add(fundo);
        
        // Dimensoes da janela.
        this.setSize(600, 600);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
}
    
    
    public static void main(String[] args) {
        new LoginEmpresa();
    }
}
