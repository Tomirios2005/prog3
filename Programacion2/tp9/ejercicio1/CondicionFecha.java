import java.time.LocalDate;

public class CondicionFecha extends Condicion{
    private LocalDate fecha;

    public CondicionFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean cumple(ArchivoGenerico aa) {
        return aa.getFecha().isAfter(this.fecha);
    }
}
