package PackData;

public class AnimalMain {

	public static void main(String[] args) {
		
		//mamíferos
        Gato gato = new Gato("Frajola", 4.5, true, "Cinza", "Siamês");
        Cachorro cao = new Cachorro("Roberto", 10.0, true, "Marrom", "Caramelo");

        //répteis
        Tartaruga tartaruga = new Tartaruga("Donatelo", 2.0, true, "Verde", 35);
        Lagarto lagarto = new Lagarto("Largato", 12.0, true, "Verde", 10);

        //dados mamíferos
        System.out.println(gato);
        System.out.println(cao);

        //dados répteis
        System.out.println(tartaruga);
        System.out.println(lagarto);
    }
}