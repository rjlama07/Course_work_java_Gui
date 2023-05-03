
/**
 * Write a description of class DebitCard here.
 *
 * @author (22067690 Animesh Bhattarai)
 * @version (1.0.0)
 */
public class DebitCard extends BankCard

{
    // Attributes:  

    private int PINnumber;

    private int WithdrawalAmt;

    private String DateOfWithdrawal;

    private boolean hasWithdrawn;

   
    // Constructor:

    public DebitCard(int balanceAmt, int cardID, String bankAcc, String issuerBank, String clientName, int PINnumber)

    {

        // Call to the parent constructor:

        super(balanceAmt, cardID, bankAcc, issuerBank);

        this.PINnumber = PINnumber;

        this.WithdrawalAmt = 0;

        this.DateOfWithdrawal = "";

        this.hasWithdrawn = false;

        super.setClientName(clientName);

    }

   
    // Getter:

    public int getPINnumber() {

        return this.PINnumber;

    }

    public int getWithdrawalAmount() {

        return this.WithdrawalAmt;

    }

    public String getDateOfWithdrawal() {

        return this.DateOfWithdrawal;

    }

    public boolean getHasWithdrawn() {

        return this.hasWithdrawn;

    }

   
    // Setter:

    public void setWithdrawalAmount(int withdrawalAmount) {

        this.WithdrawalAmt = WithdrawalAmt;

    }

       

    // Method:

    public void withdraw(int WithdrawalAmt, String DateOfWithdrawal, int enteredPINnumber)

    {
         if (enteredPINnumber == this.PINnumber)

         {
            if (WithdrawalAmt <= this.getBalanceAmount())

             {

                 this.setBalanceAmount(this.getBalanceAmount() - WithdrawalAmt);

                 this.WithdrawalAmt = WithdrawalAmt;

                 this.DateOfWithdrawal = DateOfWithdrawal;

                 this.hasWithdrawn = true;

                 System.out.println("Transaction successful.");

             }

             else

             {

                System.out.println("Insufficient balance.");

            }

        }

        else

        {

            System.out.println("Invalid pin.");

        }
    }

   
    // Display:

    public void display() {

        //parent class display call

        //if transaction:

        //display everything

        //else

        //display everything except

        super.display();

        if (this.hasWithdrawn) {

            System.out.println("Pin Number: " + this.PINnumber);

            System.out.println("Withdrawal Amount: " + this.WithdrawalAmt);

            System.out.println("Date of Withdrawal: " + this.DateOfWithdrawal);

        }

        else

        {

            System.out.println("Transaction not carried yet.");

        }
    }
}

 


    

