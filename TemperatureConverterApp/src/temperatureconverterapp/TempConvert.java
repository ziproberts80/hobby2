
package temperatureconverterapp;

public class TempConvert {
    
    private   double temperatureConverted;
    private   double temperatureProvided;
    private   String temperatureTypeProvided;
    private   String temperatureTypeConverted;

    // default constructor nothing happens
    
    public TempConvert() {
    }

    
    public void CtoF(double temperatureProvided ){
        
        this.temperatureTypeProvided = "Celsius";
        this.temperatureTypeConverted= "Fahrenheit";
        this.temperatureProvided = temperatureProvided;
        

        //T(°F) = T(°C) × 1.8 + 32
        
        temperatureConverted = (temperatureProvided * 1.8) + 32;
        
       
    }
   
        
    public void FtoC(double temperatureProvided ){
        
        this.temperatureTypeProvided = "Fahrenheit";
        this.temperatureTypeConverted= "Celsius";
        this.temperatureProvided = temperatureProvided;
        

        //T(°C) = (T(°F) - 32) / 1.8
        
        temperatureConverted = (temperatureProvided - 32)/1.8;
        
       
    }

    @Override
    public String toString() {
        
        String output = String.format("%.1f %s converts to %.1f %s", 
                                          temperatureProvided,
                                          temperatureTypeProvided,
                                          temperatureConverted,
                                          temperatureTypeConverted);
        return output; 
    }
    
    
            
}
