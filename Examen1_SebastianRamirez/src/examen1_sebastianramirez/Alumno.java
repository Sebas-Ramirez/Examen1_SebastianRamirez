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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public String getLugar_de_nacimiento() {
        return lugar_de_nacimiento;
    }

    public void setLugar_de_nacimiento(String lugar_de_nacimiento) {
        this.lugar_de_nacimiento = lugar_de_nacimiento;
    }

    public String getNumero_de_cuenta() {
        return numero_de_cuenta;
    }

    public void setNumero_de_cuenta(String numero_de_cuenta) {
        this.numero_de_cuenta = numero_de_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + '}';
    }
    
}
