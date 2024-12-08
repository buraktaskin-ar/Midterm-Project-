package vize;



public class ContactInfo {
    private String homeAddress;
    private String telNumber;
    private String eMail;

    public ContactInfo(String homeAddress, String telNumber, String eMail) {
        this.homeAddress = homeAddress;
        this.telNumber = telNumber;
        this.eMail = eMail;
    }

    public ContactInfo(){
        this.homeAddress = null;
        this.telNumber = null;
        this.eMail = null;
    }

    public ContactInfo(ContactInfo obj){
        this.homeAddress = obj.homeAddress;
        this.telNumber = obj.telNumber;
        this.eMail = obj.eMail;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String toString() {
        return "ContactInfo{" +
                "homeAddress='" + getHomeAddress() + '\'' +
                ", telNumber='" + getTelNumber() + '\'' +
                ", eMail='" + geteMail() + '\'' +
                '}';
    }


    public boolean equals(Object obj) {
        // Referans ve sınıf kontrolleri yapılır.
        if (obj == null)
            return false;

        else if ( this.getClass() != obj.getClass()) {
            return false;
        }


        ContactInfo c = (ContactInfo) obj;
        return (this.getHomeAddress().equals(c.getHomeAddress())) &&
                this.geteMail().equals(c.geteMail())  &&
                this.getTelNumber().equals(c.getTelNumber());
    }





}
