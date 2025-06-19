package com.techlab.inicio;
// Importo cliente de clase5 para no copiar
//import com.techlab.inicio.ejercicios.clase5.Cliente;
import java.util.ArrayList;
/*------------------------------------------------------------------*/
public class Pedido {
    private ArrayList<Producto> productosDelPedido;
    private Cliente cliente;
    private  static int contadorPedidos = 1;
    private int idPedido;
    /*------------------------------------------------------------------*/
    // CONSTRUCTOR, Recibe: un objeto Cliente, un objeto Producto y la cantidad requerida del mismo
    public Pedido(Cliente cliente, Producto producto, int cantidad) {
        idPedido = contadorPedidos++;
        this.cliente = cliente;     // ver setter cliente validación
        this.productosDelPedido = new ArrayList<>(); // Se crea cuando hay un primer producto para el pedido
        addProductoToPedido(producto, cantidad);
    }
    /*------------------------------------------------------------------*/
    // GET-ID
    public int getId(){return idPedido;}
    /*------------------------------------------------------------------*/
    // GET-CANTIDAD-PEDIDOS-CARGADOS
    public int getCantPedidosCargados(){return contadorPedidos;}
    /*------------------------------------------------------------------*/
    // AGREGA UN NUEVO PRODUCTO O LA LISTA DE PRODUCTOS DEL PEDIDO
    // Recibe: un objeto Producto y la cantidad requerida del mismo.
    protected void addProductoToPedido(Producto p, int cantidad){
        p.setCantidadRequerida(cantidad);   // Almacena la cantidad pedida en la variable del producto
        productosDelPedido.add(p);      // almacena el producto, la cant y sus datos en la lista del pedido
    }
    /*------------------------------------------------------------------*/
    // CALCULA EL COSTO TOTAL DEL PEDIDO: SUMATORIA DEL PRECIO POR LA CANTIDAD DE CADA PRODUCTO
    protected double calcularTotal() {
        // todo // Lógica para sumar precios
        double total = 0;
        for (Producto p : productosDelPedido) {
            total += p.getPrecio() * p.getCantidadRequerida();
        }
        return total;
    }
    /*------------------------------------------------------------------*/
    // MOSTRAR PEDIDO (toString) // mostrarPedido ver que hace toString.
    public String toString() {
        return "Pedido ID Numero: "+idPedido+"; - Cliente: "+cliente+"; - Total: $"+this.calcularTotal();

    }
}
