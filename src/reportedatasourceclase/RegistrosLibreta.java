/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportedatasourceclase;

import java.util.Date;

/**
 * Proyecto de tesis desarrollado por Angel Cobo coboangel210@gmail.com y Jose
 * Manzano manzanojl@yahoo.es Riobamba - ESPOCH Jan 31, 2014
 *
 * @author angel
 */
public class RegistrosLibreta {

    private int numRegistro;
    private Date fechaRegistro;
    private Double deposito;
    private Double retiros;
    private Double saldo;
    private String codigo;
    private char imprimir;

    public RegistrosLibreta() {
        numRegistro = 0;
        fechaRegistro = null;
        deposito = 0.0;
        retiros = 0.0;
        saldo = 0.0;
        codigo = null;
        imprimir = 'N';

    }

    public String getCodigo() {
        return codigo;
    }

    public double getDeposito() {
        return deposito;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public double getRetiros() {
        return retiros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public char getImprimir() {
        return imprimir;
    }

    public void setImprimir(char imprimir) {
        this.imprimir = imprimir;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

}
