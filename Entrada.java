import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaMuro
     */
    public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
        comentarios = new ArrayList<String>();
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }

    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }

    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }

    public String getUsuario()
    {
        return usuario;
    }

    public int getMeGusta()
    {
        return cantidadMeGusta;
    }

    public LocalDateTime momentoPublicacion()
    {
        return momentoPublicacion;
    }

	public ArrayList<String> getComentarios(){
		return comentarios;
	}
    
    public String toStringg()
    {
       String cadenaADevolver = "";
                
       return cadenaADevolver;
    }
    
}