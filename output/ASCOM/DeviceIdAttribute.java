package ASCOM;

/*

              An attribute for declaratively associating an assembly, class or property with an 
              ASCOM device ID (and optionally, a display name).
            


              This attribute is intended for use in two main situations:
              
                
                  
                    Settings management and integration with Visual Studio designers
                  
                  
                    When this attribute is placed on the driver's Properties.Settings class, it  propagates
                    down to each of the settings properties. When the setting is passed to the 
                    ASCOM.SettingsProvider class at runtime, the settings provider looks for this attribute
                    to determine which settings hive to save the value in when it is passed to 
                    .
                  
                
                
                  
                    Deployment
                  
                  
                    The values in this attribute could be used by an installer custom action to perform
                    ASCOM registration during setup. Historically this has been handled programmatically,
                    but there are trends towards a more declarative approach to deployment (for example
                    WiX, Windows Installer Xml). It is expected that such an installer may need to obtain
                    registration data by reflecting on the assemblies being installed. Placing this attribute
                    at the assembly level will assist in this situation.
                  
                
              
            
 */
public class DeviceIdAttribute {

    /*
null
null
     */
    private String DeviceId;
    /*
null
null
     */
    private String DeviceName;


    /*

              Initializes a new instance of the  class.
            

              
                Recommended usage is:
                
                  [DeviceId("ASCOM.SuperDuper.Telescope", DeviceName="SuperDuper Deluxe")]
                
              
              
                In the event that the DeviceName optional parameter is not set, it will return the DeviceId.
              
            
     */
    public DeviceIdAttribute(String theString) {
        setDeviceID(theString);
    }

    /*
 Sets null
null
     */
    public void setDeviceId(String _theValue) {
        this.DeviceId = _theValue;
    }

    /*
 Gets null
null
     */
    public String getDeviceId() {
        return DeviceId;
    }

    /*
 Sets null
null
     */
    public void setDeviceName(String _theValue) {
        this.DeviceName = _theValue;
    }

    /*
 Gets null
null
     */
    public String getDeviceName() {
        return DeviceName;
    }
}
