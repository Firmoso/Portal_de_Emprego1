
package Model;

import java.awt.image.BufferedImage;
import java.util.Date;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Usuario extends Registro{
    
    private String nacionalidade,tipodoc, residencia,formacao,experiencia,areaFormacao,curso,recomendacao,cv,localForm;
     private String nascimento;
      private int contEmergencia;
      String nomeUsuario,EmailRecuperacao;

    public Usuario(String nacionalidade, String tipodoc, String residencia, String formacao, String experiencia, int contEmergencia, String areaFormacao, String curso, String recomendacao, String cv, String nascimento, String nome, String Id, int contacto,String localForm,String email,String passe,String nomeUsuario, String emailRecuperacao) {
        super(nome,email, Id,passe,contacto);
        this.nacionalidade = nacionalidade;
        this.tipodoc = tipodoc;
        this.residencia = residencia;
        this.formacao = formacao;
        this.experiencia = experiencia;
        this.contEmergencia = contEmergencia;
        this.areaFormacao = areaFormacao;
        this.curso = curso;
        this.recomendacao = recomendacao;
        this.cv = cv;
        this.localForm= localForm;
        this.nomeUsuario= nomeUsuario;
        this.EmailRecuperacao=emailRecuperacao;
        this.nascimento=nascimento;

        imprimir();
    }
    

    public Usuario(String nomeUsuario, String EmailRecuperacao, String email, String passe) {
        super(email, passe);
        this.nomeUsuario = nomeUsuario;
        this.EmailRecuperacao = EmailRecuperacao;
        
    }
    
    public void imprimir(){
                System.out.println("1 "+nacionalidade+" 2"+tipodoc+"3 "+residencia+" 4"+formacao+" \n5"+experiencia+"6 "+contEmergencia
        +"7 "+areaFormacao+" 8"+curso+"9 "+recomendacao+" 10"+cv+"11 "+nascimento+" 12"+localForm);
        
        System.out.println("13 "+email+" 14 "+EmailRecuperacao+"15 "+nomeUsuario+" 16"+passe+"nascimento "+nascimento);
    }
    

    public Usuario(String Id, String passe) {
        super(Id, passe);
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    
   
    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRecomendacao() {
        return recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public String getLocalForm() {
        return localForm;
    }

    public void setLocalForm(String localForm) {
        this.localForm = localForm;
    }

    public int getContEmergencia() {
        return contEmergencia;
    }

    public void setContEmergencia(int contEmergencia) {
        this.contEmergencia = contEmergencia;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmailRecuperacao() {
        return EmailRecuperacao;
    }

    public void setEmailRecuperacao(String EmailRecuperacao) {
        this.EmailRecuperacao = EmailRecuperacao;
    }

  
    
}
