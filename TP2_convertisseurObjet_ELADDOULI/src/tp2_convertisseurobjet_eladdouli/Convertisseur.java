/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_eladdouli;

/**
 *
 * @author sarah
 */
public class Convertisseur {
    
     int nbConversions;
    
   
    public Convertisseur () 
     {
      nbConversions = 0 ;
     }
    
    public static double CelciusVersKelvin (double tCelcius) 
    {
      double Kelvin = 0 ;
      Kelvin = (tCelcius + 273.15) ;
      return Kelvin ;
    }
    
   public static double KelvinVersCelcius (double tKelvin) 
    {
      double Celcius = 0 ;
      Celcius = (tKelvin + 273.15) ;
      return Celcius ;
    }
   
  public static double FarenheitVersCelcius (double tFarenheit) 
    {
     double Celcius = 0 ; 
     Celcius = ((tFarenheit-32)*5/9);
     return Celcius ; 
    }
  
  public static double CelciusVersFarenheit (double tCelcius) 
    {
     double Farenheit = 0;
     Farenheit = (9/5*tCelcius+32);
     return Farenheit ; 
    }
  
 public static double KelvinVersFarenheit (double tKelvin)
    {
     double Farenheit = 0;
     double Celcius = 0;
     Celcius = KelvinVersCelcius (tKelvin);
     Farenheit = CelciusVersFarenheit (Celcius);
     
     return Farenheit;
    }
 
 public static double FarenheitVersKelvin (double tFarenheit)
    {
     double Kelvin = 0;
     double Celcius = 0;
     Celcius = FarenheitVersCelcius (tFarenheit);
     Kelvin = CelciusVersKelvin (Celcius);
     
     return Kelvin;
    }
            
            
@Override
public String toString () 
     {
      return "nb de conversions"+ nbConversions;
     }
    
    
}
