
package View;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Cadastro_Usuario1 extends JFrame implements ActionListener{ 

    //ICONES
     ImageIcon imgportalemprego = new ImageIcon(getClass().getResource("Portalemprego.png"));
     
    ImageIcon imgususario= new ImageIcon(getClass().getResource("Usuarioprinc.png"));
    
    //SECÇÃO LABEL
    JLabel Jlfichacadastro = new JLabel("     FICHA DE CADASTRO DO USUÁRIO");   JLabel nome = new JLabel("Nome do usuário:");
    JLabel Jlemail = new JLabel("E-mail do Usuário:");                          JLabel Jlp_passe = new JLabel("Palavra-Passe:");
    JLabel Jlconfirmarp_passe = new JLabel("Confirmar Palavra-Passe:");         JLabel Jldicap_passe = new JLabel("Dica de Palavra-Passe:");
    JLabel Jlemailrecuperacao = new JLabel("E-mail de Recuperação:");           JLabel Jliconeusuario = new JLabel(imgususario);
    JLabel Jlportalemprego = new JLabel(imgportalemprego);                    
    
    
    //SECÇÃO TEXTFIELD
    JTextField Jtnome = new JTextField(20);              JTextField Jtemail = new JTextField(20);
    JTextField Jtp_passe = new JTextField(20);           JTextField Jtconfirmarp_passe = new JTextField(20);
    JTextField Jtdicap_passe = new JTextField(20);       JTextField Jtemailrecuperacao = new JTextField(20);
    
    //SECÇÃO BUTTON
    JButton Jbvoltar = new JButton("VOLTAR");         JButton Jbproximo = new JButton("PRÓXIMO");
      JButton Jbcarregarfoto = new JButton("CARREGAR FOTO DE PERFIL");
       
    //SECÇÃO MENU
    JMenuBar menu = new JMenuBar();
    JMenu opcoes = new JMenu("Opções");     JMenu servicos = new JMenu("Serviços");
    JMenu sobre = new JMenu("Sobre");       JMenuItem sair = new JMenuItem("Sair"); 
    
    //SECÇÃO PANEL
    JPanel pnorte = new JPanel(new BorderLayout());
    JPanel pcentro = new JPanel(new GridBagLayout());
    JPanel psul = new JPanel(new BorderLayout()); 
    JPanel pbutton = new JPanel();
    
    public Cadastro_Usuario1(){
        
        
        
        //CONFIGURAÇÃO DA JANELA
        this.setLayout(new BorderLayout());
        this.setSize(950, 700);
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); 
        this.setBackground(new Color(0x8bb1c4));
        
        /*
        nome.setForeground(Color.white);
        email.setForeground(Color.white);
        p_passe.setForeground(Color.white);
        confirmarp_passe.setForeground(Color.white);
        dicap_passe.setForeground(Color.white);
        emailrecuperacao.setForeground(Color.white);
        carregarfoto.setForeground(Color.white);
        */
        //Accoes
        this.Jbproximo.addActionListener(this);
        this.Jbvoltar.addActionListener(this);
        this.Jbcarregarfoto.addActionListener(this);
        
        //PAINEL NORTE
        pnorte.add(Jlportalemprego, BorderLayout.WEST);
        pnorte.setBackground(Color.white);
        Jlfichacadastro.setFont(new Font(null, Font.BOLD,25));
//        fichacadastro.setForeground(Color.yellow);
        pnorte.add(Jlfichacadastro, BorderLayout.CENTER);
        
        //PAINEL CENTRO
        pcentro.setBackground(new Color(0x8bb1c4));
        nome.setFont(new Font(null, Font.BOLD,15));
        Jlemail.setFont(new Font(null, Font.BOLD,15));
        Jlp_passe.setFont(new Font(null, Font.BOLD,15));
        Jlconfirmarp_passe.setFont(new Font(null, Font.BOLD,15));
        Jldicap_passe.setFont(new Font(null, Font.BOLD,15));
       Jlemailrecuperacao.setFont(new Font(null, Font.BOLD,15));
        
        Jbcarregarfoto.setFont(new Font(null, Font.BOLD,15));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 10, 3, 10);
        gbc.gridx = 0;
        gbc.gridy = 0; pcentro.add(Jliconeusuario, gbc);
        gbc.gridy = 2; pcentro.add(Jbcarregarfoto, gbc);
        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridy = 0; pcentro.add(nome, gbc);
        gbc.gridy = 1; pcentro.add(Jlemail, gbc);
        gbc.gridy = 2; pcentro.add(Jlp_passe, gbc);
        gbc.gridy = 3; pcentro.add(Jlconfirmarp_passe, gbc);
        gbc.gridy = 4; pcentro.add(Jldicap_passe, gbc);
        gbc.gridy = 5; pcentro.add(Jlemailrecuperacao, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridy = 0; pcentro.add(Jtnome, gbc);
        gbc.gridy = 1; pcentro.add(Jtemail, gbc);
        gbc.gridy = 2; pcentro.add(Jtp_passe, gbc);
        gbc.gridy = 3; pcentro.add(Jtconfirmarp_passe, gbc);
        gbc.gridy = 4; pcentro.add(Jtdicap_passe, gbc);
        gbc.gridy = 5; pcentro.add(Jtemailrecuperacao, gbc);
        
        
        //PAINEL SUL
        pbutton.setBackground(new Color(0x8bb1c4));
        pbutton.add(Jbvoltar);
        pbutton.add(Jbproximo);
        psul.add(pbutton, BorderLayout.SOUTH);
        psul.setBackground(new Color(0x8bb1c4));
        
        add(pnorte, BorderLayout.NORTH); add(pcentro, BorderLayout.CENTER); add(psul, BorderLayout.EAST);
    }

    public JTextField getJtnome() {
        return Jtnome;
    }

    public void setJtnome(JTextField Jtnome) {
        this.Jtnome = Jtnome;
    }

    public JTextField getJtemail() {
        return Jtemail;
    }

    public void setJtemail(JTextField Jtemail) {
        this.Jtemail = Jtemail;
    }

    public JTextField getJtp_passe() {
        return Jtp_passe;
    }

    public void setJtp_passe(JTextField Jtp_passe) {
        this.Jtp_passe = Jtp_passe;
    }

    public JTextField getJtconfirmarp_passe() {
        return Jtconfirmarp_passe;
    }

    public void setJtconfirmarp_passe(JTextField Jtconfirmarp_passe) {
        this.Jtconfirmarp_passe = Jtconfirmarp_passe;
    }

    public JTextField getJtdicap_passe() {
        return Jtdicap_passe;
    }

    public void setJtdicap_passe(JTextField Jtdicap_passe) {
        this.Jtdicap_passe = Jtdicap_passe;
    }

    public JTextField getJtemailrecuperacao() {
        return Jtemailrecuperacao;
    }

    public void setJtemailrecuperacao(JTextField Jtemailrecuperacao) {
        this.Jtemailrecuperacao = Jtemailrecuperacao;
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public ImageIcon getImgususario() {
        return imgususario;
    }

    public void setImgususario(ImageIcon imgususario) {
        this.imgususario = imgususario;
    }
    

    public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==Jbproximo){
             setVisible(false);
             new CadastroUsuario(this);
         }
         if(e.getSource()==Jbvoltar){
             new AccoesRapidas();
             setVisible(false);
             
                    }
         if(e.getSource()==Jbcarregarfoto){
             
              JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

         } 
    }
    
    
    public static void main(String[] args) {
        new Cadastro_Usuario1();
    }    

}
