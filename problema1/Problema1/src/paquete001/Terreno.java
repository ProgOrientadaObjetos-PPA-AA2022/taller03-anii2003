/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;

/**
 *
 * @author DELL
 */
public class Terreno {     
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
        
    public void establecerAncho(double a){
        ancho = a;
    }
    
    public void establecerLargo(double l){
        largo = l;
    }
    
    public void establecerArea(){
        area = ancho*largo;
    }
    
    public void establecerValorMetroCuadrado(double v){
        valorMetroCuadrado = v;
    }

    public void establecerCostoTerreno(){
        costoTerreno = area*valorMetroCuadrado;
    }    
        
    public double obtenerAncho(){
        return ancho;
    }
       
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }

    public double obtenerCostoTerreno(){
        return costoTerreno;
    }          
}
