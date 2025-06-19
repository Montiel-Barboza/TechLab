package com.techlab.inicio;
import static com.techlab.inicio.Utilidades.formatearNombre;

public class Cliente {
    // Atributos:
    private String nombreCliente;
    private String email;
    private String tipoCliente;
    private int idCliente;
    private static int contadorClientes = 1;
    /*------------------------------------------------------------------*/
    // CONSTRUCTOR
    public Cliente(String nombre, String email) {
        idCliente = contadorClientes++;
        setNombre(nombre);
        setEmail(email);
        setTipoCliente("Nuevo");
    }
    /*------------------------------------------------------------------*/
    // GET Y SET NOMBRE-CLIENTE
    public String getNombre() {
        return this.nombreCliente;
    }
    private void setNombre(String nombre) {
        // TODO AÑADIR VALIDACIÓN PARA EL NOMBRE TRY() CATCH()
        this.nombreCliente = formatearNombre(nombre);
    }
    /*------------------------------------------------------------------*/
    // GET Y SET EMAIL
    public String getEmail() { return this.email; }
    private void setEmail(String email) {
        // todo Asegurá que email contenga un @ antes de asignarlo. TRY() CATCH()
        this.email = email;
    }
    /*------------------------------------------------------------------*/
    // GET Y SET TIPO-CLIENTE
    public String getTipoCliente(){return tipoCliente;}
    // todo validar quien o cómo, puede cambiar el tipo de cliente
    // todo resumir a 3 o 4 tipod de cliente, ej: Nuevo, Mayorista, Minorista, premium.
    public void setTipoCliente(String tipo) {
        this.tipoCliente = tipo;
    }
    /*------------------------------------------------------------------*/
    // ID, CONTADOR DE CLIENTES CREADOS, get y set contadorClientes
    public static int getContadorClientes(){return contadorClientes;}
    // todo función para cambiar idCliente y contadorCliente por si es necesario
    /*private void setContadorClientes(int numero /*, SUPERUSUARIO){
        if(contadorClientes<=idCliente && numero>idCliente){
            contadorClientes = numero;
        } // todo verificación de algún tipo antes de modificar contadorClientes
    }*/
    /*------------------------------------------------------------------*/
    // get y set idCliente
    public int getIdCliente() {return idCliente;}
    //private void setIdCliente(int id, SUPERUSUARIO) {this.idCliente = id;}
    /*------------------------------------------------------------------*/
    // MOSTRAR INFORMACIÓN DEL CLIENTE
    // todo ver diferencia con toString
    public void mostrarInfoCliente (){
        System.out.println("ID: "+getIdCliente()+", Nombre: "+getNombre()+", Email: "
                +this.getEmail()+", Tipo: "+this.getTipoCliente());
    }
}
