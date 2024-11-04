package PackData;

public class Reptil extends Animal {
    private boolean escamas;
    private String cor;

    public Reptil(String nome, double peso, boolean escamas, String cor) {
        super(nome, peso);
        this.escamas = escamas;
        this.cor = cor;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public void setEscamas(boolean escamas) {
        this.escamas = escamas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Reptil [nome=" + getNome() 
        		   + ", peso=" + getPeso() 
        		   + ", escamas=" + escamas 
        		   + ", cor=" + cor + "]";
    }
}