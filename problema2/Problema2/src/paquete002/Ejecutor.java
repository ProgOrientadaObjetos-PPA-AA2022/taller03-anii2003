/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

import paquete001.EquivalenteHora;

/**
 *
 * @author DELL
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear el objeto
        EquivalenteHora hs = new EquivalenteHora();
        
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.

        hs.establecerHoras(34);
        hs.establecerMinutos();
        hs.establecerSegundos();
        hs.establecerDias();
        
        System.out.printf("\tEJEMPLO 1\nHoras: %.2f\n" + "Minutos: %.2f\n" + "Segundos: %.2f\n" 
                + "Dias: %.2f\n", hs.obtenerHoras(), hs.obtenerMinutos(),
                hs.obtenerSegundos(), hs.obtenerDias());           
        
        System.out.println("---------------------------------");
        
        // Crear un segundo objeto
        EquivalenteHora hs2 = new EquivalenteHora();
        
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.

        hs2.establecerHoras(24);
        hs2.establecerMinutos();
        hs2.establecerSegundos();
        hs2.establecerDias();
        
        System.out.printf("\tEJEMPLO 2\nHoras: %.2f\n" + "Minutos: %.2f\n" + "Segundos: %.2f\n" 
                + "Dias: %.2f\n", hs2.obtenerHoras(), hs2.obtenerMinutos(),
                hs2.obtenerSegundos(), hs2.obtenerDias());         
    }
}
