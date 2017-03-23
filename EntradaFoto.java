import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends EntradaConComentario
{
    private String urlImagen;
    private String titulo;
    
    /**
     * Constructor for objects of class EntradaMuro
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }

    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    public void mostrar(){
        System.out.println(toString());
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();  
		cadenaADevolver += titulo +"\n";
		cadenaADevolver += urlImagen +"\n";



        return cadenaADevolver;
    } 
    
}