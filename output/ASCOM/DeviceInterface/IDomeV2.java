package ASCOM.DeviceInterface;

/*

 Defines the IDome Interface
 


*/
public class IDomeV2{

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
private double Altitude;
/*
null
null
*/
private double AtHome;
/*
null
null
*/
private double AtPark;
/*
null
null
*/
private double Azimuth;
/*
null
null
*/
private double CanFindHome;
/*
null
null
*/
private double CanPark;
/*
null
null
*/
private double CanSetAltitude;
/*
null
null
*/
private double CanSetAzimuth;
/*
null
null
*/
private double CanSetPark;
/*
null
null
*/
private double CanSetShutter;
/*
null
null
*/
private double CanSlave;
/*
null
null
*/
private double CanSyncAzimuth;
/*
null
null
*/
private double ShutterStatus;
/*
null
null
*/
private double Slaved;
/*
null
null
*/
private double Slewing;


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

 Immediately cancel current dome operation.
 

		Must be implemented, must not throw a MethodNotImplementedException.
 Calling this method will immediately disable hardware slewing ( will become False). Raises an error if a communications failure occurs, or if the command is known to have failed. 
 
*/
public void AbortSlew(){
return null;
}


/*

 Close shutter or otherwise shield telescope from the sky.
 

*/
public void CloseShutter(){
return null;
}


/*

 Start operation to search for the dome home position.
 

 After Home position is established initializes  to the default value and sets the  flag. 
 Exception if not supported or communications failure. Raises an error if  is True.
 
*/
public void FindHome(){
return null;
}


/*

 Open shutter or otherwise expose telescope to the sky.
 

 Raises an error if not supported or if a communications failure occurs. 
 
*/
public void OpenShutter(){
return null;
}


/*

 Rotate dome in azimuth to park position.
 

 After assuming programmed park position, sets  flag. Raises an error if  is True, or if not supported, or if a communications failure has occurred. 
 
*/
public void Park(){
return null;
}


/*

 Set the current azimuth, altitude position of dome to be the park position.
 

 Raises an error if not supported or if a communications failure occurs. 
 
*/
public void SetPark(){
return null;
}


/*

 Slew the dome to the given altitude position.
 

 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated altitude. 
 
*/
public void SlewToAltitude(Double){
return null;
}


/*

 Slew the dome to the given azimuth position.
 

 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated azimuth. 
 
*/
public void SlewToAzimuth(Double){
return null;
}


/*

 Synchronize the current position of the dome to the given azimuth.
 

 Raises an error if not supported or if a communications failure occurs. 
 
*/
public void SyncToAzimuth(Double){
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
public void setAltitude(double _theValue){
this.Altitude=_theValue;
}

/*
 Gets null
null
*/
public double getAltitude(){
return Altitude;
}

/*
 Sets null
null
*/
public void setAtHome(double _theValue){
this.AtHome=_theValue;
}

/*
 Gets null
null
*/
public double getAtHome(){
return AtHome;
}

/*
 Sets null
null
*/
public void setAtPark(double _theValue){
this.AtPark=_theValue;
}

/*
 Gets null
null
*/
public double getAtPark(){
return AtPark;
}

/*
 Sets null
null
*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets null
null
*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets null
null
*/
public void setCanFindHome(double _theValue){
this.CanFindHome=_theValue;
}

/*
 Gets null
null
*/
public double getCanFindHome(){
return CanFindHome;
}

/*
 Sets null
null
*/
public void setCanPark(double _theValue){
this.CanPark=_theValue;
}

/*
 Gets null
null
*/
public double getCanPark(){
return CanPark;
}

/*
 Sets null
null
*/
public void setCanSetAltitude(double _theValue){
this.CanSetAltitude=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetAltitude(){
return CanSetAltitude;
}

/*
 Sets null
null
*/
public void setCanSetAzimuth(double _theValue){
this.CanSetAzimuth=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetAzimuth(){
return CanSetAzimuth;
}

/*
 Sets null
null
*/
public void setCanSetPark(double _theValue){
this.CanSetPark=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetPark(){
return CanSetPark;
}

/*
 Sets null
null
*/
public void setCanSetShutter(double _theValue){
this.CanSetShutter=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetShutter(){
return CanSetShutter;
}

/*
 Sets null
null
*/
public void setCanSlave(double _theValue){
this.CanSlave=_theValue;
}

/*
 Gets null
null
*/
public double getCanSlave(){
return CanSlave;
}

/*
 Sets null
null
*/
public void setCanSyncAzimuth(double _theValue){
this.CanSyncAzimuth=_theValue;
}

/*
 Gets null
null
*/
public double getCanSyncAzimuth(){
return CanSyncAzimuth;
}

/*
 Sets null
null
*/
public void setShutterStatus(double _theValue){
this.ShutterStatus=_theValue;
}

/*
 Gets null
null
*/
public double getShutterStatus(){
return ShutterStatus;
}

/*
 Sets null
null
*/
public void setSlaved(double _theValue){
this.Slaved=_theValue;
}

/*
 Gets null
null
*/
public double getSlaved(){
return Slaved;
}

/*
 Sets null
null
*/
public void setSlewing(double _theValue){
this.Slewing=_theValue;
}

/*
 Gets null
null
*/
public double getSlewing(){
return Slewing;
}
}
