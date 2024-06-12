package banco;

    class CCuenta {
    //Los atributos diferencian los objetos de otros
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;
    
    //Los metodos sirven para modificar los valores del atributo de un objeto 
    public void asignarNombre(String nom){
        if(nom.length()== 0){
            System.out.println("Erro:El nombre de la cuetan esta vacio");
            return;
        }else{
         nombre = nom;
        }
    }
    public String obtenerNombre(){
        return nombre;
    }
    
    public void asignarCuenta(String cue){
        if(cue.length()== 0){
            System.out.println("Erro:La cuenta no es valida");
            return;
        }else{
         cuenta = cue;
        }
    }
     public String obtenerCuenta(){
        return cuenta;
    }
    
    public double estado(){
        return saldo;
    }
    
    public void ingreso(double cantidad){
        if(cantidad < 0){
            System.out.println("El ingreso no pude ser negativo");
        }else{
            saldo = saldo + cantidad;
        }
    }
    
    public void reintegro(double cantidad){
        if(saldo- cantidad < 0){
            System.out.println("No hay saldo disponible");
        }else{
            saldo = saldo - cantidad;
        }
    }
    
    public void asignarTipoDeInteres(double tipo){
        if(tipo < 0 ){
            System.out.println("El interes no pude ser negativo");
        }else{
            tipoDeInteres = tipo;
        }
    }
    
    public double obtenerTipoDeInteres(){
        return tipoDeInteres;
    }
    
    //Metdo constructor sin parametros 
    public CCuenta(){
        
    }
    //Se puede asignar los valores en una sola linea
    public CCuenta(String nom, String cue, double sal , double tipo){
        asignarNombre(nom);
        asignarCuenta(cue);
        ingreso(tipo);
        asignarTipoDeInteres(tipo);
    }
}