package ASCOM.DriverAccess;

/*

            Provides universal access to ASCOM Dome drivers
            


*/
public class Dome{

/*
null
null
*/
private double Altitude;
/*
null
null
*/
private double AtHome;
/*
null
null
*/
private double AtPark;
/*
null
null
*/
private double Azimuth;
/*
null
null
*/
private double CanFindHome;
/*
null
null
*/
private double CanPark;
/*
null
null
*/
private double CanSetAltitude;
/*
null
null
*/
private double CanSetAzimuth;
/*
null
null
*/
private double CanSetPark;
/*
null
null
*/
private double CanSetShutter;
/*
null
null
*/
private double CanSlave;
/*
null
null
*/
private double CanSyncAzimuth;
/*
null
null
*/
private double ShutterStatus;
/*
null
null
*/
private double Slaved;
/*
null
null
*/
private double Slewing;


/*

            Constructor for Dome class. Creates a Dome based on the ProgID in the DomeID string.
            

*/
public void Dome(String){
return null;
}


/*

            Shows the ASCOM Chooser to select a Dome.
            

*/
public void Choose(String){
return null;
}


/*

            Immediately cancel current dome operation.
            

            Calling this method will immediately disable hardware slewing ( will become False).
            Raises an error if a communications failure occurs, or if the command is known to have failed. 
            
*/
public void AbortSlew(){
return null;
}


/*

            Close shutter or otherwise shield telescope from the sky.
            

*/
public void CloseShutter(){
return null;
}


/*

            Start operation to search for the dome home position.
            

            After Home position is established initializes  to the default value and sets the  flag. 
            Exception if not supported or communications failure. Raises an error if  is True.
            
*/
public void FindHome(){
return null;
}


/*

            Open shutter or otherwise expose telescope to the sky.
            

            Raises an error if not supported or if a communications failure occurs. 
            
*/
public void OpenShutter(){
return null;
}


/*

            Rotate dome in azimuth to park position.
            

            After assuming programmed park position, sets  flag. Raises an error if  is True,
            or if not supported, or if a communications failure has occurred. 
            
*/
public void Park(){
return null;
}


/*

            Set the current azimuth, altitude position of dome to be the park position.
            

            Raises an error if not supported or if a communications failure occurs. 
            
*/
public void SetPark(){
return null;
}


/*

            Slew the dome to the given altitude position.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated altitude. 
            
*/
public void SlewToAltitude(Double){
return null;
}


/*

            Slew the dome to the given azimuth position.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated azimuth. 
            
*/
public void SlewToAzimuth(Double){
return null;
}


/*

            Synchronize the current position of the dome to the given azimuth.
            

            Raises an error if not supported or if a communications failure occurs. 
            
*/
public void SyncToAzimuth(Double){
return null;
}

/*
 Sets null
null
*/
public void setAltitude(double _theValue){
this.Altitude=_theValue;
}

/*
 Gets null
null
*/
public double getAltitude(){
return Altitude;
}

/*
 Sets null
null
*/
public void setAtHome(double _theValue){
this.AtHome=_theValue;
}

/*
 Gets null
null
*/
public double getAtHome(){
return AtHome;
}

/*
 Sets null
null
*/
public void setAtPark(double _theValue){
this.AtPark=_theValue;
}

/*
 Gets null
null
*/
public double getAtPark(){
return AtPark;
}

/*
 Sets null
null
*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets null
null
*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets null
null
*/
public void setCanFindHome(double _theValue){
this.CanFindHome=_theValue;
}

/*
 Gets null
null
*/
public double getCanFindHome(){
return CanFindHome;
}

/*
 Sets null
null
*/
public void setCanPark(double _theValue){
this.CanPark=_theValue;
}

/*
 Gets null
null
*/
public double getCanPark(){
return CanPark;
}

/*
 Sets null
null
*/
public void setCanSetAltitude(double _theValue){
this.CanSetAltitude=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetAltitude(){
return CanSetAltitude;
}

/*
 Sets null
null
*/
public void setCanSetAzimuth(double _theValue){
this.CanSetAzimuth=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetAzimuth(){
return CanSetAzimuth;
}

/*
 Sets null
null
*/
public void setCanSetPark(double _theValue){
this.CanSetPark=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetPark(){
return CanSetPark;
}

/*
 Sets null
null
*/
public void setCanSetShutter(double _theValue){
this.CanSetShutter=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetShutter(){
return CanSetShutter;
}

/*
 Sets null
null
*/
public void setCanSlave(double _theValue){
this.CanSlave=_theValue;
}

/*
 Gets null
null
*/
public double getCanSlave(){
return CanSlave;
}

/*
 Sets null
null
*/
public void setCanSyncAzimuth(double _theValue){
this.CanSyncAzimuth=_theValue;
}

/*
 Gets null
null
*/
public double getCanSyncAzimuth(){
return CanSyncAzimuth;
}

/*
 Sets null
null
*/
public void setShutterStatus(double _theValue){
this.ShutterStatus=_theValue;
}

/*
 Gets null
null
*/
public double getShutterStatus(){
return ShutterStatus;
}

/*
 Sets null
null
*/
public void setSlaved(double _theValue){
this.Slaved=_theValue;
}

/*
 Gets null
null
*/
public double getSlaved(){
return Slaved;
}

/*
 Sets null
null
*/
public void setSlewing(double _theValue){
this.Slewing=_theValue;
}

/*
 Gets null
null
*/
public double getSlewing(){
return Slewing;
}
}
