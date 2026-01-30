package decorador;

public class Crema extends BebidaDecorador {

    public Crema(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Crema de Canela";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.5;
    }
    
}
