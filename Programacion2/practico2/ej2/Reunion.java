public class Reunion{
    String lugar,tema;
    int duracion;
    Participante [] participantes;
    public Reunion(String lugar, String tema, int duracion) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
    }
    public void setParticipantes(Participante participante, int nroParticipante){
            participantes[nroParticipante]=participante;
            
    }
    

    

}