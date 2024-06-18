package Model;

public class Vendedor extends Pessoa {
    private int id;
    private String cargo;

    public Vendedor() {
    }

    public Vendedor(int id, String nome, String email, String telefone, String cargo) {
        super(nome, email, telefone);
        this.id = id;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}
