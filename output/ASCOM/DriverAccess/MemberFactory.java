package ASCOM.DriverAccess;

/*

            A factory class to access any registered driver members
            


*/
public class MemberFactory{

/*
null
null
*/
private double GetLateBoundObject;
/*
null
null
*/
private double IsComObject;
/*
null
null
*/
private double GetObjType;
/*
null
null
*/
private double GetInterfaces;


/*

            Constructor, creates an instance of the of the ASCOM driver using the given TraceLogger
            
            

*/
public void MemberFactory(String,ASCOM.Utilities.TraceLogger){
return null;
}


/*

            Dispose the late-bound interface, if needed. Will release it via COM
            if it is a COM object, else if native .NET will just dereference it
            for GC.
            

*/
public void Dispose(){
return null;
}


/*

            Calls a method on an object dynamically. 
            
            parameterTypes must match the parameters and in the same order.
            

*/
public void CallMember(Int32,String,Type[],Object[]){
return null;
}


/*

            Checks for ASCOM exceptions returned as inner exceptions of TargetInvocationException. When new ASCOM exceptions are created 
            they must be added to this method. They will then be used in all three cases of Property Get, Property Set and Method call. 
            

*/
public void CheckDotNetExceptions(String,Exception){
return null;
}

/*
 Sets null
null
*/
public void setGetLateBoundObject(double _theValue){
this.GetLateBoundObject=_theValue;
}

/*
 Gets null
null
*/
public double getGetLateBoundObject(){
return GetLateBoundObject;
}

/*
 Sets null
null
*/
public void setIsComObject(double _theValue){
this.IsComObject=_theValue;
}

/*
 Gets null
null
*/
public double getIsComObject(){
return IsComObject;
}

/*
 Sets null
null
*/
public void setGetObjType(double _theValue){
this.GetObjType=_theValue;
}

/*
 Gets null
null
*/
public double getGetObjType(){
return GetObjType;
}

/*
 Sets null
null
*/
public void setGetInterfaces(double _theValue){
this.GetInterfaces=_theValue;
}

/*
 Gets null
null
*/
public double getGetInterfaces(){
return GetInterfaces;
}
}
