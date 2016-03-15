package ASCOM.Astrometry.NOVASCOM;

/*

                NOVAS-COM: Provide characteristics of a solar system body
            

NOVAS-COM objects of class Planet hold the characteristics of a solar system body. Properties are 
                type (major or minor planet), number (for major and numbered minor planets), name (for unnumbered 
                minor planets and comets), the ephemeris object to be used for orbital calculations, an optional 
                ephemeris object to use for barycenter calculations, and an optional value for delta-T. 
                The number values for major planets are 1 to 9 for Mercury to Pluto, 10 for Sun and 11 for Moon. The last two obviously 
                    aren't planets, but this numbering is a NOVAS convention that enables us to retrieve useful information about these bodies.
                
                The high-level NOVAS astrometric functions are implemented as methods of Planet: 
                    GetTopocentricPosition(), GetLocalPosition(), GetApparentPosition(), GetVirtualPosition(), 
                    and GetAstrometricPosition(). These methods operate on the properties of the Planet, and produce 
                    a PositionVector object. For example, to get the topocentric coordinates of a planet, create and 
                    initialize a planet then call 
                    Planet.GetTopocentricPosition(). The resulting PositionVector's right ascension and declination 
                    properties are the topocentric equatorial coordinates, at the same time, the (optionally 
                    refracted) alt-az coordinates are calculated, and are also contained within the returned 
                    PositionVector. Note that Alt/Az is available in PositionVectors returned from calling 
                        GetTopocentricPosition(). The accuracy of these calculations is typically dominated by the accuracy 
                    of the attached ephemeris generator. 
                
                    Ephemeris Generator
                    
                    By default, Kepler instances are attached for both Earth and Planet objects so it is
                    not necessary to create and attach these in order to get Kepler accuracy from this
                    component
                The ephemeris generator object used with NOVAS-COM must support a single 
                    method GetPositionAndVelocity(tjd). This method must take a terrestrial Julian date (like the 
                    NOVAS-COM methods) as its single parameter, and return an array of Double 
                    containing the rectangular (x/y/z) heliocentric J2000 equatorial coordinates of position (AU) and velocity 
                    (KM/sec.). In addition, it must support three read/write properties BodyType, Name, and Number, 
                    which correspond to the Type, Name, and Number properties of Novas.Planet. 
                
            
*/
public class Planet{

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
private double Ephemeris;
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
private double Type;


/*

                Create a new instance of the Plant class
            
This assigns default Kepler instances for the Earth and Planet objects so it is
                not necessary to create and attach Kepler objects in order to get Kepler accuracy from this
                component
*/
public void Planet(){
return null;
}


/*

                Get an apparent position for given time
            

*/
public void GetApparentPosition(Double){
return null;
}


/*

                Get an astrometric position for given time
            

*/
public void GetAstrometricPosition(Double){
return null;
}


/*

                Get an local position for given time
            

*/
public void GetLocalPosition(Double,ASCOM.Astrometry.NOVASCOM.Site){
return null;
}


/*

                Get a topocentric position for given time
            

*/
public void GetTopocentricPosition(Double,ASCOM.Astrometry.NOVASCOM.Site,Boolean){
return null;
}


/*

                Get a virtual position for given time
            

*/
public void GetVirtualPosition(Double){
return null;
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
public void setEphemeris(double _theValue){
this.Ephemeris=_theValue;
}

/*
 Gets null
null
*/
public double getEphemeris(){
return Ephemeris;
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
public void setType(double _theValue){
this.Type=_theValue;
}

/*
 Gets null
null
*/
public double getType(){
return Type;
}
}
