public class Persona {
    String nombre;
    String apellido;
    int edad;
    String nacimiento;
    int dni;
    String sexo;
    int peso;
    int altura;

    public Persona(int dni, String nombre, String apellido, String nacimiento){
        this.dni=dni;
        this.setNacimiento(nacimiento);
        this.setSexo("femenino");;
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setPeso(1);;
        this.setAltura(1);;

    }

    public Persona(int dni){
        this(dni,"n","n","1/1/2000");

    }
    public Persona(int dni, String nombre, String apellido){
     
        this(dni, nombre, apellido,"1/1/2000");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDni() {
        return dni;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double calcMasaCorporal(){
       return this.getPeso()/(this.getAltura()*this.getAltura());
    }
    public boolean estaEnForma(){
        if (this.calcMasaCorporal()>=18.5&&this.calcMasaCorporal()<=25) {
            return true;
        }
        return false;
    }
   public boolean cumpleAnios(String fechaActual){
    return fechaActual == this.getNacimiento();

   }

}