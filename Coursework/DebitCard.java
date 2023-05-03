
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
  
  // class DebitCard is the sub class for bankcard
  
    
    //declaring attributes
  private int PIN;
  private int withdrawalAmount;
  private String dateOfWithdrawal;
  private boolean hasWithdrawn;
  
  //parameterized constructor

  public DebitCard(double balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int PIN) {
      // calling super class method
    super ( cardId, issuerBank, bankAccount, balanceAmount );
    super.setClientName(clientName);
    
    //assigning values to instance variables
    this.PIN = PIN ;
    
    this.hasWithdrawn = false;
  }
  
  //getter method for all attributes

  protected int getPIN() {
    return PIN;
  }

  protected int getWithdrawalAmount() {
    return withdrawalAmount;
  }

  protected String getDateOfWithdrawal() {
    return dateOfWithdrawal;
  }

  public boolean getHasWithdrawn() {
    return hasWithdrawn;
  }
   protected void setWithdrawalAmount(int withdrawalAmount) {
    this.withdrawalAmount = withdrawalAmount;
  }

   
  public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int PIN) {
    if (this.PIN == PIN) {
      if (super .getBalanceAmount() >= withdrawalAmount) {
        super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
        this.withdrawalAmount = withdrawalAmount;
        this.dateOfWithdrawal = dateOfWithdrawal;
        this.hasWithdrawn = true;
      } else {
        System.out.println("Insufficient balance.");
    }
    } else {
      System.out.println("Invalid PIN.");
    }
  }

  public void display() {
    super.display();
    System.out.println("PIN: " + PIN);
    if (hasWithdrawn == true) {
      System.out.println("Withdrawal Amount: " + withdrawalAmount);
      System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
    }
  }
  
  public static void main(String[] args){
      DebitCard object = new DebitCard(55555.55, 02, "A234576189001","Nabil bank","Prabin khatri",2001);
      object.withdraw(02, "29/08/2023", 2001);
      object.display();
  }
}
    
    

