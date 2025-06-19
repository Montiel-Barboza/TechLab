package com.techlab.inicio;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //static boolean SU = false;
    //private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Producto> catalogo = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    //private static ArrayList<Pedido> pedidos = new ArrayList<>();
    public static void main(String[] args) {
        /*System.out.println("Antes de entrar al try");
        try {
            System.out.println("Dentro de try, intentará dividir por cero y mostrar el resultado.");
            int a, b; a=5; b=0;
            System.out.println(a/b);
            System.out.println("Si ves ésto, no se produjo ningún error, no deberías ver catch!");
        } catch (Exception excep) { // excep.printStackTrace();
            // Muestra el error péro, permite que el programa continúe
            System.out.println("Ocurrió un error, Mostrar un mensaje relacionado, Por ejemplo:");
            System.out.println("No se puede dividir por cero." +
                    " O ejecutar otra sentencia, anidar try, etc. Fin catch.");
        }finally { System.out.println("Ejecuta la clausula FINALLY que es opcional, puede no estar!"); }
        System.out.println("De acá en adelante, continúa la ejecución normal del programa!");*/
        /*------------------------------------------------------------------*/
        // Una forma
        Scanner sc = null;
        /*try {
            sc = new Scanner(System.in);
            System.out.println("Ingrese su edad, (Solo números, solo dígitos enteros!): ");
            int edad = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Solo se admite el ingreso de números enteros, ningún otro caracter!");
        } finally {
            if (sc != null) { sc.close();
                System.out.println("Scanner cerró correctamente");
            }
            System.out.println("finally ejecutado");
        }*/
        /*------------------------------------------------------------------*/
        // OTRA FORMA
        /*try {
            pedirDato();

        } catch (){

        }*/
        /*------------------------------------------------------------------*/
        catalogo.add(new Producto("   caFÉ   preMIUM    MolIDO   ", 250.0, 100, 0));
        catalogo.add(new Producto("Té Verde Orgánico", 180.0, 50, 0));
        catalogo.add(new Producto("Chocolate Amargo 80%", 300.0, 30, 0));
        catalogo.add(new Bebida("   refrES  coLA    ", 1222.33, 3000, 1.25, 0));
        catalogo.add(new Comida("  paN    dE   molDE  caseRO  ", 3573.54,
                200, "25/06/2025", 0));
        listarCatalogo();
        /*------------------------------------------------------------------*/
        //menu();
        /*------------------------------------------------------------------*/
        System.out.println(" ");
        System.out.println("*********************************************");
        System.out.println("*-------- PROBANDO LA CLASE CLIENTE --------*");
        System.out.println("*********************************************");
        //ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("   pabLO   monTIEL   ", "montielpablo@yahoo.com.ar"));
        listaClientes.add(new Cliente("Osvaldo Figueroa", "ova@gmail.com"));
        listaClientes.add(new Cliente("Silvia Torres", "torrsil@hotmail.com"));
        listaClientes.add(new Cliente("Paula Gomez", "gomezpau@yahoo.com"));
        listaClientes.add(new Cliente("Gustavo Peralta", "pergus@gmail.com.ar"));
        listarClientes();

    }
    /*------------------------------------------------------------------*/
    // "LISTAR/IMPRIMIR CLIENTES" MUESTRA UNA LISTA DE TODOS LOS CLIENTES CREADOS EN LA LISTA-CLIENTES.
    private static void listarClientes() {System.out.println();
        System.out.println("|        NOMBRE CLIENTE        |        EMAIL CLIENTE        |");
        for ( Cliente cliente: listaClientes){cliente.mostrarInfoCliente();}
    }
    /*------------------------------------------------------------------*/
    // "LISTAR/IMPRIMIR CATÁLOGO" MUESTRA UNA LISTA DE TODOS LOS PRODUCTOS CREADOS EN EL CATÁLOGO.
    private static void listarCatalogo() {System.out.println();
        System.out.println("| ID  |  STOCK     |  PRECIO         | DESCUENTO |    DESCRIPCIÓN DEL PRODUCTO               |");
        for ( Producto producto: catalogo){producto.reporteProducto();}
    }
    /*------------------------------------------------------------------*/



    /*private static void menu() {
        int opcion;
        do{
            System.out.println();
            System.out.println("********************************************");
            System.out.println("*------- MENÚ PRINCIPAL --- TECHLAB -------*");
            System.out.println("********************************************");
            System.out.println("* 1. Ver Catálogo de Productos Almacenados.*");
            System.out.println("* 2. Crear pedido                          *");
            System.out.println("* 3. Ver pedidos                           *");
            System.out.println("* 4. Super Usuario                         *");
            if(SU){System.out.println("* 5. Agregar nuevo producto(SU)            *");}
            if(SU){System.out.println("* 6. Cerrar sesión Super Usuario           *");}
            System.out.println("* 0. salir                                 *");
            System.out.println("********************************************");

            opcion = Utilidades.leerEntero(sc,"Ingrese opcion: ");
            switch (opcion) {
                case 1 -> listarCatalogo();
                case 2 -> crearPedido();
                case 3 -> mostrarPedidos();
                case 4 -> superUsuario();
                case 5 -> {if(SU){agregarProducto();}}
                case 6 -> {SU=false;}
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
    }*/
    /*------------------------------------------------------------------*/


    /*private static void crearPedido() {
        sc.nextLine();
        System.out.println("Nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Email del cliente: ");
        String email = sc.nextLine();

        Cliente cliente = new Cliente(nombre,email);
        Pedido pedido = new Pedido(cliente);

        boolean seguir = true;
        while (seguir) {
            mostrarProductos();
            int id = Utilidades.leerEntero(sc, "Ingrese ID del producto a agregar (0 para terminar):");
            if (id == 0) break;

            Producto seleccionado = buscarProductoPorId(id);
            if (seleccionado != null) {
                pedido.agregarProducto(seleccionado);
                System.out.println("Producto agregado.");
            } else {
                System.out.println("Producto no encontrado.");
            }
        }
        try {
            if(pedido.calcularTotal() == 0) {
                throw new PedidoException("No se puede crear un pedido vacio.");
            } else {
                pedidos.add(pedido);
                System.out.println("Pedido creado con exito.");
            }
        } catch (PedidoException e) {
            System.out.println("Error al crear pedido: " + e.getMessage());
        }
    }*/
    /*------------------------------------------------------------------*/
    /*private static Producto buscarProductoPorId(int id) {
        for (Producto p : catalogo) {
            if (p.getIdProducto() == id) return p;
        }
        return null;
    }*/
    /*------------------------------------------------------------------*/
    /*private static void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos aún.");
            return;
        }
        System.out.println();
        System.out.println("=".repeat(35));
        System.out.println("--- Pedidos - TECHLAB ---");
        System.out.println("=".repeat(35));
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }*/
    /*------------------------------------------------------------------*/
    /*private static void superUsuario() {
        sc.nextLine(); // al estar utilizando el metodo anterior se usa este codigo para de una sierta forma limiar el Scaner
        System.out.print("Ingrese su usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contra = sc.nextLine();

        if(usuario.equals("gustavo") && contra.equals("gu123")) {
            SU = true;
            System.out.println("Modo Super Usuario activado ✅");
        } else {
            System.out.println("Credenciales incorrectas ❌");
        }
    }*/
    /*------------------------------------------------------------------*/
    /*private static void agregarProducto() {
        sc.nextLine();
        System.out.print("Nombre del nuevo producto: ");
        String nombre = sc.nextLine();
        double precio = Utilidades.leerDouble(sc, "Ingrese el Precio del producto: ");
        int nuevoId = Utilidades.leerEntero(sc, "Ingrese un entero, ID del Producto: ");
        int cantStock = Utilidades.leerEntero(sc, "Ingrese un entero, Cantidad de producto en Stock: ");
        catalogo.add(new Producto(nuevoId, nombre, precio, cantStock));

        System.out.println("Producto agregado exitosamente. ✅");
    }*/
    /*------------------------------------------------------------------*/

    /*  */
        /*
        cafe.mostrarInformacion();
        cafe.reporteProducto();
        teVerde.mostrarInformacion();
        teVerde.reporteProducto();
        chocolateAmargo.mostrarInformacion();
        chocolateAmargo.reporteProducto();
        */

    //cafe.descuento10();
    //teVerde.descuento10();
    //chocolateAmargo.descuento10();

        /*
        ArrayList<Cliente> listadoClientes = new ArrayList<>();
        Cliente cl1 = new Cliente("Ricardo Rubén", "rr@gmail.com");
        listadoClientes.add(cl1);
        Cliente cl2 = new Cliente("Pablo Montiel", "montielpablo@yahoo.com.ar");
        listadoClientes.add(cl2);
        cl1.mostrarInfo();
        cl2.mostrarInfo();
        */
        /*
        System.out.println("Cantidad de productos creados: "
                +Producto.getContadorProductos());
        */
    /*------------------------------------------------------------------*/
}
