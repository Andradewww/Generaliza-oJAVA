package PackData;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DataEx5 {
	
	//receptor do mês e ano
    public List<String> getAllDaysOfMonth(int month, int year) {
        List<String> daysOfMonth = new ArrayList<>();
        
        // Obter o número de dias no mês e ano informados
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        
        //formatador para dia no formato "dd/MM/yyyy"
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Gerador das datas de cada dia no mês
        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = LocalDate.of(year, month, day);
            daysOfMonth.add(date.format(dateFormatter)); //adiciona o dia formatado na lista
        }
        
        return daysOfMonth;
    }
}
