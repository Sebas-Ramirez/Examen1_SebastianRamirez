package examen1_sebastianramirez;
public abstract class Alumno {
    private String nombre,lugar_de_nacimiento,numero_de_cuenta,carrera;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nombre, String lugar_de_nacimiento, String numero_de_cuenta,String carrera, int edad) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.lugar_de_nacimiento = lugar_de_nacimiento;
        this.numero_de_cuenta = numero_de_cuenta;
        this.edad = edad;
    }

    public abstract String getNombre();
    public abstract String getUsuario();
    public abstract String getContraseña();
}
