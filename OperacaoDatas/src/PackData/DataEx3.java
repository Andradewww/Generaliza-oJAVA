package PackData;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataEx3 {
	
	private LocalDate startDate;
    private int numberOfInstallments;
    private List<LocalDate> holidays;

    //Construtor para data inicial, número de parcelas e feriados
    public DataEx3(LocalDate startDate, int numberOfInstallments, List<LocalDate> holidays) {
        this.startDate = startDate;
        this.numberOfInstallments = numberOfInstallments;
        this.holidays = holidays;
    }

    //calcular as datas de pagamento ajustadas para dias úteis
    public List<LocalDate> generatePaymentDates() {
        List<LocalDate> paymentDates = new ArrayList<>();
        LocalDate dueDate = startDate;

        for (int i = 0; i < numberOfInstallments; i++) {
            //adiciona 30 dias para calcular a próxima data de vencimento
            dueDate = dueDate.plusDays(30);

            //Ajusta a data para o próximo dia útil, se for final de semana ou feriado
            dueDate = adjustToNextBusinessDay(dueDate);
            
            // Adiciona a data na lista de pagamentos
            paymentDates.add(dueDate);
        }

        return paymentDates;
    }

    private LocalDate adjustToNextBusinessDay(LocalDate date) {
        // Verifica se a data cai em final de semana ou feriado
        while (date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY || holidays.contains(date)) {
            date = date.plusDays(1); //vai para o próximo dia até ser um dia útil
        }
        return date;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(int numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public List<LocalDate> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<LocalDate> holidays) {
        this.holidays = holidays;
    }

}
