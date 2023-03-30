import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Date dt = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(
                "'Hoje é' EEEE', dia' dd 'de' MMMM 'de' yyyy 'e agora são' HH 'horas e' mm' minutos.'");

        System.out.println(sdf.format(dt));
    }
}
