package ASCOM.Utilities;

/*

 The Chooser object provides a way for your application to let your user select the telescope to use.
 


		Calling Chooser.Choose() causes a chooser window to appear, with a drop down selector list containing all of the registered Telescope 
 drivers, listed by the driver's friendly/display name. The user sees a list of telescope types and selects one. 
 Before the OK button will light up, however, the user must click the Setup button, causing the selected driver's setup dialog to appear 
 (it calls the driver's Telescope.SetupDialog() method). When the setup dialog is closed, the OK button will light and allow the user 
 to close the Chooser itself.
		The Choose() method returns the DriverID of the selected driver. Choose() allows you to optionally pass the DriverID of a "current" 
 driver (you probably save this in the registry), and the corresponding telescope type is pre-selected in the Chooser's list. In this case, 
 the OK button starts out enabled (lit-up); the assumption is that the pre-selected driver has already been configured. 
	
*/
public class Chooser{

/*
null
null
*/
private double DeviceType;


/*

 Creates a new Chooser object
 

*/
public void Chooser(){
return null;
}


/*

 Does the work of cleaning up objects used by Chooser
 
You can't call this directly, use Dispose with no arguments instead.
*/
public void Dispose(Boolean){
return null;
}


/*

 Cleans up and disposes objects used by Chooser
 

*/
public void Dispose(){
return null;
}


/*

 Select ASCOM driver to use including pre-selecting one in the dropdown list
 
The supplied driver will be pre-selected in the Chooser's list when the chooser window is first opened.
 
*/
public void Choose(String){
return null;
}


/*

 Select ASCOM driver to use without pre-selecting in the dropdown list
 
No driver will be pre-selected in the Chooser's list when the chooser window is first opened. 
 Thrown if the Chooser.DeviceType property has not been set before Choose is called. 
 It must be set in order for Chooser to know which list of devices to display.
		This overload is not available through COM, please use "Choose(ByVal DriverProgID As String)"
 with an empty string parameter to achieve this effect.
	
*/
public void Choose(){
return null;
}

/*
 Sets null
null
*/
public void setDeviceType(double _theValue){
this.DeviceType=_theValue;
}

/*
 Gets null
null
*/
public double getDeviceType(){
return DeviceType;
}
}
