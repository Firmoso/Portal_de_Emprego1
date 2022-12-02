package Model;

public class Parceiro extends Registro{
    private String duracao,servico;

    public Parceiro(String duracao, String servico, String nome, String email, String Id, String passe, int contacto) {
        super(nome, email, Id, passe, contacto);
        this.duracao = duracao;
        this.servico = servico;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }
    

    
}
