package View;
import Controller.CadastroUsuarioController;
import com.toedter.calendar.JCalendar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.*;


public class CadastroUsuario extends JFrame implements ActionListener{
  
  private final Cadastro_Usuario1 View;  
  JCalendar calendario= new JCalendar();
    
//ButtonGroup
    ButtonGroup BtGroup= new ButtonGroup();
    
    //Arrays
    String nacionalidade [] = new String [] {"Angola", "Brasil", "Cabo Verde", "Guiné-Bissau", "Moçambique", 
                                             "Portugal", "São Tomé e Príncipe", "Timor-Leste"};
    String []residencia = new String[]{"Maputo-Cidade","Maputo-Província","Inhambane","Gaza", "Sofala",
                                       "Manica","Zambézia","Tete", "Niassa","Nampula", "Cabo Delgado"};
    String []formacao = new String[]{"Nenhuma","Bacharel","Ensino Básico","Ensino Médio","Licenciatura", "Mestrado","Doutorado","Catedrático"};
    String []experiencia = new String[]{"Nenhum","3 Meses","6 Meses","12 Meses","</= 3 Anos", "</= 5 Anos","</= 10 Anos","> 10 Anos"};
    //Combobox
    JComboBox<Object> JcNacionalidade = new JComboBox<>(nacionalidade);
    JComboBox<Object> JcResidencia = new JComboBox<>(residencia);
    JComboBox<Object> JcFormAcademica= new JComboBox<>(formacao);
    JComboBox<Object> JcExper= new JComboBox<>(experiencia);
    
    //Barra de rolagem
    JScrollPane scroll= new JScrollPane();
    JScrollBar bar= new JScrollBar();
    
     //Menus
     JMenuBar menu= new JMenuBar();
    JMenu jj = new JMenu("Opções");
    JMenu jj2 = new JMenu("Serviços");
    JMenu jj3 = new JMenu("Sobre");
    JMenuItem item1= new JMenuItem("Sair");
    JMenuItem item2 = new JMenuItem("Voltar");
  
    //Imagens
     ImageIcon portalempregoim;
     JLabel imgl;
     ImageIcon fundoimg;
     JLabel fundolb;
    
    //Panels
    JPanel pnorte  = new JPanel(new BorderLayout());
    JPanel pcentro = new JPanel();  
    JPanel psul = new JPanel(new BorderLayout());
    JPanel pdadospessoais = new JPanel(new GridBagLayout());
    JPanel pdadosinstitucionais = new JPanel (new GridBagLayout());
    JPanel pbuttons = new JPanel();
    JPanel pBtGroup = new JPanel();
    JPanel pfileCarta = new JPanel();
    JPanel pfileCv = new JPanel();
    
    //TextField
    JTextField JtnomeCompl= new JTextField(15);
    JTextField JtnumDoc= new JTextField(15);
    JTextField JtContPrinc= new JTextField(10);
    JTextField JtContSec= new JTextField(10);
    JTextField JtE_mail= new JTextField(15);
    JTextField JtDataNasc= new JTextField("DD/MM/AAAA");
    
    //TextPainel2
    JTextField JtLocUltForm=new JTextField();
    JTextField JtCartRec= new JTextField();
    JTextField JtCarCv= new JTextField();
    JTextField JtOutro= new JTextField(10);
    JTextField JtCurso= new JTextField(10);
 
    //LABEL PAINEL DADOS PESSOAIS
    JLabel JlDadosPessoais= new JLabel("Dados pessoais: ");
    JLabel JlnomeCompl = new JLabel("Nome Completo: ");
    JLabel JlnumDoc = new JLabel("N. Documento: ");
    JLabel JlCont= new JLabel("Contactos/Telefone: ");
    JLabel JlE_mail= new JLabel("E_mail: ");
    JLabel JlDataNasc = new JLabel("Data de Nascimento: ");
    JLabel JlNacionalidade = new JLabel("Nacionalidade: ");
    JLabel JlTipoDoc= new JLabel("Tipo de documento: ");
    JLabel JlLocresi= new JLabel("Local de Residência: ");
    JLabel Jlprincipal= new JLabel("Principal: ");
    JLabel JlSecundario= new JLabel("Secundário: ");
    JLabel fichacadastro = new JLabel("     FICHA DE CADASTRO DO USUÁRIO");
    
