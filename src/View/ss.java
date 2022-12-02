package View;
import java.awt.*;
import javax.swing.*;

public class ss extends JFrame {
    //JLABEL
    JLabel lbinicio = new JLabel("INICIO");
    JLabel lbusuario = new JLabel("USUÁRIO");
    JLabel lbempresa = new JLabel("EMPRESA");
    JLabel lbparceiro = new JLabel("PARCEIRO");
    JLabel lbmais = new JLabel("MAIS");
    JLabel lbadmin = new JLabel("ADMIN.");
    JLabel lbpesquisar = new JLabel("PESQUISAR ENTIDADE");
    JLabel lbeconomia = new JLabel("ECONOMIA");
    JLabel lbeducacao = new JLabel("EDUCAÇÃO");
    JLabel lbengenharia = new JLabel("ENGENHARIA");
    JLabel lbdireito = new JLabel("DIREITO");
    JLabel lbgestao = new JLabel("GESTÃO");
    JLabel lbsaude = new JLabel("SAÚDE");
    JLabel lbseguranca = new JLabel("SEGURANÇA");
    JLabel lbtransporte = new JLabel("TRANSPORTE");
    JLabel lbpesquisa = new JLabel(" PESQUISAR  ");
    
    //JPANEL
    JPanel peste = new JPanel (new BorderLayout());
    JPanel plbadmin = new JPanel (new BorderLayout());
    JPanel padmin = new JPanel ();
    JPanel pcentro = new JPanel (new BorderLayout());
    JPanel poeste = new JPanel ();
    JPanel pcabecalho = new JPanel(new GridBagLayout()); //(new GridBagLayout());
    JPanel pareas = new JPanel (new GridBagLayout());
    JPanel ppesquisa = new JPanel (new GridBagLayout());
    JPanel panuncios = new JPanel ();
    JPanel pnorte = new JPanel (new BorderLayout());
    
    //ICONES E IMAGENS
     ImageIcon portalempregoim, fundoimg, usuarioim, inicioimg, usuarioimg, empresaimg, parceiroimg, maisimg, pesquisaimg,
               economiaimg, educacaoimg, engenhariaimg, direitoimg, gestaoimg, saudeimg, segurancaimg, transporteimg;
     JLabel imgportal, imgfundo, imgusuario;
     
     //TEXTFIELD
    JTextField tpesquisa = new JTextField (10);
     
    //JBUTTON
    JButton btinicio, btusuario, btempresa, btparceiro, btmais, btpesquisa,
            bteconomia, bteducacao, btengenharia, btdireito, btgestao, btsaude, btseguranca, bttransporte;
    
    
    
    ss() {
        setLayout(new BorderLayout());
        usuarioimg = new ImageIcon(getClass().getResource("empresa.png"));
        imgusuario = new JLabel(usuarioimg);
        fundoimg = new ImageIcon(getClass().getResource("FundoEmpresa2.png"));
        imgfundo = new JLabel(fundoimg);
        portalempregoim = new ImageIcon(getClass().getResource("Portalemprego.png"));
        imgportal = new JLabel(portalempregoim);
        
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
        
        
        
        this.setSize(900, 700);
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
    
    void PainelEste(){
        //ADD COMPONENTES
        peste.add(ppesquisa, BorderLayout.NORTH);
        peste.add(panuncios, BorderLayout.CENTER);
        
        
        pesquisaimg = new ImageIcon(getClass().getResource("Icones//icons8-pesquisa.png"));
        btpesquisa = new JButton(pesquisaimg);
        btpesquisa.setBackground(Color.white);
        
        //PAINEL PESQUISA
        ppesquisa.setBackground(Color.white);
        ppesquisa.add(lbpesquisa);
        ppesquisa.add(tpesquisa);
        ppesquisa.add(btpesquisa);
        
        //PAINEL ANUNCIOS
        panuncios.setBackground(Color.white);
        add(peste, BorderLayout.EAST);
    }
    
    void PainelOeste(){
        //ADD COMPONENTES
        poeste.setLayout(new BoxLayout(poeste, BoxLayout.Y_AXIS));
        padmin.setLayout(new BoxLayout(padmin, BoxLayout.Y_AXIS));
        plbadmin.add(new JLabel("ADMIN."), BorderLayout.WEST);
//        plbadmin.add(fotoadmin, BorderLayout.CENTER);
        poeste.setBackground(Color.white);
        poeste.add(plbadmin);
//        poeste.add(padmin);
        
        
        add(poeste, BorderLayout.WEST);
    }
    
    void PainelCentro(){
        economiaimg = new ImageIcon(getClass().getResource("Icones//economia.png"));
        educacaoimg = new ImageIcon(getClass().getResource("Icones//educacao.png"));    
        engenhariaimg = new ImageIcon(getClass().getResource("Icones//engenharia.png"));
        direitoimg = new ImageIcon(getClass().getResource("Icones//direito.png"));    
        gestaoimg = new ImageIcon(getClass().getResource("Icones//gestao.png"));
        saudeimg = new ImageIcon(getClass().getResource("Icones//saude.png"));    
        segurancaimg = new ImageIcon(getClass().getResource("Icones//policia.png"));
        transporteimg = new ImageIcon(getClass().getResource("Icones//transporte.png"));    
        
        bteconomia = new JButton(economiaimg);    
        bteducacao = new JButton(educacaoimg);
        btengenharia = new JButton(engenhariaimg);    
        btdireito = new JButton(direitoimg);
        btgestao = new JButton(gestaoimg);    
        btsaude = new JButton(saudeimg);
        btseguranca = new JButton(segurancaimg);    
        bttransporte = new JButton(transporteimg);    
            
        bteconomia.setBackground(Color.white);
        bteducacao.setBackground(Color.white);
        btengenharia.setBackground(Color.white);
        btdireito.setBackground(Color.white);
        btgestao.setBackground(Color.white);
        btsaude.setBackground(Color.white);
        btseguranca.setBackground(Color.white);
        bttransporte.setBackground(Color.white);
        
//        lbeconomia.setForeground(Color.white);
//        lbengenharia.setForeground(Color.white);
//        lbgestao.setForeground(Color.white);
//        lbdireito.setForeground(Color.white);
//        lbtransporte.setForeground(Color.white);
//        lbseguranca.setForeground(Color.white);
//        lbsaude.setForeground(Color.white);
//        lbeducacao.setForeground(Color.white);
        
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
        
//        pareas.setBackground(new Color(0x8bb1c4));
        pareas.setBackground(Color.white);
        add(pareas, BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        new ss();
    }
}
