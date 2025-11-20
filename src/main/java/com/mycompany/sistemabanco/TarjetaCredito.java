
package com.mycompany.sistemabanco;

public class TarjetaCredito extends CuentaBase {
    
    public TarjetaCredito(double apertura){
        super(apertura);
    }
    
    public void sumaInteres(double cantidad){
        double interes=cantidad*0.15;
        setMontoActual(getMontoActual()+interes);
    }
    
}
