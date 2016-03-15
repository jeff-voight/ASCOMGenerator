package ASCOM.DeviceInterface;

/*

 Defines the IObservingConditions Interface.
 This interface provides a limited set of values that are useful
 for astronomical purposes for things such as determining if it is safe to open or operate the observing system,
 for recording astronomical data or determining refraction corrections.
 

It is NOT intended as a general purpose environmental sensor system. The Action method and 
 SupportedActions property can be used to extend your driver to present any further sensors that you need.
 
*/
public class IObservingConditions{

/*
null
null
*/
private double Connected;
/*
null
null
*/
private double Description;
/*
null
null
*/
private double DriverInfo;
/*
null
null
*/
private double DriverVersion;
/*
null
null
*/
private double InterfaceVersion;
/*
null
null
*/
private double Name;
/*
null
null
*/
private double SupportedActions;
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

 Launches a configuration dialog box for the driver.  The call will not return
 until the user clicks OK or cancel manually.
 
Must be implemented
	
*/
public void SetupDialog(){
return null;
}


/*

 Invokes the specified device-specific action.
 
Can throw a not implemented exception 
 This method is intended for use in all current and future device types and to avoid name clashes, management of action names 
 is important from day 1. A two-part naming convention will be adopted - DeviceType:UniqueActionName where:
 
			DeviceType is the same value as would be used by  e.g. Telescope, Camera, Switch etc.
			UniqueActionName is a single word, or multiple words joined by underscore characters, that sensibly describes the action to be performed.
		
		
 It is recommended that UniqueActionNames should be a maximum of 16 characters for legibility.
 Should the same function and UniqueActionName be supported by more than one type of device, the reserved DeviceType of 
 “General” will be used. Action names will be case insensitive, so FilterWheel:SelectWheel, filterwheel:selectwheel 
 and FILTERWHEEL:SELECTWHEEL will all refer to the same action.
		The names of all supported actions must be returned in the  property.
		For ObservingConditions drivers the following conventions are recommended:
 
				The "ActionName" should be the name of a sensor in a form that makes sense to the user.
 This must not be changed in the driver.
				The "ActionParameter" should be "Value" to return the sensor value and 
 "Description" to return the sensor description. 
 The description must return a valid description, even if not connected.
			
		
	
*/
public void Action(String,String){
return null;
}


/*

 Transmits an arbitrary string to the device and does not wait for a response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandBlind(String,Boolean){
return null;
}


/*

 Transmits an arbitrary string to the device and waits for a boolean response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandBool(String,Boolean){
return null;
}


/*

 Transmits an arbitrary string to the device and waits for a string response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandString(String,Boolean){
return null;
}


/*

 Dispose the late-bound interface, if needed. Will release it via COM
 if it is a COM object, else if native .NET will just dereference it
 for GC.
 

*/
public void Dispose(){
return null;
}


/*

 Provides the time since the sensor value was last updated
 

		Must Not throw a MethodNotImplementedException when the specified sensor Is implemented but must throw a MethodNotImplementedException when the specified sensor Is Not implemented.
		PropertyName must be the name of one of the sensor properties specified in the  interface. If the caller supplies some other value, throw an InvalidValueException.
		Return a negative value to indicate that no valid value has ever been received from the hardware.
		If an empty string is supplied as the PropertyName, the driver must return the time since the most recent update of any sensor. A MethodNotImplementedException must not be thrown in this circumstance.
	
*/
public void TimeSinceLastUpdate(String){
return null;
}


/*

 Provides a description of the sensor providing the requested property
 

		Must Not throw a MethodNotImplementedException when the specified sensor Is implemented 
 but must throw a MethodNotImplementedException when the specified sensor Is Not implemented.
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
public void setConnected(double _theValue){
this.Connected=_theValue;
}

/*
 Gets null
null
*/
public double getConnected(){
return Connected;
}

/*
 Sets null
null
*/
public void setDescription(double _theValue){
this.Description=_theValue;
}

/*
 Gets null
null
*/
public double getDescription(){
return Description;
}

/*
 Sets null
null
*/
public void setDriverInfo(double _theValue){
this.DriverInfo=_theValue;
}

/*
 Gets null
null
*/
public double getDriverInfo(){
return DriverInfo;
}

/*
 Sets null
null
*/
public void setDriverVersion(double _theValue){
this.DriverVersion=_theValue;
}

/*
 Gets null
null
*/
public double getDriverVersion(){
return DriverVersion;
}

/*
 Sets null
null
*/
public void setInterfaceVersion(double _theValue){
this.InterfaceVersion=_theValue;
}

/*
 Gets null
null
*/
public double getInterfaceVersion(){
return InterfaceVersion;
}

/*
 Sets null
null
*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets null
null
*/
public double getName(){
return Name;
}

/*
 Sets null
null
*/
public void setSupportedActions(double _theValue){
this.SupportedActions=_theValue;
}

/*
 Gets null
null
*/
public double getSupportedActions(){
return SupportedActions;
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
