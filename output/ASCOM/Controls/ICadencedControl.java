package ASCOM.Controls;

/*

              Defines the members necessary for a control to register and be managed by the
               singleton.
            


*/
public class ICadencedControl{

/*
null
null
*/
private double Cadence;


/*

              Updates the control's display.
               always calls this method on the GUI thread so that control updates are thread-safe.
            

*/
public void CadenceUpdate(Boolean){
return null;
}

/*
 Sets null
null
*/
public void setCadence(double _theValue){
this.Cadence=_theValue;
}

/*
 Gets null
null
*/
public double getCadence(){
return Cadence;
}
}
