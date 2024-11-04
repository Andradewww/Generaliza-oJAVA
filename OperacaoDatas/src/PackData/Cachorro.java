package PackData;

public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String nome, double peso, boolean pelo, String cor, String raca) {
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
        return "Cao [nome=" + getNome() + ","
        		 + " peso=" + getPeso() + ", "
        		 + "pelo=" + isPelo() + ", "
        		 + "cor=" + getCor() 
        		 + ", raca=" + raca + "]";
    }
}