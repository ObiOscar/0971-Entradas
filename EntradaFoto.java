import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
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

    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    /**
     * Constructor for objects of class EntradaMuro
     */
    public EntradaFoto(String autor, int meGusta, String fecha, String url, String titulo)
    {
        super(autor,meGusta,fecha);
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
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 6;
    }
    
    public void mostrarDatosExclusivos (){
      System.out.println("Los datos exclusivos son: " + titulo +" y "+ urlImagen+ "\n");
    }

    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();  
		cadenaADevolver += titulo +"\n";
		cadenaADevolver += urlImagen +"\n";

        return cadenaADevolver;
    }
    
        public String mostrarPagina()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.mostrarPagina(); 
        cadenaADevolver +="<b>" + titulo + ":</b>" + "\n <br/>";  
        cadenaADevolver +="<span class= " + "nota " + "> <a href=\"" +urlImagen + "\">" + "<img src=\"" +urlImagen + "\"" + "width=40% height=40%/>" + "</a></span>" + "<br/><br/><span style=" + "font-weight:bold; color:navy ></span>" + "<hr align=" + "left " + "noshade=" + "noshade " + "size=" +"2 " + "width=" + "105% />" + "</p> <br/>"; 
			

        return cadenaADevolver;
    } 
    
}