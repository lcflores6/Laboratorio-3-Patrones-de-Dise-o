package Singleton2;

public class ModuloVentas {

    public void vender(double monto){       
        CajaRegistradora caja = CajaRegistradora.getInstancia();
        caja.registrarVenta(monto);
    }
}
