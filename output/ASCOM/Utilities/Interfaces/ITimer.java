package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Timer component
 


*/
public class ITimer{

/*
null
null
*/
private double Interval;
/*
null
null
*/
private double Enabled;

/*
 Sets null
null
*/
public void setInterval(double _theValue){
this.Interval=_theValue;
}

/*
 Gets null
null
*/
public double getInterval(){
return Interval;
}

/*
 Sets null
null
*/
public void setEnabled(double _theValue){
this.Enabled=_theValue;
}

/*
 Gets null
null
*/
public double getEnabled(){
return Enabled;
}
}
