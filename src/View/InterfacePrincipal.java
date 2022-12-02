package View;
import Controller.CadastroUsuarioController;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class InterfacePrincipal extends JFrame implements ActionListener{
 
    //JLABEL
final    JLabel lbinicio = new JLabel("INICIO");
final    JLabel lbusuario = new JLabel("USUÁRIO");
final    JLabel lbempresa = new JLabel("EMPRESA");
final    JLabel lbparceiro = new JLabel("PARCEIRO");
final    JLabel lbmais = new JLabel("MAIS");
final    JLabel lbadmin = new JLabel("ADMIN.");
final    JLabel lbpesquisar = new JLabel("PESQUISAR ENTIDADE");
final    JLabel lbeconomia = new JLabel("ECONOMIA");
final    JLabel lbeducacao = new JLabel("EDUCAÇÃO");
final    JLabel lbengenharia = new JLabel("ENGENHARIA");
final    JLabel lbdireito = new JLabel("DIREITO");
final    JLabel lbgestao = new JLabel("GESTÃO");
final    JLabel lbsaude = new JLabel("SAÚDE");
final    JLabel lbseguranca = new JLabel("SEGURANÇA");
final    JLabel lbtransporte = new JLabel("TRANSPORTE");
final    JLabel lbprofissao = new JLabel("PROFISSÃO");
final    JLabel lbpesquisa = new JLabel(" PESQUISAR  ");


final    JLabel lbinicio2 = new JLabel("INICIO");
final    JLabel lbusuario2 = new JLabel("USUÁRIO");
final    JLabel lbempresa2 = new JLabel("EMPRESA");
final    JLabel lbparceiro2 = new JLabel("PARCEIRO");
final    JLabel lbmais2 = new JLabel("MAIS");
final    JLabel lbadmin2 = new JLabel("ADMIN.");
final    JLabel lbpesquisar2 = new JLabel("PESQUISAR ENTIDADE");
final    JLabel lbeconomia2 = new JLabel("ECONOMIA");
final    JLabel lbeducacao2 = new JLabel("EDUCAÇÃO");
final    JLabel lbengenharia2 = new JLabel("ENGENHARIA");
final    JLabel lbdireito2 = new JLabel("DIREITO");
final    JLabel lbgestao2 = new JLabel("GESTÃO");
final    JLabel lbsaude2 = new JLabel("SAÚDE");
final    JLabel lbseguranca2 = new JLabel("SEGURANÇA");
final    JLabel lbtransporte2 = new JLabel("TRANSPORTE");
final    JLabel lbprofissao2 = new JLabel("PROFISSÃO");
final    JLabel lbpesquisa2 = new JLabel(" PESQUISAR  ");
    
    //JPANEL
    JPanel peste = new JPanel (new BorderLayout());
    JPanel plbadmin = new JPanel (new BorderLayout());
    JPanel padmin = new JPanel ();
    JPanel pcentro = new JPanel (new BorderLayout());
    JPanel poeste = new JPanel ();
    JPanel pcabecalho = new JPanel(new GridBagLayout()); //(new GridBagLayout());
    JPanel pareas = new JPanel ();
    JPanel ppesquisa = new JPanel (new GridBagLayout());
    JPanel panuncios = new JPanel (new GridBagLayout());
    JPanel pnorte = new JPanel (new BorderLayout());
    
    //ICONES E IMAGENS
     ImageIcon uemimg, portalempregoim, fundoimg, usuarioim, inicioimg, usuarioimg, empresaimg, parceiroimg, maisimg, pesquisaimg,
               economiaimg, educacaoimg, engenhariaimg, direitoimg, gestaoimg, saudeimg, segurancaimg, transporteimg, profissaoimg;
     JLabel imguem, imgportal, imgfundo, imgusuario;
     
     //TEXTFIELD
    JTextField tpesquisa = new JTextField (10);
     
    //JBUTTON
    JButton btinicio, btusuario, btempresa, btparceiro, btmais, btpesquisa,
            bteconomia, bteducacao, btengenharia, btdireito, btgestao, btsaude, btseguranca, bttransporte, btprofissao;
    
    //Label
    JLabel imgeconomia, imgeducacao, imgengenharia, imgdireito, imggestao, imgsaude, imgseguranca, imgtransporte, imgprofissao;
    
    
    InterfacePrincipal() {
        setLayout(new BorderLayout());
        usuarioimg = new ImageIcon(getClass().getResource("empresa.png"));
        imgusuario = new JLabel(usuarioimg);
        fundoimg = new ImageIcon(getClass().getResource("FundoEmpresa2.png"));
        imgfundo = new JLabel(fundoimg);
        portalempregoim = new ImageIcon(getClass().getResource("Portalemprego.png"));
        imgportal = new JLabel(portalempregoim);
    
        //uhjm
        economiaimg = new ImageIcon(getClass().getResource("Icones//economia.png"));
        educacaoimg = new ImageIcon(getClass().getResource("Icones//educacao.png"));    
        engenhariaimg = new ImageIcon(getClass().getResource("Icones//engenharia.png"));
        direitoimg = new ImageIcon(getClass().getResource("Icones//direito.png"));    
        gestaoimg = new ImageIcon(getClass().getResource("Icones//gestao.png"));
        saudeimg = new ImageIcon(getClass().getResource("Icones//saude.png"));    
        segurancaimg = new ImageIcon(getClass().getResource("Icones//policia.png"));
        transporteimg = new ImageIcon(getClass().getResource("Icones//transporte.png"));    
        profissaoimg = new ImageIcon(getClass().getResource("Icones//educacao1.png"));
        
        imgeconomia = new JLabel(economiaimg);
        imgeducacao = new JLabel(educacaoimg);
        imgengenharia = new JLabel(engenhariaimg);
        imgdireito = new JLabel(direitoimg);
        imggestao = new JLabel(gestaoimg);
        imgsaude = new JLabel(saudeimg);
        imgseguranca = new JLabel(segurancaimg);
        imgtransporte = new JLabel(transporteimg);
        imgprofissao = new JLabel(profissaoimg);
        
        //Tornando o painel de fundo opaco.
        pnorte.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f)); 
        pareas.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        peste.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        poeste.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        panuncios.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        
        PainelNorte();
        PainelEste();
        PainelOeste();
        PainelCentro();
        accoes();
        this.setSize(950, 700);
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    void PainelNorte(){    
        //ADICIONAR COMPONENTES
        pnorte.add(imgportal, BorderLayout.WEST);
        pnorte.add(pcabecalho, BorderLayout.CENTER);
        add(pnorte, BorderLayout.NORTH);
        
        //PAINEL CABEÇALHO
        inicioimg = new ImageIcon(getClass().getResource("Icones//icons8-inicio1.png"));
        usuarioimg = new ImageIcon(getClass().getResource("Icones//icons8-usuario1.png"));
        empresaimg = new ImageIcon(getClass().getResource("Icones//icons8-empresa1.png"));
        parceiroimg = new ImageIcon(getClass().getResource("Icones//icons8-parceiro.png"));
        maisimg = new ImageIcon(getClass().getResource("Icones//mais.png"));
        
        btinicio = new JButton(inicioimg);
        btempresa = new JButton(empresaimg);
        btparceiro = new JButton(parceiroimg);
        btusuario = new JButton(usuarioimg);
        btmais = new JButton(maisimg);
        
        btparceiro.setBackground(Color.white);
        btempresa.setBackground(Color.white);
        btusuario.setBackground(Color.white);
        btinicio.setBackground(Color.white);
        btmais.setBackground(Color.white);
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(15,5,5,15);
        gbc.gridx=0;    gbc.gridy=0;    pcabecalho.add(btinicio, gbc);
        gbc.gridx=0;    gbc.gridy=1;    pcabecalho.add(lbinicio, gbc);
        gbc.gridx=1;    gbc.gridy=0;    pcabecalho.add(btusuario, gbc);
        gbc.gridx=1;    gbc.gridy=1;    pcabecalho.add(lbusuario, gbc);
        gbc.gridx=2;    gbc.gridy=0;    pcabecalho.add(btempresa, gbc);
        gbc.gridx=2;    gbc.gridy=1;    pcabecalho.add(lbempresa, gbc);
        gbc.gridx=3;    gbc.gridy=0;    pcabecalho.add(btparceiro, gbc);
        gbc.gridx=3;    gbc.gridy=1;    pcabecalho.add(lbparceiro, gbc);
        gbc.gridx=4;    gbc.gridy=0;    pcabecalho.add(btmais, gbc);
        gbc.gridx=4;    gbc.gridy=1;    pcabecalho.add(lbmais, gbc);
        pcabecalho.setBackground(Color.white);
        add(pcentro, BorderLayout.CENTER);
    }
    
    
    //Operacoes do painel usuario:
    JButton adicionarusuario = new JButton("ADICIONAR USUÁRIO");
     JButton removerusuario = new JButton("REMOVER USUÁRIO");
    JButton editarusuario = new JButton("EDITAR DADOS");
    JButton cv = new JButton("IMPRIMIR CV");
    
    void OperacoesUsuario(){
        //LABEL & TEXTFIELD
    JLabel id = new JLabel ("ID USUÁRIO:");
    JTextField tid = new JTextField(13);

        adicionarusuario.setForeground(Color.white);
        editarusuario.setForeground(Color.white);
        removerusuario.setForeground(Color.white);
        cv.setForeground(Color.white);
        adicionarusuario.setBackground(new Color(0x123456));
        editarusuario.setBackground(new Color(0x123456));
        cv.setBackground(new Color(0x123456));
        removerusuario.setBackground(Color.red);
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets (10,10,10,10);
        grid.gridx = 1;     grid.gridy = 0;     panuncios.add(adicionarusuario, grid);
        grid.gridx = 0;     grid.gridy = 1;     panuncios.add(id, grid);
        grid.gridx = 1;     grid.gridy = 1;     panuncios.add(tid, grid);
        grid.gridy = 3;                              panuncios.add(removerusuario, grid);
        grid.gridy = 4;                              panuncios.add(editarusuario, grid);
        grid.gridy = 5;                              panuncios.add(cv, grid);
                            
    }
    
    void OperacoesEmpresa(){
        //LABEL & TEXTFIELD
    JLabel id = new JLabel ("ID EMPRESA:");
    JTextField tid = new JTextField(13);
    
    //BUTTONS
    JButton adicionarempresa = new JButton("ADICIONAR EMPRESA");
    JButton removerempresa = new JButton("REMOVER EMPRESA");
    JButton editarempresa = new JButton("EDITAR DADOS");
    
    
        adicionarempresa.setForeground(Color.white);
        editarempresa.setForeground(Color.white);
        removerempresa.setForeground(Color.white);
        adicionarempresa.setBackground(new Color(0x123456));
        editarempresa.setBackground(new Color(0x123456));
        removerempresa.setBackground(Color.red);
        
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets (10,10,10,10);
        grid.gridx = 1;     grid.gridy = 0;     panuncios.add(adicionarempresa, grid);
        grid.gridx = 0;     grid.gridy = 1;     panuncios.add(id, grid);
        grid.gridx = 1;     grid.gridy = 1;     panuncios.add(tid, grid);
                            grid.gridy = 3;     panuncios.add(removerempresa, grid);
                            grid.gridy = 4;     panuncios.add(editarempresa, grid);
    }
    
    void OperacoesMais(){
        //BUTTONS
        JButton repositorio = new JButton("REPOSITÓRIO GITHUB");
        JButton sobrenos = new JButton("SOBRE NÓS");
    
        repositorio.setForeground(Color.white);
        sobrenos.setForeground(Color.white);
        repositorio.setBackground(new Color(0x123456));
        sobrenos.setBackground(new Color(0x123456));
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets (10,10,10,10);
        grid.gridx = 0;     grid.gridy = 0;     panuncios.add(repositorio, grid);
        grid.gridx = 0;     grid.gridy = 1;     panuncios.add(sobrenos, grid);
    }
    
    void PainelOeste(){
        //ADD COMPONENTES
        uemimg = new ImageIcon(getClass().getResource("uemlogo.png"));
        imguem = new JLabel(uemimg);
        poeste.setLayout(new BoxLayout(poeste, BoxLayout.Y_AXIS));
        //padmin.setLayout(new BoxLayout(padmin, BoxLayout.Y_AXIS));
        poeste.add(imguem);
        poeste.add(new JLabel("     ENGENHARIA INFORMÁTICA      "));
        poeste.setForeground(Color.white);
        poeste.add(new JLabel("     TURMA DE 2021"));
        poeste.add(new JLabel("     CADEIRA DE POO2"));
        poeste.add(new JLabel("     DEVELOPERS:"));
        poeste.add(new JLabel("     AlfOi FirMe"));
        poeste.add(new JLabel("     Marcos David Golias"));
                poeste.add(new JLabel("     Novembro, 2022"));

//        plbadmin.add(fotoadmin, BorderLayout.CENTER);
//        poeste.setBackground(Color.white);
        poeste.setBackground(new Color(0x8bb1c4));
//        poeste.setBackground(new Color(0x123456));
//        poeste.add(imguem);
      //  poeste.add(plbadmin);
//        poeste.add(padmin);
            
        add(poeste, BorderLayout.WEST);
    }
    
    void PainelCentro(){

        bteconomia = new JButton(economiaimg);    
        bteducacao = new JButton(educacaoimg);
        btengenharia = new JButton(engenhariaimg);    
        btdireito = new JButton(direitoimg);
        btgestao = new JButton(gestaoimg);    
        btsaude = new JButton(saudeimg);
        btseguranca = new JButton(segurancaimg);    
        bttransporte = new JButton(transporteimg);
        btprofissao = new JButton(profissaoimg);
            
        bteconomia.setBackground(Color.white);
        bteducacao.setBackground(Color.white);
        btengenharia.setBackground(Color.white);
        btdireito.setBackground(Color.white);
        btgestao.setBackground(Color.white);
        btsaude.setBackground(Color.white);
        btseguranca.setBackground(Color.white);
        bttransporte.setBackground(Color.white);
        btprofissao.setBackground(Color.white);
        
//        lbeconomia.setForeground(Color.white);
//        lbengenharia.setForeground(Color.white);
//        lbgestao.setForeground(Color.white);
//        lbdireito.setForeground(Color.white);
//        lbtransporte.setForeground(Color.white);
//        lbseguranca.setForeground(Color.white);
//        lbsaude.setForeground(Color.white);
//        lbeducacao.setForeground(Color.white);
pareas = new JPanel (new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,10,10,10);
        gbc.gridx=0;    gbc.gridy=0;    pareas.add(bteconomia, gbc);
                        gbc.gridy=1;    pareas.add(lbeconomia, gbc);
        gbc.gridx=2;    gbc.gridy=0;    pareas.add(btengenharia, gbc);
                        gbc.gridy=1;    pareas.add(lbengenharia, gbc);
        gbc.gridx=1;    gbc.gridy=2;    pareas.add(btgestao, gbc);
                        gbc.gridy=3;    pareas.add(lbgestao, gbc);                
        gbc.gridx=0;    gbc.gridy=4;    pareas.add(btseguranca, gbc);
                        gbc.gridy=5;    pareas.add(lbseguranca, gbc);
        gbc.gridx=1;    gbc.gridy=0;    pareas.add(bteducacao, gbc);
                        gbc.gridy=1;    pareas.add(lbeducacao, gbc);
        gbc.gridx=0;    gbc.gridy=2;    pareas.add(btdireito, gbc);
                        gbc.gridy=3;    pareas.add(lbdireito, gbc);
        gbc.gridx=2;    gbc.gridy=2;    pareas.add(btsaude, gbc);
                        gbc.gridy=3;    pareas.add(lbsaude, gbc);
        gbc.gridx=1;    gbc.gridy=4;    pareas.add(bttransporte, gbc);
                        gbc.gridy=5;    pareas.add(lbtransporte, gbc);
        gbc.gridx=2;    gbc.gridy=4;    pareas.add(btprofissao, gbc);
                        gbc.gridy=5;    pareas.add(lbprofissao, gbc);                
        
//        pareas.setBackground(new Color(0x8bb1c4));
        pareas.setBackground(Color.white);
        add(pareas, BorderLayout.CENTER);
    }
    
    
    
    
    void PainelEste(){
        //ADD COMPONENTES
        peste.add(ppesquisa, BorderLayout.NORTH);
        pesquisaimg = new ImageIcon(getClass().getResource("Icones//icons8-pesquisa.png"));
        btpesquisa = new JButton(pesquisaimg);
        btpesquisa.setBackground(Color.white);
        
        //PAINEL PESQUISA
        ppesquisa.setBackground(Color.white);
        ppesquisa.add(lbpesquisa);
        ppesquisa.add(tpesquisa);
        ppesquisa.add(btpesquisa);
        
        //PAINEL ANUNCIOS
//        panuncios.setBackground(Color.white);
        add(peste, BorderLayout.EAST);
        this.add(panuncios);
        panuncios.setBackground(new Color(0x8bb1c4));
        peste.add(panuncios, BorderLayout.CENTER);
    }
    
    
    //Painel para operacoes da empresa.
     //LABEL & TEXTFIELD
    JLabel idempresa = new JLabel ("ID EMPRESA:");
    JLabel idusuario = new JLabel ("ID USUÁRIO:");
    JTextField tidempresa = new JTextField(13);
    JTextField tidusuario = new JTextField(10);
    
    //BUTTONS
    JButton adicionarempresa = new JButton("ADICIONAR EMPRESA");
    JButton removerempresa = new JButton("REMOVER EMPRESA");
    JButton editarempresa = new JButton("EDITAR DADOS");
    JButton contratarusuario = new JButton("CONTRATAR");
    JButton demitirusuario = new JButton("DEMITIR");
    JButton empregados = new JButton("EMPREGADOS");
    
    //PANELS
    JPanel pempresa = new JPanel(new GridBagLayout());
    JPanel pusuario = new JPanel(new GridBagLayout());
    JPanel retorno = new  JPanel();
    
    
    JPanel empresaOperacoes() {

        retorno.setLayout(new BorderLayout());
        adicionarempresa.setForeground(Color.white);
        editarempresa.setForeground(Color.white);
        removerempresa.setForeground(Color.white);
        adicionarempresa.setBackground(new Color(0x123456));
        editarempresa.setBackground(new Color(0x123456));
        removerempresa.setBackground(Color.red);
        empregados.setBackground(new Color(0x123456));
        empregados.setForeground(Color.white);
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets (10,10,10,10);
        grid.gridx = 1;     grid.gridy = 0;     pempresa.add(adicionarempresa, grid);
        grid.gridx = 0;     grid.gridy = 1;     pempresa.add(idempresa, grid);
        grid.gridx = 1;     grid.gridy = 1;     pempresa.add(tidempresa, grid);
                            grid.gridy = 3;     pempresa.add(removerempresa, grid);
                            grid.gridy = 4;     pempresa.add(editarempresa, grid);
                            grid.gridy = 5;     pempresa.add(empregados, grid);
        
        pusuario.setBorder(BorderFactory.createTitledBorder("RECURSOS HUMANOS:  ") );
        contratarusuario.setForeground(Color.white);
        contratarusuario.setBackground(new Color(0x123456));
        demitirusuario.setForeground(Color.white);
        demitirusuario.setBackground(Color.red);
        
        GridBagConstraints gd = new GridBagConstraints();
        gd.insets = new Insets (10,10,10,10);
        gd.gridx = 0;     gd.gridy = 0;     pusuario.add(idusuario, gd);
        gd.gridx = 1;     gd.gridy = 0;     pusuario.add(tidusuario, gd);
                          gd.gridy = 3;     pusuario.add(contratarusuario, gd);
        gd.gridx = 0;     gd.gridy = 3;     pusuario.add(demitirusuario, gd);
             
        pempresa.setBackground(Color.white);
        retorno.add(pempresa, BorderLayout.CENTER);
        retorno.add(pusuario, BorderLayout.PAGE_END);
        pempresa.setBackground(new Color(0x8bb1c4));
        pusuario.setBackground(Color.white);
    
    return retorno;
            }
    
    void accoes(){
          //ActionListener
         this.btinicio.addActionListener(this);
         this.btusuario.addActionListener(this);
         this.btempresa.addActionListener(this);
         this.btparceiro.addActionListener(this);
         this.btmais.addActionListener(this);
         this.bteconomia.addActionListener(this);
         this.bteducacao.addActionListener(this);
         this.btengenharia.addActionListener(this);
         this.btdireito.addActionListener(this);
         this.btgestao.addActionListener(this);
         this.btsaude.addActionListener(this);
         this.btseguranca.addActionListener(this);
         this.bttransporte.addActionListener(this);
         this.btprofissao.addActionListener(this);
         this.btpesquisa.addActionListener(this);
         this.adicionarempresa.addActionListener(this);
         this.adicionarusuario.addActionListener(this);
    }
    
    //Tabela MDG
    
    String[] cabecalho = {"Id","Nome","email","TipoDocumento","Contacto","formacao"};

