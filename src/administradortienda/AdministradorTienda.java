/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradortienda;


/**
 *
 * @author OLMEDO
 */
public class AdministradorTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        Menu menu = Menu.getInstance();
        menu.mostrar();
    }
    
}
