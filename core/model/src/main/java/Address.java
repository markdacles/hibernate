public class Address {

	private String stNum;
	private String brgy;
	private String city;
	private String zipCode;

    public Address() { }

    public Address(String stNum, String brgy, String city, String zipCode) {
        this.stNum = stNum;
        this.brgy = brgy;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStNum() { return stNum; }
    public void setStNum(String s) { stNum = s; }  

    public String getBrgy() { return brgy; }
    public void setBrgy(String b) { brgy = b; }  

    public String getCity() { return city; }
    public void setCity(String c) { city = c; }   

    public String getZipCode() { return zipCode; }
    public void setZipCode(String z) { zipCode = z; } 
}