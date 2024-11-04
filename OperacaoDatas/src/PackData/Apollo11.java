package PackData;

public class Apollo11 extends NaveEspacial {
    private String tipoCombustivel;

    // Construtor
    public Apollo11(double velocidadeMaxima, String tipoCombustivel) {
        super(velocidadeMaxima);
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString() {
        return "Apollo11 [tipoCombustivel=" + tipoCombustivel + ", " + super.toString() + "]";
    }
}