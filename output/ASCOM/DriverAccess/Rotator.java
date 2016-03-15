package ASCOM.DriverAccess;

/*

            Provides universal access to Rotator drivers
            


*/
public class Rotator{

/*
null
null
*/
private double CanReverse;
/*
null
null
*/
private double IsMoving;
/*
null
null
*/
private double Position;
/*
null
null
*/
private double Reverse;
/*
null
null
*/
private double StepSize;
/*
null
null
*/
private double TargetPosition;


/*

            Creates a rotator object with the given Prog ID
            

*/
public void Rotator(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a Rotator
            

*/
public void Choose(String){
return null;
}


/*

            Immediately stop any Rotator motion due to a previous Move or MoveAbsolute method call.
            
This is an optional method. Raises an error if not supported.
*/
public void Halt(){
return null;
}


/*

            Causes the rotator to move Position degrees relative to the current  value.
            
Calling Move causes the  property to change to the sum of the current angular position 
            and the value of the  parameter (modulo 360 degrees), then starts rotation to .
*/
public void Move(Single){
return null;
}


/*

            Causes the rotator to move the absolute position of  degrees.
            
Calling MoveAbsolute causes the  property to change to the value of the
             parameter, then starts rotation to . 
*/
public void MoveAbsolute(Single){
return null;
}

/*
 Sets null
null
*/
public void setCanReverse(double _theValue){
this.CanReverse=_theValue;
}

/*
 Gets null
null
*/
public double getCanReverse(){
return CanReverse;
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
public void setReverse(double _theValue){
this.Reverse=_theValue;
}

/*
 Gets null
null
*/
public double getReverse(){
return Reverse;
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
public void setTargetPosition(double _theValue){
this.TargetPosition=_theValue;
}

/*
 Gets null
null
*/
public double getTargetPosition(){
return TargetPosition;
}
}
