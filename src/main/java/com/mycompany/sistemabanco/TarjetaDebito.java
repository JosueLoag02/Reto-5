
package com.mycompany.sistemabanco;

public class TarjetaDebito extends CuentaBase {
    
    public TarjetaDebito(double apertura){
        super(apertura);
    }
    
    public void retirar(double cantidad){
        setMontoActual(getMontoActual()-cantidad);
    }
    
}
