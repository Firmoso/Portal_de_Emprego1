
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import View.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Login_Principal extends JFrame implements ActionListener {
    
     public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==empresaJb){
            
             new CadastroEmpresa();
             setVisible(false);
             
                    }
        if(e.getSource()==ususarioJb){
            new Cadastro_Usuario1();
            setVisible(false);
        }
       
    }
     
     //Jmenus
     
      JMenuBar menu= new JMenuBar();
    JMenu jj = new JMenu("Opções");
    JMenu jj2 = new JMenu("Serviços");
    JMenu jj3 = new JMenu("Sobre");
    JMenuItem item1= new JMenuItem("Sair");
    
    //Imagens
     ImageIcon portalempregoim= new ImageIcon(getClass().getResource("Portalemprego.png"));
     JLabel imgl= new JLabel(portalempregoim);
     ImageIcon fundoimg= new ImageIcon(getClass().getResource("Fundo1org.png"));
     JLabel fundolb= new JLabel(fundoimg);
     ImageIcon ususarioimg= new ImageIcon(getClass().getResource("Usuarioprinc.png"));
     JLabel usuarioimglb= new JLabel(ususarioimg);
     ImageIcon empresaimg= new ImageIcon(getClass().getResource("empresa.png"));
     JLabel empresalb= new JLabel(empresaimg);
    
    //Panels
    JPanel fundo= new JPanel();
    JPanel Jp1= new JPanel();  
   
    //Buttons
    JButton ususarioJb= new JButton("USUÁRIO");
    JButton empresaJb= new JButton("EMPRESA");
 
    public Login_Principal(){
        
        this.setLayout(null);
        this.Jp1.setLayout(null);
        this.fundo.setLayout(null);
        
        //Adicionando menus
        
         setJMenuBar(menu);
        menu.add(jj);
        menu.add(jj2);
        menu.add(jj3);
        jj.add(item1);
        
         
        //Accoes
        this.empresaJb.addActionListener(this);
        this.ususarioJb.addActionListener(this);
        this.item1.addActionListener(this);
        
        
        //Adicionando borda 
      Jp1.setBorder(BorderFactory.createTitledBorder("Entrar como: ") );
      ususarioJb.setBorder(BorderFactory.createRaisedBevelBorder());
      empresaJb.setBorder(BorderFactory.createRaisedBevelBorder());
      
      //Tornando o painel de fundo opaco.
      Jp1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
      this.fundo.add(Jp1);
        
        //Dimensionando componentes.
        this.imgl.setBounds(70, 10, 250, 70);
        this.fundo.setBounds(0, 0, 400, 400);
        this.fundolb.setBounds(0, 0, 400, 400);
        Jp1.setBounds(10, 85,375, 240);
        this.usuarioimglb.setBounds(40, 40, 85, 89);
        this.ususarioJb.setBounds(30, 140, 100, 30);
        this.empresaJb.setBounds(230, 140, 100, 30);
        this.empresalb.setBounds(235, 40, 85, 89);
        
        //Adicionando Componentes
        this.Jp1.add(fundolb);
        this.Jp1.add(usuarioimglb);
        this.Jp1.add(ususarioJb);
        this.Jp1.add(empresaJb);
        this.Jp1.add(empresalb);
        
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
        new Login_Principal();
    }
}
