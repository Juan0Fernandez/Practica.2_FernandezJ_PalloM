/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Objects;

/**
 *
 * @author Juan Fernandez
 */
public class Disco {
    
    private int codigo;
    private String nombre;
    private int anioDeLanza;

    public Disco() {
    }

    public Disco(int codigo, String nombre, int anioDeLanza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioDeLanza = anioDeLanza;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioDeLanza() {
        return anioDeLanza;
    }

    public void setAnioDeLanza(int anioDeLanza) {
        this.anioDeLanza = anioDeLanza;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + this.anioDeLanza;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Disco other = (Disco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.anioDeLanza != other.anioDeLanza) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Disco{" + "codigo=" + codigo + ", nombre=" + nombre + ", anioDeLanza=" + anioDeLanza + '}';
    }
    
    
    
           
}

