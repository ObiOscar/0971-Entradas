import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.LocalDate;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class EntradaConComentario extends Entrada
{
    // instance variables - replace the example below with your own

    private ArrayList<String> comentarios;
    
        public EntradaConComentario(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }
    

    /**
     * Constructor for objects of class EntradaMuro
     */
    public EntradaConComentario(String autor, int meGusta,String fecha)
    {
        super(autor,meGusta,fecha);
        comentarios = new ArrayList<String>();
    }
    
    public void addComentarios(String texto){
        comentarios.clear();                    //Elimino lo que haya en el arraylist
        comentarios.add(texto);
    }

    public ArrayList<String> getComentarios(){
        return comentarios;
    }
    
    public String toString()
    {
       String cadenaADevolver = "";
       
       cadenaADevolver +=super.toString();
        
               if(getComentarios().isEmpty()){
            cadenaADevolver += "La entrada no tiene comentarios\n";
        }
        else{
            cadenaADevolver+= "Comentarios : \n";
         for(String comentario : getComentarios()){
            cadenaADevolver += comentario + "\n";
            }
        }
        
       return cadenaADevolver;
    }
    
    public String mostrarPagina()
    {
       String cadenaADevolver = "";
       
       cadenaADevolver +=super.mostrarPagina();
        
               if(getComentarios().isEmpty()){
            cadenaADevolver += "<br/>La entrada no tiene comentarios\n" + "<br/><br/>";
        }
        else{
            cadenaADevolver+= "Comentarios : \n" + "<br/>";
         for(String comentario : getComentarios()){
            cadenaADevolver +="<span style=" + "font-weight:bold; color:#5C84E6>" + comentario + "\n<br/>";
            }
        }
        
       return cadenaADevolver + "<br/>";
    }
    
}