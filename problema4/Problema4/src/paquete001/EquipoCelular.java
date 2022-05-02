/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;

/**
 *
 * @author DELL
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaEnPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private long informacionIMEI;
    
    public void establecerSistemaOperativo(String s) {
        sistemaOperativo = s;
    }
    
    public void establecerTamanioPantalla(String t) {
        tamanioPantalla = t;
    }
    
    public void establecerCostoInicial(double ci) {
        costoInicial = ci;
    }
    
    public void establecerIvaEnPorcentaje(double ip) {
        ivaEnPorcentaje = ip;
    }

    public void calcularIvaCostoInicial() {
        ivaCostoInicial = costoInicial * (ivaEnPorcentaje/100);
    }    
    
    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDireccionMac(String dm) {
        direccionMac = dm;
    }
    
    public void establecerInformacionIMEI(long IMEI) {
        informacionIMEI = IMEI;
    }
    
    public String obtenerSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public String obtenerTamanioPantalla() {
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial() {
        return costoInicial;
    }
    
    public double obtenerIvaEnPorcentaje() {
        return ivaEnPorcentaje;
    }
    
    public double CalcularIvaCostoInicial() {
        return ivaCostoInicial;
    }
    
    public double CalcularCostoFinal() {
        return costoFinal;
    }
    
    public String obtenerDireccionMac() {
        return direccionMac;
    }
    
    public long obtenerInformacionIMEI() {
        return informacionIMEI;
    }
}
