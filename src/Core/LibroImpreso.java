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
public class LibroImpreso extends Libro {
    private int paginas;
    private int numEjemplares;
    public LibroImpreso (String titulo, ArrayList<Autor> autores , String isbn, String genero, String formato, float Valor, Editorial editorial, int paginas, int numEjemplares){
        super( titulo,  autores ,  isbn,  genero,  formato,  Valor,  editorial);
        this.paginas=paginas;
        this.numEjemplares=numEjemplares;
    }
}
