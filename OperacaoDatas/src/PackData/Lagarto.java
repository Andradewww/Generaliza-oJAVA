package PackData;

public class Lagarto extends Reptil {
    private int idade;

    public Lagarto(String nome, double peso, boolean escamas, String cor, int idade) {
        super(nome, peso, escamas, cor);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Lagarto [nome=" + getNome() 
        			+ ", peso=" + getPeso() 
        			+ ", escamas=" + isEscamas() 
        			+ ", cor=" + getCor() 
        			+ ", idade=" + idade + "]";
    }
}