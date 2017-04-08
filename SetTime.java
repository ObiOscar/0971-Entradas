
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


import java.text.SimpleDateFormat;

import java.util.Calendar;

/**
 *
 * @author SoftMolina
 */

public class SetTime {
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
    
        public SetTime(String autor, int meGusta, String fecha)
    {

        usuario = autor;
        cantidadMeGusta = meGusta;
    }

    public void main(String fecha) {
           //fechaAcutalCompleta;
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

           
           Calendar calendar = Calendar.getInstance();
           //calendar.set(12,02,1992,hora,minuto);
           calendar.set(Calendar.YEAR, ano);
           calendar.set(Calendar.MONTH, mes-1);     //No se porque el mes me lo suma siempre 1, asi que se lo resto hasta encontrar una solucion mas elegante
           calendar.set(Calendar.DATE, dia);


           calendar.set(Calendar.HOUR_OF_DAY, hora);
           calendar.set(Calendar.MINUTE, minuto);
           simpleDateFormat.setLenient(false);
           System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
    
    /*public static int restarFechas(Date fechaIn, Date fechaFinal ){
        GregorianCalendar fechaInicio= new GregorianCalendar();
        fechaInicio.setTime(fechaIn);
        GregorianCalendar fechaFin= new GregorianCalendar();
        fechaFin.setTime(fechaFinal);
        int dias = 0;
        if(fechaFin.get(Calendar.YEAR)==fechaInicio.get(Calendar.YEAR)){
        dias =(fechaFin.get(Calendar.DAY_OF_YEAR)- fechaInicio.get(Calendar.DAY_OF_YEAR))+1;
        }else{
        int rangoAnyos = fechaFin.get(Calendar.YEAR) – fechaInicio.get(Calendar.YEAR);
        for(int i=0;i<=rangoAnyos;i++){
        int diasAnio = fechaInicio.isLeapYear(fechaInicio.get(Calendar.YEAR)) ? 366 : 365;
        if(i==0){
        dias=1+dias +(diasAnio- fechaInicio.get(Calendar.DAY_OF_YEAR));
        }else	if(i==rangoAnyos){
        dias=dias +fechaFin.get(Calendar.DAY_OF_YEAR);
        }else{
        dias=dias+diasAnio;
        }
        }
        }
        return dias;
    }*/
    
        public String mostrarPagina()
    {
       String cadenaADevolver = "";                
       cadenaADevolver +="<img src=" + "usuario.png " + "alt=" + "fotoUsuario.png " + "width=10% height=10% align =left> <br/><h2>  El Usuario: <em>" + getUsuario() + "</em> </h2></b>";   
       cadenaADevolver +="<i><small>" + getMeGusta() + " me gusta </i>";

        long segundosQueHanPasado = momentoPublicacion().until(LocalDateTime.now(), ChronoUnit. SECONDS);
        System.out.println(momentoPublicacion().until(LocalDateTime.now(), ChronoUnit. SECONDS));
        long minutossQueHanPasado = segundosQueHanPasado /60;
        long segundosResiduos = segundosQueHanPasado % 60;
        
        cadenaADevolver += " Hace ";
        if(minutossQueHanPasado >0){
            cadenaADevolver += minutossQueHanPasado +  " minuto(s) y ";
        }
        cadenaADevolver += segundosResiduos + " segundos.\n<br/>" + "</small>" + "<br/>";
                  
       return cadenaADevolver; 
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
    
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 3;
    }

}