    //LABEL PAINEL DADOS INSTITUCIONAIS
    JLabel JlFormAcademica= new JLabel("Formação académica: ");
    JLabel JlLocalForm = new JLabel("Local de ultima formação: ");
    JLabel JlAreaForm = new JLabel("Área de formação: ");
    JLabel JlCurso = new JLabel("Curso de formação: ");
    JLabel JlExperie= new JLabel("Periodo de experiência: ");
    JLabel JlCartRecomend = new JLabel("Carta de recomendação: ");
    JLabel JlCV = new JLabel("CV: ");
    //Checkbox
    JCheckBox JchSaude = new JCheckBox("Saúde");
    JCheckBox JchEduc  = new JCheckBox("Educação");
    JCheckBox Jchenge   = new JCheckBox("Engenharia");
    JCheckBox Jchseg     = new JCheckBox("Segurança");
    JCheckBox JcDireito= new JCheckBox("Direito");
    JCheckBox JcEconomia= new JCheckBox("Economia");
    JCheckBox JcGestao= new JCheckBox("Gestão");
    JCheckBox JcTransporte= new JCheckBox("Transporte");
    JCheckBox Jchoutro  = new JCheckBox("Outra (Especifique ao lado)");
    
    //RadioButton
    JRadioButton JrBI=new JRadioButton("BI");
    JRadioButton JrDIRE= new JRadioButton("DIRE");
    JRadioButton JrPASSAPORTE = new JRadioButton("PASSAPORTE");
    
    //Fonte
     Font Tor = new Font ("Times new roman",Font.BOLD|Font.ROMAN_BASELINE ,15);
    
