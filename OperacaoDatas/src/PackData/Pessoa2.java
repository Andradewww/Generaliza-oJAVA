package PackData;

public class Pessoa2 {
    private int codigo;
    private String nome;
    private String endereco;

    // Construtor
    public Pessoa2(int codigo, String nome, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa [codigo=" + codigo 
        		   + ", nome=" + nome 
        		   + ", endereço=" + endereco + "]";
    }
}