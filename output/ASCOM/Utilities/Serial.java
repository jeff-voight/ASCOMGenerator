package ASCOM.Utilities;

/*

 Creates a .NET serial port and provides a simple set of commands to use it.
 

This object provides an easy to use interface to a serial (COM) port. 
 It provides ASCII and binary I/O with controllable timeout.
 The interface is callable from any .NET client.
 The platform allows you to control use of the DTR and RTS/CTS lines for a particular 
 COM port and to remove or force listing of individual COM ports in the AvailableComPorts 
 list through configuration in the ASCOM Profile.
 Please see the Tools and Features section of this help file for further details.
	
*/
public class Serial{

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
private double RTSEnable;
/*
null
null
*/
private double Handshake;
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
private double Speed;
/*
null
null
*/
private double PortName;
/*
null
null
*/
private double AvailableCOMPorts;


/*

 Disposes of resources used by the profile object
 

*/
public void Dispose(){
return null;
}


/*

 Disposes of resources used by the profile object - called by IDisposable interface
 

*/
public void Dispose(Boolean){
return null;
}


/*

 Clears the ASCOM serial port receive and transmit buffers
 

*/
public void ClearBuffers(){
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

 Translates a supplied string into hex characters
 

*/
public void MakeHex(String){
return null;
}


/*

 OS level blocking wait for an event 
 

*/
public void WaitForSingleObject(IntPtr,UInt32){
return null;
}


/*

 Sleep the calling thread until the worker thread has completed
 

*/
public void WaitForThread(ASCOM.Utilities.Serial.ThreadData){
return null;
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
public void setAvailableCOMPorts(double _theValue){
this.AvailableCOMPorts=_theValue;
}

/*
 Gets null
null
*/
public double getAvailableCOMPorts(){
return AvailableCOMPorts;
}
}
