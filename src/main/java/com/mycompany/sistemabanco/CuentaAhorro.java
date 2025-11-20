
package com.mycompany.sistemabanco;

public class CuentaAhorro extends CuentaBase {
    
    public CuentaAhorro(double apertura){
        super(apertura);
    }
    
    public void invertir(double cantidad){
        setMontoActual(getMontoActual()+(cantidad*0.10));
    }
    
}
