package ASCOM.Astrometry.NOVASCOM;

/*

                NOVAS-COM: Site Class
            

NOVAS-COM objects of class Site contain the specifications for an observer's location on the Earth 
                ellipsoid. Properties are latitude, longitude, height above mean sea level, the ambient temperature 
                and the sea-level barmetric pressure. The latter two are used only for optional refraction corrections. 
                Latitude and longitude are (common) geodetic, not geocentric. 
*/
public class Site{

/*
null
null
*/
private double Height;
/*
null
null
*/
private double Latitude;
/*
null
null
*/
private double Longitude;
/*
null
null
*/
private double Pressure;
/*
null
null
*/
private double Temperature;


/*

                Initialises a new site object
            

*/
public void Site(){
return null;
}


/*

                Set all site properties in one method call
            

*/
public void Set(Double,Double,Double){
return null;
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
public void setLatitude(double _theValue){
this.Latitude=_theValue;
}

/*
 Gets null
null
*/
public double getLatitude(){
return Latitude;
}

/*
 Sets null
null
*/
public void setLongitude(double _theValue){
this.Longitude=_theValue;
}

/*
 Gets null
null
*/
public double getLongitude(){
return Longitude;
}

/*
 Sets null
null
*/
public void setPressure(double _theValue){
this.Pressure=_theValue;
}

/*
 Gets null
null
*/
public double getPressure(){
return Pressure;
}

/*
 Sets null
null
*/
public void setTemperature(double _theValue){
this.Temperature=_theValue;
}

/*
 Gets null
null
*/
public double getTemperature(){
return Temperature;
}
}
