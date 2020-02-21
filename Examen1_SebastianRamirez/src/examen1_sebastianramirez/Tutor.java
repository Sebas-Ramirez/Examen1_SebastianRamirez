package examen1_sebastianramirez;

import java.util.ArrayList;

public class Tutor extends Alumno{
    private String nombre,lugar_de_nacimiento,numero_de_cuenta,carrera;
    private ArrayList<String> clases = new ArrayList();
    private int edad,ganancias,tutorias_dadas;

    public Tutor() {
    }

    public Tutor(String nombre, String lugar_de_nacimiento, String numero_de_cuenta, String carrera, int edad, int ganancias, int tutorias_dadas) {
        this.nombre = nombre;
        this.lugar_de_nacimiento = lugar_de_nacimiento;
        this.numero_de_cuenta = numero_de_cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.ganancias = ganancias;
        this.tutorias_dadas = tutorias_dadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGanancias() {
        return ganancias;
    }

    public void setGanancias(int ganancias) {
        this.ganancias = ganancias;
    }

    public int getTutorias_dadas() {
        return tutorias_dadas;
    }

    public void setTutorias_dadas(int tutorias_dadas) {
        this.tutorias_dadas = tutorias_dadas;
    }
    
}
