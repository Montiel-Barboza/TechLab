package com.techlab.inicio;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import static com.techlab.inicio.Utilidades.formatearNombre;

public class Producto {
    private String nombreProducto;
    private double precio;
    private double descuento=0;
    private int cantidadEnStock;
    private int cantidadRequerida=0;
    private static int contadorProductos = 1;
    private int idProducto;
    /*------------------------------------------------------------------*/
    // CONSTRUCTOR
    protected Producto(String nombreProducto, double precio, int cantidadEnStock, double descuento) {
        idProducto = contadorProductos++;
        setNombreProducto(nombreProducto);
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
        setDescuento(descuento);
    }
    /*------------------------------------------------------------------*/
    // SIN ARGUMENTOS    /*protected Producto(){}*/
    /*------------------------------------------------------------------*/
    // GET Y SET NOMBRE-PRODUCTO
    public String getNombreProducto() {return this.nombreProducto;}
    public void setNombreProducto(String nombre) {
        // Podemos verificar que el nombre no esté vacío
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombreProducto = formatearNombre(nombre);}
    }
    /*------------------------------------------------------------------*/
    // get y set cantidadRequerida
    public int getCantidadRequerida(){return this.cantidadRequerida;}
    protected void setCantidadRequerida(int cantidad){
        if (cantidad<=this.cantidadEnStock){this.cantidadRequerida = cantidad;}
        else {System.out.println("Error: No hay Stock suficiente para cumplir con el pedido.");}
        // todo descontar la cantidad requerida (por cada pedido concretado) del stock
    }
    /*------------------------------------------------------------------*/
    // ID, CONTADOR DE PRODUCTOS CREADOS, get y set contadorProductos
    /*public static int getContadorProductos(){return contadorProductos;}*/
    //private void //setContadorProductos(int cantProdCreados/*, SUPERUSUARIO*/){
    //                      contadorProductos = cantProdCreados;}
    /*------------------------------------------------------------------*/
    // get y set idProducto
    public int getIdProducto() {return idProducto;}
    //private void setIdProducto(int id) {this.idProducto = id;}
    /*------------------------------------------------------------------*/
    // get y set precio
    protected double getPrecio() {return this.precio;}
    protected void setPrecio(double precio) {if (precio >= 0) {this.precio = precio;
    }else System.out.println("El precio ingresado no puede ser menor a CERO");}
    /*------------------------------------------------------------------*/
    // actualizarPrecio
    /*protected void //actualizarPrecio (double nuevoPrecio){
        if(nuevoPrecio > 0 && nuevoPrecio > this.precio){this.precio = nuevoPrecio;
        }else System.out.println("El nuevo precio no puede ser menor al precio actual");}*/
    /*------------------------------------------------------------------*/
    // get y set cantidadEnStock
    protected int getCantidadEnStock() {return this.cantidadEnStock;}
    private void setCantidadEnStock(int cantidad) {
        if (cantidad >= 0) {this.cantidadEnStock += cantidad;}
    }
    /*------------------------------------------------------------------*/
    // REPORTE PRODUCTO: MUESTRA LA INFORMACIÓN DEL PRODUCTO
    public void reporteProducto() {System.out.println(" id: "+getIdProducto()+
            ",  Stock: "+getCantidadEnStock()+",  Precio: $"+separadorDeMiles(getPrecio())+"--|  % Desc: "
            +getDescuento()+"%,  Nombre: "+getNombreProducto()+";");

    }
    /*------------------------------------------------------------------*/

    /*------------------------------------------------------------------*/
    // SEPARADOR DE MILES PARA DAR FORMATO AL PRECIO, SOLO VISUAL
    protected String separadorDeMiles(double numero) {
        DecimalFormatSymbols sim = new DecimalFormatSymbols();
        sim.setGroupingSeparator('.');
        DecimalFormat formato = new DecimalFormat("#,##0.00",sim);
        return formato.format(numero);    }
    /*------------------------------------------------------------------*/
    // GET Y SET DESCUENTO
    protected void setDescuento(double desc) {
        if (descuento <= 30) {this.descuento = desc;}
        else System.out.println("El descuento no puede ser superior al 30%");}
    protected double getDescuento(){return this.descuento;}
    /*------------------------------------------------------------------*/
    // para buscar si el nombreProducto contiene subString
    /* protected boolean contiene-Nombre(String b){
        return this.nombreProducto.contains(b);} */
    /*------------------------------------------------------------------*/
    // CALCULAR-PRECIO-TOTAL
    /* double //calcularPrecioTotal(){
        double precioLista = getPrecio() * getCantidadRequerida();
        double descuento = 1 - (getDescuento()/100);
        return precioLista * descuento;
    }*/
}
