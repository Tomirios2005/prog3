/**
 * Facturador
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Facturador {
public static void main(String[] args) {
    char tipoDeFactura;
    int numeroFactura;
    String cliente;
    String producto1;
    float precio1;
    String producto2;
    float precio2;
    float precioTotal;

    try {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese el tipo de factura (a, b, c): ");
        tipoDeFactura = entrada.readLine().charAt(0);
        System.out.println("ingrese el numero de factura: ");
        numeroFactura = Integer.valueOf(entrada.readLine());
        System.out.println("ingrese el nombre del cliente: ");
        cliente = entrada.readLine();
        System.out.println("ingrese un producto: ");
        producto1 = entrada.readLine();
        System.out.println("ingrese su precio: ");
        precio1 = Float.valueOf(entrada.readLine());
        System.out.println("ingrese otro producto: ");
        producto2 = entrada.readLine();
        System.out.println("ingrese su precio: ");
        precio2 = Float.valueOf(entrada.readLine());
        precioTotal=precio1+precio2;

        System.out.println("Factura\t"+tipoDeFactura+"\tN "+numeroFactura+"\nNombre: "+ cliente+"\nProducto\tImporte\n"+producto1+"\t"+precio1+"\n"+producto2+"\t"+precio2+ "\nImporte total\t"+precioTotal);
        



        



    } catch (Exception e) {
        // TODO: handle exception
    }
    
}
}