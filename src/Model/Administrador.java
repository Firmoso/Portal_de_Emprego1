package Model;

public class Administrador extends Registro{
 
    private String localformacao,emailPessoal,emial,passe;

    public Administrador(String localformacao, String emailPessoal, String nome, String email, String Id, String passe, int contacto) {
        super(nome, email, Id, passe, contacto);
        this.localformacao = localformacao;
        this.emailPessoal = emailPessoal;
    }

    public Administrador(String email, String passe) {
        super(email, passe);
    }




    public String getLocalformacao() {
        return localformacao;
    }

    public void setLocalformacao(String localformacao) {
        this.localformacao = localformacao;
    }

    public String getEmailPessoal() {
        return emailPessoal;
    }

    public void setEmailPessoal(String emailPessoal) {
        this.emailPessoal = emailPessoal;
    }
    

 
}
