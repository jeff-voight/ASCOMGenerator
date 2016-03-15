package ASCOM.Astrometry.NOVASCOM;

/*

                NOVAS-COM: Star Class
            

NOVAS-COM objects of class Star contain the specifications for a star's catalog position in either FK5 or Hipparcos units (both must be J2000). Properties are right ascension and declination, proper motions, parallax, radial velocity, catalog type (FK5 or HIP), catalog number, optional ephemeris engine to use for barycenter calculations, and an optional value for delta-T. Unless you specifically set the DeltaT property, calculations performed by this class which require the value of delta-T (TT - UT1) rely on an internal function to estimate delta-T. 
                The high-level NOVAS astrometric functions are implemented as methods of Star: 
                    GetTopocentricPosition(), GetLocalPosition(), GetApparentPosition(), GetVirtualPosition(), 
                    and GetAstrometricPosition(). These methods operate on the properties of the Star, and produce 
                    a PositionVector object. For example, to get the topocentric coordinates of a star, simply create 
                    and initialize a Star, then call Star.GetTopocentricPosition(). The resulting vaPositionVector's 
                    right ascension and declination properties are the topocentric equatorial coordinates, at the same 
                    time, the (optionally refracted) alt-az coordinates are calculated, and are also contained within 
                    the returned PositionVector. Note that Alt/Az is available in PositionVectors returned from calling 
                        GetTopocentricPosition().
                
            
*/
public class Star{

/*
null
null
*/
private double Catalog;
/*
null
null
*/
private double Declination;
/*
null
null
*/
private double DeltaT;
/*
null
null
*/
private double EarthEphemeris;
/*
null
null
*/
private double Name;
/*
null
null
*/
private double Number;
/*
null
null
*/
private double Parallax;
/*
null
null
*/
private double ProperMotionDec;
/*
null
null
*/
private double ProperMotionRA;
/*
null
null
*/
private double RadialVelocity;
/*
null
null
*/
private double RightAscension;


/*

                Initialise a new instance of the star class
            

*/
public void Star(){
return null;
}


/*

                Get an apparent position for a given time
            

*/
public void GetApparentPosition(Double){
return null;
}


/*

                Get an astrometric position for a given time
            

*/
public void GetAstrometricPosition(Double){
return null;
}


/*

                Get a local position for a given site and time
            

*/
public void GetLocalPosition(Double,ASCOM.Astrometry.NOVASCOM.Site){
return null;
}


/*

                Get a topocentric position for a given site and time
            

*/
public void GetTopocentricPosition(Double,ASCOM.Astrometry.NOVASCOM.Site,Boolean){
return null;
}


/*

                Get a virtual position at a given time
            

*/
public void GetVirtualPosition(Double){
return null;
}


/*

                Initialize all star properties with one call
            
Assumes positions are FK5. If Parallax is set to zero, NOVAS-COM assumes the object 
                is on the "celestial sphere", which has a distance of 10 megaparsecs. 
*/
public void Set(Double,Double,Double,Double,Double,Double){
return null;
}


/*

                Initialise all star properties in one call using Hipparcos data. Transforms to FK5 standard used by NOVAS.
            
Assumes positions are Hipparcos standard and transforms to FK5 standard used by NOVAS. 
                If Parallax is set to zero, NOVAS-COM assumes the object is on the "celestial sphere", 
                    which has a distance of 10 megaparsecs.
            
*/
public void SetHipparcos(Double,Double,Double,Double,Double,Double){
return null;
}

/*
 Sets null
null
*/
public void setCatalog(double _theValue){
this.Catalog=_theValue;
}

/*
 Gets null
null
*/
public double getCatalog(){
return Catalog;
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
public void setDeltaT(double _theValue){
this.DeltaT=_theValue;
}

/*
 Gets null
null
*/
public double getDeltaT(){
return DeltaT;
}

/*
 Sets null
null
*/
public void setEarthEphemeris(double _theValue){
this.EarthEphemeris=_theValue;
}

/*
 Gets null
null
*/
public double getEarthEphemeris(){
return EarthEphemeris;
}

/*
 Sets null
null
*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets null
null
*/
public double getName(){
return Name;
}

/*
 Sets null
null
*/
public void setNumber(double _theValue){
this.Number=_theValue;
}

/*
 Gets null
null
*/
public double getNumber(){
return Number;
}

/*
 Sets null
null
*/
public void setParallax(double _theValue){
this.Parallax=_theValue;
}

/*
 Gets null
null
*/
public double getParallax(){
return Parallax;
}

/*
 Sets null
null
*/
public void setProperMotionDec(double _theValue){
this.ProperMotionDec=_theValue;
}

/*
 Gets null
null
*/
public double getProperMotionDec(){
return ProperMotionDec;
}

/*
 Sets null
null
*/
public void setProperMotionRA(double _theValue){
this.ProperMotionRA=_theValue;
}

/*
 Gets null
null
*/
public double getProperMotionRA(){
return ProperMotionRA;
}

/*
 Sets null
null
*/
public void setRadialVelocity(double _theValue){
this.RadialVelocity=_theValue;
}

/*
 Gets null
null
*/
public double getRadialVelocity(){
return RadialVelocity;
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
}
