package classes;

public class Customer extends Person{
    int custID;
    String membLevel;
    int credNumber;


    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public String getMembLevel() {
        return membLevel;
    }

    public void setMembLevel(String membLevel) {
        this.membLevel = membLevel;
    }

    public int getCredNumber() {
        return credNumber;
    }

    public void setCredNumber(int credNumber) {
        this.credNumber = credNumber;
    }
}
