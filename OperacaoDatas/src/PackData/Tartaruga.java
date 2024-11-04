package PackData;

public class Tartaruga extends Reptil {
    private int idade;

    public Tartaruga(String nome, double peso, boolean escamas, String cor, int idade) {
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
        return "Tartaruga [nome=" + getNome() 
        		      + ", peso=" + getPeso() 
        		      + ", escamas=" + isEscamas() 
        		      + ", cor=" + getCor() 
        		      + ", idade=" + idade + "]";
    }
}