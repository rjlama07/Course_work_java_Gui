
/**
 * Write a description of class BankCard here.
 *
 * @author (22067690 Animesh Bhattarai)
 * @version (1.0.0)
 */
public class BankCard

{
    // Attributes:  

    private int cardID;

    private String clientName;

    private String issuerBank;

    private String bankAcc;

    private int balanceAmt;

   

    // Constructor:

    public BankCard(int balanceAmt, int cardID, String bankAcc, String issuerBank)

    {

        this.balanceAmt=balanceAmt;

        this.cardID=cardID;

        this.bankAcc=bankAcc;

        this.issuerBank=issuerBank;

        this.clientName = "";

    }

    // Getter:

    public int getCardID() {

        return this.cardID;

    }

    public String getClientName() {

        return this.clientName;

    }

    public String getIssuerBank() {

        return this.issuerBank;

    }

    public String getBankAccount() {

        return this.bankAcc;

    }

    public int getBalanceAmount() {

        return this.balanceAmt;

    }

    // Setter:

    public void setClientName(String ClientName) {

        this.clientName = ClientName;

    }

       public void setBalanceAmount(int BalanceAmount) {

        this.balanceAmt = BalanceAmount;

    }

    // Display:

    public void display() {

        if (!this.clientName.equals(""))

        {

            System.out.println("CardID: " + this.cardID);

            System.out.println("ClientName: " + this.clientName);

            System.out.println("IssuerBank: " + this.issuerBank);

            System.out.println("BankAccount: " + this.bankAcc);

            System.out.println("BalanceAmount: " + this.balanceAmt);

        }

        else

        {

            System.out.println("Client name not assigned.");

        }
    }
}
      

