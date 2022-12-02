package View;
import Controller.CadastroEmpresaController;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class CadastroEmpresa extends JFrame implements ActionListener {
    
    //Arrays
    String []provincias = new String[]{"Maputo-Cidade","Maputo-Província","Inhambane","Gaza", "Sofala",
                                       "Manica","Zambézia","Tete", "Niassa","Nampula", "Cabo Delgado"};
    //Jcombobox
    JComboBox<Object> JcLocalizacao= new JComboBox<>(provincias);
    
    JCheckBox JcTodas= new JCheckBox("Todas");
    JCheckBox JcSaude= new JCheckBox("Saúde");
    JCheckBox JcEducacao= new JCheckBox("Educação");
    JCheckBox JcEngenharia= new JCheckBox("Engenharia");    
    JCheckBox JcSeguranca= new JCheckBox("Segurança");
    JCheckBox JcDireito= new JCheckBox("Direito");
    JCheckBox JcEconomia= new JCheckBox("Economia");
    JCheckBox JcGestao= new JCheckBox("Gestão");
    JCheckBox JcTransporte= new JCheckBox("Transporte");
    
    //Menus
     JMenuBar menu= new JMenuBar();
    JMenu jj = new JMenu("Opções");
    JMenu jj2 = new JMenu("Serviços");
    JMenu jj3 = new JMenu("Sobre");
    JMenuItem item1= new JMenuItem("Sair");
   
    //Imagens
     ImageIcon portalempregoim;
     JLabel imgl;
     ImageIcon fundoimg;
     JLabel fundolb;
     ImageIcon ususarioimg;
     JLabel usuarioimglb;
    
    //Panels
    JPanel pSul = new JPanel(new GridBagLayout());
    JPanel pnorte = new JPanel(new BorderLayout());
    JPanel pcentro = new JPanel();
    JPanel psul = new JPanel(new BorderLayout());
    JPanel pnort = new JPanel();
    JPanel pperfil = new JPanel(new GridBagLayout());
    JPanel pempresa = new JPanel(new GridBagLayout());
    JPanel pempresa2 = new JPanel(new GridBagLayout());
    JPanel pregistador = new JPanel(new GridBagLayout());
    JPanel ppalavrapasse = new JPanel(new GridBagLayout());
    JPanel pbuttons = new JPanel(); 
    
    //TextField
    
    JTextField JtNomEmpresa= new JTextField(10);
    JTextField JtE_mail= new JTextField(10);
    JTextField JtContacto= new JTextField(10);
    JTextField JtBairro= new JTextField(10);
    JTextField JtAvenida= new JTextField(10);
    JTextField JtCaixaPost= new JTextField(10);
    JTextField JtNuit= new JTextField(10);
    JTextField JtNomreg= new JTextField(10);
    JTextField JtApelido= new JTextField(10);
    JTextField JtTelefonereg1= new JTextField(10);
  //  JTextField JtTelefone2= new JTextField(10);
    JTextField JtPosOcup= new JTextField(10);
    JTextField JtPalPasse= new JTextField(10);
    JTextField JtConfPasse= new JTextField(10);
    
    //Buttons
    JButton voltar = new JButton ("VOLTAR");
    JButton submeter = new JButton ("SUBMETER");
    
    //Label
    JLabel JlNomeEmpresa= new JLabel("Nome da empresa: ");
    JLabel JlpalPasse= new JLabel("Palavra-Passe: ");
    JLabel JlE_mail= new JLabel("E_mail: ");
    JLabel JlContEmpresa= new JLabel("Contacto/Telefone: ");
    JLabel JlLocalizacao= new JLabel("Localização da empresa: ");
    JLabel JlBairro= new JLabel("Bairro: ");
    JLabel JlAvenida= new JLabel("Avenida: ");
    JLabel JlCaixPostal= new JLabel("Caixa Postal: ");
    JLabel JlNuit= new JLabel("Nuit: ");
    JLabel JlInterresse= new JLabel("Áreas de interesse: ");
    JLabel JlPessoaResistra= new JLabel("Dados da pessoa que regista a empresa: ");
    JLabel JlNomePessoaRegistra= new JLabel("Nome: ");
    JLabel JlApelidoPessoaRegistra= new JLabel("Apelido: ");
    JLabel JlTelefonePessoaRegistra= new JLabel("Telefone: ");
    JLabel JlPosOcupa= new JLabel("Posição que ocupa na empresa: ");
    JLabel JlPalPasse= new JLabel("Palavra-Passe: ");
     JLabel JlPalPasseConfirm= new JLabel("Confirme a palavra-passe: ");
      JLabel JlMensagem= new JLabel("           Após a submissão, um código será enviado dentro de 24 horas "
                                              + "para validar o registo da empresa.");
    JLabel Jlperfil= new JLabel("CARREGAR FOTO DE PERFIL");
    JLabel Jlfichadastro = new JLabel("         FICHA DE CADASTRO DE EMPRESA");
      
    //Fonte
     Font Tor = new Font ("Times new roman",Font.BOLD|Font.ROMAN_BASELINE ,15);
    private CadastroEmpresa CadastroEmpresa;
    private final CadastroEmpresaController controller;
    
public CadastroEmpresa(){
            
    this.voltar.addActionListener(this);
    this.submeter.addActionListener(this);
    
        controller = new CadastroEmpresaController(this);
           
        this.setLayout(new BorderLayout());
        this.ususarioimg = new ImageIcon(getClass().getResource("empresa.png"));
        this.usuarioimglb = new JLabel(ususarioimg);
        this.fundoimg = new ImageIcon(getClass().getResource("FundoEmpresa2.png"));
        this.fundolb = new JLabel(fundoimg);
        this.portalempregoim = new ImageIcon(getClass().getResource("Portalemprego.png"));
        this.imgl = new JLabel(portalempregoim);
        
        //Adicionando menus
         setJMenuBar(menu);
        menu.add(jj);
        menu.add(jj2);
        menu.add(jj3);
        jj.add(item1);
        
        //Accoes
        this.voltar.addActionListener(this);
        this.submeter.addActionListener(this);
        //PAINEL NORTE
        Jlfichadastro.setFont(new Font(null, Font.BOLD,25));
        pnorte.add(imgl, BorderLayout.WEST);
        pnorte.add(Jlfichadastro, BorderLayout.CENTER);
        pnorte.setBackground(Color.white);
        add(pnorte, BorderLayout.NORTH);
        
        //PAINEL NORT
        pnort.setLayout(new BoxLayout(pnort, BoxLayout.X_AXIS));
        pnort.add(pperfil);
        pnort.add(pempresa);
                
        //PAINEL CENTRO
        pcentro.setLayout(new BoxLayout(pcentro, BoxLayout.Y_AXIS));
        pcentro.add(pnort);
        pcentro.add(pregistador);
        add(pcentro, BorderLayout.CENTER);
        
        //PAINEL PERFIL
        GridBagConstraints gd = new GridBagConstraints();
        gd.insets = new Insets(3, 15, 0, 10);
        gd.gridx = 0;      gd.gridy = 0;  pperfil.add(usuarioimglb, gd);
        gd.gridx = 0;      gd.gridy = 1;  pperfil.add(Jlperfil, gd);
        
        //PAINEL EMPRESA
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(3, 10, 3, 10);
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.gridx = 1;      gbc.gridy = 0;  pempresa.add(JlNomeEmpresa, gbc);
        gbc.gridx = 2;      gbc.gridy = 0;  pempresa.add(JtNomEmpresa, gbc);
        gbc.gridx = 1;      gbc.gridy = 1;  pempresa.add(JlE_mail, gbc);
        gbc.gridx = 2;      gbc.gridy = 1;  pempresa.add(JtE_mail, gbc);
        gbc.gridx = 1;      gbc.gridy = 2;  pempresa.add(JlContEmpresa, gbc);
        gbc.gridx = 2;      gbc.gridy = 2;  pempresa.add(JtContacto, gbc);
        gbc.gridx = 1;      gbc.gridy = 3;  pempresa.add(JlNuit, gbc);
        gbc.gridx = 2;      gbc.gridy = 3;  pempresa.add(JtNuit, gbc);
        gbc.gridx = 1;      gbc.gridy = 4;  pempresa.add(JlCaixPostal, gbc);
        gbc.gridx = 2;      gbc.gridy = 4;  pempresa.add(JtCaixaPost, gbc);
        
        gbc.gridx = 1;      gbc.gridy = 6;  pempresa.add(JlBairro, gbc);
        gbc.gridx = 1;      gbc.gridy = 7;  pempresa.add(JlAvenida, gbc);
        gbc.gridx = 2;      gbc.gridy = 6;  pempresa.add(JtBairro, gbc);
        gbc.gridx = 2;      gbc.gridy = 7;  pempresa.add(JtAvenida, gbc);
        
        //PAINEL EMPRESA2 (LOCALIZAÇÃO E ÁREAS DE INTERESSE)
        JcLocalizacao.setSize(20, 50);
        GridBagConstraints grd = new GridBagConstraints();
        grd.insets = new Insets(3, 10, 3, 10);
        grd.anchor = GridBagConstraints.LINE_START;
        grd.gridx = 3;      grd.gridy = 0;  pempresa2.add(JlLocalizacao, grd);
        grd.gridx = 4;      grd.gridy = 0;  pempresa2.add(JcLocalizacao, grd);
        grd.gridx = 3;      grd.gridy = 1;  pempresa2.add(JlInterresse, grd);
        grd.gridx = 3;      grd.gridy = 2;  pempresa2.add(JcTodas, grd);
        grd.gridx = 3;      grd.gridy = 3;  pempresa2.add(JcEconomia, grd);
        grd.gridx = 3;      grd.gridy = 4;  pempresa2.add(JcEducacao, grd);
        grd.gridx = 3;      grd.gridy = 5;  pempresa2.add(JcEngenharia, grd);
        grd.gridx = 3;      grd.gridy = 6;  pempresa2.add(JcDireito, grd);
        grd.gridx = 4;      grd.gridy = 3;  pempresa2.add(JcGestao, grd);
        grd.gridx = 4;      grd.gridy = 4;  pempresa2.add(JcSaude, grd);
        grd.gridx = 4;      grd.gridy = 5;  pempresa2.add(JcSeguranca, grd);
        grd.gridx = 4;      grd.gridy = 6;  pempresa2.add(JcTransporte, grd);
        pnort.add(pempresa2);
        
        
        //PAINEL REGISTADOR
        pregistador.setBorder(BorderFactory.createTitledBorder("Dados da pessoa que regista a empresa") );
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets(3, 10, 3, 10);
        grid.anchor = GridBagConstraints.LINE_END;
//        grid.gridx = 0;      grid.gridy = 0;  pregistador.add(JlPessoaResistra, grid);
        grid.gridx = 0;      grid.gridy = 1;  pregistador.add(JlNomePessoaRegistra, grid);
        grid.gridx = 0;      grid.gridy = 2;  pregistador.add(JlApelidoPessoaRegistra, grid);
       grid.gridx = 0;      grid.gridy = 3;  pregistador.add(JlTelefonePessoaRegistra, grid);
        grid.gridx = 0;      grid.gridy = 4;  pregistador.add(JlPosOcupa, grid);
        grid.gridx = 1;      grid.gridy = 1;  pregistador.add(JtNomreg, grid);
        grid.gridx = 1;      grid.gridy = 2;  pregistador.add(JtApelido, grid);
       grid.gridx = 1;      grid.gridy = 3;  pregistador.add(JtTelefonereg1, grid);
        grid.gridx = 1;      grid.gridy = 4;  pregistador.add(JtPosOcup, grid);
        
        //PAINEL PALAVRA-PASSE
        grid.gridx = 3;      grid.gridy = 3;   ppalavrapasse.add(JlPalPasse, grid);
        grid.gridx = 4;      grid.gridy = 3;   ppalavrapasse.add(JtPalPasse, grid);
        grid.gridx = 3;      grid.gridy = 4;   ppalavrapasse.add(JlPalPasseConfirm, grid);
        grid.gridx = 4;      grid.gridy = 4;   ppalavrapasse.add(JtConfPasse, grid);
        pSul.add( ppalavrapasse);
        
        //PAINEL Sul (PESSOA QUE REGISTA A EMPRESA E PALAVRA-PASSE)
        GridBagConstraints gid = new GridBagConstraints();
        gid.insets = new Insets(3, 15, 0, 10);
//        gid.weightx = 1;    gid.weighty = 1;
        gid.gridx = 0;      gid.gridy = 0;  pSul.add(pregistador, gid);
        gid.weightx = 1;    gid.weighty = 1;
        gid.gridx = 1;      gid.gridy = 0;  pSul.add(ppalavrapasse, gid);
        
//        pSul.add(pregistador);
//        pSul.add(ppalavrapasse);
        pcentro.add(pSul);
        
        //PAINEL SUL
        pbuttons.add(voltar);
        pbuttons.add(submeter);
        psul.add(pbuttons, BorderLayout.EAST);
        psul.add(JlMensagem, BorderLayout.CENTER);
        add(psul, BorderLayout.SOUTH);        
        
        //COLORIR PAINEIS
        pcentro.setBackground(new Color(0x8bb1c4));
        pSul.setBackground(new Color(0x8bb1c4));
        pbuttons.setBackground(new Color(0x8bb1c4));
        pempresa.setBackground(new Color(0x8bb1c4));
        pempresa2.setBackground(new Color(0x8bb1c4));
        pnort.setBackground(new Color(0x8bb1c4));
//        pnorte.setBackground(new Color(0x8bb1c4));
        ppalavrapasse.setBackground(new Color(0x8bb1c4));
        pperfil.setBackground(new Color(0x8bb1c4));
        pregistador.setBackground(new Color(0x8bb1c4));
//        psul.setBackground(new Color(0x8bb1c4));
        
        // Dimensoes da janela.
        this.setSize(900, 700);
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    } 
        
        public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==voltar){
             new AccoesRapidas();
             setVisible(false);
                    }
         
        if(e.getSource()==submeter){
             try {
                 controller.AdicionarEmpresa();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
             }
            this.setVisible(false);
           
        }
    }
        public void exibirMensagem(String mensagem){
             JOptionPane.showMessageDialog(null,mensagem);
        }

    public JTextField getJtNomEmpresa() {
        return JtNomEmpresa;
    }

    public void setJtNomEmpresa(JTextField JtNomEmpresa) {
        this.JtNomEmpresa = JtNomEmpresa;
    }

    public JTextField getJtE_mail() {
        return JtE_mail;
    }

    public void setJtE_mail(JTextField JtE_mail) {
        this.JtE_mail = JtE_mail;
    }

    public JTextField getJtContacto() {
        return JtContacto;
    }

    public void setJtContacto(JTextField JtContacto) {
        this.JtContacto = JtContacto;
    }

    public JTextField getJtBairro() {
        return JtBairro;
    }

    public void setJtBairro(JTextField JtBairro) {
        this.JtBairro = JtBairro;
    }

    public JTextField getJtAvenida() {
        return JtAvenida;
    }

    public void setJtAvenida(JTextField JtAvenida) {
        this.JtAvenida = JtAvenida;
    }

    public JTextField getJtCaixaPost() {
        return JtCaixaPost;
    }

    public void setJtCaixaPost(JTextField JtCaixaPost) {
        this.JtCaixaPost = JtCaixaPost;
    }

    public JTextField getJtNuit() {
        return JtNuit;
    }

    public void setJtNuit(JTextField JtNuit) {
        this.JtNuit = JtNuit;
    }

    public JTextField getJtNomreg() {
        return JtNomreg;
    }

    public void setJtNomreg(JTextField JtNomreg) {
        this.JtNomreg = JtNomreg;
    }

    public JTextField getJtApelido() {
        return JtApelido;
    }

    public void setJtApelido(JTextField JtApelido) {
        this.JtApelido = JtApelido;
    }

    public JTextField getJtTelefonereg1() {
        return JtTelefonereg1;
    }

    public void setJtTelefonereg1(JTextField JtTelefonereg1) {
        this.JtTelefonereg1 = JtTelefonereg1;
    }

    public JTextField getJtPosOcup() {
        return JtPosOcup;
    }

    public void setJtPosOcup(JTextField JtPosOcup) {
        this.JtPosOcup = JtPosOcup;
    }

    public JTextField getJtPalPasse() {
        return JtPalPasse;
    }

    public void setJtPalPasse(JTextField JtPalPasse) {
        this.JtPalPasse = JtPalPasse;
    }

    public JTextField getJtConfPasse() {
        return JtConfPasse;
    }

    public void setJtConfPasse(JTextField JtConfPasse) {
        this.JtConfPasse = JtConfPasse;
    }

    public JComboBox<Object> getJcLocalizacao() {
        return JcLocalizacao;
    }

    public void setJcLocalizacao(JComboBox<Object> JcLocalizacao) {
        this.JcLocalizacao = JcLocalizacao;
    }
    
    
    public static void main(String[] args) {
        new CadastroEmpresa();
    }
}
