package View;
import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class OperacoesEmpresa extends JFrame {

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
    
    //PANELS
    JPanel pempresa = new JPanel(new GridBagLayout());
    JPanel pusuario = new JPanel(new GridBagLayout());
    
    public OperacoesEmpresa() {
        this.setLayout(new BorderLayout());
        adicionarempresa.setForeground(Color.white);
        editarempresa.setForeground(Color.white);
        removerempresa.setForeground(Color.white);
        adicionarempresa.setBackground(new Color(0x123456));
        editarempresa.setBackground(new Color(0x123456));
        removerempresa.setBackground(Color.red);
        
        GridBagConstraints grid = new GridBagConstraints();
        grid.insets = new Insets (10,10,10,10);
        grid.gridx = 1;     grid.gridy = 0;     pempresa.add(adicionarempresa, grid);
        grid.gridx = 0;     grid.gridy = 1;     pempresa.add(idempresa, grid);
        grid.gridx = 1;     grid.gridy = 1;     pempresa.add(tidempresa, grid);
                            grid.gridy = 3;     pempresa.add(removerempresa, grid);
                            grid.gridy = 4;     pempresa.add(editarempresa, grid);
        
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
        this.add(pempresa, BorderLayout.CENTER);
        this.add(pusuario, BorderLayout.PAGE_END);
        pempresa.setBackground(new Color(0x8bb1c4));
        pusuario.setBackground(Color.white);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
    
    

    public static void main(String[] args) {
        new OperacoesEmpresa();
    }
    
}