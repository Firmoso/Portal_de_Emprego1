
package View;

import Controller.LoginUsuarioController;
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
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BoxLayout;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class AccoesRapidas extends JFrame implements ActionListener {
    
     public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==empresaJb){
            
             new CadastroEmpresa();
             setVisible(false);
             
                    }
        if(e.getSource()==ususarioJb){
            new Cadastro_Usuario1();
            setVisible(false);
        }
        if(e.getSource()==entrar){
            new InterfacePrincipal();
            setVisible(false);
        }
       
    }
     //Panels
    JPanel pnorte= new JPanel();
    JPanel pcentro= new JPanel();  
    JPanel patalho= new JPanel(new GridBagLayout()); 
    JPanel pbutton= new JPanel(new BorderLayout()); 
    //Buttons
    JButton entrar= new JButton("INÍCIO");
     //Jmenus
     
      JMenuBar menu= new JMenuBar();
    JMenu jj = new JMenu("Opções");
    JMenu jj2 = new JMenu("Serviços");
    JMenu jj3 = new JMenu("Sobre");
    JMenuItem item1= new JMenuItem("Sair");
    
    //Imagens
     ImageIcon portalempregoim= new ImageIcon(getClass().getResource("Portalemprego.png"));
     JLabel imgl= new JLabel(portalempregoim);
     ImageIcon ususarioimg= new ImageIcon(getClass().getResource("Usuarioprinc.png"));
     JLabel usuariolb= new JLabel(ususarioimg);
     ImageIcon empresaimg= new ImageIcon(getClass().getResource("empresa.png"));
     JLabel empresalb= new JLabel(empresaimg);
   
    //Buttons
    JButton ususarioJb= new JButton("NOVO USUÁRIO");
    JButton empresaJb= new JButton("NOVA EMPRESA");
 
    public AccoesRapidas(){
        
       this.setLayout(new BorderLayout());
        //Criando objecto controller... .
//        Controller = new LoginUsuarioController(this);
        
        //Adiconando menus
         setJMenuBar(menu);
        menu.add(jj);
        menu.add(jj2);
        menu.add(jj3);
        jj.add(item1);
        
        //Accoes
        this.entrar.addActionListener(this);
        this.ususarioJb.addActionListener(this);
        this.empresaJb.addActionListener(this);
        
        //PAINEL NORTE
        pnorte.add(imgl);
        pnorte.setBackground(new Color(0x123456));
        this.add(pnorte, BorderLayout.NORTH);
        
        
        //PAINEL CENTRO
        pcentro.setLayout(new BoxLayout(pcentro, BoxLayout.Y_AXIS));
        
        
         GridBagConstraints gd = new GridBagConstraints();
//         gd.anchor = GridBagConstraints.LINE_END;
         gd.insets = new Insets(10,10,10,10);
         gd.gridx=0;    gd.gridy=0;     patalho.add(usuariolb, gd);
         gd.gridx=1;    gd.gridy=0;     patalho.add(empresalb, gd);
         gd.gridx=0;    gd.gridy=1;     patalho.add(ususarioJb, gd);
         gd.gridx=1;    gd.gridy=1;     patalho.add(empresaJb, gd);
         this.add(pcentro, BorderLayout.CENTER);
         
         
         pcentro.add(patalho);
         
         //PAINEL SUL
         entrar.setForeground(Color.white);
         entrar.setBackground(new Color(0x123456));
         pbutton.add(entrar, BorderLayout.EAST);
         pbutton.setBackground(Color.white);
         this.add(pbutton, BorderLayout.SOUTH);
         
       //Adicionando borda 
      pcentro.setBorder(BorderFactory.createTitledBorder("ACÇÕES RÁPIDAS:  ") );
     
        // Dimensoes da janela.
        pcentro.setBackground(Color.white);
        patalho.setBackground(Color.white);
        pnorte.setBackground(Color.white);
        patalho.setBackground(new Color(0x8bb1c4));
        this.setSize(500, 500);
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
}
    
    public static void main(String[] args) {
        new AccoesRapidas();
    }
}
