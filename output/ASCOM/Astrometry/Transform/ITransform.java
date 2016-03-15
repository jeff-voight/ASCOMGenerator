package ASCOM.Astrometry.Transform;

/*

                Interface to the coordinate transform component; J2000 - apparent - local topocentric
            

Use this component to transform between J2000, apparent and local topocentric (JNow) coordinates or 
                vice versa. To use the component, instantiate it, then use one of SetJ2000 or SetJNow or SetApparent to 
                initialise with known values. Now use the RAJ2000, DECJ200, RAJNow, DECJNow, RAApparent and DECApparent 
                properties to read off the required transformed values.
                The component can be reused simply by setting new co-ordinates with a Set command, there
                    is no need to create a new component each time a transform is required.
                Transforms are effected through the ASCOM NOVAS-COM engine that encapsulates the USNO NOVAS2 library. 
                    The USNO NOVAS reference web page is: 
                    http://www.usno.navy.mil/USNO/astronomical-applications/software-products/novas/novas-fortran/novas-fortran 
                
            
*/
public class ITransform{

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
private double SiteElevation;
/*
null
null
*/
private double SiteTemperature;
/*
null
null
*/
private double Refraction;
/*
null
null
*/
private double RAJ2000;
/*
null
null
*/
private double DECJ2000;
/*
null
null
*/
private double RATopocentric;
/*
null
null
*/
private double DECTopocentric;
/*
null
null
*/
private double RAApparent;
/*
null
null
*/
private double DECApparent;
/*
null
null
*/
private double AzimuthTopocentric;
/*
null
null
*/
private double ElevationTopocentric;
/*
null
null
*/
private double JulianDateTT;
/*
null
null
*/
private double JulianDateUTC;


/*

                Causes the transform component to recalculate values derrived from the last Set command
            
Use this when you have set J2000 co-ordinates and wish to ensure that the mount points to the same 
                co-ordinates allowing for local effects that change with time such as refraction.
*/
public void Refresh(){
return null;
}


/*

                Sets the known J2000 Right Ascension and Declination coordinates that are to be transformed
            

*/
public void SetJ2000(Double,Double){
return null;
}


/*

                Sets the known apparent Right Ascension and Declination coordinates that are to be transformed
            

*/
public void SetApparent(Double,Double){
return null;
}


/*

                Sets the known local topocentric Right Ascension and Declination coordinates that are to be transformed
            

*/
public void SetTopocentric(Double,Double){
return null;
}


/*

                Sets known Altitude and Azimuth values which are to be transformed
            

*/
public void SetAzimuthElevation(Double,Double){
return null;
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
public void setSiteTemperature(double _theValue){
this.SiteTemperature=_theValue;
}

/*
 Gets null
null
*/
public double getSiteTemperature(){
return SiteTemperature;
}

/*
 Sets null
null
*/
public void setRefraction(double _theValue){
this.Refraction=_theValue;
}

/*
 Gets null
null
*/
public double getRefraction(){
return Refraction;
}

/*
 Sets null
null
*/
public void setRAJ2000(double _theValue){
this.RAJ2000=_theValue;
}

/*
 Gets null
null
*/
public double getRAJ2000(){
return RAJ2000;
}

/*
 Sets null
null
*/
public void setDECJ2000(double _theValue){
this.DECJ2000=_theValue;
}

/*
 Gets null
null
*/
public double getDECJ2000(){
return DECJ2000;
}

/*
 Sets null
null
*/
public void setRATopocentric(double _theValue){
this.RATopocentric=_theValue;
}

/*
 Gets null
null
*/
public double getRATopocentric(){
return RATopocentric;
}

/*
 Sets null
null
*/
public void setDECTopocentric(double _theValue){
this.DECTopocentric=_theValue;
}

/*
 Gets null
null
*/
public double getDECTopocentric(){
return DECTopocentric;
}

/*
 Sets null
null
*/
public void setRAApparent(double _theValue){
this.RAApparent=_theValue;
}

/*
 Gets null
null
*/
public double getRAApparent(){
return RAApparent;
}

/*
 Sets null
null
*/
public void setDECApparent(double _theValue){
this.DECApparent=_theValue;
}

/*
 Gets null
null
*/
public double getDECApparent(){
return DECApparent;
}

/*
 Sets null
null
*/
public void setAzimuthTopocentric(double _theValue){
this.AzimuthTopocentric=_theValue;
}

/*
 Gets null
null
*/
public double getAzimuthTopocentric(){
return AzimuthTopocentric;
}

/*
 Sets null
null
*/
public void setElevationTopocentric(double _theValue){
this.ElevationTopocentric=_theValue;
}

/*
 Gets null
null
*/
public double getElevationTopocentric(){
return ElevationTopocentric;
}

/*
 Sets null
null
*/
public void setJulianDateTT(double _theValue){
this.JulianDateTT=_theValue;
}

/*
 Gets null
null
*/
public double getJulianDateTT(){
return JulianDateTT;
}

/*
 Sets null
null
*/
public void setJulianDateUTC(double _theValue){
this.JulianDateUTC=_theValue;
}

/*
 Gets null
null
*/
public double getJulianDateUTC(){
return JulianDateUTC;
}
}
