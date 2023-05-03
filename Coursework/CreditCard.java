
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
  
   private int cvcNum;
   private double creditLimit;
   private double interestRate;
   private String expirationDate;
   private int gracePeriod;
   private boolean isGranted;
    
    protected CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, double balanceAmount, int cvcNum, double interestRate,
    String expirationDate) {
        super (cardId,issuerBank , bankAccount, balanceAmount);
        super.setClientName(clientName);
        this.cvcNum = cvcNum;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    
    protected int getCvcNum() {
        return cvcNum;
    }
    
    protected double getCreditLimit() {
        return creditLimit;
    }
    
    protected double getInterestRate() {
        return interestRate;
    }
    
    protected String getExpirationDate() {
        return expirationDate;
    }
    
    protected int getGracePeriod() {
        return gracePeriod;
    }
    
    protected boolean getIsGranted() {
        return isGranted;
    }
    
    public void setCreditLimit(double newCreditLimit, int newGracePeriod) {
        if (newCreditLimit <= 2.5 * super.getBalanceAmount()) {
            this.creditLimit = newCreditLimit;
            this.gracePeriod = newGracePeriod;
            this.isGranted = true;
        } else {
            throw new IllegalArgumentException("Credit cannot be issued.");

        }
    }
    
    public void cancelCreditCard() {
        if (isGranted) {
            this.cvcNum = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
            System.out.println("Credit Card has valid");
        } else {
            System.out.println("Credit card has not been valid");
              throw new IllegalArgumentException("Credit card has not been valid");
            
        }
    }
    
    public void display() {
        if (isGranted) {
            super.display();
            System.out.println("Credit Limit: " + creditLimit);
            System.out.println("Grace Period: " + gracePeriod);
        } else {
            super.display();
        }
    }
    public class main{
        public static void main (String[] args){
            CreditCard object= new CreditCard(02, "Prabin khatri", "Nabil Bank", "A234576189001",55555.55,2001, 7.5, "29/08/2023");
            object.setCreditLimit(400, 2119);
            object.display();
        }
    }
}


    