/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megaferia;

import Core.Megaferia;

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
      
      megaferia.verifyStands();
    }
    
}
