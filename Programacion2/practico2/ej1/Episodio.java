public class Episodio{
    String titulo, descripcion;
    boolean vista;
    int calificacion;
    public Episodio(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.vista = false;
        this.calificacion = -1;
    }
  
    public void setCalificacion(int calificacion){
        if (calificacion>=1&&calificacion<=5) {
            this.calificacion=calificacion;
            vista=true;
            
        }else{
            System.out.println("la calificacion ingresada es erronea");
        }

    }

    public boolean fueVisto(){
        return vista;
    }
    public int getCalificacion(){
        return this.calificacion;
    }

}