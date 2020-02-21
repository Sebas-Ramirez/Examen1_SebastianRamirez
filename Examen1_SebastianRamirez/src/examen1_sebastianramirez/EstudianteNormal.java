package examen1_sebastianramirez;

import java.util.ArrayList;

public class EstudianteNormal extends Alumno {
    private String nombre,lugar_de_nacimiento,numero_de_cuenta,carrera;
    private int edad,conocimiento_acumulado,nivel_de_aprendizaje;
    private ArrayList examenes = new ArrayList();

    public EstudianteNormal() {
    }

    public EstudianteNormal(String nombre, String lugar_de_nacimiento, String numero_de_cuenta, String carrera, int edad, int conocimiento_acumulado, int nivel_de_aprendizaje) {
        this.nombre = nombre;
        this.lugar_de_nacimiento = lugar_de_nacimiento;
        this.numero_de_cuenta = numero_de_cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.conocimiento_acumulado = conocimiento_acumulado;
        this.nivel_de_aprendizaje = nivel_de_aprendizaje;
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

    public int getConocimiento_acumulado() {
        return conocimiento_acumulado;
    }

    public void setConocimiento_acumulado(int conocimiento_acumulado) {
        this.conocimiento_acumulado = conocimiento_acumulado;
    }

    public int getNivel_de_aprendizaje() {
        return nivel_de_aprendizaje;
    }

    public void setNivel_de_aprendizaje(int nivel_de_aprendizaje) {
        this.nivel_de_aprendizaje = nivel_de_aprendizaje;
    }
    
}
