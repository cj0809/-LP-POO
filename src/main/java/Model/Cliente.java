package Model;

public class Cliente extends Pessoa {
    private int id;
    private String endereco;

    public Cliente() {
    }

    public Cliente(int id, String nome, String email, String telefone, String endereco) {
        super(nome, email, telefone);
        this.id = id;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
