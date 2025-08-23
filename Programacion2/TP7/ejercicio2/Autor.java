package ejercicio2;

public class Autor {
    private String nombre;
    public Autor(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean equals(Object o1){
        try {
            Autor aa = (Autor) o1;
            return this.nombre.equalsIgnoreCase(aa.getNombre());
        } catch (Exception e) {
            return false;
            // TODO: handle exception
        }
    }
    

}