    //Buttons
     JButton voltar = new JButton("VOLTAR");
     JButton submeter = new JButton("SUBMETER");
     JButton carregarcarta = new JButton("CARREGAR CARTA");
     JButton carregarcv = new JButton("CARREGAR CV");
    private final CadastroUsuarioController controller;
     

     
    CadastroUsuario(Cadastro_Usuario1 View){
     
        controller= new CadastroUsuarioController(this);
        this.View=View;
        this.fundoimg = new ImageIcon(getClass().getResource("FundoEmpresa2.png"));
        this.fundolb = new JLabel(fundoimg);
        this.portalempregoim = new ImageIcon(getClass().getResource("Portalemprego.png"));
        this.imgl = new JLabel(portalempregoim);
        
        this.voltar.addActionListener(this);
        this.carregarcarta.addActionListener(this);
        this.carregarcv.addActionListener(this);
        this.submeter.addActionListener(this);
        //Adicionando menus
         setJMenuBar(menu);
        menu.add(jj);
        menu.add(jj2);
        menu.add(jj3);
        jj.add(item1);
        
       //Adicionando borda 
      pdadospessoais.setBorder(BorderFactory.createTitledBorder("DADOS   PESSOAIS:  ") );
//      pdadosinstitucionais.setBorder(BorderFactory.createTitledBorder("DADOS INSTITUCIONAIS:  ") );
     
     Border loweredetched = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
     TitledBorder title = BorderFactory.createTitledBorder(loweredetched, "DADOS   INSTITUCIONAIS:    ");
    title.setTitleJustification(TitledBorder.RIGHT);
    pdadosinstitucionais.setBorder(title);
      
      //Tornando o painel de fundo opaco.
      pnorte.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f)); 
      pcentro.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
      psul.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
      pdadospessoais.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
      pdadosinstitucionais.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
      pcentro.add(pdadospessoais);
      pcentro.add(pdadosinstitucionais);
      add(pnorte, BorderLayout.NORTH);
      add(pcentro, BorderLayout.CENTER);
      add(psul, BorderLayout.SOUTH);

      //PAINEL NORTE
      pnorte.add(imgl, BorderLayout.WEST);
      pnorte.setBackground(Color.white);
      pnorte.add(fichacadastro, BorderLayout.CENTER);
      
      //PAINEL CENTRO
      pcentro.setBackground(new Color(0x8bb1c4));
      pcentro.setLayout(new BoxLayout(pcentro, BoxLayout.LINE_AXIS));
      pdadospessoais.setPreferredSize(new Dimension(0,400));
      pdadosinstitucionais.setPreferredSize(new Dimension(0,400));
      pcentro.add(pdadospessoais);
      pcentro.add(pdadosinstitucionais);
      
      //PAINEL SUL
      pbuttons.add(voltar);
      pbuttons.add(submeter);
      pbuttons.setBackground(new Color(0x8bb1c4));
      psul.add(pbuttons, BorderLayout.EAST);

    /* 
    //Adicionando Fundo
     this.fundo.add(imgl);
     this.fundo.add(fundolb);
     this.add(fundo);        
    */    
    
    PainelDadosPessoais();
    PainelDadosInstitucionais();
    
        // Dimensoes da janela.
      this.setSize(900, 700);
      //this.pack();
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    } 
    
    void PainelDadosPessoais(){
       //PAINEL DADOS PESSOAIS
//   this.Jp1.add(fundolb);
   
        //Adicionando Componentes
        GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(3, 10, 3, 10);
            gbc.fill=GridBagConstraints.HORIZONTAL;
            gbc.gridx = 0;
            gbc.gridy = 0;      pdadospessoais.add(JlnomeCompl,gbc);
            gbc.gridy = 1;      pdadospessoais.add(JtnomeCompl,gbc);
            gbc.gridy = 3;      pdadospessoais.add(JlDataNasc,gbc);
            gbc.gridy = 4;      pdadospessoais.add(JtDataNasc,gbc);
            gbc.gridy = 6;      pdadospessoais.add(JlNacionalidade,gbc);
            gbc.gridy = 7;      pdadospessoais.add(JcNacionalidade,gbc);
            gbc.gridy = 9;      pdadospessoais.add(JlTipoDoc,gbc);
            
            gbc.gridy= 10;      gbc.ipady=1;
            BtGroup.add(JrBI);    BtGroup.add(JrDIRE);  BtGroup.add(JrPASSAPORTE);
            pBtGroup.add(JrBI);   pBtGroup.add(JrDIRE); pBtGroup.add(JrPASSAPORTE);
            pdadospessoais.add(pBtGroup,gbc);
            
            gbc.gridy= 12;       pdadospessoais.add(JlnumDoc,gbc);
            gbc.gridy= 13;       pdadospessoais.add(JtnumDoc,gbc);
            gbc.gridy= 15;       pdadospessoais.add(JlCont,gbc);
            gbc.gridy= 16;       pdadospessoais.add(Jlprincipal,gbc);
            gbc.gridy= 17;       pdadospessoais.add(JtContPrinc,gbc);
            gbc.gridy= 18;       pdadospessoais.add(JlSecundario,gbc);
            gbc.gridy= 19;       pdadospessoais.add(JtContSec,gbc);
            gbc.gridy= 20;       pdadospessoais.add(JlLocresi,gbc);
            gbc.gridy= 21;       pdadospessoais.add(JcResidencia,gbc);          
    }
     
    void PainelDadosInstitucionais(){
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill=GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(3, 10, 3, 10);
//        gbc.anchor=GridBagConstraints.LINE_END;
        gbc.ipadx=0;    gbc.gridx=0;    gbc.gridy=0;
                        pdadosinstitucionais.add(JlFormAcademica,gbc);
        gbc.gridy=1;    pdadosinstitucionais.add(JcFormAcademica,gbc);
        gbc.gridy=2;    pdadosinstitucionais.add(JlLocalForm,gbc);
        gbc.gridy=3;    pdadosinstitucionais.add(JtLocUltForm,gbc);
        gbc.gridy=4;    pdadosinstitucionais.add(JlAreaForm,gbc);
        gbc.gridy=5;    pdadosinstitucionais.add(JcEconomia,gbc);
        gbc.gridy=6;    pdadosinstitucionais.add(JchEduc,gbc);
        gbc.gridy=7;    pdadosinstitucionais.add(Jchenge,gbc);
        gbc.gridy=8;    pdadosinstitucionais.add(JcDireito,gbc);
        
        gbc.gridx=1;    
        gbc.gridy=5;    pdadosinstitucionais.add(JcGestao,gbc);       
        gbc.gridy=6;    pdadosinstitucionais.add(JchSaude,gbc);       
        gbc.gridy=7;    pdadosinstitucionais.add(Jchseg,gbc);        
        gbc.gridy=8;    pdadosinstitucionais.add(JcTransporte,gbc);                 
        gbc.gridx=0;    gbc.gridy=9;
                        pdadosinstitucionais.add(Jchoutro,gbc);
        gbc.gridx=1;    gbc.gridy=9;
                        pdadosinstitucionais.add(JtOutro,gbc);
                        
        gbc.gridx=0;    gbc.gridy=10;   
                        pdadosinstitucionais.add(JlCurso,gbc);
        gbc.gridx=1;    gbc.gridy=10;
                        pdadosinstitucionais.add(JtCurso,gbc);
        gbc.gridx=0;    gbc.gridy=11;                
                        pdadosinstitucionais.add(JlExperie,gbc);        
        gbc.gridx=1;    gbc.gridy=11;    pdadosinstitucionais.add(JcExper,gbc);     
        
        gbc.gridx=0;    gbc.gridy=12;   pdadosinstitucionais.add(JlCartRecomend,gbc);        
        gbc.gridy=13;   //gbc.ipadx=2;
                        pdadosinstitucionais.add(carregarcarta,gbc);        
        gbc.gridx=1;    gbc.gridy=13;   pdadosinstitucionais.add(JtCartRec,gbc);
        gbc.gridx=0;    gbc.gridy=14;   pdadosinstitucionais.add(JlCV,gbc);
                        gbc.gridy=15;   pdadosinstitucionais.add(carregarcv,gbc);
        gbc.gridx=1;    gbc.gridy=15;   pdadosinstitucionais.add(JtCarCv,gbc);  
    }

             public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==voltar){
            new Cadastro_Usuario1();
             setVisible(false);
                    }
         if(e.getSource()==submeter){
             try {
                 controller.adicionarusuario();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(CadastroUsuario.class.getName()).log(Level.SEVERE, null, ex);
             }
             setVisible(false);
             
                    }
         if(e.getSource()==carregarcarta){
             
         }
         
         if(e.getSource()==carregarcv){
             
         }
       
    }
             
             
    public JComboBox<Object> getJcNacionalidade() {
        return JcNacionalidade;
    }

    public void setJcNacionalidade(JComboBox<Object> JcNacionalidade) {
        this.JcNacionalidade = JcNacionalidade;
    }

    public JComboBox<Object> getJcResidencia() {
        return JcResidencia;
    }

    public void setJcResidencia(JComboBox<Object> JcResidencia) {
        this.JcResidencia = JcResidencia;
    }

    public JComboBox<Object> getJcFormAcademica() {
        return JcFormAcademica;
    }

    public void setJcFormAcademica(JComboBox<Object> JcFormAcademica) {
        this.JcFormAcademica = JcFormAcademica;
    }

    public JComboBox<Object> getJcExper() {
        return JcExper;
    }

    public void setJcExper(JComboBox<Object> JcExper) {
        this.JcExper = JcExper;
    }

    public JTextField getJtnomeCompl() {
        return JtnomeCompl;
    }

    public void setJtnomeCompl(JTextField JtnomeCompl) {
        this.JtnomeCompl = JtnomeCompl;
    }

    public JTextField getJtnumDoc() {
        return JtnumDoc;
    }

    public void setJtnumDoc(JTextField JtnumDoc) {
        this.JtnumDoc = JtnumDoc;
    }

    public JTextField getJtContPrinc() {
        return JtContPrinc;
    }

    public void setJtContPrinc(JTextField JtContPrinc) {
        this.JtContPrinc = JtContPrinc;
    }

    public JTextField getJtContSec() {
        return JtContSec;
    }

    public void setJtContSec(JTextField JtContSec) {
        this.JtContSec = JtContSec;
    }

    public JTextField getJtE_mail() {
        return JtE_mail;
    }

    public void setJtE_mail(JTextField JtE_mail) {
        this.JtE_mail = JtE_mail;
    }

    public JTextField getJtDataNasc() {
        return JtDataNasc;
    }

    public void setJtDataNasc(JTextField JtDataNasc) {
        this.JtDataNasc = JtDataNasc;
    }

    public JTextField getJtLocUltForm() {
        return JtLocUltForm;
    }

    public void setJtLocUltForm(JTextField JtLocUltForm) {
        this.JtLocUltForm = JtLocUltForm;
    }

    public JTextField getJtCartRec() {
        return JtCartRec;
    }

    public void setJtCartRec(JTextField JtCartRec) {
        this.JtCartRec = JtCartRec;
    }

    public JTextField getJtCarCv() {
        return JtCarCv;
    }

    public void setJtCarCv(JTextField JtCarCv) {
        this.JtCarCv = JtCarCv;
    }

    public JTextField getJtOutro() {
        return JtOutro;
    }

    public void setJtOutro(JTextField JtOutro) {
        this.JtOutro = JtOutro;
    }

    public JTextField getJtCurso() {
        return JtCurso;
    }

    public void setJtCurso(JTextField JtCurso) {
        this.JtCurso = JtCurso;
    }

    public JCheckBox getJchSaude() {
        return JchSaude;
    }

    public void setJchSaude(JCheckBox JchSaude) {
        this.JchSaude = JchSaude;
    }

    public JCheckBox getJchEduc() {
        return JchEduc;
    }

    public void setJchEduc(JCheckBox JchEduc) {
        this.JchEduc = JchEduc;
    }

    public JCheckBox getJchenge() {
        return Jchenge;
    }

    public void setJchenge(JCheckBox Jchenge) {
        this.Jchenge = Jchenge;
    }

    public JCheckBox getJchseg() {
        return Jchseg;
    }

    public void setJchseg(JCheckBox Jchseg) {
        this.Jchseg = Jchseg;
    }

    public JCheckBox getJcDireito() {
        return JcDireito;
    }

    public void setJcDireito(JCheckBox JcDireito) {
        this.JcDireito = JcDireito;
    }

    public JCheckBox getJcEconomia() {
        return JcEconomia;
    }

    public void setJcEconomia(JCheckBox JcEconomia) {
        this.JcEconomia = JcEconomia;
    }

    public JCheckBox getJcGestao() {
        return JcGestao;
    }

    public void setJcGestao(JCheckBox JcGestao) {
        this.JcGestao = JcGestao;
    }

    public JCheckBox getJcTransporte() {
        return JcTransporte;
    }

    public void setJcTransporte(JCheckBox JcTransporte) {
        this.JcTransporte = JcTransporte;
    }

    public JCheckBox getJchoutro() {
        return Jchoutro;
    }

    public void setJchoutro(JCheckBox Jchoutro) {
        this.Jchoutro = Jchoutro;
    }

    public JRadioButton getBI() {
        return JrBI;
    }

    public void setBI(JRadioButton BI) {
        this.JrBI = BI;
    }

    public JRadioButton getDIRE() {
        return JrDIRE;
    }

    public void setDIRE(JRadioButton DIRE) {
        this.JrDIRE = DIRE;
    }

    public JRadioButton getPASSAPORTE() {
        return JrPASSAPORTE;
    }

    public void setPASSAPORTE(JRadioButton PASSAPORTE) {
        this.JrPASSAPORTE = PASSAPORTE;
    }
    
        //Ajudante
     private String nomeUsuario,emailRecuperacao,email,passe;

    public String getNomeUsuario() {
        return View.getJtnome().getText();
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailRecuperacao() {
        return View.getJtemailrecuperacao().getText();
    }

    public void setEmailRecuperacao(String emailRecuperacao) {
        this.emailRecuperacao = emailRecuperacao;
    }

    public String getEmail() {
        return View.getJtemail().getText();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasse() {
        return View.getJtp_passe().getText();
    }

    public void setPasse(String passe) {
        this.passe = passe;
    }

    public JRadioButton getJrBI() {
        return JrBI;
    }

    public void setJrBI(JRadioButton JrBI) {
        this.JrBI = JrBI;
    }

    public JRadioButton getJrDIRE() {
        return JrDIRE;
    }

    public void setJrDIRE(JRadioButton JrDIRE) {
        this.JrDIRE = JrDIRE;
    }

    public JRadioButton getJrPASSAPORTE() {
        return JrPASSAPORTE;
    }

    public void setJrPASSAPORTE(JRadioButton JrPASSAPORTE) {
        this.JrPASSAPORTE = JrPASSAPORTE;
    }

    public void exibirMensagem(String adicionado_com_sucesso) {
JOptionPane.showMessageDialog(null, adicionado_com_sucesso); 
    new InterfacePrincipal();
    }
    
    
    
}
