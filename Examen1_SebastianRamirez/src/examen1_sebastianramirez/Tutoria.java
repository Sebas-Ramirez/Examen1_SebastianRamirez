package examen1_sebastianramirez;
public class Tutoria {
    private String hora, aula, día, clase, mes, año, tema;
    private Tutor tutor;
    private EstudianteNormal alumno;

    public Tutoria(String hora, String aula, String día, String clase, String mes, String año, String tema, Tutor tutor, EstudianteNormal alumno) {
        this.hora = hora;
        this.aula = aula;
        this.día = día;
        this.clase = clase;
        this.mes = mes;
        this.año = año;
        this.tema = tema;
        this.tutor = tutor;
        this.alumno = alumno;
    }
    
}
