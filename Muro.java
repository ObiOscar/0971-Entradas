import java.util.ArrayList;
import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

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
    
/*    public String imprimirPagina()
    {
        String cadenaADevolver = "";
        for(Entrada entrada : miArrayList){
           cadenaADevolver += entrada + "\n";
        }
        return cadenaADevolver;
    }*/
    
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada, String nombre){
       for(Entrada entrada : miArrayList){
             if(entrada.getClass().getSimpleName().equals(tipoEntrada) || tipoEntrada == "null"){  
                //if(entrada.getUsuario().getUsuario().equals(nombre) || nombre == "null"){  
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
               // }
            }
       }
    }
    
    public void mostrarMuroEnNavegador(){
        // Obtenemos una referencia a una ruta donde estará el archivo

        Path rutaArchivo = Paths.get("miRedSocial.html");


        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
        {
            File miHtml = new File("miHtml.htm");
            FileReader leerMiHtml = new FileReader (miHtml);
            BufferedReader guardadaLecturaMiHtml = new BufferedReader(leerMiHtml);
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);            
           // Lectura del fichero
            String linea;
            while((linea=guardadaLecturaMiHtml.readLine())!=null){
               archivo.write(linea);
            }
            archivo.write(toString());
			archivo.write("</div><div id=" + "footer" + ">Trabajo programacion &copy; 2017.</div></body></html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
    
    }
    
    public void mostrar ()
    {
        System.out.println(this);
    }
    
}