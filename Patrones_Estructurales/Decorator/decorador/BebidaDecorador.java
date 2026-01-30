package decorador;

public abstract class BebidaDecorador implements Bebida {
    
    protected Bebida bebida;

    public BebidaDecorador(Bebida bebida) {
        this.bebida = bebida;
    }
    
    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebida.getCosto();
    }
    
}
