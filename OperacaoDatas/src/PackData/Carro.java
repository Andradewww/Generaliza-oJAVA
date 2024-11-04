package PackData;

public class Carro extends Veiculo {
    private int portas;

    public Carro(boolean motor, int portas) {
        super(motor);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro [motor = " + getMotor() + ", portas = " + portas + "]";
    }
}