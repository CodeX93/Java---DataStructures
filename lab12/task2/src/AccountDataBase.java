public class AccountDataBase {

    private int Record;
    private int AccountID;
    private String FirstName;
    private String lastName;
    private double Balance;

    public void setRecord(int record) {Record = record;}
    public void setFirstName(String firstName) {FirstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setBalance(double balance) {Balance = balance;}

    public int getRecord() {return Record;}
    public String getFirstName() {return FirstName;}

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public String getLastName() {return lastName;}
    public double getBalance() {return Balance;}

    public AccountDataBase (int r, int id, String fn, String ln, double bal)
    {
        this.setRecord(r);
        this.setAccountID(id);
        this.setFirstName(fn);
        this.setLastName(ln);
        this.setBalance(bal);

    }

}
