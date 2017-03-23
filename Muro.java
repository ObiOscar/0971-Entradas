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
    
    public void verCantidadDatosPorEntrada(){
      for(Entrada entrada : miArrayList){
        System.out.println("Lineas " + entrada.getCantidadDeDatosAsociadosALaEntrada());
      } 
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        for(Entrada entrada : miArrayList){
           cadenaADevolver += entrada + "\n";
        }
        return cadenaADevolver;
    }
    
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String nombre){
        if(tipoEntrada == "null"){
            mostrarDatos(null,nombre);
        } 
        
        if(nombre == "null"){
            mostrarDatos(tipoEntrada,null);
        }
        
        if(tipoEntrada != "null" && nombre != "null"){
            mostrarDatos(tipoEntrada,nombre);
        }
    }
    
    public void mostrarDatos(String tipoEntrada, String nombre){
       for(Entrada entrada : miArrayList){
             if(entrada.getClass().getSimpleName().equals(tipoEntrada)){  
                 if(tipoEntrada == "null"){
                     EntradaTexto entradaTexto = (EntradaTexto) entrada;
                     entradaTexto.mostrarDatosExclusivos();
                     EntradaFoto entradaFoto = (EntradaFoto) entrada;
                     entradaFoto.mostrarDatosExclusivos();
                     EntradaUnionAGrupo entradaGrupo = (EntradaUnionAGrupo) entrada;
                     entradaGrupo.mostrarDatosExclusivos();
                    }

                 if(tipoEntrada == "EntradaTexto"){
                        EntradaTexto entradaTexto = (EntradaTexto) entrada;
                        entradaTexto.mostrarDatosExclusivos();
                    }
                
                 if(tipoEntrada == "EntradaFoto"){
                        EntradaFoto entradaFoto = (EntradaFoto) entrada;
                        entradaFoto.mostrarDatosExclusivos();
                    }
        
                 if(tipoEntrada == "EntradaUnionAGrupo"){
                        EntradaUnionAGrupo entradaGrupo = (EntradaUnionAGrupo) entrada;
                        entradaGrupo.mostrarDatosExclusivos();
                 }
            }
       }
    }
    
    public void mostrar ()
    {
        System.out.println(this);
    }
    
}