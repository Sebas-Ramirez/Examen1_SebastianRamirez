package examen1_sebastianramirez;
public class Examen {
    private String clase,conocimiento,tema;
    private int puntaje;

    public Examen() {
    }

    public Examen(String clase, String conocimiento, String tema, int puntaje) {
        this.clase = clase;
        this.conocimiento = conocimiento;
        this.tema = tema;
        this.puntaje = puntaje;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
}