String acura = "Äcura";     int NSX = 19;
        String[][] dados;

        JButton repositorio = new JButton("REPOSITÓRIO GITHUB");
    JButton sobrenos = new JButton("SOBRE NÓS");
    JPanel retorno2= new JPanel();
    
    
        void TabelaUsuario() throws ClassNotFoundException{
         pareas.setLayout(new BorderLayout());
        JPanel peditarusuario = new JPanel(new GridBagLayout());
        
        repositorio.setForeground(Color.white);
        sobrenos.setForeground(Color.white);
        repositorio.setBackground(new Color(0x123456));
        sobrenos.setBackground(new Color(0x123456));
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets (10,10,10,10);
        grid.gridx = 0;     grid.gridy = 0;     peditarusuario.add(repositorio, grid);
        grid.gridx = 0;     grid.gridy = 1;     peditarusuario.add(sobrenos, grid);
    CadastroUsuario View2 = null;
        
         int i= new Controller.CadastroUsuarioController(View2).mostraUsuario2().length;
         dados= new String[i][6];
         dados= new Controller.CadastroUsuarioController(View2).mostraUsuario2();
        
        peditarusuario.setBackground(Color.white);
       // this.add(peditarusuario, BorderLayout.SOUTH);
        pareas.add(peditarusuario,BorderLayout.SOUTH);
        
        JTable tabela = new JTable(dados, cabecalho);
        JScrollPane scrollPane = new JScrollPane(tabela);
        scrollPane.setPreferredSize(new Dimension(950, 150));
       
        //this.add(scrollPane, BorderLayout.CENTER);
      pareas.add(scrollPane,BorderLayout.CENTER);
        this.add(pareas, BorderLayout.CENTER);
    }
        
        
        public void actionPerformed(ActionEvent e){
        
         if(e.getSource()==btinicio){
    pareas.setVisible(false);
    PainelCentro();
    pareas.setVisible(true);
    accoes();
                 }
         
         if(e.getSource()==btusuario){
   
              peste.setVisible(false);
             panuncios.removeAll();
          OperacoesUsuario();
             peste.setVisible(true);
             
                    }
         if(e.getSource()==btempresa){
             
            peste.setVisible(false);
             panuncios.removeAll();
            this.panuncios.add(empresaOperacoes());
             peste.setVisible(true);

         } 
         
                 if(e.getSource()==btparceiro){

                 }
         if(e.getSource()==btmais){
             peste.setVisible(false);
             panuncios.removeAll();
             OperacoesMais();
             peste.setVisible(true);
                    }
         
         if(e.getSource()==bteconomia){
         setPareas(imgeconomia,lbeconomia2); 
         pareas.removeAll();
         pareas.setVisible(false);
             try {
                 TabelaUsuario();
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(InterfacePrincipal.class.getName()).log(Level.SEVERE, null, ex);
             }
         pareas.setVisible(true);

         } 
         
                 if(e.getSource()==bteducacao){
                     
                     setPareas(imgeducacao, lbeducacao2);
                 }
         if(e.getSource()==btengenharia){
             setPareas(imgengenharia, lbengenharia2);
                    }
         if(e.getSource()==btdireito){
             setPareas(imgdireito, lbdireito2);

         } 
                 if(e.getSource()==btgestao){
                     setPareas(imggestao, lbgestao2);
                 }
         if(e.getSource()==btsaude){
             setPareas(imgsaude, lbsaude2);
                    }
         
         if(e.getSource()==btseguranca){
             
             setPareas(imgseguranca, lbseguranca2);
         }
         
          if(e.getSource()==bttransporte){
              setPareas(imgtransporte,lbtransporte2);
         }
          
           if(e.getSource()==btprofissao){
               setPareas(imgprofissao, lbprofissao2);
         }
           
             if(e.getSource()==btpesquisa){
             

         }

           if(e.getSource()==adicionarempresa){
             
         this.setVisible(false);
         new View.CadastroEmpresa();
         }
           
             if(e.getSource()==adicionarusuario){
             this.setVisible(false);
             new View.Cadastro_Usuario1();

         }
    }     
        
        
    void setPareas(JLabel imglabel, JLabel label){
      peste.setVisible(false);
     panuncios.removeAll();
     GridBagConstraints gb= new GridBagConstraints();
     gb.insets= new Insets(10, 10, 10, 10);
     gb.gridx=0;
     gb.gridy=0;
     panuncios.add(imglabel,gb);
     gb.gridy=1;
     panuncios.add(label,gb);
       peste.setVisible(true);
    } 
    
    public static void main(String[] args) {
        new InterfacePrincipal();
    }
}
