package PackData;
import java.util.List;

public class DataMainEx5 {

	public static void main(String[] args) {

		DataEx5 dateUtils = new DataEx5();
        
        int month = 10; // Exemplo: Outubro
        int year = 2024; // Exemplo: Ano 2024
        
        // Obtém todos os dias do mês e ano informados
        List<String> daysOfMonth = dateUtils.getAllDaysOfMonth(month, year);
        
        System.out.println("Dias do mês " + month + "/" + year + ":");
        for (String day : daysOfMonth) {
            System.out.println(day);
        }
    }
}