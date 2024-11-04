package PackData;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class DataEx4 {
	
	//construtor para obter e exibir o dia da semana de uma data informada pelo usuário
    public static void findDayOfWeek() {
    	Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("EEEE", new Locale("pt", "BR")); // Formatter para o dia da semana em português
        
        try {
            System.out.print("Digite uma data (dd/MM/yyyy): ");
            String inputDate = scanner.nextLine();
            
            //Converte a entrada para LocalDate
            LocalDate date = LocalDate.parse(inputDate, dateFormatter);
            
            //Obtém o dia da semana
            String dayOfWeek = date.format(dayOfWeekFormatter);
            
            System.out.println("O dia da semana para " + inputDate + " é: " + dayOfWeek);
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Por favor, insira a data no formato dd/MM/yyyy.");
        } finally {
            scanner.close();
        }
    }
}