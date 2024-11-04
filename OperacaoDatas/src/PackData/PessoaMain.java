package PackData;

public class PessoaMain {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();

		p.setNome("Josué");
		p.setEndereco("Rua teste");
		
		pf.setCpf("3532345352"); 
		pf.setEndereco("Agronômica");
		pf.setEstadoCivil("Solteiro");
		pf.setNome("Pedro Korb");
		
		pj.setNome("Empresa teste");
		pj.setEndereco("Rio do Sul");
		pj.setCnpj("345432456435643");
		pj.setTipoEmpresa("SA");
		
		
		System.out.println(p);
		
		System.out.println();
		System.out.println(pf);
		
		System.out.println();
		System.out.println(pj);

		
	}

}
