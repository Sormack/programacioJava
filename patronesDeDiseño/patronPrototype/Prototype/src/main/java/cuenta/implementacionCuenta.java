package cuenta;
import Interface.interfaceCuenta;

public class implementacionCuenta implements interfaceCuenta {
    private String tipo;
    private double monto;
    
    public implementacionCuenta(){
        tipo = "Ahorro";
    }
    
    @Override
    public interfaceCuenta clonar(){
            implementacionCuenta cuenta = null;
        try {
            cuenta = (implementacionCuenta) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cuenta;
    }
    
    @Override
    public String toString(){
        return "Cuenta Implementacion tipo " + tipo + " monto= " + monto;
    }
    public void setMonto(double monto) {
       this.monto = monto; 
    }
    public double getMonto() {
       return monto; 
    }
}
