/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author jbarreno
 */
public class Gerente extends Persona{
    private Editorial editorial;
    
    public Gerente (String nombre, int cedula){
        super( nombre,  cedula);
        this.editorial=null;
    }
    @Override
     public String toString() {
        return getClass().getSimpleName() +"("+this.nombre +","+this.cedula+")";
    }
    
    public void setEditorial(Editorial editorial){
        this.editorial=editorial;
    }

    public String getEditorial() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
