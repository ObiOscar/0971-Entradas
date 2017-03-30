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
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 4;
    }
    
    public void mostrarDatosExclusivos (){
      System.out.println("El dato exclusivo es: " + grupo+"\n");
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "Se ha unido al grupo " + grupo + ".\n";
        
        return cadenaADevolver;
    }
    
    public String mostrarPagina()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.mostrarPagina();  
        cadenaADevolver +="<b>"+ "Se ha unido a: " + "<big>" + grupo + "</big>" + "</b>" + "<hr align=" + "left " + "noshade=" + "noshade " + "size=" +"2 " + "width=" + "105% />" + "\n <br/>"; 
       
        return cadenaADevolver;
    }
    
    
}