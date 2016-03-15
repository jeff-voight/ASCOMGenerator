package ASCOM.Astrometry.NOVASCOM;

/*

                NOVAS-COM: VelocityVector Class
            

NOVAS-COM objects of class VelocityVector contain vectors used for velocities (earth, sites, 
                planets, and stars) throughout NOVAS-COM. Of course, its properties include the x, y, and z 
                components of the velocity. Additional properties are the velocity in equatorial coordinates of 
                right ascension dot, declination dot and radial velocity. You can initialize a PositionVector from 
                a Star object (essentially an FK5 or HIP catalog entry) or a Site (lat/long/height). For the star 
                object the proper motions, distance and radial velocity are used, for a site, the velocity is that 
                of the observer with respect to the Earth's center of mass. 
*/
public class VelocityVector{

/*
null
null
*/
private double DecVelocity;
/*
null
null
*/
private double RadialVelocity;
/*
null
null
*/
private double RAVelocity;
/*
null
null
*/
private double x;
/*
null
null
*/
private double y;
/*
null
null
*/
private double z;


/*

                Creates a new velocity vector object
            

            
*/
public void VelocityVector(){
return null;
}


/*

                Initialize the VelocityVector from a Site object and Greenwich Apparent Sdereal Time.
            
The velocity vector is that of the observer with respect to the Earth's center 
                of mass. The GAST parameter must be for Greenwich, not local. The time is rotated through 
                the site longitude. See SetFromSiteJD() for an equivalent method that takes UTC Julian 
                Date and optionally Delta-T (eliminating the need for calculating hyper-accurate GAST yourself). 
*/
public void SetFromSite(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}


/*

                Initialize the VelocityVector from a Site object using UTC Julian Date
            
The velocity vector is that of the observer with respect to the Earth's center 
                of mass. The Julian date must be UTC Julian date, not terrestrial. This call will use 
                the internal tables and estimator to get delta-T.
                This overload is not available through COM, please use 
                "SetFromSiteJD(ByVal site As Site, ByVal ujd As Double, ByVal delta_t As Double)"
                with delta_t set to 0.0 to achieve this effect.
            
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}


/*

                Initialize the VelocityVector from a Site object using UTC Julian Date and Delta-T
            
The velocity vector is that of the observer with respect to the Earth's center 
                of mass. The Julian date must be UTC Julian date, not terrestrial.
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double,Double){
return null;
}


/*

                Initialize the VelocityVector from a Star object.
            
The proper motions, distance and radial velocity are used in the velocity calculation. 
*/
public void SetFromStar(ASCOM.Astrometry.NOVASCOM.Star){
return null;
}

/*
 Sets null
null
*/
public void setDecVelocity(double _theValue){
this.DecVelocity=_theValue;
}

/*
 Gets null
null
*/
public double getDecVelocity(){
return DecVelocity;
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
public void setRAVelocity(double _theValue){
this.RAVelocity=_theValue;
}

/*
 Gets null
null
*/
public double getRAVelocity(){
return RAVelocity;
}

/*
 Sets null
null
*/
public void setX(double _theValue){
this.x=_theValue;
}

/*
 Gets null
null
*/
public double getX(){
return x;
}

/*
 Sets null
null
*/
public void setY(double _theValue){
this.y=_theValue;
}

/*
 Gets null
null
*/
public double getY(){
return y;
}

/*
 Sets null
null
*/
public void setZ(double _theValue){
this.z=_theValue;
}

/*
 Gets null
null
*/
public double getZ(){
return z;
}
}
