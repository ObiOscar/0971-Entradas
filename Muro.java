import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    private ArrayList<Entrada> miArrayList;         //Guardará objetos Entrada, ya sea entradadaConComentario o sus subclases o EntradaUnionAgrupo

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        miArrayList = new ArrayList<Entrada>();
    }
    
    public void addEntrada(Entrada nuevaEntrada)
    {
        miArrayList.add(nuevaEntrada);
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        for(Entrada entrada : miArrayList){
           cadenaADevolver += entrada + "\n";
        }
        return cadenaADevolver;
    }
    
    public void mostrar ()
    {
        System.out.println(this);
    }
    
}