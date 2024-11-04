package PackData;

public class VeiculoMain {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao(true, 3);
        Carro carro = new Carro(true, 4);
        Moto moto = new Moto(true, 150);

        System.out.println(caminhao);
        System.out.println(carro);
        System.out.println(moto);
	}

}
