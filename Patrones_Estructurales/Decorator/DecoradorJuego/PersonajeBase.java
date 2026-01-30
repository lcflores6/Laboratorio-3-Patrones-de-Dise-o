package DecoradorJuego;

public class PersonajeBase implements Personaje{

    @Override
    public String getDescripcion() {
        return "Crash";
    }

    @Override
    public int getDefensa() {
        return 10;
    }

    @Override
    public int getAtaque() {
        return 10;
    }
    
}
