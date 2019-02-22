/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgraficapc;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class NombresEquipos {
    private String nombreGrupo;
    private int cantidad;

    public NombresEquipos(String nombreGrupo, int cantidad) {
        this.nombreGrupo = nombreGrupo;
        this.cantidad = cantidad;    
    }

  
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
