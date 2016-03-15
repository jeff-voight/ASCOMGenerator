package ASCOM.Utilities.Interfaces;

/*

 Interface for KeyValuePair class
 

This is a return type only used by a small number of the Profile.XXXCOM commands. Including
 IProfile.RegisteredDevices, 
 IProfile.SubKeys and 
 IProfile.Values.
*/
public class IKeyValuePair{

/*
null
null
*/
private double Key;
/*
null
null
*/
private double Value;

/*
 Sets null
null
*/
public void setKey(double _theValue){
this.Key=_theValue;
}

/*
 Gets null
null
*/
public double getKey(){
return Key;
}

/*
 Sets null
null
*/
public void setValue(double _theValue){
this.Value=_theValue;
}

/*
 Gets null
null
*/
public double getValue(){
return Value;
}
}
