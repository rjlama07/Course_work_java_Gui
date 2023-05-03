 
/**
 * This is Creditcard class which is used to store the details of client CreditCard.
 * author@ Pritee Bhattarai
 * ID: NP05CP4A220092
 */
public class Creditcard extends BankCard 
{
    //Declaring attributes of Creditcard
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;

    //constructor which accepts eight parameters
    public Creditcard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNumber, double interestRate, String expirationDate) 
    {
        //call to superclass constructor
        super(balanceAmount, cardId, bankAccount, issuerBank);
        super.setClientName(clientName);
        // assigning value to attributes
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }

    //accessor method for each attributes
    public int getCvcNumber() 
    {
        return cvcNumber;
    }

    public double getCreditLimit() 
    {
        return creditLimit;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public int getGracePeriod()
    {
        return gracePeriod;
    }

    public boolean getIsGranted()
    {
        return isGranted;
    }

    //method to set the credit limit
    public void setCreditLimit ( double newcreditLimit, int newgracePeriod) 
    {
        if (creditLimit <= (2.5 * super.getBalanceAmount())) {
            this.creditLimit = newcreditLimit;
            this.gracePeriod = newgracePeriod;
            this.isGranted = true;
            System.out.println("Your creditCard has been issued");
        } 
        else {
            System.out.println("Your creditCard can't be issued right now ");
        }
    }

    //method to cancel Credit card
    public void cancelCreditCard() 
    {
        this.cvcNumber = 0;
        this.creditLimit = 0;
        this.gracePeriod = 0;
        this.isGranted = false;
        System.out.println("Your credit is cancelled sucessfully. ");
    }

    //display method to display the details of the Credit card
    public void display() 
    {
        // call made to super class display method
        super.display();
        
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Expiration date: " + expirationDate);
        
        if (isGranted) {
            System.out.println("CvCNumber: " + cvcNumber);
            System.out.println("Credit limit: " + creditLimit);
            System.out.println("Grace period: " + gracePeriod);
        }
    }
}
//End of code
