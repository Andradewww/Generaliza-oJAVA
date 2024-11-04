package PackData;

public class Mamifero extends Animal {
    private boolean pelo;
    private String cor;

    public Mamifero(String nome, double peso, boolean pelo, String cor) {
        super(nome, peso);
        this.pelo = pelo;
        this.cor = cor;
    }

    public boolean isPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Mamifero [nome = " + getNome() 
        			 + ", peso = " + getPeso() 
        			 + ", pelo = " + pelo 
        			 + ", cor = " + cor + "]";
    }
}