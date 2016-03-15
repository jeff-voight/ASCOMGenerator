package ASCOM;

/*

            Exception thrown by a driver when it receives an unknown command through the Action method.
            


*/
public class ActionNotImplementedException{

/*
null
null
*/
private double Action;


/*

              Create a new exception object and identify the specified driver method as the source.
            

*/
public void ActionNotImplementedException(String){
return null;
}


/*

              Create a new exception object and identify the specified driver method as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void ActionNotImplementedException(String,Exception){
return null;
}


/*

              For Code Analysis, please don't use
            

*/
public void ActionNotImplementedException(){
return null;
}


/*

            Initializes a new instance of the  class.
            

*/
public void ActionNotImplementedException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets null
null
*/
public void setAction(double _theValue){
this.Action=_theValue;
}

/*
 Gets null
null
*/
public double getAction(){
return Action;
}
}
