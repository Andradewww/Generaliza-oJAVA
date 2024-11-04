package PackData;

public class Gato extends Mamifero {
    private String raca;

    public Gato(String nome, double peso, boolean pelo, String cor, String raca) {
        super(nome, peso, pelo, cor);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Gato [nome=" + getNome() 
        		 + ", peso=" + getPeso() 
        		 + ", pelo=" + isPelo() 
        		 + ", cor=" + getCor() 
        		 + ", raca=" + raca + "]";
    }
}