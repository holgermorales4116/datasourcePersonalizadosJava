/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedatasourceclase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Proyecto de tesis desarrollado por Angel Cobo coboangel210@gmail.com y Jose
 * Manzano manzanojl@yahoo.es Riobamba - ESPOCH Jan 31, 2014
 *
 * @author angel
 */
    public class LibretaReporte {

    private String titular;
    private String cedula;
    private String numeroSocio;
    private String numeroCuenta;
    private Collection<RegistrosLibreta> listaRegistrosLibreta;
    private int primerRegistro;

    public LibretaReporte() {
        listaRegistrosLibreta = new ArrayList<>();

    }

    public String getCedula() {
        return cedula;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getNumeroSocio() {
        return numeroSocio;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setNumeroSocio(String numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    public Collection<RegistrosLibreta> getListaRegistrosLibreta() {
        return listaRegistrosLibreta;
    }

    public int getPrimerRegistro() {
        return primerRegistro;
    }

    public void setPrimerRegistro(int primerRegistro) {
        this.primerRegistro = primerRegistro;
    }

    public void setListaRegistrosLibreta(Collection<RegistrosLibreta> listaRegistrosLibreta) {
        this.listaRegistrosLibreta = listaRegistrosLibreta;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

}
