import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentario extends EntradaSinComentario
{
    // instance variables - replace the example below with your own

    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaMuro
     */
    public EntradaConComentario(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }

	public ArrayList<String> getComentarios(){
		return comentarios;
	}
    
    public String toStringg()
    {
       String cadenaADevolver = "";
                
       return cadenaADevolver;
    }
    
}