package ASCOM;

/*

              All properties defined by the relevant ASCOM standard interface must exist in each driver. However,
              those properties do not all have to be implemented. The minimum requirement
              for each defined property is to throw the ASCOM.PropertyNotImplementedException for each
              of its accessors. Note that no default constructor is supplied. Throwing this requires both the 
              property name and unimplemented accessor type to be supplied.
            


*/
public class PropertyNotImplementedException{

/*
null
null
*/
private double Property;
/*
null
null
*/
private double AccessorSet;


/*

              Create a new exception object and identify the specified driver property and accessor as the source.
            

*/
public void PropertyNotImplementedException(String,Boolean){
return null;
}


/*

              Create a new exception object and identify the specified driver property as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void PropertyNotImplementedException(String,Boolean,Exception){
return null;
}


/*

              Create a new exception
            

*/
public void PropertyNotImplementedException(String,Exception){
return null;
}


/*

              Create a new exception
            

*/
public void PropertyNotImplementedException(){
return null;
}


/*

              Create a new exception
            

*/
public void PropertyNotImplementedException(String){
return null;
}


/*

              Initializes a new instance of the  class.
            

*/
public void PropertyNotImplementedException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets null
null
*/
public void setProperty(double _theValue){
this.Property=_theValue;
}

/*
 Gets null
null
*/
public double getProperty(){
return Property;
}

/*
 Sets null
null
*/
public void setAccessorSet(double _theValue){
this.AccessorSet=_theValue;
}

/*
 Gets null
null
*/
public double getAccessorSet(){
return AccessorSet;
}
}
