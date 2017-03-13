import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto
{
    // instance variables - replace the example below with your own
    private String usuario;
    
    private String mensaje;
    
    private LocalDateTime momentoPublicacion;
    
    private int cantidadMeGusta;
    
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        // initialise instance variables
        usuario = autor;
        mensaje = texto;
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
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public void toStringg()
    {
        
    }
    
}
 
