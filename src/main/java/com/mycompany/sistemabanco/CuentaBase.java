
package com.mycompany.sistemabanco;

public class CuentaBase {
    private double montoActual;
    
    public CuentaBase(double apertura){
        this.montoActual=apertura;
    }
    
    protected void setMontoActual(double montoActual){
        this.montoActual=montoActual;
    }
    
    public void depositar(double cantidad){
        montoActual+=cantidad;
    }
    
    public double getMontoActual(){
        return montoActual;
    }
    
    }

