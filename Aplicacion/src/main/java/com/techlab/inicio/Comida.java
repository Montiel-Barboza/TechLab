package com.techlab.inicio;

public class Comida extends Producto {
    private String fechaVencimiento;
    /*------------------------------------------------------------------*/
    public Comida(String nombre, double precio,
                  int cantidadEnStock, String fecha, double descuento) {
        super(nombre, precio, cantidadEnStock, descuento);
        setFechaVencimiento(fecha);
    }
    /*------------------------------------------------------------------*/
    // GET Y SET VOLUMEN
    public String getFechaVencimiento() {return this.fechaVencimiento;}
    private void setFechaVencimiento(String fecha){
        this.fechaVencimiento = fecha;
    }
    /*------------------------------------------------------------------*/
    // REPORTE PRODUCTO: MUESTRA LA INFORMACIÓN DEL PRODUCTO
    @Override
    public void reporteProducto() {
        System.out.println(" id: "+getIdProducto()+",  Stock: "+getCantidadEnStock()+
                ",  Precio: $"+separadorDeMiles(getPrecio())+"--|  % Desc: "+getDescuento()+"%,  Nombre: "
                +getNombreProducto()+", Vencimiento: "+this.getFechaVencimiento()+";");
    }
}
