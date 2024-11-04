package PackData;

public class Pessoa {
	
	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) { 
	    if (nome != null && nome.length() > 0) {
	        this.nome = nome;
	    }
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String esdereco) {
	    if (esdereco != null && esdereco.trim().length() > 0) {
	        this.endereco = esdereco;
	    } else {
	        System.out.println("Endereço inválido");
	    }
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("pessoa [nome=");
		builder.append(nome);
		builder.append(", Endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}
}
