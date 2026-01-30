package decorador;

public class Azucar extends BebidaDecorador {

    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Azucar";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto(); 
    }
    
}
