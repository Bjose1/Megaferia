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
public class Narrador extends Persona{
    private ArrayList<AudioLibro> libros;
    
    public Narrador (String nombre, int cedula){
        super( nombre,  cedula);
        this.libros=new ArrayList<>();
    }
    
    public boolean addLibro(AudioLibro audiolibro){
        if(!this.libros.contains(audiolibro)){
            this.libros.add(audiolibro);
            return true;
        }
        return false;
    }
    
}
