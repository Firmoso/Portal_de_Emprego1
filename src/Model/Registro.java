package Model;

public class Registro {
    
    protected String nome,email,Id,passe;
    protected int contacto;

    public Registro(String nome, String email, String Id, String passe, int contacto) {
        this.nome = nome;
        this.email = email;
        this.Id = Id;
        this.passe = passe;
        this.contacto = contacto;
    }    

    public Registro(String email, String passe) {
        this.email = email;
        this.passe = passe;
    }
    
public Registro(String nome,String Id,int contacto){
    this.nome=nome;
    this.contacto=contacto;
    this.Id=Id;
}

    public Registro(String nome, int contacto) {
        this.nome = nome;
        this.contacto = contacto;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getPasse() {
        return passe;
    }

    public void setPasse(String passe) {
        this.passe = passe;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
}
