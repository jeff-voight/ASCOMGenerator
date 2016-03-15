package ASCOM.Astrometry.NOVASCOM;

/*

                Interface to an Earth object that represents the "state" of the Earth at a given Terrestrial Julian date
            

Objects of class Earth represent the "state" of the Earth at a given Terrestrial Julian date. 
                The state includes barycentric and heliocentric position vectors for the earth, plus obliquity, 
                nutation and the equation of the equinoxes. Unless set by the client, the Earth ephemeris used is 
                computed using an internal approximation. The client may optionally attach an ephemeris object for 
                increased accuracy. 
                
                    Ephemeris Generator
                    
                    The ephemeris generator object used with NOVAS-COM must support a single 
                    method GetPositionAndVelocity(tjd). This method must take a terrestrial Julian date (like the 
                    NOVAS-COM methods) as its single parameter, and return an array of Double 
                    containing the rectangular (x/y/z) heliocentric J2000 equatorial coordinates of position (AU) and velocity 
                    (KM/sec.). In addition, it must support three read/write properties BodyType, Name, and Number, 
                    which correspond to the Type, Name, and Number properties of Novas.Planet. 
                
            
*/
public class IEarth{

/*
null
null
*/
private double BarycentricPosition;
/*
null
null
*/
private double BarycentricTime;
/*
null
null
*/
private double BarycentricVelocity;
/*
null
null
*/
private double EarthEphemeris;
/*
null
null
*/
private double EquationOfEquinoxes;
/*
null
null
*/
private double HeliocentricPosition;
/*
null
null
*/
private double HeliocentricVelocity;
/*
null
null
*/
private double MeanObliquity;
/*
null
null
*/
private double NutationInLongitude;
/*
null
null
*/
private double NutationInObliquity;
/*
null
null
*/
private double TrueObliquity;


/*

                Initialize the Earth object for given terrestrial Julian date
            

*/
public void SetForTime(Double){
return null;
}

/*
 Sets null
null
*/
public void setBarycentricPosition(double _theValue){
this.BarycentricPosition=_theValue;
}

/*
 Gets null
null
*/
public double getBarycentricPosition(){
return BarycentricPosition;
}

/*
 Sets null
null
*/
public void setBarycentricTime(double _theValue){
this.BarycentricTime=_theValue;
}

/*
 Gets null
null
*/
public double getBarycentricTime(){
return BarycentricTime;
}

/*
 Sets null
null
*/
public void setBarycentricVelocity(double _theValue){
this.BarycentricVelocity=_theValue;
}

/*
 Gets null
null
*/
public double getBarycentricVelocity(){
return BarycentricVelocity;
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
public void setEquationOfEquinoxes(double _theValue){
this.EquationOfEquinoxes=_theValue;
}

/*
 Gets null
null
*/
public double getEquationOfEquinoxes(){
return EquationOfEquinoxes;
}

/*
 Sets null
null
*/
public void setHeliocentricPosition(double _theValue){
this.HeliocentricPosition=_theValue;
}

/*
 Gets null
null
*/
public double getHeliocentricPosition(){
return HeliocentricPosition;
}

/*
 Sets null
null
*/
public void setHeliocentricVelocity(double _theValue){
this.HeliocentricVelocity=_theValue;
}

/*
 Gets null
null
*/
public double getHeliocentricVelocity(){
return HeliocentricVelocity;
}

/*
 Sets null
null
*/
public void setMeanObliquity(double _theValue){
this.MeanObliquity=_theValue;
}

/*
 Gets null
null
*/
public double getMeanObliquity(){
return MeanObliquity;
}

/*
 Sets null
null
*/
public void setNutationInLongitude(double _theValue){
this.NutationInLongitude=_theValue;
}

/*
 Gets null
null
*/
public double getNutationInLongitude(){
return NutationInLongitude;
}

/*
 Sets null
null
*/
public void setNutationInObliquity(double _theValue){
this.NutationInObliquity=_theValue;
}

/*
 Gets null
null
*/
public double getNutationInObliquity(){
return NutationInObliquity;
}

/*
 Sets null
null
*/
public void setTrueObliquity(double _theValue){
this.TrueObliquity=_theValue;
}

/*
 Gets null
null
*/
public double getTrueObliquity(){
return TrueObliquity;
}
}
