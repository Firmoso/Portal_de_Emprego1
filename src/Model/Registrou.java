
package Model;

public class Registrou extends Registro{
    
String cargo;
String apelido;

    public Registrou(String cargo, String nome,String apelido, int contacto) {
        super(nome, contacto);
        this.cargo = cargo;
        this.apelido = apelido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


}
