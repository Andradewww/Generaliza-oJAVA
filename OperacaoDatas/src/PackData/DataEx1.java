package PackData;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DataEx1 {
	
	private LocalDate dataInicial;
    private LocalDate dataFinal;

    // Construtor das datas de início e fim
    public DataEx1(LocalDate startDate, LocalDate endDate) {
        this.dataInicial = startDate;
        this.dataFinal = endDate;
    }

    // contador de sábados e domingos
    public int countWeekends() {
        int count = 0;
        
        // Itera sobre os dias entre as duas datas
        for (LocalDate date = dataInicial; !date.isAfter(dataFinal); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            // Verifica se é sábado ou domingo
            if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
                count++;
            }
        }
        
        return count;
    }

    public LocalDate getStartDate() {
        return dataInicial;
    }

    public void setStartDate(LocalDate startDate) {
        this.dataInicial = startDate;
    }

    public LocalDate getEndDate() {
        return dataFinal;
    }

    public void setEndDate(LocalDate endDate) {
        this.dataFinal = endDate;
    }

}
