package PackData;
import java.time.LocalDate;
import java.util.List;

public class DataMainEx3 {

	public static void main(String[] args) {
		
		LocalDate dataInicial = LocalDate.of(2024, 1, 15);
        int numberOfInstallments = 5;

        //lista de feriados
        List<LocalDate> holidays = List.of(
            LocalDate.of(2024, 1, 1),   // Ano Novo
            LocalDate.of(2024, 4, 21),  // Tiradentes
            LocalDate.of(2024, 5, 1),   // Dia do Trabalho
            LocalDate.of(2024, 9, 7),   // Independência do Brasil
            LocalDate.of(2024, 12, 25)  // Natal
        );

        DataEx3 paymentSchedule = new DataEx3(dataInicial, numberOfInstallments, holidays);
        List<LocalDate> paymentDates = paymentSchedule.generatePaymentDates();

        System.out.println("Datas de pagamento:");
        for (LocalDate date : paymentDates) {
            System.out.println(date);
        }
    }
}