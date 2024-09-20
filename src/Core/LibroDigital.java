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
public class LibroDigital extends Libro{
    private boolean hasHipervinculos;
    private ArrayList<String> hipervinculos;
    public LibroDigital (String titulo, ArrayList<Autor> autores , String isbn, String genero, String formato, float Valor, Editorial editorial, boolean hasHipervinculos, ArrayList<String> hipervinculos){
        super( titulo,  autores ,  isbn,  genero,  formato,  Valor,  editorial);
        this.hasHipervinculos=hasHipervinculos;
        this.hipervinculos=hipervinculos;
    }
}
