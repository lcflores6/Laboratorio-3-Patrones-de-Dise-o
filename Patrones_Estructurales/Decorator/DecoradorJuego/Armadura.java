package DecoradorJuego;

public class Armadura extends PersonajeDecorador{

    public Armadura(Personaje personaje) {
        super(personaje);
    }

    @Override
    public String getDescripcion() {
        return personaje.getDescripcion() + " + Armadura";
    }

    @Override
    public int getDefensa() {
        return personaje.getDefensa() + 20; 
    }

    @Override
    public int getAtaque() {
        return personaje.getAtaque();
    }
    
}
