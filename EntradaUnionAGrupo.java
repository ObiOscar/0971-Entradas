import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    private String grupo;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaUnionAGrupo(String autor, String grupo)
    {
        super(autor);
        this.grupo=grupo;
    }

    public void unionGrupo(){
        System.out.println(getUsuario() + " Se ha unido a: " + grupo);
    }
    
    public void mostrar(){
        System.out.println(toString());
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();  
        cadenaADevolver += "Se ha unido a: " + grupo;
       
        return cadenaADevolver;
        }
}