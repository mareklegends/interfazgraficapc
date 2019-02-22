/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficapc;

/**
 *
 * @author alumno
 */
public class Alumno {
    private String nombre;
    private int edad;    
    private boolean interesado;

    public Alumno(String nombre, int edad, boolean interesado) {
        this.nombre = nombre;
        this.edad = edad;
        this.interesado = interesado;
    }
    
    
    

    @Override
    public String toString() {
        return nombre +" ------ "+edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isInteresado() {
        return interesado;
    }

    public void setInteresado(boolean interesado) {
        this.interesado = interesado;
    }
}
