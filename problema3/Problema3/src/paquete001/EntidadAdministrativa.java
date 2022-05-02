/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;

/**
 *
 * @author DELL
 */
public class EntidadAdministrativa {
    private String nombre;
    private String tipoInstitucion;
    private int numAlum;
    private int numDocen;
    private int numSedes;
    private double gastosProyectadoPorEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipoInstitucion(String i){
        tipoInstitucion = i;
    }

    public void establecerNumAlum(int alum){
        numAlum = alum;
    }

    public void establecerNumDocen(int docen) {
        numDocen = docen;
    }
    
    public void establecerNumSedes(int sed) {
        numSedes = sed;
    }
    
    public void establecerGastosProyectadoPorEstudiante(double gastos) {
        gastosProyectadoPorEstudiante = gastos;
    }
    
    public void calcularPresupuesto() {
        presupuesto = numAlum * gastosProyectadoPorEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }
    
    public int obtenerNumeroDeAlumnos() {
        return numAlum;
    }
    
    public int obtenerNumeroDeDocentes() {
        return numDocen;
    }
    
    public int obtenerNumeroDeSedes() {
        return numSedes;
    }
    
    public double obtenerGastosProyectadoPorEstudiante(){
        return gastosProyectadoPorEstudiante;
    }
    
    public double CalcularPresupuesto() {
        return presupuesto;
    }               
}
