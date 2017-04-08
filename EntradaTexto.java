import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends EntradaConComentario
{
    private String mensaje;

    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }
    
    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor,int meGusta, String fecha, String texto)
    {
        super(autor,meGusta,fecha);
        mensaje = texto;
        
    }

    public String getMensaje()
    {
        return mensaje;
    }
    
    public void meGusta(){
        super.meGusta();
    }

    public void mostrarAutorYMensaje(){
        System.out.println("Autor: " + getUsuario() + "\n\n" + "Mensaje: \n" + mensaje);
    }
    
    public void mostrar(){
        System.out.println(toString());
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 5;
    }
    
    public void mostrarDatosExclusivos (){
      System.out.println("El dato exclusivo es: " + mensaje+"\n");
    }
    
    public String toString()
    {
        String cadenaADevolver = "";   
        cadenaADevolver += super.toString();  
        cadenaADevolver += mensaje + "\n"; 

        return cadenaADevolver;
    } 

    public String mostrarPagina()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.mostrarPagina();  
        cadenaADevolver +="<span style=" + "font-weight:bold; color:#5C84E9>" + mensaje + "</span>" + "<hr align=" + "left " + "noshade=" + "noshade " + "size=" +"2 " + "width=" + "105% />" + "</p> <br/>"; 

        return cadenaADevolver;
    } 
}
 
