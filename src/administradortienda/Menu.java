/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradortienda;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author OLMEDO
 */
public class Menu {

    private static Menu menu;

    private Menu() {

    }

    public static Menu getInstance() {

        if (menu == null) {

            menu = new Menu();

        }

        return menu;

    }

    public void opciones() {

        System.out.println("----- Tienda de Donnia Mary -----");

        System.out.println("1. Agregar Producto");
        System.out.println("2. Mostrar Productos ");
        System.out.println("3. Cargar Producto");
        System.out.println("4. Descargar Producto");
        System.out.println("5. Descartar Producto");
        System.out.println("6. Restaurar Producto");
        System.out.println("7. Editar Nombre");
        System.out.println("8. Editar Precio");
        System.out.println("9. Salir");

    }

    public void mostrar() {

        int opcion = 2;

        Scanner leer = new Scanner(System.in);
        
        ListaProductos productos = new ListaProductos();

        while (opcion != 9) {

            opciones();

            try {
                opcion = leer.nextInt();
                System.out.println("");
                switch (opcion) {

                    case 1:
                        productos.Annadir();
                        System.out.println("");
                        break;
                    case 2:
                        productos.Mostrar();
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println("Ingrese cual elemento quiere(numero) ");
                        productos.Mostrar();
                        System.out.println("");
                        productos.Cargar();
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println("Ingrese cual elemento quiere(numero) ");
                        productos.Mostrar();
                        System.out.println("");
                        productos.Descargar();
                        System.out.println("");
                        break;
                    case 5:
                        productos.Mostrar();
                        productos.Descartar();
                        System.out.println("");
                        break;
                    case 6:
                        productos.MostrarDescartados();
                        productos.Restaurar();
                        System.out.println("");
                        break;
                    case 7:
                        productos.Mostrar();
                        productos.editarNombre();
                        break;
                    case 8:
                        productos.Mostrar();
                        productos.editarPrecio();
                        break;
                    case 9:
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");

                }

            } catch (InputMismatchException e) {

                System.err.println("Por favor, Ingrese un número");

                leer.nextLine();

            }

        }

    }

}
