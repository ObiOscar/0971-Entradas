import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto
{
    // instance variables - replace the example below with your own
    private String usuario;
    
    private String urlImagen;
    
    private String titulo;
    
    private LocalDateTime momentoPublicacion;
    
    private int cantidadMeGusta;
    
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaMuro
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        // initialise instance variables
        usuario = autor;
        urlImagen = url;
        momentoPublicacion = LocalDateTime.now();
        this.titulo = titulo;
        cantidadMeGusta = 0;
        comentarios = new ArrayList<String>();
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void unLike()
    {
        cantidadMeGusta--;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public void toStringg()
    {
        
    }
    
}