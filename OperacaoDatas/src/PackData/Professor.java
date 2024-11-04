package PackData;

public class Professor extends Pessoa2 {
    private String disciplina;

    // Construtor
    public Professor(int codigo, String nome, String endereco, String disciplina) {
        super(codigo, nome, endereco);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor [disciplina=" + disciplina + ", " + super.toString() + "]";
    }
}