/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.EquipoCelular;
/**
 *
 * @author DELL
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear el objeto
        EquipoCelular eq = new EquipoCelular();
     
        // Valores de entrada        
        String sistemaOperativo = "IOS";
        String tamanioPantalla = "6.1''";
        double costoInicial = 850;
        double ivaEnPorcentaje = 12;
        String direccionMac = "08:87:C7:E7:F9:11";
        long informacionIMEI = 356862118498537L;   
        
        eq.establecerSistemaOperativo(sistemaOperativo);
        eq.establecerTamanioPantalla(tamanioPantalla);
        eq.establecerCostoInicial(costoInicial);
        eq.establecerIvaEnPorcentaje(ivaEnPorcentaje);
        eq.calcularIvaCostoInicial();
        eq.establecerDireccionMac(direccionMac);
        eq.establecerInformacionIMEI(informacionIMEI);
        eq.calcularCostoFinal();
        
        // Imprimir la información obtenida
        System.out.printf("\tDISPOSITIVOS ELECTRÓNICOS\n\n\t***Equipo celular 1***"+"\nSistema Operativo: %s\n"
        +"Tamaño de la pantalla: %s\n"+"Costo Inicial: %.2f\n"+"Iva en Porcentaje: %.2f\n"
        +"Iva del costo Inicial: %.2f\n"+"Dirección MAC: %s\n"+"Información IMEI: %d\n"+"\tCOSTO FINAL: %.2f\n",
        eq.obtenerSistemaOperativo(), eq.obtenerTamanioPantalla(), eq.obtenerCostoInicial(),
        eq.obtenerIvaEnPorcentaje(), eq.CalcularIvaCostoInicial(), eq.obtenerDireccionMac(),
        eq.obtenerInformacionIMEI(),eq.CalcularCostoFinal());
        
        System.out.println("-----------------------------------------------------");
        
        // Crear el objeto
        EquipoCelular eq2 = new EquipoCelular();
     
        // Valores de entrada        
        String sistemaOperativo2 = "Android";
        String tamanioPantalla2 = "6.72''";
        double costoInicial2 = 360;
        double ivaEnPorcentaje2 = 12;
        String direccionMac2 = "78:55:A2:G1:S2:0B";
        long informacionIMEI2 = 458723985163218L;   
        
        eq2.establecerSistemaOperativo(sistemaOperativo2);
        eq2.establecerTamanioPantalla(tamanioPantalla2);
        eq2.establecerCostoInicial(costoInicial2);
        eq2.establecerIvaEnPorcentaje(ivaEnPorcentaje2);
        eq2.calcularIvaCostoInicial();
        eq2.establecerDireccionMac(direccionMac2);
        eq2.establecerInformacionIMEI(informacionIMEI2);
        eq2.calcularCostoFinal();
        
        // Imprimir la información obtenida
        System.out.printf("\t***Equipo celular 2***"+"\nSistema Operativo: %s\n"
        +"Tamaño de la pantalla: %s\n"+"Costo Inicial: %.2f\n"+"Iva en Porcentaje: %.2f\n"
        +"Iva del costo Inicial: %.2f\n"+"Dirección MAC: %s\n"+"Información IMEI: %d\n"+"\tCOSTO FINAL: %.2f\n",
        eq2.obtenerSistemaOperativo(), eq2.obtenerTamanioPantalla(), eq2.obtenerCostoInicial(),
        eq2.obtenerIvaEnPorcentaje(), eq2.CalcularIvaCostoInicial(), eq2.obtenerDireccionMac(),
        eq2.obtenerInformacionIMEI(),eq2.CalcularCostoFinal());        
    }
}
