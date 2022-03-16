public class ContactsModel {
    
    private int cID;
    private String fName;
    private String lName;
    private String mNumber;
    private String lNumber;
    private String eMail;
    private String address;
    
    public ContactsModel(){}

    public ContactsModel(int cID, String fName, String lName, String mNumber, String lNumber, String eMail, String address) {
        this.cID = cID;
        this.fName = fName;
        this.lName = lName;
        this.mNumber = mNumber;
        this.lNumber = lNumber;
        this.eMail = eMail;
        this.address = address;
    }

    public int getcID() {
        return cID;
    }

    public void setcID(int cID) {
        this.cID = cID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public String getlNumber() {
        return lNumber;
    }

    public void setlNumber(String lNumber) {
        this.lNumber = lNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }      
}
