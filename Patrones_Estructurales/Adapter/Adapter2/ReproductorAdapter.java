package Adapter2;

public class ReproductorAdapter implements Reproductor{
    private ReproductorMP4 mp4;

    public ReproductorAdapter(ReproductorMP4 mp4) {
        this.mp4 = mp4;
    }
    
    @Override
    public void reproducir(String archivo) {
        mp4.playMP4(archivo);
    }
    
}
