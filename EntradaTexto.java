import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends Entrada
{
    private String mensaje;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }

    public String getMensaje()
    {
        return mensaje;
    }

    public String toStringg()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += mensaje + "\n"; 
        cadenaADevolver += momentoPublicacion() + " me gusta";
        
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
 
