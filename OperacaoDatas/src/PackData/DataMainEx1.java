package PackData;
import java.time.LocalDate;


public class DataMainEx1 {

	public static void main(String[] args) {
		
		LocalDate dataInicial = LocalDate.of(2024, 1, 1);
        LocalDate dataFinal = LocalDate.of(2024, 12, 31);

        DataEx1 weekendCounter = new DataEx1(dataInicial, dataFinal);
        int weekendsCount = weekendCounter.countWeekends();

        System.out.println("Quantidade de sábados e domingos: " + weekendsCount);
    }
}