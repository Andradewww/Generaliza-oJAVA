package PackData;

public class MillenniumFalcon extends Apollo11 {
	
    private float classeHiperPropulsor;

    // Construtor
    public MillenniumFalcon(double velocidadeMaxima, String tipoCombustivel, float classeHiperPropulsor) {
        super(velocidadeMaxima, tipoCombustivel);
        this.classeHiperPropulsor = classeHiperPropulsor;
    }

    public float getClasseHiperPropulsor() {
        return classeHiperPropulsor;
    }

    public void setClasseHiperPropulsor(float classeHiperPropulsor) {
        this.classeHiperPropulsor = classeHiperPropulsor;
    }

    @Override
    public String toString() {
        return "MillenniumFalcon [classeHiperPropulsor=" + classeHiperPropulsor + ", " + super.toString() + "]";
    }
}