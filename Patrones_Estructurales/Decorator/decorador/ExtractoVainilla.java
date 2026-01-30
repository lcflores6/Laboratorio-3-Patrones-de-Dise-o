package decorador;

public class ExtractoVainilla extends BebidaDecorador {

    public ExtractoVainilla(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " + Extracto de vainilla";
    }

    @Override
    public double getCosto() {
         return bebida.getCosto() + 0.25;
    }
    
}
