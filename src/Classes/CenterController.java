
package Classes;

public class CenterController {
 private int id;
    private String registrationNo;
    private String centerName;
    private String address;
    private String contactNo;
    private String gpsLocation;
    private String district;

    public CenterController(String registrationNo, String centerName, String address, String contactNo, String gpsLocation, String district) {
        this.registrationNo = registrationNo;
        this.centerName = centerName;
        this.address = address;
        this.contactNo = contactNo;
        this.gpsLocation = gpsLocation;
        this.district = district;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getGpsLocation() {
        return gpsLocation;
    }

    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
    
 
}
