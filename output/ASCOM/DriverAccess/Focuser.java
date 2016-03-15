package ASCOM.DriverAccess;

/*

            Provides universal access to Focuser drivers
            


*/
public class Focuser{

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

            Creates a focuser object with the given Prog ID
            

*/
public void Focuser(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a Focuser
            

*/
public void Choose(String){
return null;
}


/*

            Immediately stop any focuser motion due to a previous  method call.
            

            Some focusers may not support this function, in which case an exception will be raised. 
            Recommendation: Host software should call this method upon initialization and,
            if it fails, disable the Halt button in the user interface.
            
*/
public void Halt(){
return null;
}


/*

              Moves the focuser by the specified amount or to the specified position depending on the value of the  property.
             
If the  property is True, then this is an absolute positioning focuser. 
             The Move command tells the focuser to move to an exact step position, and the Position parameter 
             of the Move method is an integer between 0 and .
             If the  property is False, then this is a relative positioning focuser. The Move command tells 
             the focuser to move in a relative direction, and the Position parameter of the Move method (in this case, step distance) 
             is an integer between minus  and plus .
            
*/
public void Move(Int32){
return null;
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
