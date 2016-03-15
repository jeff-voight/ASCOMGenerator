package ASCOM.DriverAccess;

/*

            Implements a camera class to access any registered ASCOM Camera
            


*/
public class Camera{

/*
null
null
*/
private double BinX;
/*
null
null
*/
private double BinY;
/*
null
null
*/
private double CCDTemperature;
/*
null
null
*/
private double CameraState;
/*
null
null
*/
private double CameraXSize;
/*
null
null
*/
private double CameraYSize;
/*
null
null
*/
private double CanAbortExposure;
/*
null
null
*/
private double CanAsymmetricBin;
/*
null
null
*/
private double CanGetCoolerPower;
/*
null
null
*/
private double CanPulseGuide;
/*
null
null
*/
private double CanSetCCDTemperature;
/*
null
null
*/
private double CanStopExposure;
/*
null
null
*/
private double CoolerOn;
/*
null
null
*/
private double CoolerPower;
/*
null
null
*/
private double ElectronsPerADU;
/*
null
null
*/
private double FullWellCapacity;
/*
null
null
*/
private double HasShutter;
/*
null
null
*/
private double HeatSinkTemperature;
/*
null
null
*/
private double ImageArray;
/*
null
null
*/
private double ImageArrayVariant;
/*
null
null
*/
private double ImageReady;
/*
null
null
*/
private double IsPulseGuiding;
/*
null
null
*/
private double LastExposureDuration;
/*
null
null
*/
private double LastExposureStartTime;
/*
null
null
*/
private double MaxADU;
/*
null
null
*/
private double MaxBinX;
/*
null
null
*/
private double MaxBinY;
/*
null
null
*/
private double NumX;
/*
null
null
*/
private double NumY;
/*
null
null
*/
private double PixelSizeX;
/*
null
null
*/
private double PixelSizeY;
/*
null
null
*/
private double SetCCDTemperature;
/*
null
null
*/
private double StartX;
/*
null
null
*/
private double StartY;
/*
null
null
*/
private double BayerOffsetX;
/*
null
null
*/
private double BayerOffsetY;
/*
null
null
*/
private double CanFastReadout;
/*
null
null
*/
private double ExposureMax;
/*
null
null
*/
private double ExposureMin;
/*
null
null
*/
private double ExposureResolution;
/*
null
null
*/
private double FastReadout;
/*
null
null
*/
private double Gain;
/*
null
null
*/
private double GainMax;
/*
null
null
*/
private double GainMin;
/*
null
null
*/
private double Gains;
/*
null
null
*/
private double PercentCompleted;
/*
null
null
*/
private double ReadoutMode;
/*
null
null
*/
private double ReadoutModes;
/*
null
null
*/
private double SensorName;
/*
null
null
*/
private double SensorType;


/*

            Creates an instance of the camera class.
            

*/
public void Camera(String){
return null;
}


/*

            The Choose() method returns the DriverID of the selected driver.
            Choose() allows you to optionally pass the DriverID of a "current" driver,
            and the corresponding camera type is pre-selected in the Chooser///s list.
            In this case, the OK button starts out enabled (lit-up); the assumption is that the pre-selected driver has already been configured.
            

*/
public void Choose(String){
return null;
}


/*

            Aborts the current exposure, if any, and returns the camera to Idle state.
            

            NOTES:
            
            Must throw exception if camera is not idle and abort is unsuccessful (or not possible, e.g. during download).
            Must throw exception if hardware or communications error occurs.
            Must NOT throw an exception if the camera is already idle.
            
            
*/
public void AbortExposure(){
return null;
}


/*

            Activates the Camera's mount control sytem to instruct the mount to move in a particular direction for a given period of time
            

            This method returns only after the move has completed.
            
            The (symbolic) values for GuideDirections are:
            
            Constant     Value      Description
            guideNorth     0        North (+ declination/elevation)
            guideSouth     1        South (- declination/elevation)
            guideEast      2        East (+ right ascension/azimuth)
            guideWest      3        West (+ right ascension/azimuth)
            
            
            Note: directions are nominal and may depend on exact mount wiring.  
             must be opposite , and 
             must be opposite .
            
*/
public void PulseGuide(ASCOM.DeviceInterface.GuideDirections,Int32){
return null;
}


/*

            Starts an exposure. Use  to check when the exposure is complete.
            

            A dark frame or bias exposure may be shorter than the V2  value and for a bias frame can be zero.
            Check the value of Light and allow exposures down to 0 seconds 
            if Light is False.  If the hardware will not
            support an exposure duration of zero then, for dark and bias frames, set it to the minimum that is possible.
            Some applications will set an exposure time of zero for bias frames so it's important that the driver allows this.
            
*/
public void StartExposure(Double,Boolean){
return null;
}


/*

            Stops the current exposure, if any.
            

            If an exposure is in progress, the readout process is initiated.  Ignored if readout is already in process.
            
*/
public void StopExposure(){
return null;
}

/*
 Sets null
null
*/
public void setBinX(double _theValue){
this.BinX=_theValue;
}

/*
 Gets null
null
*/
public double getBinX(){
return BinX;
}

/*
 Sets null
null
*/
public void setBinY(double _theValue){
this.BinY=_theValue;
}

/*
 Gets null
null
*/
public double getBinY(){
return BinY;
}

/*
 Sets null
null
*/
public void setCCDTemperature(double _theValue){
this.CCDTemperature=_theValue;
}

/*
 Gets null
null
*/
public double getCCDTemperature(){
return CCDTemperature;
}

/*
 Sets null
null
*/
public void setCameraState(double _theValue){
this.CameraState=_theValue;
}

/*
 Gets null
null
*/
public double getCameraState(){
return CameraState;
}

/*
 Sets null
null
*/
public void setCameraXSize(double _theValue){
this.CameraXSize=_theValue;
}

/*
 Gets null
null
*/
public double getCameraXSize(){
return CameraXSize;
}

/*
 Sets null
null
*/
public void setCameraYSize(double _theValue){
this.CameraYSize=_theValue;
}

/*
 Gets null
null
*/
public double getCameraYSize(){
return CameraYSize;
}

/*
 Sets null
null
*/
public void setCanAbortExposure(double _theValue){
this.CanAbortExposure=_theValue;
}

/*
 Gets null
null
*/
public double getCanAbortExposure(){
return CanAbortExposure;
}

/*
 Sets null
null
*/
public void setCanAsymmetricBin(double _theValue){
this.CanAsymmetricBin=_theValue;
}

/*
 Gets null
null
*/
public double getCanAsymmetricBin(){
return CanAsymmetricBin;
}

/*
 Sets null
null
*/
public void setCanGetCoolerPower(double _theValue){
this.CanGetCoolerPower=_theValue;
}

/*
 Gets null
null
*/
public double getCanGetCoolerPower(){
return CanGetCoolerPower;
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
public void setCanSetCCDTemperature(double _theValue){
this.CanSetCCDTemperature=_theValue;
}

/*
 Gets null
null
*/
public double getCanSetCCDTemperature(){
return CanSetCCDTemperature;
}

/*
 Sets null
null
*/
public void setCanStopExposure(double _theValue){
this.CanStopExposure=_theValue;
}

/*
 Gets null
null
*/
public double getCanStopExposure(){
return CanStopExposure;
}

/*
 Sets null
null
*/
public void setCoolerOn(double _theValue){
this.CoolerOn=_theValue;
}

/*
 Gets null
null
*/
public double getCoolerOn(){
return CoolerOn;
}

/*
 Sets null
null
*/
public void setCoolerPower(double _theValue){
this.CoolerPower=_theValue;
}

/*
 Gets null
null
*/
public double getCoolerPower(){
return CoolerPower;
}

/*
 Sets null
null
*/
public void setElectronsPerADU(double _theValue){
this.ElectronsPerADU=_theValue;
}

/*
 Gets null
null
*/
public double getElectronsPerADU(){
return ElectronsPerADU;
}

/*
 Sets null
null
*/
public void setFullWellCapacity(double _theValue){
this.FullWellCapacity=_theValue;
}

/*
 Gets null
null
*/
public double getFullWellCapacity(){
return FullWellCapacity;
}

/*
 Sets null
null
*/
public void setHasShutter(double _theValue){
this.HasShutter=_theValue;
}

/*
 Gets null
null
*/
public double getHasShutter(){
return HasShutter;
}

/*
 Sets null
null
*/
public void setHeatSinkTemperature(double _theValue){
this.HeatSinkTemperature=_theValue;
}

/*
 Gets null
null
*/
public double getHeatSinkTemperature(){
return HeatSinkTemperature;
}

/*
 Sets null
null
*/
public void setImageArray(double _theValue){
this.ImageArray=_theValue;
}

/*
 Gets null
null
*/
public double getImageArray(){
return ImageArray;
}

/*
 Sets null
null
*/
public void setImageArrayVariant(double _theValue){
this.ImageArrayVariant=_theValue;
}

/*
 Gets null
null
*/
public double getImageArrayVariant(){
return ImageArrayVariant;
}

/*
 Sets null
null
*/
public void setImageReady(double _theValue){
this.ImageReady=_theValue;
}

/*
 Gets null
null
*/
public double getImageReady(){
return ImageReady;
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
public void setLastExposureDuration(double _theValue){
this.LastExposureDuration=_theValue;
}

/*
 Gets null
null
*/
public double getLastExposureDuration(){
return LastExposureDuration;
}

/*
 Sets null
null
*/
public void setLastExposureStartTime(double _theValue){
this.LastExposureStartTime=_theValue;
}

/*
 Gets null
null
*/
public double getLastExposureStartTime(){
return LastExposureStartTime;
}

/*
 Sets null
null
*/
public void setMaxADU(double _theValue){
this.MaxADU=_theValue;
}

/*
 Gets null
null
*/
public double getMaxADU(){
return MaxADU;
}

/*
 Sets null
null
*/
public void setMaxBinX(double _theValue){
this.MaxBinX=_theValue;
}

/*
 Gets null
null
*/
public double getMaxBinX(){
return MaxBinX;
}

/*
 Sets null
null
*/
public void setMaxBinY(double _theValue){
this.MaxBinY=_theValue;
}

/*
 Gets null
null
*/
public double getMaxBinY(){
return MaxBinY;
}

/*
 Sets null
null
*/
public void setNumX(double _theValue){
this.NumX=_theValue;
}

/*
 Gets null
null
*/
public double getNumX(){
return NumX;
}

/*
 Sets null
null
*/
public void setNumY(double _theValue){
this.NumY=_theValue;
}

/*
 Gets null
null
*/
public double getNumY(){
return NumY;
}

/*
 Sets null
null
*/
public void setPixelSizeX(double _theValue){
this.PixelSizeX=_theValue;
}

/*
 Gets null
null
*/
public double getPixelSizeX(){
return PixelSizeX;
}

/*
 Sets null
null
*/
public void setPixelSizeY(double _theValue){
this.PixelSizeY=_theValue;
}

/*
 Gets null
null
*/
public double getPixelSizeY(){
return PixelSizeY;
}

/*
 Sets null
null
*/
public void setSetCCDTemperature(double _theValue){
this.SetCCDTemperature=_theValue;
}

/*
 Gets null
null
*/
public double getSetCCDTemperature(){
return SetCCDTemperature;
}

/*
 Sets null
null
*/
public void setStartX(double _theValue){
this.StartX=_theValue;
}

/*
 Gets null
null
*/
public double getStartX(){
return StartX;
}

/*
 Sets null
null
*/
public void setStartY(double _theValue){
this.StartY=_theValue;
}

/*
 Gets null
null
*/
public double getStartY(){
return StartY;
}

/*
 Sets null
null
*/
public void setBayerOffsetX(double _theValue){
this.BayerOffsetX=_theValue;
}

/*
 Gets null
null
*/
public double getBayerOffsetX(){
return BayerOffsetX;
}

/*
 Sets null
null
*/
public void setBayerOffsetY(double _theValue){
this.BayerOffsetY=_theValue;
}

/*
 Gets null
null
*/
public double getBayerOffsetY(){
return BayerOffsetY;
}

/*
 Sets null
null
*/
public void setCanFastReadout(double _theValue){
this.CanFastReadout=_theValue;
}

/*
 Gets null
null
*/
public double getCanFastReadout(){
return CanFastReadout;
}

/*
 Sets null
null
*/
public void setExposureMax(double _theValue){
this.ExposureMax=_theValue;
}

/*
 Gets null
null
*/
public double getExposureMax(){
return ExposureMax;
}

/*
 Sets null
null
*/
public void setExposureMin(double _theValue){
this.ExposureMin=_theValue;
}

/*
 Gets null
null
*/
public double getExposureMin(){
return ExposureMin;
}

/*
 Sets null
null
*/
public void setExposureResolution(double _theValue){
this.ExposureResolution=_theValue;
}

/*
 Gets null
null
*/
public double getExposureResolution(){
return ExposureResolution;
}

/*
 Sets null
null
*/
public void setFastReadout(double _theValue){
this.FastReadout=_theValue;
}

/*
 Gets null
null
*/
public double getFastReadout(){
return FastReadout;
}

/*
 Sets null
null
*/
public void setGain(double _theValue){
this.Gain=_theValue;
}

/*
 Gets null
null
*/
public double getGain(){
return Gain;
}

/*
 Sets null
null
*/
public void setGainMax(double _theValue){
this.GainMax=_theValue;
}

/*
 Gets null
null
*/
public double getGainMax(){
return GainMax;
}

/*
 Sets null
null
*/
public void setGainMin(double _theValue){
this.GainMin=_theValue;
}

/*
 Gets null
null
*/
public double getGainMin(){
return GainMin;
}

/*
 Sets null
null
*/
public void setGains(double _theValue){
this.Gains=_theValue;
}

/*
 Gets null
null
*/
public double getGains(){
return Gains;
}

/*
 Sets null
null
*/
public void setPercentCompleted(double _theValue){
this.PercentCompleted=_theValue;
}

/*
 Gets null
null
*/
public double getPercentCompleted(){
return PercentCompleted;
}

/*
 Sets null
null
*/
public void setReadoutMode(double _theValue){
this.ReadoutMode=_theValue;
}

/*
 Gets null
null
*/
public double getReadoutMode(){
return ReadoutMode;
}

/*
 Sets null
null
*/
public void setReadoutModes(double _theValue){
this.ReadoutModes=_theValue;
}

/*
 Gets null
null
*/
public double getReadoutModes(){
return ReadoutModes;
}

/*
 Sets null
null
*/
public void setSensorName(double _theValue){
this.SensorName=_theValue;
}

/*
 Gets null
null
*/
public double getSensorName(){
return SensorName;
}

/*
 Sets null
null
*/
public void setSensorType(double _theValue){
this.SensorType=_theValue;
}

/*
 Gets null
null
*/
public double getSensorType(){
return SensorType;
}
}
