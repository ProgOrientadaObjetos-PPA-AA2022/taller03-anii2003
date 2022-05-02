/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.Terreno;

/**
 *
 * @author DELL
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un objeto de tipo Terreno
        Terreno terreno = new Terreno();
        
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        terreno.establecerAncho(34.50);
        terreno.establecerLargo(75.20);
        terreno.establecerArea();
        terreno.establecerValorMetroCuadrado(60.25);   
        
        terreno.establecerCostoTerreno();
        
        System.out.printf("\t*Terreno 1*\nAncho del Terreno: %.3f\n" + "Largo del Terreno: %.3f\n" + ""
                + "Area del Terreno: %.2f\n" + "Valor del metro cuadrado: %.3f\n" 
                + "\nCosto del Terreno: %.2f\n", terreno.obtenerAncho(),
                terreno.obtenerLargo(), terreno.obtenerArea(),
                terreno.obtenerValorMetroCuadrado(),terreno.obtenerCostoTerreno());

        System.out.println("-----------------------------------------------------------");
        System.out.println("");
        
        // Crear un segundo objeto
        Terreno terreno2 = new Terreno();
        
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        terreno2.establecerAncho(40.5);
        terreno2.establecerLargo(80.30);
        terreno2.establecerArea();
        terreno2.establecerValorMetroCuadrado(50);   
        
        terreno2.establecerCostoTerreno();
        
        System.out.printf("\t*Terreno 2*\nAncho del Terreno: %.3f\n" + "Largo del Terreno: %.3f\n" + ""
                + "Area del Terreno: %.2f\n" + "Valor del metro cuadrado: %.3f\n" 
                + "\nCosto del Terreno: %.2f\n", terreno2.obtenerAncho(),
                terreno2.obtenerLargo(), terreno2.obtenerArea(),
                terreno2.obtenerValorMetroCuadrado(),terreno2.obtenerCostoTerreno());

        System.out.println("");
               
    }
    
}
