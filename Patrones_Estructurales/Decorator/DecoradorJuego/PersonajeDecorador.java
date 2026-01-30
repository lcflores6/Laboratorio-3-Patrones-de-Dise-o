package DecoradorJuego;

public abstract class PersonajeDecorador implements Personaje {
    protected Personaje personaje;

    public PersonajeDecorador(Personaje personaje) {
        this.personaje = personaje;
    }
    
    
}
