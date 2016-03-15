package ASCOM.DeviceInterface;

/*

 Defines the ISafetyMonitor Interface
 


*/
public class ISafetyMonitor{

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
private double IsSafe;


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
public void setIsSafe(double _theValue){
this.IsSafe=_theValue;
}

/*
 Gets null
null
*/
public double getIsSafe(){
return IsSafe;
}
}
