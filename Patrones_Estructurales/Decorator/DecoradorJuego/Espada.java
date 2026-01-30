package DecoradorJuego;

public class Espada extends PersonajeDecorador{

    public Espada(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion() + " + Espada";
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa();
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque() + 10;
    }
    
}
