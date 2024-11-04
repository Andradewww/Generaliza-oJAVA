package PackData;
import java.time.LocalDate;
import java.util.List;


public class DataMainEx2 {

	public static void main(String[] args) {
		
		LocalDate dataInicial = LocalDate.of(2024, 1, 1);
        LocalDate dataFinal = LocalDate.of(2024, 12, 31);

        // Lista de feriados
        List<LocalDate> holidays = List.of(
            LocalDate.of(2024, 1, 1),  // Ano Novo
            LocalDate.of(2024, 4, 21), // Tiradentes
            LocalDate.of(2024, 5, 1),  // Dia do Trabalho
            LocalDate.of(2024, 9, 7),  // Independência do Brasil
            LocalDate.of(2024, 12, 25) // Natal
        );

        DataEx2 workingDaysCounter = new DataEx2(dataInicial, dataFinal, holidays);
        int workingDaysCount = workingDaysCounter.countWorkingDays();

        System.out.println("Quantidade de dias úteis entre " + dataInicial + " e " + dataFinal + ": " + workingDaysCount);
    }
}