import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


import java.text.SimpleDateFormat;

import java.util.Calendar;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
    
        public Entrada(String autor)
    {
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;

    }
    
    /**
     * Constructor for objects of class EntradaMuro
     */
    public Entrada(String autor, int meGusta, String fecha)
    {

        usuario = autor;
        cantidadMeGusta = meGusta;
        String[]fechaHora = fecha.split("-");   
        String fechaDiaMesAno= fechaHora[0];
        String fechaHoraMinuto= fechaHora[1];
           
        String[]cadenaTiempoCalendario = fechaDiaMesAno.split("/");       
        //LocalDate localDate = LocalDate.parse(cadenaTiempo[0]);
        // momentoPublicacion = fecha;       //LocalDateTime.now();
        int dia = Integer.parseInt(cadenaTiempoCalendario[0]);
        int mes = Integer.parseInt(cadenaTiempoCalendario[1]);
        int ano = Integer.parseInt(cadenaTiempoCalendario[2]); 
           
        String[]cadenaTiempoHora = fechaHoraMinuto.split(":");    
           
        int hora = Integer.parseInt(cadenaTiempoHora[0]);
        int minuto = Integer.parseInt(cadenaTiempoHora[1]);
           
        momentoPublicacion=LocalDateTime.of(ano,mes,dia,hora,minuto);        
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
    
    abstract void mostrar();
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 3;
    }
    
    public String toString()
    {
       String cadenaADevolver = "";
       cadenaADevolver += "El Usuario: " + getUsuario() + "\n";   
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
    
    
    public String mostrarPagina()
    {
       String cadenaADevolver = "";                
       cadenaADevolver +="<img src=" + "usuario.png " + "alt=" + "fotoUsuario.png " + "width=10% height=10% align =left> <br/><h2>  El Usuario: <em>" + getUsuario() + "</em> </h2></b>";   
       cadenaADevolver +="<i><small>" + getMeGusta() + " me gusta </i>";
       
       boolean boleano = false;

        long segundosQueHanPasado = momentoPublicacion().until(LocalDateTime.now(), ChronoUnit. SECONDS);
        long minutossQueHanPasado = segundosQueHanPasado /60;           //obtengo los minutos totales
        long horasQueHanPasado = minutossQueHanPasado / 60;             //obtengo las horas que han pasado
        long diasQueHanPasado = horasQueHanPasado / 24;                 //obtengo los dias que han pasado
        long horasResiduos = horasQueHanPasado % 24;
        long minutosResiduos = minutossQueHanPasado % 60;
        long segundosResiduos = segundosQueHanPasado % 60;

        
        cadenaADevolver += " Hace ";
        if(diasQueHanPasado >0){
            cadenaADevolver += diasQueHanPasado +  " dia(s) ";
            boleano = true;
        }
        
        if(horasQueHanPasado >0 && !boleano){
            cadenaADevolver +=horasResiduos +  " hora(s) , ";
        }
        
        if(minutossQueHanPasado >0 && !boleano){
            cadenaADevolver += minutosResiduos +  " minuto(s) y ";
        }
        
        if(segundosResiduos >0 && !boleano){
            cadenaADevolver += segundosResiduos +" segundos." ;
        }        
       return cadenaADevolver + "\n<br/>" + "</small>" + "<br/>"; 
    }           
}
    
