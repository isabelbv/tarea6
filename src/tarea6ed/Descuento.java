/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6ed;

/**
 *
 * @author isabe
 */
public class Descuento {
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > MINIMO_DESCUENTOS) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * DESCUENTO_BIG;
            EnseñarTotal(Total);
        } else {
            Total = precioProducto * DESCUENTO_ESTANDAR;
            EnseñarTotal(Total);
        }

    }
    private static final int MINIMO_DESCUENTOS = 3;
    private static final double DESCUENTO_ESTANDAR = 0.95;
    private static final double DESCUENTO_BIG = 0.8;

    private void EnseñarTotal(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
    
}
