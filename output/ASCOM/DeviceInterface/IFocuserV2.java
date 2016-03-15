package ASCOM.DeviceInterface;

/*

 Provides universal access to Focuser drivers
 


*/
public class IFocuserV2{

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
private double Absolute;
/*
null
null
*/
private double IsMoving;
/*
null
null
*/
private double Link;
/*
null
null
*/
private double MaxIncrement;
/*
null
null
*/
private double MaxStep;
/*
null
null
*/
private double Position;
/*
null
null
*/
private double StepSize;
/*
null
null
*/
private double TempComp;
/*
null
null
*/
private double TempCompAvailable;
/*
null
null
*/
private double Temperature;


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

 Immediately stop any focuser motion due to a previous  method call.
 

		Can throw a not implemented exceptionSome focusers may not support this function, in which case an exception will be raised. 
 Recommendation: Host software should call this method upon initialization and,
 if it fails, disable the Halt button in the user interface.
	
*/
public void Halt(){
return null;
}


/*

  Moves the focuser by the specified amount or to the specified position depending on the value of the  property.
 
Must be implemented
 If the  property is True, then this is an absolute positioning focuser. The Move command tells the focuser to move to an exact step position, and the Position parameter 
 of the Move method is an integer between 0 and .
 If the  property is False, then this is a relative positioning focuser. The Move command tells the focuser to move in a relative direction, and the Position parameter 
 of the Move method (in this case, step distance) is an integer between minus  and plus .
	
*/
public void Move(Int32){
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
public void setAbsolute(double _theValue){
this.Absolute=_theValue;
}

/*
 Gets null
null
*/
public double getAbsolute(){
return Absolute;
}

/*
 Sets null
null
*/
public void setIsMoving(double _theValue){
this.IsMoving=_theValue;
}

/*
 Gets null
null
*/
public double getIsMoving(){
return IsMoving;
}

/*
 Sets null
null
*/
public void setLink(double _theValue){
this.Link=_theValue;
}

/*
 Gets null
null
*/
public double getLink(){
return Link;
}

/*
 Sets null
null
*/
public void setMaxIncrement(double _theValue){
this.MaxIncrement=_theValue;
}

/*
 Gets null
null
*/
public double getMaxIncrement(){
return MaxIncrement;
}

/*
 Sets null
null
*/
public void setMaxStep(double _theValue){
this.MaxStep=_theValue;
}

/*
 Gets null
null
*/
public double getMaxStep(){
return MaxStep;
}

/*
 Sets null
null
*/
public void setPosition(double _theValue){
this.Position=_theValue;
}

/*
 Gets null
null
*/
public double getPosition(){
return Position;
}

/*
 Sets null
null
*/
public void setStepSize(double _theValue){
this.StepSize=_theValue;
}

/*
 Gets null
null
*/
public double getStepSize(){
return StepSize;
}

/*
 Sets null
null
*/
public void setTempComp(double _theValue){
this.TempComp=_theValue;
}

/*
 Gets null
null
*/
public double getTempComp(){
return TempComp;
}

/*
 Sets null
null
*/
public void setTempCompAvailable(double _theValue){
this.TempCompAvailable=_theValue;
}

/*
 Gets null
null
*/
public double getTempCompAvailable(){
return TempCompAvailable;
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
}
