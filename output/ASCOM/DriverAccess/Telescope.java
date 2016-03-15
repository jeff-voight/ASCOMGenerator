package ASCOM.DriverAccess;

/*

            Implements a telescope class to access any registered ASCOM telescope
            


*/
public class Telescope{

/*
null
null
*/
private double AlignmentMode;
/*
null
null
*/
private double Altitude;
/*
null
null
*/
private double ApertureArea;
/*
null
null
*/
private double ApertureDiameter;
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
private double CanPulseGuide;
/*
null
null
*/
private double CanSetDeclinationRate;
/*
null
null
*/
private double CanSetGuideRates;
/*
null
null
*/
private double CanSetPark;
/*
null
null
*/
private double CanSetPierSide;
/*
null
null
*/
private double CanSetRightAscensionRate;
/*
null
null
*/
private double CanSetTracking;
/*
null
null
*/
private double CanSlew;
/*
null
null
*/
private double CanSlewAltAz;
/*
null
null
*/
private double CanSlewAltAzAsync;
/*
null
null
*/
private double CanSlewAsync;
/*
null
null
*/
private double CanSync;
/*
null
null
*/
private double CanSyncAltAz;
/*
null
null
*/
private double CanUnpark;
/*
null
null
*/
private double Declination;
/*
null
null
*/
private double DeclinationRate;
/*
null
null
*/
private double DoesRefraction;
/*
null
null
*/
private double EquatorialSystem;
/*
null
null
*/
private double FocalLength;
/*
null
null
*/
private double GuideRateDeclination;
/*
null
null
*/
private double GuideRateRightAscension;
/*
null
null
*/
private double IsPulseGuiding;
/*
null
null
*/
private double RightAscension;
/*
null
null
*/
private double RightAscensionRate;
/*
null
null
*/
private double SideOfPier;
/*
null
null
*/
private double SiderealTime;
/*
null
null
*/
private double SiteElevation;
/*
null
null
*/
private double SiteLatitude;
/*
null
null
*/
private double SiteLongitude;
/*
null
null
*/
private double SlewSettleTime;
/*
null
null
*/
private double Slewing;
/*
null
null
*/
private double TargetDeclination;
/*
null
null
*/
private double TargetRightAscension;
/*
null
null
*/
private double Tracking;
/*
null
null
*/
private double TrackingRate;
/*
null
null
*/
private double TrackingRates;
/*
null
null
*/
private double UTCDate;


/*

            Creates an instance of the telescope class.
            

*/
public void Telescope(String){
return null;
}


/*

            The Choose() method returns the DriverID of the selected driver.
            Choose() allows you to optionally pass the DriverID of a "current" driver (you probably save this in the registry),
            and the corresponding telescope type is pre-selected in the Chooser's list.
            In this case, the OK button starts out enabled (lit-up); the assumption is that the pre-selected driver has already been configured. 
            

*/
public void Choose(String){
return null;
}


/*

            Stops a slew in progress.
            

            Effective only after a call to , , , or .
            Does nothing if no slew/motion is in progress. 
            Tracking is returned to its pre-slew state.
            Raises an error if  is true. 
            
*/
public void AbortSlew(){
return null;
}


/*

            A collection of rates at which the telescope may be moved about the specified axis by the  method.
            

            See the description of  for more information. This method must return an empty collection if  is not supported. 
            This is only available for telescope InterfaceVersions 2 and 3
            
            Please note that the rate objects must contain absolute non-negative values only. Applications determine the direction by applying a
            positive or negative sign to the rates provided. This obviates the need for the driver to to present a duplicate set of negative rates 
            as well as the positive rates.
            
*/
public void AxisRates(ASCOM.DeviceInterface.TelescopeAxes){
return null;
}


/*

             Shows whether the telescope can be controlled about the specified axis via the MoveAxis() method.
             
See the description of MoveAxis() for more information. The (symbolic) values for TelescopeAxes are:
            
            axisPrimary 0 Primary axis (e.g., Right Ascension or Azimuth)
            axisSecondary 1 Secondary axis (e.g., Declination or Altitude)
            axisTertiary 2 Tertiary axis (e.g. imager rotator/de-rotator)
            
*/
public void CanMoveAxis(ASCOM.DeviceInterface.TelescopeAxes){
return null;
}


/*

            Predict side of pier for German equatorial mounts
            

            This is only available for telescope InterfaceVersions 2 and 3
            
*/
public void DestinationSideOfPier(Double,Double){
return null;
}


/*

            Locates the telescope's "home" position (synchronous)
            

            Returns only after the home position has been found.
            At this point the  property will be True.
            Raises an error if there is a problem. 
            Raises an error if AtPark is true. 
            This is only available for telescope InterfaceVersions 2 and 3
            
*/
public void FindHome(){
return null;
}


/*

            Move the telescope in one axis at the given rate.
            

            This method supports control of the mount about its mechanical axes.
            The telescope will start moving at the specified rate about the specified axis and continue indefinitely.
            This method can be called for each axis separately, and have them all operate concurrently at separate rates of motion. 
            Set the rate for an axis to zero to restore the motion about that axis to the rate set by the  property.
            Tracking motion (if enabled, see note below) is suspended during this mode of operation. 
            
            Raises an error if  is true. 
            This must be implemented for the if the  property returns True for the given axis.
            This is only available for telescope InterfaceVersions 2 and 3
            
            NOTES:
            
            The movement rate must be within the value(s) obtained from a  object in the 
            the  collection. This is a signed value with negative rates moving in the oposite direction to positive rates.
            The values specified in  are absolute, unsigned values and apply to both directions, 
            determined by the sign used in this command.
            An out of range exception is raised the rate is out of range.
            The value of  must be True if the telescope is moving 
            about any of its axes as a result of this method being called. 
            This can be used to simulate a handbox by initiating motion with the
            MouseDown event and stopping the motion with the MouseUp event.
            When the motion is stopped by setting the rate to zero the scope will be set to the previous 
             or to no movement, depending on the state of the  property.
            It may be possible to implement satellite tracking by using the  method to move the 
            scope in the required manner to track a satellite.
            
            
            
*/
public void MoveAxis(ASCOM.DeviceInterface.TelescopeAxes,Double){
return null;
}


/*

            Move the telescope to its park position, stop all motion (or restrict to a small safe range), and set  to True.
            

            Raises an error if there is a problem communicating with the telescope or if parking fails. 
            Parking should put the telescope into a state where its pointing accuracy 
            will not be lost if it is power-cycled (without moving it).
            Some telescopes must be power-cycled before unparking.
            Others may be unparked by simply calling the  method.
            Calling this with  = True does nothing (harmless) 
            
*/
public void Park(){
return null;
}


/*

            Moves the scope in the given direction for the given interval or time at 
            the rate given by the corresponding guide rate property 
            

            This method returns immediately if the hardware is capable of back-to-back moves,
            i.e. dual-axis moves. For hardware not having the dual-axis capability,
            the method returns only after the move has completed. 
            
            NOTES:
            
            Raises an error if  is true.
            The  property must be be True during pulse-guiding.
            The rate of motion for movements about the right ascension axis is 
            specified by the  property. The rate of motion
            for movements about the declination axis is specified by the 
             property. These two rates may be tied together
            into a single rate, depending on the driver's implementation
            and the capabilities of the telescope.
            
            
            
*/
public void PulseGuide(ASCOM.DeviceInterface.GuideDirections,Int32){
return null;
}


/*

            Sets the telescope Park position to the current telescope position.
            

*/
public void SetPark(){
return null;
}


/*

            Move the telescope to the given local horizontal coordinates, return when slew is complete
            

            This Method must be implemented if  returns True.
            Raises an error if the slew fails. 
            The slew may fail if the target coordinates are beyond limits imposed within the driver component.
            Such limits include mechanical constraints imposed by the mount or attached instruments,
            building or dome enclosure restrictions, etc.
            
            The  and  properties are not changed by this method. 
            Raises an error if  is True, or if  is True. 
            This is only available for telescope InterfaceVersions 2 and 3
            
*/
public void SlewToAltAz(Double,Double){
return null;
}


/*

            This Method must be implemented if  returns True.
            

            This method should only be implemented if the properties , ,
            ,  and  can be read while the scope is slewing.
            Raises an error if starting the slew fails. Returns immediately after starting the slew.
            The client may monitor the progress of the slew by reading the , ,
            and  properties during the slew. When the slew completes, Slewing becomes False. 
            The slew may fail if the target coordinates are beyond limits imposed within the driver component.
            Such limits include mechanical constraints imposed by the mount or attached instruments,
            building or dome enclosure restrictions, etc. 
            The  and  properties are not changed by this method. 
            
            Raises an error if  is True, or if  is True.
            This is only available for telescope InterfaceVersions 2 and 3
            
*/
public void SlewToAltAzAsync(Double,Double){
return null;
}


/*

            Move the telescope to the given equatorial coordinates, return when slew is complete
            

            This Method must be implemented if  returns True. Raises an error if the slew fails. 
            The slew may fail if the target coordinates are beyond limits imposed within the driver component.
            Such limits include mechanical constraints imposed by the mount or attached instruments,
            building or dome enclosure restrictions, etc. The target coordinates are copied to
             and  whether or not the slew succeeds. 
            Raises an error if  is True, or if  is False.
            
*/
public void SlewToCoordinates(Double,Double){
return null;
}


/*

            Move the telescope to the given equatorial coordinates, return immediately after starting the slew.
            

            This method must be implemented if  returns True. Raises an error if starting the slew failed. 
            Returns immediately after starting the slew. The client may monitor the progress of the slew by reading
            the , , and  properties during the slew. When the slew completes,
             becomes False. The slew may fail to start if the target coordinates are beyond limits
            imposed within the driver component. Such limits include mechanical constraints imposed
            by the mount or attached instruments, building or dome enclosure restrictions, etc. 
            The target coordinates are copied to  and 
            whether or not the slew succeeds. 
            Raises an error if  is True, or if  is False.
            
*/
public void SlewToCoordinatesAsync(Double,Double){
return null;
}


/*

            Move the telescope to the  and  coordinates, return when slew complete.
            

            This Method must be implemented if  returns True. Raises an error if the slew fails. 
            The slew may fail if the target coordinates are beyond limits imposed within the driver component.
            Such limits include mechanical constraints imposed by the mount or attached
            instruments, building or dome enclosure restrictions, etc. 
            Raises an error if  is True, or if  is False. 
            
*/
public void SlewToTarget(){
return null;
}


/*

            Move the telescope to the  and   coordinates,
            returns immediately after starting the slew.
            

            This Method must be implemented if   returns True.
            Raises an error if starting the slew failed. 
            Returns immediately after starting the slew. The client may
            monitor the progress of the slew by reading the RightAscension, Declination,
            and Slewing properties during the slew. When the slew completes,   becomes False. 
            The slew may fail to start if the target coordinates are beyond limits imposed within 
            the driver component. Such limits include mechanical constraints imposed by the mount
            or attached instruments, building or dome enclosure restrictions, etc. 
            Raises an error if  is True, or if  is False. 
            
*/
public void SlewToTargetAsync(){
return null;
}


/*

            Matches the scope's local horizontal coordinates to the given local horizontal coordinates.
            

            This must be implemented if the  property is True. Raises an error if matching fails. 
            Raises an error if  is True, or if  is True.
            This is only available for telescope InterfaceVersions 2 and 3
            
*/
public void SyncToAltAz(Double,Double){
return null;
}


/*

            Matches the scope's equatorial coordinates to the given equatorial coordinates.
            

            This must be implemented if the  property is True. Raises an error if matching fails. 
            Raises an error if  AtPark is True, or if  is False. 
            The way that Sync is implemented is mount dependent and it should only be relied on to improve pointing for positions close to
            the position at which the sync is done.
            
*/
public void SyncToCoordinates(Double,Double){
return null;
}


/*

            Matches the scope's equatorial coordinates to the given equatorial coordinates.
            

            This must be implemented if the  property is True. Raises an error if matching fails. 
            Raises an error if  AtPark is True, or if  is False. 
            The way that Sync is implemented is mount dependent and it should only be relied on to improve pointing for positions close to
            the position at which the sync is done.
            
*/
public void SyncToTarget(){
return null;
}


/*

            Takes telescope out of the Parked state.
            

            The state of  after unparking is undetermined. 
            Valid only after .
            Applications must check and change Tracking as needed after unparking. 
            Raises an error if unparking fails. Calling this with  = False does nothing (harmless) 
            
*/
public void Unpark(){
return null;
}

/*
 Sets null
null
*/
public void setAlignmentMode(double _theValue){
this.AlignmentMode=_theValue;
}

/*
 Gets null
null
*/
public double getAlignmentMode(){
return AlignmentMode;
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
public void setApertureArea(double _theValue){
this.ApertureArea=_theValue;
}

/*
 Gets null
null
*/
public double getApertureArea(){
return ApertureArea;
}

/*
 Sets null
null
*/
public void setApertureDiameter(double _theValue){
this.ApertureDiameter=_theValue;
}

/*
 Gets null
null
*/
public double getApertureDiameter(){
return ApertureDiameter;
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
public void setCanPulseGuide(double _theValue){
this.CanPulseGuide=_theValue;
}

/*
 Gets null
null
*/
public double getCanPulseGuide(){
return CanPulseGuide;
}

/*
 Sets null
null
*/
public void setCanSetDeclinationRate(double _theValue){
this.CanSetDeclinationRate=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetDeclinationRate(){
return CanSetDeclinationRate;
}

/*
 Sets null
null
*/
public void setCanSetGuideRates(double _theValue){
this.CanSetGuideRates=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetGuideRates(){
return CanSetGuideRates;
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
public void setCanSetPierSide(double _theValue){
this.CanSetPierSide=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetPierSide(){
return CanSetPierSide;
}

/*
 Sets null
null
*/
public void setCanSetRightAscensionRate(double _theValue){
this.CanSetRightAscensionRate=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetRightAscensionRate(){
return CanSetRightAscensionRate;
}

/*
 Sets null
null
*/
public void setCanSetTracking(double _theValue){
this.CanSetTracking=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetTracking(){
return CanSetTracking;
}

/*
 Sets null
null
*/
public void setCanSlew(double _theValue){
this.CanSlew=_theValue;
}

/*
 Gets null
null
*/
public double getCanSlew(){
return CanSlew;
}

/*
 Sets null
null
*/
public void setCanSlewAltAz(double _theValue){
this.CanSlewAltAz=_theValue;
}

/*
 Gets null
null
*/
public double getCanSlewAltAz(){
return CanSlewAltAz;
}

/*
 Sets null
null
*/
public void setCanSlewAltAzAsync(double _theValue){
this.CanSlewAltAzAsync=_theValue;
}

/*
 Gets null
null
*/
public double getCanSlewAltAzAsync(){
return CanSlewAltAzAsync;
}

/*
 Sets null
null
*/
public void setCanSlewAsync(double _theValue){
this.CanSlewAsync=_theValue;
}

/*
 Gets null
null
*/
public double getCanSlewAsync(){
return CanSlewAsync;
}

/*
 Sets null
null
*/
public void setCanSync(double _theValue){
this.CanSync=_theValue;
}

/*
 Gets null
null
*/
public double getCanSync(){
return CanSync;
}

/*
 Sets null
null
*/
public void setCanSyncAltAz(double _theValue){
this.CanSyncAltAz=_theValue;
}

/*
 Gets null
null
*/
public double getCanSyncAltAz(){
return CanSyncAltAz;
}

/*
 Sets null
null
*/
public void setCanUnpark(double _theValue){
this.CanUnpark=_theValue;
}

/*
 Gets null
null
*/
public double getCanUnpark(){
return CanUnpark;
}

/*
 Sets null
null
*/
public void setDeclination(double _theValue){
this.Declination=_theValue;
}

/*
 Gets null
null
*/
public double getDeclination(){
return Declination;
}

/*
 Sets null
null
*/
public void setDeclinationRate(double _theValue){
this.DeclinationRate=_theValue;
}

/*
 Gets null
null
*/
public double getDeclinationRate(){
return DeclinationRate;
}

/*
 Sets null
null
*/
public void setDoesRefraction(double _theValue){
this.DoesRefraction=_theValue;
}

/*
 Gets null
null
*/
public double getDoesRefraction(){
return DoesRefraction;
}

/*
 Sets null
null
*/
public void setEquatorialSystem(double _theValue){
this.EquatorialSystem=_theValue;
}

/*
 Gets null
null
*/
public double getEquatorialSystem(){
return EquatorialSystem;
}

/*
 Sets null
null
*/
public void setFocalLength(double _theValue){
this.FocalLength=_theValue;
}

/*
 Gets null
null
*/
public double getFocalLength(){
return FocalLength;
}

/*
 Sets null
null
*/
public void setGuideRateDeclination(double _theValue){
this.GuideRateDeclination=_theValue;
}

/*
 Gets null
null
*/
public double getGuideRateDeclination(){
return GuideRateDeclination;
}

/*
 Sets null
null
*/
public void setGuideRateRightAscension(double _theValue){
this.GuideRateRightAscension=_theValue;
}

/*
 Gets null
null
*/
public double getGuideRateRightAscension(){
return GuideRateRightAscension;
}

/*
 Sets null
null
*/
public void setIsPulseGuiding(double _theValue){
this.IsPulseGuiding=_theValue;
}

/*
 Gets null
null
*/
public double getIsPulseGuiding(){
return IsPulseGuiding;
}

/*
 Sets null
null
*/
public void setRightAscension(double _theValue){
this.RightAscension=_theValue;
}

/*
 Gets null
null
*/
public double getRightAscension(){
return RightAscension;
}

/*
 Sets null
null
*/
public void setRightAscensionRate(double _theValue){
this.RightAscensionRate=_theValue;
}

/*
 Gets null
null
*/
public double getRightAscensionRate(){
return RightAscensionRate;
}

/*
 Sets null
null
*/
public void setSideOfPier(double _theValue){
this.SideOfPier=_theValue;
}

/*
 Gets null
null
*/
public double getSideOfPier(){
return SideOfPier;
}

/*
 Sets null
null
*/
public void setSiderealTime(double _theValue){
this.SiderealTime=_theValue;
}

/*
 Gets null
null
*/
public double getSiderealTime(){
return SiderealTime;
}

/*
 Sets null
null
*/
public void setSiteElevation(double _theValue){
this.SiteElevation=_theValue;
}

/*
 Gets null
null
*/
public double getSiteElevation(){
return SiteElevation;
}

/*
 Sets null
null
*/
public void setSiteLatitude(double _theValue){
this.SiteLatitude=_theValue;
}

/*
 Gets null
null
*/
public double getSiteLatitude(){
return SiteLatitude;
}

/*
 Sets null
null
*/
public void setSiteLongitude(double _theValue){
this.SiteLongitude=_theValue;
}

/*
 Gets null
null
*/
public double getSiteLongitude(){
return SiteLongitude;
}

/*
 Sets null
null
*/
public void setSlewSettleTime(double _theValue){
this.SlewSettleTime=_theValue;
}

/*
 Gets null
null
*/
public double getSlewSettleTime(){
return SlewSettleTime;
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

/*
 Sets null
null
*/
public void setTargetDeclination(double _theValue){
this.TargetDeclination=_theValue;
}

/*
 Gets null
null
*/
public double getTargetDeclination(){
return TargetDeclination;
}

/*
 Sets null
null
*/
public void setTargetRightAscension(double _theValue){
this.TargetRightAscension=_theValue;
}

/*
 Gets null
null
*/
public double getTargetRightAscension(){
return TargetRightAscension;
}

/*
 Sets null
null
*/
public void setTracking(double _theValue){
this.Tracking=_theValue;
}

/*
 Gets null
null
*/
public double getTracking(){
return Tracking;
}

/*
 Sets null
null
*/
public void setTrackingRate(double _theValue){
this.TrackingRate=_theValue;
}

/*
 Gets null
null
*/
public double getTrackingRate(){
return TrackingRate;
}

/*
 Sets null
null
*/
public void setTrackingRates(double _theValue){
this.TrackingRates=_theValue;
}

/*
 Gets null
null
*/
public double getTrackingRates(){
return TrackingRates;
}

/*
 Sets null
null
*/
public void setUTCDate(double _theValue){
this.UTCDate=_theValue;
}

/*
 Gets null
null
*/
public double getUTCDate(){
return UTCDate;
}
}
