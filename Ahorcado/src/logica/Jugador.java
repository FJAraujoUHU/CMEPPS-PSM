package logica;

/**
 *
 * @author Francisco Javier Araujo Mendoza
 */
public class Jugador {
    
    private String nombre;
    private int partidasGanadas;
    
    public Jugador(String nombre) {
        this.nombre = nombre;
        partidasGanadas = 0;
    }
    
    public void haGanado() {
        partidasGanadas++;
    }
    
    public int getGanadas() {
        return partidasGanadas;
    }
    
    public String getNombre()   {
        return nombre;
    }
    
    
}
