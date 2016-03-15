package ASCOM.Utilities.Interfaces;

/*

 Interface to the TraceLogger component
 


*/
public class ITraceLogger{

/*
null
null
*/
private double Enabled;
/*
null
null
*/
private double LogFileName;


/*

 Writes the time and identifier to the log, leaving the line ready for further content through LogContinue and LogFinish
 
Use this to start a log line where you want to write further information on the line at a later time.
		E.g. You might want to use this to record that an action has started and then append the word OK if all went well.
  You would then end up with just one line to record the whole transaction even though you didn't know that it would be 
 successful when you started. If you just used LogMsg you would have ended up with two log lines, one showing 
 the start of the transaction and the next the outcome.
		Will create a LOGISSUE message in the log if called before a line started by LogStart has been closed with LogFinish. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogStart(String,String){
return null;
}


/*

 Appends further message to a line started by LogStart, appends a hex translation of the message to the line, does not terminate the line.
 

		This can be called multiple times to build up a complex log line if required.
		Will create a LOGISSUE message in the log if called before a line has been started with LogStart. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogContinue(String,Boolean){
return null;
}


/*

 Closes a line started by LogStart with option to append a translation of the supplied message into HEX
 

*/
public void LogFinish(String,Boolean){
return null;
}


/*

 Closes a line started by LogStart with the supplied message and a hex translation of the message
 

		Will create a LOGISSUE message in the log if called before a line has been started with LogStart.  
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogMessage(String,String,Boolean){
return null;
}


/*

 Logs an issue, closing any open line and opening a continuation line if necessary after the 
 issue message.
 
Use this for reporting issues that you don't want to appear on a line already opened 
 with StartLine
*/
public void LogIssue(String,String){
return null;
}


/*

 Sets the log filename and type if the constructor is called without parameters
 
The LogFileType is used in the file name to allow you to quickly identify which of several logs contains the 
 information of interest.
 Note This command is only required if the tracelogger constructor is called with no
 parameters. It is provided for use in COM clients that can not call constructors with parameters.
 If you are writing a COM client then create the trace logger as:
		
 TL = New TraceLogger()
 TL.SetLogFile("","TraceName")
 
		If you are writing a .NET client then you can achieve the same end in one call:
		
 TL = New TraceLogger("",TraceName")
 
	
*/
public void SetLogFile(String,String){
return null;
}


/*

 Insert a blank line into the log file
 

*/
public void BlankLine(){
return null;
}


/*

 Displays a message respecting carriage return and linefeed characters
 

		Will create a LOGISSUE message in the log if called before a line has been started with LogStart.  
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogMessageCrLf(String,String){
return null;
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
public void setLogFileName(double _theValue){
this.LogFileName=_theValue;
}

/*
 Gets null
null
*/
public double getLogFileName(){
return LogFileName;
}
}
