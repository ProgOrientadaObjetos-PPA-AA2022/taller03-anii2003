/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;

/**
 *
 * @author DELL
 */
public class EquivalenteHora {
    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerHoras(double h){
         horas = h;
    }    
    
    public void establecerMinutos(){
        minutos = horas*60;
    }
    
    public void establecerSegundos(){
        segundos = horas*3600;
    }    
    
    public void establecerDias(){
        dias = horas/24;
    }

    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerMinutos() {
        return minutos;
    }
    
    public double obtenerSegundos() {
        return segundos;
    }
    
    public double obtenerDias() {
        return dias;
    }
}
