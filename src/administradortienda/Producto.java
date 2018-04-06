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
public class Producto {
    private String nombre;
    private int cantidad;
    private float precio;
    
    public Producto() {
    }
    
    public Producto(String nombre, int cantidad, float precio){
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }
    public void Cargar(int carga){
        this.cantidad+= carga;
        System.out.println("Succes");
    }
    public void Descargar(int descarga){
        if(descarga>this.cantidad){
            System.out.println("No tienes tantos items para descargar");
        }else{
        this.cantidad-=descarga;
        System.out.println("Succes"); 
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "Nombre=" + nombre + ", Cantidad=" + cantidad + ", Precio=" + precio + '}';

    }
}
