/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.EntidadAdministrativa;

/**
 *
 * @author DELL
 */
public class Ejecutor {
    public static void main(String[] args) {
        EntidadAdministrativa entidad = new EntidadAdministrativa();
        // Valores de entrada
        String nombre = "Antonio Peña Celi";
        String tipoInstitucion = "Particular";
        int numAlum = 1400;
        int numDocen = 45;
        int numSedes = 1;
        double gastosProyectadoPorEstudiante = 159.54;
        
        entidad.establecerNombre(nombre);
        entidad.establecerTipoInstitucion(tipoInstitucion);
        entidad.establecerNumAlum(numAlum);
        entidad.establecerNumDocen(numDocen);
        entidad.establecerNumSedes(numSedes);
        entidad.establecerGastosProyectadoPorEstudiante(gastosProyectadoPorEstudiante);
        entidad.calcularPresupuesto();
        
        // Presentar los datos
        System.out.printf("\tInstitución Educativa 1\nNombre: %s\nTipo de Institución: %s\nNúmero de Estudiantes: %d\n"
                + "Número de Docentes: %d\nNúmero de Sedes: %d\nGastos Proyectados por Estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",entidad.obtenerNombre(), entidad.obtenerTipoInstitucion(),
                entidad.obtenerNumeroDeAlumnos(),entidad.obtenerNumeroDeDocentes(),
                entidad.obtenerNumeroDeSedes(), entidad.obtenerGastosProyectadoPorEstudiante(),
                entidad.CalcularPresupuesto());
        
        // Segunda Institución
        EntidadAdministrativa entidad2 = new EntidadAdministrativa();
        
        // Valores de entrada
        System.out.println("--------------------------------------------");
        
        String nombre2 = "Daniel Álvarez Burneo";
        String tipoInstitucion2 = "Fiscomisional";
        int numAlum2 = 3500;
        int numDocen2 = 230;
        int numSedes2 = 3;
        double gastosProyectadoPorEstudiante2 = 50.00; 
        
        entidad2.establecerNombre(nombre2);
        entidad2.establecerTipoInstitucion(tipoInstitucion2);
        entidad2.establecerNumAlum(numAlum2);
        entidad2.establecerNumDocen(numDocen2);
        entidad2.establecerNumSedes(numSedes2);
        entidad2.establecerGastosProyectadoPorEstudiante(gastosProyectadoPorEstudiante2);
        entidad2.calcularPresupuesto();

        // Presentar los datos
        System.out.printf("\tInstitución Educativa 2\nNombre: %s\nTipo de Institución: %s\nNúmero de Estudiantes: %d\n"
                + "Número de Docentes: %d\nNúmero de Sedes: %d\nGastos Proyectados por Estudiante: %.2f\n"
                + "Presupuesto: %.2f\n",entidad2.obtenerNombre(), entidad2.obtenerTipoInstitucion(),
                entidad2.obtenerNumeroDeAlumnos(),entidad2.obtenerNumeroDeDocentes(),
                entidad2.obtenerNumeroDeSedes(), entidad2.obtenerGastosProyectadoPorEstudiante(),
                entidad2.CalcularPresupuesto());       
    }
}
