package com.techlab.inicio;

public class Bebida extends Producto{
    private double volumenEnLitros;
    /*------------------------------------------------------------------*/
    public Bebida(String nombre, double precio,
                  int cantidadEnStock, double litros, double descuento) {
        super(nombre, precio, cantidadEnStock, descuento);
        setVolumenEnLitros(litros);
    }
    /*------------------------------------------------------------------*/
    // GET Y SET VOLUMEN
    public double getVolumenEnLitros() {return volumenEnLitros;}
    private void setVolumenEnLitros(double litros){
        if (litros>0){this.volumenEnLitros = litros;}
    }
    /*------------------------------------------------------------------*/
    // REPORTE PRODUCTO: MUESTRA LA INFORMACIÓN DEL PRODUCTO
    @Override
    public void reporteProducto() {
        super.reporteProducto();
        System.out.println(" id: "+getIdProducto()+",  Stock: "
                +getCantidadEnStock()+",  Precio: $"+separadorDeMiles(getPrecio())+"--|  % Desc: "
                +getDescuento()+"%,  Nombre: "+getNombreProducto()+", Litros: "+getVolumenEnLitros()+";");
    }
    /*------------------------------------------------------------------*/

}
