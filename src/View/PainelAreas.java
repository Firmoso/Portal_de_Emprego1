package View;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class PainelAreas extends JFrame{
    //LABELS
    JLabel lbeconomia = new JLabel("ECONOMIA");
    JLabel lbeducacao = new JLabel("EDUCAÇÃO");
    JLabel lbengenharia = new JLabel("ENGENHARIA");
    JLabel lbdireito = new JLabel("DIREITO");
    JLabel lbgestao = new JLabel("GESTÃO");
    JLabel lbsaude = new JLabel("SAÚDE");
    JLabel lbseguranca = new JLabel("SEGURANÇA");
    JLabel lbtransporte = new JLabel("TRANSPORTE");
    JLabel lbprofissao = new JLabel("PROFISSÃO"); 
    JLabel lbpesquisa = new JLabel(" PESQUISAR  ");

    //ICONES E IMAGENS
    ImageIcon economiaimg, educacaoimg, engenhariaimg, direitoimg, gestaoimg, saudeimg, segurancaimg, transporteimg, profissaoimg;
    JLabel imgeconomia, imgeducacao, imgengenharia, imgdireito, imggestao, imgsaude, imgseguranca, imgtransporte, imgprofissao;
    JPanel pareas;
    PainelAreas(){
        this.pareas = new JPanel();
    
        
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
        
      
        byte op= Byte.parseByte(JOptionPane.showInputDialog(null, "ESCOLHA O PAINEL PARA DISPLAY \n"
                            + "1. ECONOMIA \n"
                            + "2. EDUCAÇÃO \n"
                            + "3. ENGENHARIA \n"
                            + "4. DIREITO \n"
                            + "5. GESTÃO \n"
                            + "6. SAÚDE \n"
                            + "7. SEGURANÇA \n"
                            + "8. TRANSPORTE \n"
                            + "9. PROFISSÃO \n"));
        switch (op){
            case 1: setPareas(imgeconomia, lbeconomia); break;
            case 2: setPareas(imgeducacao, lbeducacao); break;
            case 3: setPareas(imgengenharia, lbengenharia); break;
            case 4: setPareas(imgdireito, lbdireito); break;
            case 5: setPareas(imggestao, lbgestao); break;
            case 6: setPareas(imgsaude, lbsaude); break;
            case 7: setPareas(imgseguranca, lbseguranca); break;
            case 8: setPareas(imgtransporte, lbtransporte); break;
            case 9: setPareas(imgprofissao, lbprofissao); break;
        }
    // Dimensoes da janela.
//        pareas.setBackground(Color.white);
//        patalho.setBackground(new Color(0x8bb1c4));
     // pareas = new JPanel (new BoxLayout(pareas, BoxLayout.PAGE_AXIS));  
        this.add(pareas);
        this.setSize(500, 500);
        this.setVisible(true);
//        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
     }
    
    void setPareas(JLabel imglabel, JLabel label){
       pareas.add(imglabel);
       pareas.add(label);
    } 
    
    public static void main(String[] args) {
        new PainelAreas();
    }
}
