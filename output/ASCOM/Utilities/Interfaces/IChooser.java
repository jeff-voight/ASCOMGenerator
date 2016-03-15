package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Chooser component
 


*/
public class IChooser{

/*
null
null
*/
private double DeviceType;


/*

 Select ASCOM driver to use including pre-selecting one in the dropdown list
 
The supplied driver will be pre-selected in the Chooser's list when the chooser window is first opened.
 
*/
public void Choose(String){
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
