
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class DataHora implements Serializable {

    Date data;
    Time hora;

    public DataHora() {
        data = new Date();
        hora = new Time(1000);
    }
}
