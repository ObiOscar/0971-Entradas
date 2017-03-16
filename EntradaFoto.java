import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends Entrada
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

    public String toStringg()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
		cadenaADevolver += titulo +"\n";
		cadenaADevolver += urlImagen +"\n";
        cadenaADevolver += getMeGusta() + " me gusta";
        
        long segundosQueHanPasado = momentoPublicacion().until(LocalDateTime.now(), ChronoUnit. SECONDS);
        long minutossQueHanPasado = segundosQueHanPasado /60;
        long segundosResiduos = segundosQueHanPasado % 60;
        
        cadenaADevolver += "Hace";
        if(minutossQueHanPasado >0){
            cadenaADevolver += minutossQueHanPasado +  "minutos";
        }
        cadenaADevolver += segundosResiduos + " segundos.\n";
        
        if(getComentarios().isEmpty()){
            cadenaADevolver += "La entrada no tiene comentarios";
        }
        else{
            cadenaADevolver+= "Comentarios : \n";
         for(String comentario : getComentarios()){
            cadenaADevolver += comentario + "\n";
            }
        }
        return cadenaADevolver;
    } 
    
}