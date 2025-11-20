
package com.mycompany.sistemabanco;

public class TarjetaDebito extends CuentaBase {
    
    public TarjetaDebito(double aperturaD){
        super(aperturaD);
    }
    
    public void retirar(double cantidad){
        setMontoActual(getMontoActual()-cantidad);
    }
    
}
