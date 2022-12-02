package Model;

public class Empresa extends Registro{

private String localizacao; 
private String caixa_postal,bairro,avenida,area;
private int nuit;

    /**
     *
     */
     
    public Empresa(String localizacao, String caixa_postal, String bairro, String avenida, String nome, String email, String Id, String passe, int contacto,int nuit,String area) {
        super(nome, email, Id, passe, contacto);
        this.localizacao = localizacao;
        this.caixa_postal = caixa_postal;
        this.bairro = bairro;
        this.avenida = avenida;
        this.nuit= nuit;
        this.area=area;
        
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getCaixa_postal() {
        return caixa_postal;
    }

    public void setCaixa_postal(String caixa_postal) {
        this.caixa_postal = caixa_postal;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }
    
    
}
