import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends EntradaConComentario
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

    public void mostrarAutorYMensaje(){
        System.out.println("Autor: " + getUsuario() + "\n\n" + "Mensaje: \n" + mensaje);
    }
    
    public void mostrar(){
        System.out.println(toString());
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();  
 
        cadenaADevolver += mensaje + "\n"; 


        
        return cadenaADevolver;
    } 
}
 
