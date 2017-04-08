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
import java.lang.Runtime;
import java.net.URL;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalDate;



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
    
    public String mostrarPagina()
    {
        String cadenaADevolver = "";
        for(Entrada entrada : miArrayList){
           cadenaADevolver += entrada.mostrarPagina() + "\n";
        }
        return cadenaADevolver;
    }
    
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
    
    public void mostrarMuroEnNavegador(String nombreUsuario){
        miArrayList.clear();                    //Elimino lo que haya en el arraylist
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try  
          {
            URL acesoPagina = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user="+nombreUsuario);
            Scanner leerArchivo = new Scanner(acesoPagina.openStream());
           // Lectura del fichero
            String linea;
           while(leerArchivo.hasNextLine()){
              String lineaLeer = leerArchivo.nextLine();

              String[] cadenaAPartir = lineaLeer.split(";");
              String buscandoEntrada = cadenaAPartir[0];
              if(buscandoEntrada.equals("EntradaTexto")){ 
                String autor = cadenaAPartir[1];
                int meGusta = Integer.parseInt(cadenaAPartir[2]);
                String fecha =cadenaAPartir[3]; 
                String texto =cadenaAPartir[4];
                EntradaTexto accesoTexto = new EntradaTexto(autor,meGusta,fecha,texto);
                String[] comentarios = cadenaAPartir[5].split("%");
                if(!comentarios[0].equals("Sin comentarios")){
                    for (int contador = 0; comentarios.length > contador; contador++) {
                         accesoTexto.addComentarios(comentarios[contador]);
                    }
                }
                miArrayList.add(accesoTexto);
              }
              
              if(buscandoEntrada.equals("EntradaUnionAGrupo")){ 
                String autor = cadenaAPartir[1];
                int meGusta = Integer.parseInt(cadenaAPartir[2]);              
                String fecha =cadenaAPartir[3];
                String grupo =cadenaAPartir[4];
                Entrada accesoGrupo = new EntradaUnionAGrupo(autor,meGusta,fecha,grupo);
                miArrayList.add(accesoGrupo);
              }
              
              if(buscandoEntrada.equals("EntradaFoto")){ 
                String autor = cadenaAPartir[1];
                int meGusta = Integer.parseInt(cadenaAPartir[2]);             
                String fecha =cadenaAPartir[3];
                String url =cadenaAPartir[4];
                String titulo=cadenaAPartir[5];
                EntradaFoto accesoFoto = new EntradaFoto(autor,meGusta,fecha,url,titulo);
                String[] comentarios = cadenaAPartir[6].split("%");
                if(!comentarios[0].equals("Sin comentarios")){
                    for (int contador = 0; comentarios.length > contador; contador++) {
                         accesoFoto.addComentarios(comentarios[contador]);
                    }
                }
                miArrayList.add(accesoFoto);
              }
           }
           mostrarMuroEnNavegador();
           leerArchivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
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
            archivo.write(mostrarPagina());
            archivo.write("</div><div id=" + "footer" + ">Trabajo programacion &copy; 2017.</div></body></html>");
            archivo.close();

        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
        
        try 
        {
            String cmd = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome " + "file:///A:/Program%20Files%20(x86)/Desarrollo_de_Aplicaciones_Multiplataforma/Programaci%C3%B3n/actividad%200971/miRedSocial.html" ;
            Runtime.getRuntime().exec(cmd); 
        } 
        catch (IOException ioe) 
        {
            System.out.println (ioe);
        }
    
    }
    
    public void mostrar ()
    {
        System.out.println(this);
    }
    
}