package ASCOM;

/*

              Exception to report an invalid value supplied to a driver.
            


              The most useful way to use this exception is to inform the user which property/method/parameter
              had the invalid value and also the range of allowed values.
            
*/
public class InvalidValueException{

/*
null
null
*/
private double PropertyOrMethod;
/*
null
null
*/
private double Value;
/*
null
null
*/
private double Range;


/*

              Create a new exception object and identify the specified driver property or method as the source.
            

*/
public void InvalidValueException(String,String,String){
return null;
}


/*

              Create a new exception object and identify the specified driver property as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void InvalidValueException(String,String,String,Exception){
return null;
}


/*

              Create a new exception
            

*/
public void InvalidValueException(String){
return null;
}


/*

              Create a new exception
            

*/
public void InvalidValueException(String,Exception){
return null;
}


/*

              Create a new exception object
            

*/
public void InvalidValueException(){
return null;
}


/*

              Added to keep Code Analysis happy
            

*/
public void InvalidValueException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets null
null
*/
public void setPropertyOrMethod(double _theValue){
this.PropertyOrMethod=_theValue;
}

/*
 Gets null
null
*/
public double getPropertyOrMethod(){
return PropertyOrMethod;
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

/*
 Sets null
null
*/
public void setRange(double _theValue){
this.Range=_theValue;
}

/*
 Gets null
null
*/
public double getRange(){
return Range;
}
}
