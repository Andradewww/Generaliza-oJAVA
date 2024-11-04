package PackData;

public class Veiculo {
	
	private boolean motor;

    public Veiculo(boolean motor) {
        this.motor = motor;
    }

    public boolean getMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Veiculo [motor = " + motor + "]";
    }
}
