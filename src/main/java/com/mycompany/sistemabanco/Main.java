
package com.mycompany.sistemabanco;

public class Main {
    
    public static void main(String[] args){
        
        //Prueba Tarjeta de Crédito
        TarjetaCredito tc=new TarjetaCredito(-11000);
        System.out.println("Deuda después de apertura: "+tc.getMontoActual());
        tc.depositar(1000);
        System.out.println("Deuda después de depósito: "+tc.getMontoActual());
        tc.sumaInteres(tc.getMontoActual());
        System.out.println("Deuda después de intereses: "+tc.getMontoActual());
        
        //Prueba Tarjeta de débito
        TarjetaDebito td=new TarjetaDebito(10000); 
        System.out.println("Fondos después de apertura: "+td.getMontoActual());
        td.depositar(1000);
        System.out.println("Fondos después de depósito: "+td.getMontoActual());
        td.retirar(1000);
        System.out.println("Fondos después de retiro: "+td.getMontoActual());
        
        //Prueba Cuenta de Ahorro
        CuentaAhorro ca=new CuentaAhorro(9000);
        System.out.println("Fondos después de apertura: "+ca.getMontoActual());
        ca.depositar(1000);
        System.out.println("Fondos después de depósito: "+ca.getMontoActual());
        ca.invertir(ca.getMontoActual());
        System.out.println("Fondos después de invertir: "+ca.getMontoActual());
        
    }
    
}
