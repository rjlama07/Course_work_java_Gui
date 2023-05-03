
/**
 * Write a description of class BankGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.util.ArrayList;


public class BankGui {
     ArrayList<BankCard> bankCard = new ArrayList<BankCard>();//for storing using input card
    //UI frame elements    
   private JFrame frame;
   
private JTextField debitClientName;
private JTextField debitBankAccount;
private JTextField dCardId1;
private JTextField debitIssueBank;
private JLabel lblNewLabel_2;
private JTextField debitBankAmount;
private JLabel lblNewLabel_3;
private JTextField debitPinNumber;
private JLabel lblNewLabel_4;
private JTextField dCardId2;
private JTextField dAmount;
private JTextField dIssuebank;
private JLabel lblNewLabel_6;
private JLabel lblNewLabel_7;
private JLabel lblNewLabel_8;
private JButton btnWithdraw;
private JPanel panel_1;
private JTextField cClientName;
private JTextField cBankAccount;
private JLabel lblNewLabel_9;
private JLabel lblNewLabel_10;
private JTextField cCardID1;
private JLabel lblNewLabel_1_2;
private JTextField cIssueBank;
private JLabel lblNewLabel_11;
private JTextField cBalanceAmount;
private JLabel lblNewLabel_12;
private JTextField textField_14;
private JLabel lblNewLabel_13;
private JButton addCreditCardButton;
private JLabel lblNewLabel_14;
private JTextField cCardId2;
private JTextField cCreditLimit;
private JTextField cNewGrace;
private JLabel lblNewLabel_15;
private JLabel lblNewLabel_16;
private JLabel lblNewLabel_17;
private JButton cancleCredit;
private JTextField cInterestRate;
private JLabel lblNewLabel_18;
private JLabel lblNewLabel_19;
private JButton cSetButton;
private JTextField cCardId3;


///launching the application
public static void main(String[] args) {
   EventQueue.invokeLater(new Runnable() {
       public void run() {
           try {
               BankGui window = new BankGui();
               window.frame.setVisible(true);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
   });
}

///inititalzes the frame
public BankGui() {
   initialize();
}

///contents of the frame
private void initialize() {
    //elements for combo box date
   Integer Date[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
   String Date1[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
   String Date2[] = {"2020","2021","2022"};
   frame = new JFrame();
   frame.setBackground(new Color(255, 64, 255));
   frame.setBounds(100, 100, 1008, 587);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.getContentPane().setLayout(null);
   
   JPanel panel = new JPanel();
   panel.setBackground(new Color(64, 237, 225));
   panel.setBounds(0, 6, 1008, 559);
   frame.getContentPane().add(panel);
   panel.setLayout(null);
   
   debitClientName = new JTextField();
   debitClientName.setBounds(42, 93, 130, 26);
   panel.add(debitClientName);
   debitClientName.setColumns(10);
   
   debitBankAccount = new JTextField();
   debitBankAccount.setColumns(10);
   debitBankAccount.setBounds(42, 132, 130, 26);
   panel.add(debitBankAccount);
   
   JLabel lblNewLabel = new JLabel("Client name");
   lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel.setBounds(46, 77, 88, 16);
   panel.add(lblNewLabel);
   
   JLabel lblNewLabel_1 = new JLabel("Bank Account");
   lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_1.setBounds(42, 120, 92, 16);
   panel.add(lblNewLabel_1);
   
   dCardId1 = new JTextField();
   dCardId1.setColumns(10);
   dCardId1.setBounds(184, 93, 130, 26);
   panel.add(dCardId1);
   
   JLabel lblNewLabel_1_1 = new JLabel("Card ID");
   lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_1_1.setBounds(196, 77, 88, 16);
   panel.add(lblNewLabel_1_1);
   
   debitIssueBank = new JTextField();
   debitIssueBank.setColumns(10);
   debitIssueBank.setBounds(184, 132, 130, 26);
   panel.add(debitIssueBank);
   
   lblNewLabel_2 = new JLabel("Issue Bank");
   lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_2.setBounds(184, 120, 92, 16);
   panel.add(lblNewLabel_2);
   
   debitBankAmount = new JTextField();
   debitBankAmount.setColumns(10);
   debitBankAmount.setBounds(42, 170, 130, 26);
   panel.add(debitBankAmount);
   
   lblNewLabel_3 = new JLabel("Balance Amount");
   lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_3.setBounds(42, 158, 109, 16);
   panel.add(lblNewLabel_3);
   
   debitPinNumber = new JTextField();
   debitPinNumber.setColumns(10);
   debitPinNumber.setBounds(184, 170, 130, 26);
   panel.add(debitPinNumber);
   
   lblNewLabel_4 = new JLabel("Pin Number");
   lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_4.setBounds(184, 158, 92, 16);
   panel.add(lblNewLabel_4);
   
   JButton addDebitCard = new JButton("Add Debit card");
   addDebitCard.setForeground(new Color(255, 146, 0));
   addDebitCard.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   
   ///add the debit card
   addDebitCard.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         try {
              int cardId = Integer.parseInt(dCardId1.getText());
           boolean found = false;
             for (int i = 0; i < bankCard.size(); i++) {
                  BankCard bankCard1;
                  bankCard1=bankCard.get(i);
                  int bankCardId=bankCard1.getCardId();
                  if(bankCard1 instanceof DebitCard  && cardId==bankCardId)
                  {
                      found=true;
                      break;
                  }
                  
               }
               if(found)
               {
                      JOptionPane.showMessageDialog(null, "Card Id already exists");
                   return;
               }
    String clientName = debitClientName.getText();
    
    String bankAccount = debitBankAccount.getText();
    String issuerbank = debitIssueBank.getText();
    double amount = Double.parseDouble(debitBankAmount.getText());
    int pinNumber = Integer.parseInt(debitPinNumber.getText());
    DebitCard card = new DebitCard(amount, cardId, bankAccount, issuerbank, clientName, pinNumber);
    bankCard.add(card);
    JOptionPane.showMessageDialog(null, "Debit card added successfully");
 } catch (NumberFormatException error) {
     System.out.println(error);
    JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number.");
 } catch (Exception error) {
    JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
 }
           
            
       }
   });
   addDebitCard.setBounds(34, 204, 138, 29);
   panel.add(addDebitCard);
   
   JButton displayDebitCard = new JButton("Display");
   displayDebitCard.setForeground(new Color(4, 50, 255));
   
   //for displaying in console
   displayDebitCard.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           String bankAccount = debitBankAccount.getText();
String clientName = debitClientName.getText();
int cardId = Integer.parseInt(dCardId1.getText());
String issueBank = debitIssueBank.getText();
double bankAmount = Double.parseDouble(debitBankAmount.getText());
int pinNumber = Integer.parseInt(debitPinNumber.getText());

System.out.println("Bank Account: " + bankAccount);
System.out.println("Client Name: " + clientName);
System.out.println("Card ID: " + cardId);
System.out.println("Issuer Bank: " + issueBank);
System.out.println("Bank Amount: " + bankAmount);
System.out.println("PIN Number: " + pinNumber);


       }
   });
   displayDebitCard.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   displayDebitCard.setBounds(34, 234, 138, 29);
   panel.add(displayDebitCard);
   
   JButton clearDebitCard = new JButton("Clear");
   clearDebitCard.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
                           debitBankAccount.setText("");
debitClientName.setText("");
dCardId1.setText("");
debitIssueBank.setText("");
debitBankAmount.setText("");
debitPinNumber.setText("");
       }
   });
   clearDebitCard.setForeground(new Color(255, 38, 0));
   clearDebitCard.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   clearDebitCard.setBounds(184, 208, 138, 29);
   panel.add(clearDebitCard);
   
   JLabel lblNewLabel_5 = new JLabel("Debit");
   lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 16));
   lblNewLabel_5.setBounds(43, 20, 184, 45);
   panel.add(lblNewLabel_5);
   
   dCardId2 = new JTextField();
   dCardId2.setColumns(10);
   dCardId2.setBounds(42, 317, 130, 26);
   panel.add(dCardId2);
   
   dAmount = new JTextField();
   dAmount.setColumns(10);
   dAmount.setBounds(42, 368, 130, 26);
   panel.add(dAmount);
   
   dIssuebank = new JTextField();
   dIssuebank.setColumns(10);
   dIssuebank.setBounds(184, 317, 130, 26);
   panel.add(dIssuebank);
   
   lblNewLabel_6 = new JLabel("Card ID");
   lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_6.setBounds(42, 302, 109, 16);
   panel.add(lblNewLabel_6);
   
   lblNewLabel_7 = new JLabel("Pin number");
   lblNewLabel_7.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_7.setBounds(184, 301, 109, 16);
   panel.add(lblNewLabel_7);
   
   lblNewLabel_8 = new JLabel("Withdrawl Amount");
   lblNewLabel_8.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_8.setBounds(42, 353, 109, 16);
   panel.add(lblNewLabel_8);
   
   JComboBox dayComboBox = new JComboBox(Date);
   dayComboBox.setBounds(42, 416, 58, 27);
   panel.add(dayComboBox);
   
   JComboBox monthComboBox = new JComboBox(Date1);
   monthComboBox.setBounds(97, 416, 75, 27);
   panel.add(monthComboBox);
   
   JComboBox yearComboBox = new JComboBox(Date2);
   yearComboBox.setBounds(168, 416, 116, 27);
   panel.add(yearComboBox);
   
   JLabel lblNewLabel_8_1 = new JLabel("Date of Withdrawl");
   lblNewLabel_8_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_8_1.setBounds(42, 395, 109, 16);
   panel.add(lblNewLabel_8_1);
   
   btnWithdraw = new JButton("Withdraw");
   btnWithdraw.setForeground(new Color(255, 38, 0));
   btnWithdraw.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   btnWithdraw.setBounds(42, 455, 138, 29);
   panel.add(btnWithdraw);
    ////button to withdraw
   btnWithdraw.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           int selectedIndex=-1;
           try{
               int cardId=Integer.parseInt(dCardId2.getText());
           boolean found = false;
           BankCard bankCard1=null;
           ///for checking is the card exist or not 
              for (int i = 0; i < bankCard.size(); i++) {
                  
                  bankCard1=bankCard.get(i);
                  
                  int bankCardId=bankCard1.getCardId();
                  if( bankCard1 instanceof DebitCard && cardId==bankCardId){
                   selectedIndex=i;
                      found=true;
                      break;
                   }
                  
               }
               
               if(!found)
               {
                   JOptionPane.showMessageDialog(null, "Card not found");
                   
               }
               else {
                   int pin = ((DebitCard) bankCard1).getPIN();
                   int inputPin=Integer.parseInt(dIssuebank.getText());
                   if(pin!=inputPin)
                   {
                       JOptionPane.showMessageDialog(null, "Invalid Pin");
                       
                   
                   }
                   else
                   {
                       double amount=Double.parseDouble(dAmount.getText());
                       double balance=bankCard1.getBalanceAmount();
                       if(amount>balance)
                       {
                           
                           JOptionPane.showMessageDialog(null, "Insufficient Balance");
                       }
                       else
                       {
                           bankCard.get(selectedIndex).setBalanceAmount(balance-amount);
                           JOptionPane.showMessageDialog(null, "Withdrawn sucessfull Pin");
                       }
                        
                   }
                   
                  
               }
           }
           catch (NumberFormatException error) {
     System.out.println(error);
    JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number.");
 } catch (Exception error) {
    JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
 }
           
                   

       }
   });
   
   panel_1 = new JPanel();
   panel_1.setBackground(new Color(64, 237, 225));
   panel_1.setLayout(null);
   panel_1.setBounds(408, 6, 528, 559);
   panel.add(panel_1);
   
   cClientName = new JTextField();
   cClientName.setColumns(10);
   cClientName.setBounds(42, 93, 130, 26);
   panel_1.add(cClientName);
   
   cBankAccount = new JTextField();
   cBankAccount.setColumns(10);
   cBankAccount.setBounds(42, 132, 130, 26);
   panel_1.add(cBankAccount);
   
   lblNewLabel_9 = new JLabel("Client name");
   lblNewLabel_9.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_9.setBounds(46, 77, 88, 16);
   panel_1.add(lblNewLabel_9);
   
   lblNewLabel_10 = new JLabel("Bank Account");
   lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_10.setBounds(42, 120, 92, 16);
   panel_1.add(lblNewLabel_10);
   
   cCardID1 = new JTextField();
   cCardID1.setColumns(10);
   cCardID1.setBounds(184, 93, 130, 26);
   panel_1.add(cCardID1);
   
   lblNewLabel_1_2 = new JLabel("Card ID");
   lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_1_2.setBounds(196, 77, 88, 16);
   panel_1.add(lblNewLabel_1_2);
   
   cIssueBank = new JTextField();
   cIssueBank.setColumns(10);
   cIssueBank.setBounds(184, 132, 130, 26);
   panel_1.add(cIssueBank);
   
   lblNewLabel_11 = new JLabel("Issue Bank");
   lblNewLabel_11.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_11.setBounds(184, 120, 92, 16);
   panel_1.add(lblNewLabel_11);
   
   cBalanceAmount = new JTextField();
   cBalanceAmount.setColumns(10);
   cBalanceAmount.setBounds(42, 170, 130, 26);
   panel_1.add(cBalanceAmount);
   
   lblNewLabel_12 = new JLabel("Balance Amount");
   lblNewLabel_12.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_12.setBounds(42, 158, 109, 16);
   panel_1.add(lblNewLabel_12);
   
   textField_14 = new JTextField();
   textField_14.setColumns(10);
   textField_14.setBounds(184, 170, 130, 26);
   panel_1.add(textField_14);
   
   lblNewLabel_13 = new JLabel("Cvc number");
   lblNewLabel_13.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_13.setBounds(184, 158, 92, 16);
   panel_1.add(lblNewLabel_13);
   
   addCreditCardButton = new JButton("ADD CREDIT CARD");
   addCreditCardButton.setForeground(new Color(255, 146, 0));
   addCreditCardButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   addCreditCardButton.setBounds(43, 289, 138, 29);
   panel_1.add(addCreditCardButton);
   
   
   
   lblNewLabel_14 = new JLabel("Credit");
   lblNewLabel_14.setFont(new Font("Lucida Grande", Font.BOLD, 16));
   lblNewLabel_14.setBounds(43, 20, 184, 45);
   panel_1.add(lblNewLabel_14);
   
   cCardId2 = new JTextField();
   cCardId2.setColumns(10);
   cCardId2.setBounds(53, 346, 130, 26);
   panel_1.add(cCardId2);
   
   cCreditLimit = new JTextField();
   cCreditLimit.setColumns(10);
   cCreditLimit.setBounds(53, 397, 130, 26);
   panel_1.add(cCreditLimit);
   
   cNewGrace = new JTextField();
   cNewGrace.setColumns(10);
   cNewGrace.setBounds(195, 346, 130, 26);
   panel_1.add(cNewGrace);
   
   lblNewLabel_15 = new JLabel("Card ID");
   lblNewLabel_15.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_15.setBounds(53, 331, 109, 16);
   panel_1.add(lblNewLabel_15);
   
   lblNewLabel_16 = new JLabel("New Grace Period");
   lblNewLabel_16.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_16.setBounds(205, 331, 109, 16);
   panel_1.add(lblNewLabel_16);
   
   lblNewLabel_17 = new JLabel("New Credit Limit");
   lblNewLabel_17.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_17.setBounds(53, 382, 109, 16);
   panel_1.add(lblNewLabel_17);
   
   cancleCredit = new JButton("cancel credit card");
   cancleCredit.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           try{
            int cardId=Integer.parseInt(cCardId3.getText());
           boolean found = false;
           int foundIndex=-1;
             for (int i = 0; i < bankCard.size(); i++) {
                  BankCard bankCard1;
                  bankCard1=bankCard.get(i);
                  int bankCardId=bankCard1.getCardId();
                  if(bankCard1 instanceof CreditCard  && cardId==bankCardId)
                  {
                      foundIndex=i;
                      found=true;
                      break;
                  }
               };
               if(!found)
               {
                   JOptionPane.showMessageDialog(null, "Cannot find Card");
               }
               else{
                   ((CreditCard) bankCard.get(foundIndex)).cancelCreditCard();
                   bankCard.remove(foundIndex);     
                   JOptionPane.showMessageDialog(null, "Credit Card Cancled");
               }}
            catch(Exception error){
                 JOptionPane.showMessageDialog(null, "Cannot find card. "+error);
            }
               
       }
   });
   cancleCredit.setForeground(new Color(255, 38, 0));
   cancleCredit.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   cancleCredit.setBounds(184, 451, 138, 29);
   panel_1.add(cancleCredit);
   
   cInterestRate = new JTextField();
   cInterestRate.setColumns(10);
   cInterestRate.setBounds(42, 210, 130, 26);
   panel_1.add(cInterestRate);
   
   lblNewLabel_18 = new JLabel("Interest Rate");
   lblNewLabel_18.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_18.setBounds(42, 198, 109, 16);
   panel_1.add(lblNewLabel_18);
   
   lblNewLabel_19 = new JLabel("Expiration Date");
   lblNewLabel_19.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_19.setBounds(42, 237, 92, 16);
   panel_1.add(lblNewLabel_19);
   
   cSetButton = new JButton("Set");
   cSetButton.setForeground(new Color(255, 146, 0));
   cSetButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   cSetButton.setBounds(196, 397, 138, 29);
   panel_1.add(cSetButton);
   
   JComboBox cDayComboBox = new JComboBox(Date);
   cDayComboBox.setBounds(42, 259, 58, 27);
   panel_1.add(cDayComboBox);
   
   JComboBox cMonthComboBox = new JComboBox(Date1);
   cMonthComboBox.setBounds(97, 259, 75, 27);
   panel_1.add(cMonthComboBox);
   
   
   JComboBox cYearComboBox_1 = new JComboBox(Date2);
   cYearComboBox_1.setBounds(168, 259, 116, 27);
   panel_1.add(cYearComboBox_1);
   
   cCardId3 = new JTextField();
   cCardId3.setColumns(10);
   cCardId3.setBounds(53, 450, 130, 26);
   panel_1.add(cCardId3);
   
   JLabel lblNewLabel_15_1 = new JLabel("Card ID");
   lblNewLabel_15_1.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
   lblNewLabel_15_1.setBounds(53, 435, 109, 16);
   panel_1.add(lblNewLabel_15_1);
   cSetButton.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           
            try{
               int cardId=Integer.parseInt(cCardId2.getText());
           boolean found = false;
           int foundIndex=-1;
             for (int i = 0; i < bankCard.size(); i++) {
                  BankCard bankCard1;
                  bankCard1=bankCard.get(i);
                  int bankCardId=bankCard1.getCardId();
                  if(bankCard1 instanceof CreditCard  && cardId==bankCardId)
                  {
                      foundIndex=i;
                      found=true;
                      break;
                  }
               };
               if(!found)
               {
                   JOptionPane.showMessageDialog(null, "Cannot find Card");
               }
               else{
                   int gracePeriod=Integer.parseInt(cNewGrace.getText());
                   double creditLimit=Double.parseDouble(cCreditLimit.getText());
                   ((CreditCard) bankCard.get(foundIndex)).setCreditLimit(creditLimit,gracePeriod);
                   JOptionPane.showMessageDialog(null, "Credit limit set");
                   
               }
               }
                   catch (NumberFormatException error) {
     System.out.println(error);
    JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number.");
 } catch (Exception error) {
    JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
 }
               
               
           
       }
});
addCreditCardButton.addActionListener(new ActionListener() {
   
       public void actionPerformed(ActionEvent e) {
           
           try{
                int cardId=Integer.parseInt(cCardID1.getText());
           boolean found = false;
             for (int i = 0; i < bankCard.size(); i++) {
                  BankCard bankCard1;
                  bankCard1=bankCard.get(i);
                  int bankCardId=bankCard1.getCardId();
                  if(bankCard1 instanceof CreditCard  && cardId==bankCardId)
                  {
                      found=true;
                      break;
                  }
                  
               };
                if(!found)
                {
                    int cvcNumber=Integer.parseInt(textField_14.getText());
           String clientName=cClientName.getText();
           String issuerBank=cIssueBank.getText();
           String bankAccount=cBankAccount.getText();
           double balanceAmount=Double.parseDouble(cBalanceAmount.getText());
           double interestRate=Double.parseDouble(cInterestRate.getText());
           String expiryDate=cDayComboBox.getSelectedItem()+"/"+cMonthComboBox.getSelectedItem()+"/"+cYearComboBox_1.getSelectedItem();
           CreditCard creditCard=new CreditCard(cardId,clientName,issuerBank,bankAccount,balanceAmount,cvcNumber,interestRate,expiryDate);
           bankCard.add(creditCard);
           JOptionPane.showMessageDialog(null, "Credit card added sucessfully");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Card already exists");
                   }
           }
           catch (NumberFormatException error) {
     System.out.println(error);
    JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number.");
 } catch (Exception error) {
    JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.");
 }
         
       }
   });
   
}
    
}
