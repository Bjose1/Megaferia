/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megaferia;

import Core.Editorial;
import Core.Gerente;
import Core.Megaferia;
import java.util.ArrayList;

/**
 *
 * @author jbarreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia();
        megaferia.createStand(100000);
        megaferia.createStand(200000);
        megaferia.createStand(150000);
        megaferia.createStand(500000);

        Gerente gerente1 = new Gerente("Juan Juliao", 104893);
        Gerente gerente2 = new Gerente("Pedro Perez", 116971);

        Editorial editorial1 = new Editorial("981-1547565-1", "Plante", "Calle 46 #53-163", gerente1);
        Editorial editorial2 = new Editorial("980-1547565-1", "Nova", "Calle 79 #43-93", gerente2);

        ArrayList<Integer> standsIds = new ArrayList<>();
        standsIds.add(0);
        standsIds.add(1);
        standsIds.add(3);
        standsIds.add(4);

        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);
        
        megaferia.assignStandEditorial(standsIds, editoriales);
        System.out.println(megaferia +"-->"+ megaferia.getStand());
        System.out.println(megaferia +"-->"+ megaferia.getEditorial());
        
        System.out.println(editorial1+"->"+editorial1.getGerente());
        System.out.println(gerente1 +"->"+gerente1.getEditorial());
        
        System.out.println(editorial2+"->"+editorial2.getGerente());
        System.out.println(gerente2 +"->"+gerente2.getEditorial());
        
        megaferia.verifyStands();
    }

}
