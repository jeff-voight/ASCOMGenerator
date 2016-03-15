package ASCOM.DriverAccess;

/*

            Describes a range of rates supported by the MoveAxis() method (degrees/per second)
            These are contained within the AxisRates collection. They serve to describe one or more supported ranges of rates of motion about a mechanical axis. 
            It is possible that the Rate.Maximum and Rate.Minimum properties will be equal. In this case, the Rate object expresses a single discrete rate. 
            Both the Rate.Maximum and Rate.Minimum properties are always expressed in units of degrees per second. 
            


*/
public class _Rate{

/*
null
null
*/
private double Maximum;
/*
null
null
*/
private double Minimum;


/*

            Dispose the late-bound interface, if needed. Will release it via COM
            if it is a COM object, else if native .NET will just dereference it
            for GC.
            

*/
public void Dispose(){
return null;
}

/*
 Sets null
null
*/
public void setMaximum(double _theValue){
this.Maximum=_theValue;
}

/*
 Gets null
null
*/
public double getMaximum(){
return Maximum;
}

/*
 Sets null
null
*/
public void setMinimum(double _theValue){
this.Minimum=_theValue;
}

/*
 Gets null
null
*/
public double getMinimum(){
return Minimum;
}
}
