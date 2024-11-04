package PackData;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(boolean motor, int eixos) {
        super(motor);  // chama o construtor de Veiculo
        this.eixos = eixos;
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public String toString() {
        return "Caminhao [motor = " + getMotor() + ", eixos = " + eixos + "]";
    }
}