package ASCOM.DriverAccess;

/*

            Provides universal access to ObservingConditions drivers.
            Defines the IObservingConditions Interface. This interface provides a limited set of values that are useful
            for astronomical purposes for things such as determining if it is safe to open or operate the observing system,
            for recording astronomical data or determining refraction corrections.
            

It is NOT intended as a general purpose environmental sensor system.
            The Action method and 
            SupportedActions property 
            can be used to add driver specific sensors.
            
*/
public class ObservingConditions{

/*
null
null
*/
private double AveragePeriod;
/*
null
null
*/
private double CloudCover;
/*
null
null
*/
private double DewPoint;
/*
null
null
*/
private double Humidity;
/*
null
null
*/
private double Pressure;
/*
null
null
*/
private double RainRate;
/*
null
null
*/
private double SkyBrightness;
/*
null
null
*/
private double SkyQuality;
/*
null
null
*/
private double StarFWHM;
/*
null
null
*/
private double SkyTemperature;
/*
null
null
*/
private double Temperature;
/*
null
null
*/
private double WindDirection;
/*
null
null
*/
private double WindGust;
/*
null
null
*/
private double WindSpeed;


/*

            Creates an ObservingConditions object with the given Prog ID
            

*/
public void ObservingConditions(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose an ObservingConditions driver.
            

*/
public void Choose(String){
return null;
}


/*

             Provides the time since the sensor value was last updated
             

             Must NOT throw a MethodNotImplementedException when the specified sensor is implemented but must throw a MethodNotImplementedException when the specified sensor is not implemented.
            PropertyName must be the name of one of the sensor properties specified in the  interface. If the caller supplies some other value, throw an InvalidValueException.
             Return a negative value to indicate that no valid value has ever been received from the hardware.
             If an empty string is supplied as the PropertyName, the driver must return the time since the most recent update of any sensor. A MethodNotImplementedException must not be thrown in this circumstance.
             
*/
public void TimeSinceLastUpdate(String){
return null;
}


/*

            Provides a description of the sensor providing the requested property.
            

            Must NOT throw a MethodNotImplementedException when the specified sensor is implemented 
            but must throw a MethodNotImplementedException when the specified sensor is not implemented.
            PropertyName must be the name of one of the sensor properties specified in the  interface. If the caller supplies some other value, throw an InvalidValueException.
            If the sensor is implemented, this must return a valid string, even if the driver is not connected, so that applications can use this to determine what sensors are available.
            If the sensor is not implemented, this must throw a MethodNotImplementedException.
            
*/
public void SensorDescription(String){
return null;
}


/*

            Forces the driver to immediately query its attached hardware to refresh sensor values
            

            Optional method, can throw a MethodNotImplementedException
            
*/
public void Refresh(){
return null;
}

/*
 Sets null
null
*/
public void setAveragePeriod(double _theValue){
this.AveragePeriod=_theValue;
}

/*
 Gets null
null
*/
public double getAveragePeriod(){
return AveragePeriod;
}

/*
 Sets null
null
*/
public void setCloudCover(double _theValue){
this.CloudCover=_theValue;
}

/*
 Gets null
null
*/
public double getCloudCover(){
return CloudCover;
}

/*
 Sets null
null
*/
public void setDewPoint(double _theValue){
this.DewPoint=_theValue;
}

/*
 Gets null
null
*/
public double getDewPoint(){
return DewPoint;
}

/*
 Sets null
null
*/
public void setHumidity(double _theValue){
this.Humidity=_theValue;
}

/*
 Gets null
null
*/
public double getHumidity(){
return Humidity;
}

/*
 Sets null
null
*/
public void setPressure(double _theValue){
this.Pressure=_theValue;
}

/*
 Gets null
null
*/
public double getPressure(){
return Pressure;
}

/*
 Sets null
null
*/
public void setRainRate(double _theValue){
this.RainRate=_theValue;
}

/*
 Gets null
null
*/
public double getRainRate(){
return RainRate;
}

/*
 Sets null
null
*/
public void setSkyBrightness(double _theValue){
this.SkyBrightness=_theValue;
}

/*
 Gets null
null
*/
public double getSkyBrightness(){
return SkyBrightness;
}

/*
 Sets null
null
*/
public void setSkyQuality(double _theValue){
this.SkyQuality=_theValue;
}

/*
 Gets null
null
*/
public double getSkyQuality(){
return SkyQuality;
}

/*
 Sets null
null
*/
public void setStarFWHM(double _theValue){
this.StarFWHM=_theValue;
}

/*
 Gets null
null
*/
public double getStarFWHM(){
return StarFWHM;
}

/*
 Sets null
null
*/
public void setSkyTemperature(double _theValue){
this.SkyTemperature=_theValue;
}

/*
 Gets null
null
*/
public double getSkyTemperature(){
return SkyTemperature;
}

/*
 Sets null
null
*/
public void setTemperature(double _theValue){
this.Temperature=_theValue;
}

/*
 Gets null
null
*/
public double getTemperature(){
return Temperature;
}

/*
 Sets null
null
*/
public void setWindDirection(double _theValue){
this.WindDirection=_theValue;
}

/*
 Gets null
null
*/
public double getWindDirection(){
return WindDirection;
}

/*
 Sets null
null
*/
public void setWindGust(double _theValue){
this.WindGust=_theValue;
}

/*
 Gets null
null
*/
public double getWindGust(){
return WindGust;
}

/*
 Sets null
null
*/
public void setWindSpeed(double _theValue){
this.WindSpeed=_theValue;
}

/*
 Gets null
null
*/
public double getWindSpeed(){
return WindSpeed;
}
}
