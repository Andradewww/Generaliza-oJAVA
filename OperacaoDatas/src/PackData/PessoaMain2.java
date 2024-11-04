package PackData;

public class PessoaMain2 {
	
	public static void main(String[] args) {
		
		//aluno / professor
        Aluno aluno = new Aluno(021, "Joãozinho", "Rua Abraham Lincoln, 123", 12345);
        Professor professor = new Professor(2, "Roberta", "Rua Lincoln Abraham, 321", "História");

        //informações
        System.out.println(aluno);
        System.out.println(professor);
		
	}

}
