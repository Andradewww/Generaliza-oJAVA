package PackData;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class DataEx2 {
	
	private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<LocalDate> holidays;

    // Construtor das datas de início, fim e a lista de feriados
    public DataEx2(LocalDate startDate, LocalDate endDate, List<LocalDate> holidays) {
        this.dataInicial = startDate;
        this.dataFinal = endDate;
        this.holidays = holidays;
    }

    //contador dias úteis
    public int countWorkingDays() {
        int count = 0;

        for (LocalDate date = dataInicial; !date.isAfter(dataFinal); date = date.plusDays(1)) {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            //verifica se é um dia útil
            if (dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY && !holidays.contains(date)) {
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

    public List<LocalDate> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<LocalDate> holidays) {
        this.holidays = holidays;
    }

}
