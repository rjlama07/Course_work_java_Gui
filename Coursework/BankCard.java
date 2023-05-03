
/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    
    //class BankCard is the super class for program
    
    //declaring attributes
   private int cardId;
   private String clientName;
   private String issuerBank;
   private String bankAccount;
   private double balanceAmount;
   
   
   
  
   
   //creating paremeterized constructor
   
   
   public BankCard( int cardId,  String issuerBank, String bankAccount, double balanceAmount){
       
       //assigning values to instance variables
       this.issuerBank = issuerBank;
       this.balanceAmount = balanceAmount;
       this.cardId = cardId;
       this.bankAccount = bankAccount;
       this.clientName = "";
       
    }

    
    //getter method for all attributes
    protected int getCardId(){
        return cardId;
    }
     protected String getClientName(){
         return clientName;
     }
     protected String getIssuerBank(){
         return issuerBank;
     }
     protected String getBankAccount(){
         return bankAccount;
     }
     protected double getBalanceAmount(){
         return balanceAmount;
     }
     
     
     //setter methodfor setting cilentname and balance amount
     
     public void setClientName(String clientName){
         this.clientName = clientName;
     }
     public void setBalanceAmount(double balanceAmount){
         this.balanceAmount = balanceAmount;
     }
     
     
     /*
      * Display method is call when in need to bankcard information
      * If the client name is not assigned the suitable massage is displayed else the client name is displayed
      */
     
     public void display(){
         System.out.println("Card Id: " +cardId);
         if(clientName .isBlank()){
             System.out.println("Client Name: Empty");
         } else{
             System.out.println("Client Name:" +clientName);
         }
         System.out.println("Issuer Bank: "+issuerBank);
         System.out.println("Bank Account: "+bankAccount);
         System.out.println("Balance Amount: "+balanceAmount);
         
         
     }
     
     }
     
       
   
 