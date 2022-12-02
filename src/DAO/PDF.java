package DAO;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import javax.swing.text.Document;

public class PDF {
    
    public static void main(String[] args) throws IOException {
        try{ 
            Document document = new Document();
            PdfWriter.getInstance(document,new FileOutputStream("d:/Relatório Portal de Empregos.pdf"));
            document.open();
//            Image image = Image.getInstance("Portalemprego.png");
            document.add(new Paragraph("INTRODUÇÃO\n" +
"Tendo em consideração o crescente número de pessoal formado em diversas áreas profissionais e com certa dificuldade em apresentar-se ou expor o seu currículo pela aparente escassez de empregabilidade ou acesso a informação, bem como uma possível inviabilidade na parte das empresas na necessidade de contratar pessoal qualificado para os diversos trabalhos, vemos então a necessidade da existência de um portal de emprego no qual pessoal formado em qualquer área profissional possa cadastrar-se, deixando patente suas competências, seu local de formação, anos de experiência, entre outros detalhes, de modo a ser contratado por uma instituição e parceiros.\n" +
"Por sua vez, as empresas e parceiros contratadores também poderão explorar o mesmo portal de modo a buscar e eleger de maneira sigilosa e eficaz os usuários cadastrados no portal a fim de marcações de entrevistas e possíveis contratos de emprego.\n" +
"PROBLEMA\n" +
"Dificuldade na exposição de currículos no mercado de emprego a nível global pela aparente escassez de empregabilidade ou acesso a informação, bem como uma possível inviabilidade na parte das empresas na necessidade de contratar pessoal qualificado para os diversos trabalhos.\n" +
"NECESSIDADE\n" +
"Existência de um portal de emprego para o cadastro de usuários formados nas diversas áreas profissionais.\n" +
"OBJECTIVOS\n" +
"Objectivo Principal: Criar um Portal de Emprego englobando pessoal a busca de oportunidades de emprego e empresas ou parceiros.\n" +
"Objectivos Específicos:\n" +
"- Desenvolver uma base de dados associada ao portal de emprego;\n" +
"- Alocar na base de dados os dados pessoais de usuários cadastrados no portal;\n" +
"- Alocar na base de dados os requisitos das empresas e parceiros contratadores."));
//            document.add(image);
            document.close();
        }catch(Exception e){}
        JOptionPane.showMessageDialog(null, "RELATÓRIO IMPRESSO");
    
    Desktop desktop = null;
    if(Desktop.isDesktopSupported()){
        desktop = Desktop.getDesktop();
        desktop.open(new File("d:/Relatório Portal de Empregos.pdf"));
    }
    }
    
    
}
