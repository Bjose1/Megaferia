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
public class Megaferia {
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;
    
    public Megaferia(){
        this.stands=new ArrayList<>();
        this.editoriales=new ArrayList<>();
    }
    
    public void createStand(float precio){
        this.stands.add(new Stand(precio));
    }
    
    public void verifyStands(){
        for (Stand stand : stands) {
            System.out.println(stand);
        }
    }
    
    public boolean addEditorial(Editorial editorial){
        if(!this.editoriales.contains(editorial)){
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }
}
