package ASCOM.Utilities;

/*

 Class that returns a key and associated value
 

This class is used by some Profile properties and methods and
 compensates for the inability of .NET to return Generic classes to COM clients.
 The properties and methods are: 
 Profile.RegisteredDevices, 
 Profile.SubKeys and 
 Profile.Values.
*/
public class KeyValuePair{

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

 COM visible default constructor
 

*/
public void KeyValuePair(){
return null;
}


/*

 Constructor that can set the key and value simultaneously.
 

*/
public void KeyValuePair(String,String){
return null;
}

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
