package ASCOM.DeviceInterface;

/*

 A collection of rates at which the telescope may be moved about the specified axis by the  method.
 This is only used if the telescope interface version is 2 or 3
 

See the description of the  method for more information.
		This method must return an empty collection if  is not supported.
		The values used in  members must be non-negative; forward and backward motion is achieved by the application
 applying an appropriate sign to the returned  values in the  command.
	
*/
public class IAxisRates{

/*
null
null
*/
private double Item;
/*
null
null
*/
private double Count;


/*

 Disposes of the object and cleans up
 

*/
public void Dispose(){
return null;
}


/*

 Returns an enumerator for the collection
 

*/
public void GetEnumerator(){
return null;
}

/*
 Sets null
null
*/
public void setItem(double _theValue){
this.Item=_theValue;
}

/*
 Gets null
null
*/
public double getItem(){
return Item;
}

/*
 Sets null
null
*/
public void setCount(double _theValue){
this.Count=_theValue;
}

/*
 Gets null
null
*/
public double getCount(){
return Count;
}
}
