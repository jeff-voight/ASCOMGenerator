package ASCOM.Utilities;

/*

 Provides a set of utility functions for ASCOM clients and drivers
 


*/
public class Util{

/*
null
null
*/
private double PlatformVersion;
/*
null
null
*/
private double SerialTraceFile;
/*
null
null
*/
private double SerialTrace;
/*
null
null
*/
private double TimeZoneName;
/*
null
null
*/
private double TimeZoneOffset;
/*
null
null
*/
private double UTCDate;
/*
null
null
*/
private double JulianDate;
/*
null
null
*/
private double MajorVersion;
/*
null
null
*/
private double MinorVersion;
/*
null
null
*/
private double ServicePack;
/*
null
null
*/
private double BuildNumber;


/*

 Disposes of resources used by the profile object - called by IDisposable interface
 

*/
public void Dispose(Boolean){
return null;
}


/*

 Disposes of resources used by the profile object
 

*/
public void Dispose(){
return null;
}


/*

 Pauses for a given interval in milliseconds.
 
Repeatedly puts the calling Win32 process to sleep, totally freezing it, for 10 milliseconds, 
 then pumps events so the script or program calling it will receive its normal flow of events, until the 
 pause interval elapses. If the pause interval is 20 milliseconds or less, the sleep interval is reduced 
 to 0, causing the calling Win32 process to give up control to the kernel scheduler and then immediately 
 become eligible for scheduling. 
*/
public void WaitForMilliseconds(Int32){
return null;
}


/*

 Convert sexagesimal degrees to binary double-precision degrees
 
The sexagesimal to real conversion methods such as this one are flexible enough to convert just 
 about anything that resembles sexagesimal. Thee way they operate is to first separate the input string 
 into numeric "tokens", strings consisting only of the numerals 0-9, plus and minus, and period. All other 
 characters are considered delimiters. Once the input string is parsed into tokens they are converted to 
 numerics. 
		If there are more than three numeric tokens, only the first three are considered, the remainder 
 are ignored. Left to right positionally, the tokens are assumed to represent units (degrees or hours), 
 minutes, and seconds. If only two tokens are present, they are assumed to be units and minutes, and if 
 only one token is present, it is assumed to be units. Any token can have a fractionsl part. Of course it 
 would not be normal (for example) for both the minutes and seconds parts to have fractional parts, but it 
 would be legal. So 00:30.5:30 would convert to 1.0 unit. 
		Note that plain units, for example 23.128734523 are acceptable to the method. 
	
*/
public void DMSToDegrees(String){
return null;
}


/*

 Convert sexagesimal hours to binary double-precision hours
 

		The sexagesimal to real conversion methods such as this one are flexible enough to convert just about 
 anything that resembles sexagesimal. Thee way they operate is to first separate the input string into 
 numeric "tokens", strings consisting only of the numerals 0-9, plus and minus, and period. All other 
 characters are considered delimiters. Once the input string is parsed into tokens they are converted to 
 numerics. 
		If there are more than three numeric tokens, only the first three are considered, the remainder 
 are ignored. Left to right positionally, the tokens are assumed to represent units (degrees or hours), 
 minutes, and seconds. If only two tokens are present, they are assumed to be units and minutes, and if 
 only one token is present, it is assumed to be units. Any token can have a fractionsl part. 
		Of course it would not be normal (for example) for both the minutes and seconds parts to have 
 fractional parts, but it would be legal. So 00:30.5:30 would convert to 1.0 unit. Note that plain units, 
 for example 23.128734523 are acceptable to the method. 
	
*/
public void HMSToHours(String){
return null;
}


/*

 Convert sexagesimal hours to binary double-precision hours
 

		The sexagesimal to real conversion methods such as this one are flexible enough to convert just about 
 anything that resembles sexagesimal. Thee way they operate is to first separate the input string into 
 numeric "tokens", strings consisting only of the numerals 0-9, plus and minus, and period. All other 
 characters are considered delimiters. Once the input string is parsed into tokens they are converted to 
 numerics. 
		If there are more than three numeric tokens, only the first three are considered, the remainder 
 are ignored. Left to right positionally, the tokens are assumed to represent units (degrees or hours), 
 minutes, and seconds. If only two tokens are present, they are assumed to be units and minutes, and if 
 only one token is present, it is assumed to be units. Any token can have a fractionsl part. 
		Of course it would not be normal (for example) for both the minutes and seconds parts to have 
 fractional parts, but it would be legal. So 00:30.5:30 would convert to 1.0 unit. Note that plain units, 
 for example 23.128734523 are acceptable to the method. 
	
*/
public void HMSToDegrees(String){
return null;
}


/*

 Convert degrees to sexagesimal degrees, minutes and seconds with default delimiters DD° MM' SS" 
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds with with default minute and second delimiters MM' SS" 
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds with default second delimiter SS" 
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String,String){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String,String,String){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds with specified second decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
	
*/
public void DegreesToDMS(Double,String,String,String,Int32){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with default delimiters HH:MM:SS
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with default minutes and seconds delimters MM:SS
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double,String){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with default second delimiter of null string
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double,String,String){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double,String,String,String){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with specified number of second decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
	
*/
public void HoursToHMS(Double,String,String,String,Int32){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with default delimters of HH:MM:SS
 

		If you need a leading plus sign, you must prepend it yourself.
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with the default second and minute delimiters of MM:SS
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double,String){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with the default second delimiter SS (null string)
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double,String,String){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double,String,String,String){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with the specified number of second decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
	
*/
public void DegreesToHMS(Double,String,String,String,Int32){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes with default delimiters DD° MM'
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "DegreesToDM(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDM(Double){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes with the default minutes delimeter MM'
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "DegreesToDM(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDM(Double,String){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "DegreesToDM(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDM(Double,String,String){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes with the specified number of minute decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
	
*/
public void DegreesToDM(Double,String,String,Int32){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes with default delimiters HH:MM
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHM(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with an suitable parameters to achieve this effect.
	
*/
public void HoursToHM(Double){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes with default minutes delimiter MM (null string)
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHM(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with an suitable parameters to achieve this effect.
	
*/
public void HoursToHM(Double,String){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHM(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with an suitable parameters to achieve this effect.
	
*/
public void HoursToHM(Double,String,String){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes with supplied number of minute decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
	
*/
public void HoursToHM(Double,String,String,Int32){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes with default delimiters HH:MM
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
		This overload is not available through COM, please use 
 "DegreesToHM(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHM(Double){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes with default minute delimiter MM (null string)
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
		This overload is not available through COM, please use 
 "DegreesToHM(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHM(Double,String){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
		This overload is not available through COM, please use 
 "DegreesToHM(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHM(Double,String,String){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes with supplied number of minute decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
	
*/
public void DegreesToHM(Double,String,String,Int32){
return null;
}


/*

 Tests whether the current platform version is at least equal to the supplied major and minor 
 version numbers, returns false if this is not the case
 
This function provides a simple way to test for a minimum platform level.
 If for example, your application requires at least platform version 5.5 then you can use 
 code such as this to make a test and display information as appropriate.
  Const requiredMajorVersion as Integer = 5
 Const requiredMinorVersion as Integer = 5 ' Requires Platform version 5.5
 Dim Utils as New ASCOM.Utilities.Util
 isOK = Utils.IsMinimumRequiredVersion(requiredMajorVersion, requiredMinorVersion)
 If Not isOK Then 
    ' Abort, throw exception, print an error or whatever.
    End
 EndIf
 
 
*/
public void IsMinimumRequiredVersion(Int32,Int32){
return null;
}


/*

 Convert local-time Date to Julian date
 
Julian dates are always in UTC 
*/
public void DateLocalToJulian(DateTime){
return null;
}


/*

 Convert Julian date to local-time Date
 
Julian dates are always in UTC
*/
public void DateJulianToLocal(Double){
return null;
}


/*

 Convert UTC Date to Julian date
 
Julian dates are always in UTC 
*/
public void DateUTCToJulian(DateTime){
return null;
}


/*

 Convert Julian date to UTC Date
 
Julian dates are always in UTC 
*/
public void DateJulianToUTC(Double){
return null;
}


/*

 Convert UTC Date to local-time Date
 

*/
public void DateUTCToLocal(DateTime){
return null;
}


/*

 Convert local-time Date to UTC Date
 

*/
public void DateLocalToUTC(DateTime){
return null;
}


/*

 Convert a string safearray to an ArrayList that can be used in scripting languages
 

*/
public void ToStringCollection(String[]){
return null;
}


/*

 Convert an integer safearray to an ArrayList collection that can be used in scripting languages
 

*/
public void ToIntegerCollection(Int32[]){
return null;
}


/*

 Convert from one set of speed / temperature / pressure rain rate units to another
 

		Conversions available:
		
			metres per second <==> miles per hour <==> knots
			Celsius <==> Farenheit <==> Kelvin
			hecto Pascals (hPa) <==> milli bar(mbar) <==> mm of mercury <==> inches of mercury
			mm per hour <==> inches per hour
		
		Knots conversions use the international nautical mile definition (1 nautical mile = 1852m) rather than the orginal UK or US Admiralty definitions.
		For convenience, milli bar and hecto Pascals are shown as separate units even though they have numerically identical values and there is a 1:1 conversion between them.
	
*/
public void ConvertUnits(Double,ASCOM.Utilities.Units,ASCOM.Utilities.Units){
return null;
}


/*

 Calculate the dew point (°Celsius) given the ambient temperature (°Celsius) and relative humidity (%)
 
'Calculation uses Vaisala formula for water vapour saturation pressure and is accurate to 0.083% over -20C - +50°C
 http://www.vaisala.com/Vaisala%20Documents/Application%20notes/Humidity_Conversion_Formulas_B210973EN-F.pdf 
	
*/
public void Humidity2DewPoint(Double,Double){
return null;
}


/*

 Calculate the relative humidity (%) given the ambient temperature (°Celsius) and dew point (°Celsius)
 
'Calculation uses the Vaisala formula for water vapour saturation pressure and is accurate to 0.083% over -20C - +50°C
 http://www.vaisala.com/Vaisala%20Documents/Application%20notes/Humidity_Conversion_Formulas_B210973EN-F.pdf 
	
*/
public void DewPoint2Humidity(Double,Double){
return null;
}


/*

 Convert atmospheric pressure from one altitude above mean sea level to another
 
Uses the equation: p = p0 * (1.0 - 2.25577E-05 h)^5.25588
*/
public void ConvertPressure(Double,Double,Double){
return null;
}


/*

 Convert an array of .NET built-in types to an equivalent Variant arrray (array of .NET Objects)
 
This function will primarily be of use to Scripting Language programmers who need to convert Camera and Video ImageArrays from their native types to Variant types. If this is not done, 
 the scripting language will throw a type mismatch exception when it receives, for example, Int32 element types instead of the expected Variant types.
 A VBScript Camera usage example is: Image = UTIL.ArrayToVariantArray(CAMERA.ImageArray) This example assumes that the camera and utilities objects have already been created with CreateObject statements.
		The supported .NET types are:
 
				Int16
				Int32
				UInt16
				UInt32
				UInt64
				Byte
				SByte
				Single
				Double
				Boolean
				DateTime
				String
			
		
		The function supports arrays with 1 to 5 dimensions (Rank = 1 to 5). If the supplied array already contains elements of Variant type, it is returned as-is without any processing.
*/
public void ArrayToVariantArray(Object){
return null;
}


/*

 Turns an array of type T into a variant array of Object
 
Works for 1 to 5 dimensional arrays of any Type
*/
public void ProcessArray``1(Object,Array){
return null;
}

/*
 Sets null
null
*/
public void setPlatformVersion(double _theValue){
this.PlatformVersion=_theValue;
}

/*
 Gets null
null
*/
public double getPlatformVersion(){
return PlatformVersion;
}

/*
 Sets null
null
*/
public void setSerialTraceFile(double _theValue){
this.SerialTraceFile=_theValue;
}

/*
 Gets null
null
*/
public double getSerialTraceFile(){
return SerialTraceFile;
}

/*
 Sets null
null
*/
public void setSerialTrace(double _theValue){
this.SerialTrace=_theValue;
}

/*
 Gets null
null
*/
public double getSerialTrace(){
return SerialTrace;
}

/*
 Sets null
null
*/
public void setTimeZoneName(double _theValue){
this.TimeZoneName=_theValue;
}

/*
 Gets null
null
*/
public double getTimeZoneName(){
return TimeZoneName;
}

/*
 Sets null
null
*/
public void setTimeZoneOffset(double _theValue){
this.TimeZoneOffset=_theValue;
}

/*
 Gets null
null
*/
public double getTimeZoneOffset(){
return TimeZoneOffset;
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

/*
 Sets null
null
*/
public void setJulianDate(double _theValue){
this.JulianDate=_theValue;
}

/*
 Gets null
null
*/
public double getJulianDate(){
return JulianDate;
}

/*
 Sets null
null
*/
public void setMajorVersion(double _theValue){
this.MajorVersion=_theValue;
}

/*
 Gets null
null
*/
public double getMajorVersion(){
return MajorVersion;
}

/*
 Sets null
null
*/
public void setMinorVersion(double _theValue){
this.MinorVersion=_theValue;
}

/*
 Gets null
null
*/
public double getMinorVersion(){
return MinorVersion;
}

/*
 Sets null
null
*/
public void setServicePack(double _theValue){
this.ServicePack=_theValue;
}

/*
 Gets null
null
*/
public double getServicePack(){
return ServicePack;
}

/*
 Sets null
null
*/
public void setBuildNumber(double _theValue){
this.BuildNumber=_theValue;
}

/*
 Gets null
null
*/
public double getBuildNumber(){
return BuildNumber;
}
}
