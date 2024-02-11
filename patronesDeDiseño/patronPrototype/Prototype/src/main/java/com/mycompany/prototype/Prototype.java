package com.mycompany.prototype;
import cuenta.implementacionCuenta;

public class Prototype {

    public static void main(String[] args) {
       implementacionCuenta  cuentaAhorro = new implementacionCuenta();
       cuentaAhorro.setMonto(400);
       implementacionCuenta clonarCuenta = (implementacionCuenta) cuentaAhorro.clonar();
       
       if(cuentaAhorro !=null){
           System.out.println(cuentaAhorro);
       }
       System.out.println(clonarCuenta);
       System.out.println(clonarCuenta == cuentaAhorro);
    
    }   
}
