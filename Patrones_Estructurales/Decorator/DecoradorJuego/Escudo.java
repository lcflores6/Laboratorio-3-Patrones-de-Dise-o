package DecoradorJuego;

public class Escudo extends PersonajeDecorador{

    public Escudo(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion() + " + Escudo";
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa() + 10;
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque();
    }
    
}
