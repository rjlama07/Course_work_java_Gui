
/**
 * Write a description of class CreditCard here.
 *
 * @author (22067690 Animesh Bhattarai)
 * @version (1.0.0)
 */
public class CreditCard extends BankCard

{
    // Attributes: 

    private int CVCnumber;

    private double creditLimit;

    private double intRate;

    private String expDate;

    private int gracePeriod;

    private boolean IsGranted;
    

    // Constructor:

    public CreditCard(int cardID, String clientName, String issuerBank, String bankAcc, int balanceAmt, int CVCnumber, double intRate, String expDate)

    {

        super(balanceAmt, cardID, bankAcc, issuerBank);

        this.CVCnumber=CVCnumber;

        this.intRate=intRate;

        this.expDate=expDate;

        this.gracePeriod=0;

        this.IsGranted=false;

        super.setClientName(clientName);

    }

    
    // Getter:

    public int getCVCnumber()

    {

        return this.CVCnumber;

    }

     public double getCreditLimit()

    {

        return this.creditLimit;

    }

    public double getInterestRate()

    {

        return this.intRate;

    }

    public String getExpirationDate() {

        return this.expDate;

    }

    public int getGracePeriod() {

        return this.gracePeriod;

    }

    public boolean getIsGranted() {

        return this.IsGranted;

    }

    
    // Setter:

    public void setCreditLimit(double CreditLimit, int GracePeriod)

    {
        if (CreditLimit <= 2.5 * this.getBalanceAmount())

        {

            this.creditLimit = CreditLimit;

            this.gracePeriod = GracePeriod;

            this.IsGranted = true;

        }

        else

        {

            System.out.println("Credit cannot be issued.");

        }

    }

   
    public void cancelCreditCard()

    {
        if (this.IsGranted)

        {

            this.CVCnumber = 0;

            this.creditLimit = 0;

            this.gracePeriod = 0;

            this.IsGranted = false;

        }
    }        

    public void display()

    {
        super.display();

        if (this.IsGranted)

        {

            System.out.println("CVCNumber: " + this.CVCnumber);

            System.out.println("CreditLimit: " + this.creditLimit);

            System.out.println("InterestRate: " + this.intRate);

            System.out.println("ExpirationDate: " + this.expDate);

            System.out.println("GracePeriod: " + this.gracePeriod);

            System.out.println("Credit has been granted");

        } else

        {

             System.out.println("Credit has not been granted for this card.");

        }
    }
}
