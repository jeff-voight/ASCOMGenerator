package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Serial component
 


*/
public class ISerial{

/*
null
null
*/
private double AvailableComPorts;
/*
null
null
*/
private double DataBits;
/*
null
null
*/
private double DTREnable;
/*
null
null
*/
private double Parity;
/*
null
null
*/
private double StopBits;
/*
null
null
*/
private double Handshake;
/*
null
null
*/
private double Connected;
/*
null
null
*/
private double Port;
/*
null
null
*/
private double ReceiveTimeout;
/*
null
null
*/
private double ReceiveTimeoutMs;
/*
null
null
*/
private double PortName;
/*
null
null
*/
private double Speed;
/*
null
null
*/
private double RTSEnable;


/*

 Clears the ASCOM serial port receive and transmit buffers
 

*/
public void ClearBuffers(){
return null;
}


/*

 Transmits a string through the ASCOM serial port
 

*/
public void Transmit(String){
return null;
}


/*

 Transmit an array of binary bytes through the ASCOM serial port 
 

*/
public void TransmitBinary(Byte[]){
return null;
}


/*

 Adds a message to the ASCOM serial trace file
 

		This can be called regardless of whether logging is enabled
	
*/
public void LogMessage(String,String){
return null;
}


/*

 Receive at least one text character from the ASCOM serial port
 
This method reads all of the characters currently in the serial receive buffer. It will not return 
 unless it reads at least one character. A timeout will cause a TimeoutException to be raised. Use this for 
 text data, as it returns a String. 
*/
public void Receive(){
return null;
}


/*

 Receive one binary byte from the ASCOM serial port
 
Use this for 8-bit (binary data). If a timeout occurs, a TimeoutException is raised. 
*/
public void ReceiveByte(){
return null;
}


/*

 Receive exactly the given number of characters from the ASCOM serial port and return as a string
 
If a timeout occurs a TimeoutException is raised.
*/
public void ReceiveCounted(Int32){
return null;
}


/*

 Receive exactly the given number of characters from the ASCOM serial port and return as a byte array
 

		If a timeout occurs, a TimeoutException is raised. 
		This function exists in the COM component but is not documented in the help file.
	
*/
public void ReceiveCountedBinary(Int32){
return null;
}


/*

 Receive characters from the ASCOM serial port until the given terminator string is seen
 
If a timeout occurs, a TimeoutException is raised.
*/
public void ReceiveTerminated(String){
return null;
}


/*

 Receive characters from the ASCOM serial port until the given terminator bytes are seen, return as a byte array
 

		If a timeout occurs, a TimeoutException is raised.
		This function exists in the COM component but is not documented in the help file.
	
*/
public void ReceiveTerminatedBinary(Byte[]){
return null;
}

/*
 Sets null
null
*/
public void setAvailableComPorts(double _theValue){
this.AvailableComPorts=_theValue;
}

/*
 Gets null
null
*/
public double getAvailableComPorts(){
return AvailableComPorts;
}

/*
 Sets null
null
*/
public void setDataBits(double _theValue){
this.DataBits=_theValue;
}

/*
 Gets null
null
*/
public double getDataBits(){
return DataBits;
}

/*
 Sets null
null
*/
public void setDTREnable(double _theValue){
this.DTREnable=_theValue;
}

/*
 Gets null
null
*/
public double getDTREnable(){
return DTREnable;
}

/*
 Sets null
null
*/
public void setParity(double _theValue){
this.Parity=_theValue;
}

/*
 Gets null
null
*/
public double getParity(){
return Parity;
}

/*
 Sets null
null
*/
public void setStopBits(double _theValue){
this.StopBits=_theValue;
}

/*
 Gets null
null
*/
public double getStopBits(){
return StopBits;
}

/*
 Sets null
null
*/
public void setHandshake(double _theValue){
this.Handshake=_theValue;
}

/*
 Gets null
null
*/
public double getHandshake(){
return Handshake;
}

/*
 Sets null
null
*/
public void setConnected(double _theValue){
this.Connected=_theValue;
}

/*
 Gets null
null
*/
public double getConnected(){
return Connected;
}

/*
 Sets null
null
*/
public void setPort(double _theValue){
this.Port=_theValue;
}

/*
 Gets null
null
*/
public double getPort(){
return Port;
}

/*
 Sets null
null
*/
public void setReceiveTimeout(double _theValue){
this.ReceiveTimeout=_theValue;
}

/*
 Gets null
null
*/
public double getReceiveTimeout(){
return ReceiveTimeout;
}

/*
 Sets null
null
*/
public void setReceiveTimeoutMs(double _theValue){
this.ReceiveTimeoutMs=_theValue;
}

/*
 Gets null
null
*/
public double getReceiveTimeoutMs(){
return ReceiveTimeoutMs;
}

/*
 Sets null
null
*/
public void setPortName(double _theValue){
this.PortName=_theValue;
}

/*
 Gets null
null
*/
public double getPortName(){
return PortName;
}

/*
 Sets null
null
*/
public void setSpeed(double _theValue){
this.Speed=_theValue;
}

/*
 Gets null
null
*/
public double getSpeed(){
return Speed;
}

/*
 Sets null
null
*/
public void setRTSEnable(double _theValue){
this.RTSEnable=_theValue;
}

/*
 Gets null
null
*/
public double getRTSEnable(){
return RTSEnable;
}
}
