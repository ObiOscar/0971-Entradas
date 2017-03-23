import java.util.ArrayList;
import java.time.LocalDateTime;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentario extends Entrada
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
    
    public String toString()
    {
       String cadenaADevolver = "";
       
       cadenaADevolver +=super.toString();
        
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