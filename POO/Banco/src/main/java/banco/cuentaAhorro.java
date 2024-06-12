package banco;
//Esta es una subclase de CCuenta
//Este hereda todo los atributos y metodos de CCuneta
//No hereda los constructores de CCuenta
class cuentaAhorro extends CCuenta{
    //Esta clase contiene los atributos y metodos de la clase padre CCuenta
    //Se le pueden añadir nuevos metodos y atributos
    //Atributo nuevo para esta clase 
    private double cuotaMantenimiento;
    
    //Constructor vacio 
    
    public cuentaAhorro(){
    
    }
    //sobrecarga del contructor 
    public cuentaAhorro(String nom,String cue,double sal,double tipo,double man){
        //Se invoca el constructor de la clase padre CCuenta
        super(nom,cue,sal,tipo);
        asignarCuotaMantenimiento(man);
        
    }
    //Metodo para la modificacion del aributo cuotaMantenimiento 
    public void asignarCuotaMantenimiento(double cantidad){
        if(cantidad < 0 ){
            System.out.println("EL mantenimineto no pude ser negativo");
        }else{
            cuotaMantenimiento = cantidad;
        }
    }
    //se pude sobreescribir un metodo
    public void reintegro(double cantidad){
        double saldo = estado();
        double tipoDeInteres = obtenerTipoDeInteres();
        if(tipoDeInteres >= 3.5){
            if(saldo - cantidad < 1500){
                System.out.println("No dispone de esa cantidad");
            }
        }
        super.reintegro(cantidad);
    }
    public double obtenerCuotaMantenimiento(){
        return cuotaMantenimiento;
    }
}
