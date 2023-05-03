 
/**
 * This is DebitCard class which is used to store the details of client DebitCard .
 * author@ Pritee Bhattarai
 * ID: NP05CP4A220092
 */
 
 public class DebitCard extends BankCard
 {
   //Declaring attribute of class DebitCard 
   private int pinNumber;
   private int withdrawalAmount;
   private String dateOfwithdrawal;
   private boolean hasWithdrawn;
   //constructor which accepts six parameters
   public DebitCard(int balanceAmount, int cardId, String bankAccount, String issuerBank, String clientName, int pinNumber)
   {
      //calling super class constructor
      super(balanceAmount, cardId, bankAccount, issuerBank);
      //calling clientName from super class constructor
      super.setClientName(clientName);
      this.dateOfwithdrawal = "";
      this.withdrawalAmount = 0;
      //assigning pinNumber
      this.pinNumber = pinNumber;
      //assigning hasWithdrawan as false
      this.hasWithdrawn = false;
   }    
  //accessor method for each attributes
  public int getPinNumber() 
  {
    return this.pinNumber;
  }

  public int getWithdrawalAmount() 
  {
    return this.withdrawalAmount;
  }
  
  public String getDateOfWithdrawal() 
  {
    return this.dateOfwithdrawal;
  }

  public boolean getHasWithdrawn() 
  {
    return this.hasWithdrawn;
  }
  //mutator method for withdrawalAmount
  public void setWithdrawalAmount(int withdrawalAmount)
  {
      this.withdrawalAmount = withdrawalAmount;
  }
  //creating method name withdraw which is used to deduct cash from account
 public void withdraw(int withdrawalAmount, String dateOfwithdrawal, int pinNumber)
 {
     if (getPinNumber() == pinNumber) {
             if(withdrawalAmount <= super.getBalanceAmount()) {
              this.setWithdrawalAmount(withdrawalAmount);
              this.hasWithdrawn = true;
              this.dateOfwithdrawal = dateOfwithdrawal;
             
             System.out.println( this.withdrawalAmount +  " withdrawn from balance Rs " + super.getBalanceAmount());
             super.setBalanceAmount(super.getBalanceAmount()- this.withdrawalAmount);
             }

             else {
             System.out.println("The Balance is not Sufficient" + super.getBalanceAmount());
             }
        }
        
             else {
             System.out.println("Your pin is incorrect please enter correct.");
             }
 } 
    public void display()
     {
       if (hasWithdrawn ==  false) {
             System.out.println("Your remaining Balance amount is :" + getBalanceAmount());
         }
         
        else {
        // call made to super class display method
        super.display();
        System.out.println("PinNumber: " + pinNumber);
        System.out.println("WithdrawalAmount: "+ withdrawalAmount);
        System.out.println("DateOfWithdrawal: " + dateOfwithdrawal);
        }
         
     }
}
//End of Code

        
    
