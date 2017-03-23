import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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

    /**
     * Constructor for objects of class EntradaMuro
     */
    public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;

    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
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
    
    public void mostrar(){
    
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 3;
    }
    
    public String toString()
    {
       String cadenaADevolver = "";
       
       cadenaADevolver += "\nEl Usuario: " + getUsuario() + "\n";   
       cadenaADevolver += getMeGusta() + " me gusta";
       
        long segundosQueHanPasado = momentoPublicacion().until(LocalDateTime.now(), ChronoUnit. SECONDS);
        long minutossQueHanPasado = segundosQueHanPasado /60;
        long segundosResiduos = segundosQueHanPasado % 60;
        
        cadenaADevolver += " Hace ";
        if(minutossQueHanPasado >0){
            cadenaADevolver += minutossQueHanPasado +  "minutos";
        }
        cadenaADevolver += segundosResiduos + " segundos.\n";
                  
       return cadenaADevolver;
    }
    
}