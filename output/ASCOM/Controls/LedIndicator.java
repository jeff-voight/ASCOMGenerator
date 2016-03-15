package ASCOM.Controls;

/*

              Provides a status indicator modeled on a bi-colour red/green LED lamp.
              The lamp can be red or green and  (traffic light colours) and
              can be steady or can flash with a choice of different cadences.
            


*/
public class LedIndicator{

/*
null
null
*/
private double Status;
/*
null
null
*/
private double LabelText;
/*
null
null
*/
private double Enabled;
/*
null
null
*/
private double Cadence;


/*

              Default constructor for a new LEDIndicator object. Performs the default processing required
              by the designer.
            

*/
public void LedIndicator(){
return null;
}


/*

            Releases all resources used by the .
            

*/
public void Dispose(){
return null;
}


/*

            Releases the unmanaged resources and optionally releases the managed resources.
            

*/
public void Dispose(Boolean){
return null;
}


/*

              Required method for Designer support - do not modify 
              the contents of this method with the code editor.
            

*/
public void InitializeComponent(){
return null;
}


/*

              Refreshes the LED display, taking account of the power,
              colour and cadence settings.
            

              Implements the  method.
              The  always calls this method on the GUI thread.
            
*/
public void CadenceUpdate(Boolean){
return null;
}


/*

            Renders the 'power off' appearance of the LED indicator.
            

*/
public void RenderOffAppearance(){
return null;
}


/*

            Renders the 'power on' appearance of the LED indicator. The exact appearance depends on the  property.
            

*/
public void RenderOnAppearance(){
return null;
}


/*

              Sets the colour of the LED.
              If the colour is changed, then the LED's panel control is invalidated to force a re-draw.
            

*/
public void SetColour(Drawing.Color){
return null;
}


/*

              Unregister from the .
            

*/
public void StopCadenceUpdates(){
return null;
}


/*

              Register with the .
            

*/
public void StartCadenceUpdates(){
return null;
}

/*
 Sets null
null
*/
public void setStatus(double _theValue){
this.Status=_theValue;
}

/*
 Gets null
null
*/
public double getStatus(){
return Status;
}

/*
 Sets null
null
*/
public void setLabelText(double _theValue){
this.LabelText=_theValue;
}

/*
 Gets null
null
*/
public double getLabelText(){
return LabelText;
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
