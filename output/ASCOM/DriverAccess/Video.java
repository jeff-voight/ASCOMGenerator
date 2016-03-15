package ASCOM.DriverAccess;

/*

            Provides universal access to Video drivers
            


*/
public class Video{

/*
null
null
*/
private double VideoCaptureDeviceName;
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
private double FrameRate;
/*
null
null
*/
private double SupportedIntegrationRates;
/*
null
null
*/
private double IntegrationRate;
/*
null
null
*/
private double LastVideoFrame;
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
null
null
*/
private double Width;
/*
null
null
*/
private double Height;
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
private double BitDepth;
/*
null
null
*/
private double VideoCodec;
/*
null
null
*/
private double VideoFileFormat;
/*
null
null
*/
private double VideoFramesBufferSize;
/*
null
null
*/
private double CameraState;
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
private double Gain;
/*
null
null
*/
private double Gains;
/*
null
null
*/
private double GammaMax;
/*
null
null
*/
private double GammaMin;
/*
null
null
*/
private double Gamma;
/*
null
null
*/
private double Gammas;
/*
null
null
*/
private double CanConfigureDeviceProperties;


/*

            Creates a Video object with the given Prog ID
            

*/
public void Video(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a Video device
            

*/
public void Choose(String){
return null;
}


/*

            Starts recording a new video file.
            

*/
public void StartRecordingVideoFile(String){
return null;
}


/*

            Stops the recording of a video file.
            

*/
public void StopRecordingVideoFile(){
return null;
}


/*

            Displays a device properties configuration dialog that allows the configuration of specialized settings.
            

            The dialog could also provide buttons for cameras that can be controlled via 'on screen display' menues and a set of navigation buttons such as Up, Down, Left, Right and Enter. 
            This dialog is not intended to be used in unattended mode but can give greater control over video cameras that provide special features. The dialog may also allow 
            changing standard  interface settings such as Gamma and Gain. If a client software 
            displays any  interface settings then it should take care to keep in sync the values changed by this method and those changed directly via the interface.
            To support automated and unattended control over the specialized device settings or functions available on this dialog the driver should also allow their control via . 
            This dialog is meant to be used by the applications to allow the user to adjust specialized device settings when those applications don't specifically use the specialized settings in their functionality.
            Examples for specialized settings that could be supported are white balance and sharpness.
            
*/
public void ConfigureDeviceProperties(){
return null;
}

/*
 Sets null
null
*/
public void setVideoCaptureDeviceName(double _theValue){
this.VideoCaptureDeviceName=_theValue;
}

/*
 Gets null
null
*/
public double getVideoCaptureDeviceName(){
return VideoCaptureDeviceName;
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
public void setFrameRate(double _theValue){
this.FrameRate=_theValue;
}

/*
 Gets null
null
*/
public double getFrameRate(){
return FrameRate;
}

/*
 Sets null
null
*/
public void setSupportedIntegrationRates(double _theValue){
this.SupportedIntegrationRates=_theValue;
}

/*
 Gets null
null
*/
public double getSupportedIntegrationRates(){
return SupportedIntegrationRates;
}

/*
 Sets null
null
*/
public void setIntegrationRate(double _theValue){
this.IntegrationRate=_theValue;
}

/*
 Gets null
null
*/
public double getIntegrationRate(){
return IntegrationRate;
}

/*
 Sets null
null
*/
public void setLastVideoFrame(double _theValue){
this.LastVideoFrame=_theValue;
}

/*
 Gets null
null
*/
public double getLastVideoFrame(){
return LastVideoFrame;
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

/*
 Sets null
null
*/
public void setWidth(double _theValue){
this.Width=_theValue;
}

/*
 Gets null
null
*/
public double getWidth(){
return Width;
}

/*
 Sets null
null
*/
public void setHeight(double _theValue){
this.Height=_theValue;
}

/*
 Gets null
null
*/
public double getHeight(){
return Height;
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
public void setBitDepth(double _theValue){
this.BitDepth=_theValue;
}

/*
 Gets null
null
*/
public double getBitDepth(){
return BitDepth;
}

/*
 Sets null
null
*/
public void setVideoCodec(double _theValue){
this.VideoCodec=_theValue;
}

/*
 Gets null
null
*/
public double getVideoCodec(){
return VideoCodec;
}

/*
 Sets null
null
*/
public void setVideoFileFormat(double _theValue){
this.VideoFileFormat=_theValue;
}

/*
 Gets null
null
*/
public double getVideoFileFormat(){
return VideoFileFormat;
}

/*
 Sets null
null
*/
public void setVideoFramesBufferSize(double _theValue){
this.VideoFramesBufferSize=_theValue;
}

/*
 Gets null
null
*/
public double getVideoFramesBufferSize(){
return VideoFramesBufferSize;
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
public void setGammaMax(double _theValue){
this.GammaMax=_theValue;
}

/*
 Gets null
null
*/
public double getGammaMax(){
return GammaMax;
}

/*
 Sets null
null
*/
public void setGammaMin(double _theValue){
this.GammaMin=_theValue;
}

/*
 Gets null
null
*/
public double getGammaMin(){
return GammaMin;
}

/*
 Sets null
null
*/
public void setGamma(double _theValue){
this.Gamma=_theValue;
}

/*
 Gets null
null
*/
public double getGamma(){
return Gamma;
}

/*
 Sets null
null
*/
public void setGammas(double _theValue){
this.Gammas=_theValue;
}

/*
 Gets null
null
*/
public double getGammas(){
return Gammas;
}

/*
 Sets null
null
*/
public void setCanConfigureDeviceProperties(double _theValue){
this.CanConfigureDeviceProperties=_theValue;
}

/*
 Gets null
null
*/
public double getCanConfigureDeviceProperties(){
return CanConfigureDeviceProperties;
}
}
