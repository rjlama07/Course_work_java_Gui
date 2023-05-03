 
/**
 * This is BankCard class which is used to store the details of client BankCard.
 * author@ Pritee Bhattarai
 * ID: NP05CP4A220092
 */
public class BankCard
{
    //Declaring attribute of class BankCard 
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private double balanceAmount;
    //Constructor which accepts four parameters
    public BankCard(double balanceAmount, int cardId, String bankAccount, String issuerBank)
    {
        this.balanceAmount = balanceAmount;
        this.cardId = cardId;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName= "";
    }
    // Accessor method of each attributes
    public double getBalanceAmount()
    {
        return this.balanceAmount;
    }
    public int getCardId()
    {
        return this.cardId;
    }
    public String getBankAccount()
    {
        return this.bankAccount;
    }
    public String getIssuerBank()
    {
        return this.issuerBank;
    }
    public String getClientName()
    {
        return this.clientName;
    }
    //Setter method to set clientName and balanceAmount
    public void setClientName(String clientName)
    {
        this.clientName = clientName;
    }
    public void setBalanceAmount(double balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }
    //display method to display suitable output
     public void display()
    {
        //declaring clientName as empty with suitable message
        if (this.clientName.equals("")){
            System.out.println("There is no clientName");
        }
        //displaying else case
        else {
        System.out.println("CardID:" + cardId);
        System.out.println("ClientName: " + clientName);
        System.out.println("IssuerBank: " + issuerBank);
        System.out.println("BankAccount: " + bankAccount);
        System.out.println("BalanceAmount: " + balanceAmount);
        
        }
    }
}
//End of Code



