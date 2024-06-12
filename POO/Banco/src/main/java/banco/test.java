package banco;
public class test {
    public static void main(String[] args) {
        //Se crea un nuevo objeto con los atributos de la clase CCuenta
        //CCuenta cuenta01 = new CCuenta();
        CCuenta cuenta02 = new CCuenta("Marck", "Debito", 6000, 3.5);
        cuentaAhorro cuenta01 = new cuentaAhorro("Javier", "cuenta de ahorro", 6000, 3.5, 0.80);
        cuenta01.reintegro(cuenta01.obtenerCuotaMantenimiento());
        cuenta01.ingreso(6000);
        cuenta01.reintegro(10000);
        //Se accede a los atributos de CCuenta para modificarlos
        cuenta01.asignarNombre("Javier");
        cuenta01.asignarCuenta("Cuenta de credito");
        cuenta01.asignarTipoDeInteres(2.5);
        
        cuenta01.ingreso(12000);
        cuenta01.reintegro(3000);
        
        System.out.println(cuenta01.obtenerNombre());
        System.out.println(cuenta01.obtenerCuenta());
        System.out.println(cuenta01.estado());
        System.out.println(cuenta01.obtenerTipoDeInteres());
        System.out.println("Cuenta Dos ---------------------");
        System.out.println(cuenta02.obtenerNombre());
        System.out.println(cuenta02.obtenerCuenta());
        System.out.println(cuenta02.estado());
        System.out.println(cuenta02.obtenerTipoDeInteres());
    }
}
