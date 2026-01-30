package Singleton2;

public class CajaRegistradora {
// 1. Definir una variable estatica 
    private double totalVentas;
    private double totalFacturas;
    private static CajaRegistradora instancia;
// 2. Crear un constructor privado
    private  CajaRegistradora() {
        totalVentas = 0.0;
        System.out.println("Caja Registradora lista");
    }
// 3. Agregar un método publico estatico
    
    public static CajaRegistradora getInstancia(){
            if(instancia == null){
            instancia = new CajaRegistradora();
        }
        return instancia;
    }
    public void registrarVenta(double monto){
        totalVentas = totalVentas + monto;
        System.out.println("Venta Registrada!!" + monto);
    }
    
    public void registrarFactura(double monto){
        totalFacturas = totalFacturas + monto;
        System.out.println("Factura Registrada!!" + monto);
    }
    
    public double getTotalVentas(){
        return totalVentas;
    }
    
    public double getTotalFacturas(){
        return totalFacturas;
    }
    public double getTotal(){
        return totalFacturas + totalVentas;
    }
}
