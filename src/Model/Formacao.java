package Model;

public class Formacao extends Registro{
   
    private String Local_formacao;

    public Formacao(String Local_formacao, String nome, String Id) {
        super(nome, Id);
        this.Local_formacao = Local_formacao;
    }

    public String getLocal_formacao() {
        return Local_formacao;
    }

    public void setLocal_formacao(String Local_formacao) {
        this.Local_formacao = Local_formacao;
    }
    
    
}
