/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administradortienda;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author OLMEDO
 */
public class ListaProductos {

    private ArrayList<Producto> productos;
    private ArrayList<Producto> productosDescartados;

    public ListaProductos() {
        productos = new ArrayList<>();
        productosDescartados = new ArrayList<>();
    }

    public void Annadir() {
        Scanner leer = new Scanner(System.in);
        Producto nuevoProducto = new Producto();

        System.out.println("Ingrese el nombre del producto");
        System.out.print(": ");
        nuevoProducto.setNombre(leer.nextLine());

        System.out.println("Ingrese la cantidad del producto");
        System.out.print(": ");
        nuevoProducto.setCantidad(leer.nextInt());

        System.out.println("Ingrese el precio del producto");
        System.out.print(": ");
        nuevoProducto.setPrecio(leer.nextFloat());

        productos.add(nuevoProducto);

    }

    public void Mostrar() {
        for (Producto p : productos) {
            System.out.println(productos.indexOf(p) + " - " + p.toString());
        }
    }

    public void MostrarDescartados() {
        for (Producto p : productosDescartados) {
            System.out.println(productosDescartados.indexOf(p) + " - " + p.toString());
        }
    }

    public void Cargar() {
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        System.out.println("Ingrese cuanto de este objeto se añadira al inventario: ");
        productos.get(opcion).Cargar(leer.nextInt());
    }

    public void Descargar() {
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        System.out.println("Ingrese cuanto de este objeto se eliminara del inventario: ");
        productos.get(opcion).Descargar(leer.nextInt());
    }

    public void Descartar() {
        if (productos.size() != 0) {
            System.out.println("Ingrese el producto que quiere descartar ");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            if (opcion < productos.size()) {
                productosDescartados.add(productos.get(opcion));
                productos.remove(productos.get(opcion));
            } else {
                System.out.println("Producto NO valido");
            }
            }else{
            System.out.println("No hay mas productos disponibles");
        }
        }
    

    public void Restaurar() {
        if (productosDescartados.size() != 0) {
            System.out.println("Ingrese el producto que quiere restaurar ");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            if(opcion<productosDescartados.size()){
            productos.add(productosDescartados.get(opcion));
            productosDescartados.remove(productosDescartados.get(opcion));
            }else{
                System.out.println("Producto NO valido");
            }
                 
        } else {
            System.out.println("No hay productos disponibles para restaurar");
        }
    }
    public void editarNombre(){
        if (productos.size() != 0) {
            System.out.println("Ingrese el producto que quiere editar(numero) ");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            if (opcion < productos.size()) {
                System.out.println("Nuevo nombre: ");
                productos.get(opcion).setNombre(leer.next());
            } else {
                System.out.println("Producto NO valido");
            }
            }else{
            System.out.println("Producto NO valido");
        }
    }
    public void editarPrecio(){
        if (productos.size() != 0) {
            System.out.println("Ingrese el producto que quiere editar(numero) ");
            Scanner leer = new Scanner(System.in);
            int opcion = leer.nextInt();
            if (opcion < productos.size()) {
                System.out.println("Nuevo precio: ");
                productos.get(opcion).setPrecio(leer.nextFloat());
            } else {
                System.out.println("Producto NO valido");
            }
            }else{
            System.out.println("Producto NO valido");
        }
    }

}
