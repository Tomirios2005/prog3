package ejercicio1;

import java.time.LocalDate;

public class Link extends ArchivoGenerico{
    public Link(String nombre, LocalDate fechaCreacion, LocalDate fechaModificacion) {
        super(nombre, fechaCreacion, fechaModificacion);
    }

    @Override
    public double calcularTamanio() {
        return 1;
    }
}
