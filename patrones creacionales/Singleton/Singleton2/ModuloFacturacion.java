package Singleton2;

public class ModuloFacturacion {

    public void facturar(double monto){
        CajaRegistradora caja = CajaRegistradora.getInstancia();
        caja.registrarFactura(monto);
    }
}
