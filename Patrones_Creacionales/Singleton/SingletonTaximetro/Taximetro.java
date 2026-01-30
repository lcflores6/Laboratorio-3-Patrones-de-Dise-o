package SingletonTaximetro;

public class Taximetro {
// 1. Definir una variable estatica 
    private static Taximetro instancia;
    
    private double totalAcumulado;
    private double costoInicial = 1.50;
    private double costoxkm = 0.80;
    private double calculoTramo;
    
// 2. Crear un constructor privado    
    private Taximetro (){
        this.totalAcumulado = costoInicial;
        System.out.println("== Taximetro inciado: costo inicial aplicado ===");           
    }
    
 // 3. Agregar un método publico estatico   
    public static Taximetro getInstancia(){
            if(instancia == null){
            instancia = new Taximetro();
        }
        return instancia;
    }
    
    public void registrarRecorrido(double km){       
        calculoTramo = km * costoxkm;
        this.totalAcumulado = totalAcumulado + calculoTramo;
        System.out.println("Se recorrieron: "+ km + " km. +$ " + calculoTramo);
    }
    
    public void agregarMonto(double monto) {
        this.totalAcumulado = totalAcumulado + monto;
        System.out.println("Monto extra agregado: $ "+monto);
    }
    
    public double getTotal(){ 
        return totalAcumulado;
    }
    public void reiniciar(){
        totalAcumulado = costoInicial;
        System.out.println("=== Taximetro Reiniciado");
    }
}
