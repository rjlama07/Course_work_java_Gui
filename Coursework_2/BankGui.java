/**
 * This is GUI class which is used connect out application with the User Inteference.
 * author@ Pritee Bhattarai
 * ID: NP05CP4A220092
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

public class BankGui
{
        ArrayList<BankCard> bankCard = new ArrayList<BankCard>();
    private JFrame frame;
    private JTextField dClientNameField;
    private JTextField dBankAccountField;
    private JTextField dCardId1;
    private JTextField dissuebank;
    private JLabel labelDIssuerBank;
    private JTextField dBalanceAmountField;
    private JLabel dBalanceAmount;
    private JTextField dPinNumberField;
    private JLabel dPinNumber;
    private JTextField dCardId2;
    private JTextField dAmountField;
    private JTextField d2PinNumberField;
    private JLabel d2CardId;
    private JLabel d2pinlabel;
    private JLabel dWithdrawlAmountlabel;
    private JButton withdrawsButton;
    private JPanel panel_1;
    private JTextField cClientNamefield;
    private JTextField cBankAccountField;
    private JLabel clientNameLabel;
    private JLabel lblNewLabel_10;
    private JTextField cCardID1;
    private JLabel lblNewLabel_1_2;
    private JTextField cIssueBankField;
    private JLabel cIssueBanklabel;
    private JTextField cBalanceAmountField;
    private JLabel cbalanceAmountlabel;
    private JTextField cCvcNumberField;
    private JLabel lblNewLabel_13;
    private JButton addToCreditCard;
    private JLabel lblNewLabel_14;
    private JTextField cCardId2;
    private JTextField cCreditLimitField;
    private JTextField cNewGraceField;
    private JLabel cCardlabel;
    private JLabel cGracePeriod;
    private JLabel creditLimitlabel;
    private JButton cancleCreditButton;
    private JTextField cInterestRateField;
    private JLabel lblNewLabel_18;
    private JLabel expirationDateField;
    private JButton cSetButton;
    private JTextField cCardId3Field;


    //for launching the frame
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

    //initialize the appication
    public BankGui() {
       initialize();
    }

    //creates the frame 
    private void initialize() {
       Integer Date[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
       String Date1[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
       String Date2[] = {"2020","2021","2022"};
       frame = new JFrame();
       frame.setBackground(new Color(255, 64, 255));
       frame.setBounds(100, 100, 1008, 587);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().setLayout(null);
       
       JPanel panel = new JPanel();
       panel.setBackground(new Color(176, 241, 245));
       panel.setBounds(0, -19, 1024, 584);
       frame.getContentPane().add(panel);
       panel.setLayout(null);
       
       dClientNameField = new JTextField();
       dClientNameField.setBounds(28, 183, 130, 26);
       panel.add(dClientNameField);
       dClientNameField.setColumns(10);
       
       dBankAccountField = new JTextField();
       dBankAccountField.setColumns(10);
       dBankAccountField.setBounds(28, 222, 130, 26);
       panel.add(dBankAccountField);
       
       JLabel labelDclientnmae = new JLabel("Client name");
       labelDclientnmae.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       labelDclientnmae.setBounds(32, 167, 88, 16);
       panel.add(labelDclientnmae);
       
       JLabel labelDBankAccount = new JLabel("Bank Account");
       labelDBankAccount.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       labelDBankAccount.setBounds(28, 210, 92, 16);
       panel.add(labelDBankAccount);
       
       dCardId1 = new JTextField();
       dCardId1.setColumns(10);
       dCardId1.setBounds(28, 98, 130, 26);
       panel.add(dCardId1);
       
       JLabel lableDCardId = new JLabel("Card ID");
       lableDCardId.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       lableDCardId.setBounds(28, 83, 88, 16);
       panel.add(lableDCardId);
       
       dissuebank = new JTextField();
       dissuebank.setColumns(10);
       dissuebank.setBounds(28, 137, 130, 26);
       panel.add(dissuebank);
       
       labelDIssuerBank = new JLabel("IssuerBank");
       labelDIssuerBank.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       labelDIssuerBank.setBounds(28, 122, 92, 16);
       panel.add(labelDIssuerBank);
       
       dBalanceAmountField = new JTextField();
       dBalanceAmountField.setColumns(10);
       dBalanceAmountField.setBounds(28, 260, 130, 26);
       panel.add(dBalanceAmountField);
       
       dBalanceAmount = new JLabel("Balance Amount");
       dBalanceAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       dBalanceAmount.setBounds(28, 248, 109, 16);
       panel.add(dBalanceAmount);
       
       dPinNumberField = new JTextField();
       dPinNumberField.setColumns(10);
       dPinNumberField.setBounds(30, 305, 130, 26);
       panel.add(dPinNumberField);
       
       dPinNumber = new JLabel("Pin Number");
       dPinNumber.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       dPinNumber.setBounds(30, 293, 92, 16);
       panel.add(dPinNumber);
       
       JButton dAddDebitCardButton = new JButton("Add Debit card");
       dAddDebitCardButton.setBackground(Color.RED);
       dAddDebitCardButton.setForeground(new Color(0, 0, 0));
       dAddDebitCardButton.setBorderPainted(true);
       dAddDebitCardButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       dAddDebitCardButton.addActionListener(new ActionListener() {
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
                         
                              JOptionPane.showMessageDialog(null, "Card Id already exists", "Error", JOptionPane.ERROR_MESSAGE);
                          
                       return;
                   }
        String clientName = dClientNameField.getText();
        
        String bankAccount = dBankAccountField.getText();
        String issuerbank = dissuebank.getText();
        int amount = Integer.parseInt(dBalanceAmountField.getText());
        int pinNumber = Integer.parseInt(dPinNumberField.getText());
        DebitCard card = new DebitCard(amount, cardId, bankAccount, issuerbank, clientName, pinNumber);
        bankCard.add(card);
        JOptionPane.showMessageDialog(null, "Debit card added successfully");
     } catch (NumberFormatException error) {
         System.out.println(error);
       
        JOptionPane.showMessageDialog(null, "Invalid input format. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        
     } catch (Exception error) {
        
          JOptionPane.showMessageDialog(null, "An error occurred. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
     }
               
                
           }
       });
       dAddDebitCardButton.setBounds(184, 183, 211, 64);
       panel.add(dAddDebitCardButton);
       
       JButton dDisplayButton = new JButton("Display");
       dDisplayButton.setForeground(new Color(255, 64, 255));
       dDisplayButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String bankAccount = dBankAccountField.getText();
    String clientName = dClientNameField.getText();
    int cardId = Integer.parseInt(dCardId1.getText());
    String issueBank = dissuebank.getText();
    double bankAmount = Double.parseDouble(dBalanceAmountField.getText());
    int pinNumber = Integer.parseInt(dPinNumberField.getText());

    System.out.println("Bank Account: " + bankAccount);
    System.out.println("Client Name: " + clientName);
    System.out.println("Card ID: " + cardId);
    System.out.println("Issuer Bank: " + issueBank);
    System.out.println("Bank Amount: " + bankAmount);
    System.out.println("PIN Number: " + pinNumber);


           }
       });
       dDisplayButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       dDisplayButton.setBounds(184, 99, 211, 64);
       panel.add(dDisplayButton);
       
       JButton dClearButton = new JButton("Clear");
       dClearButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                               dBankAccountField.setText("");
    dClientNameField.setText("");
    dCardId1.setText("");
    dissuebank.setText("");
    dBalanceAmountField.setText("");
    dPinNumberField.setText("");
           }
       });
       dClearButton.setForeground(new Color(255, 38, 0));
       dClearButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       dClearButton.setBounds(184, 260, 211, 50);
       panel.add(dClearButton);
       
       JLabel lblNewLabel_5 = new JLabel("Debit Card");
       lblNewLabel_5.setFont(new Font("Lucida Grande", Font.BOLD, 16));
       lblNewLabel_5.setBounds(28, 26, 184, 45);
       panel.add(lblNewLabel_5);
       
       dCardId2 = new JTextField();
       dCardId2.setColumns(10);
       dCardId2.setBounds(34, 370, 130, 26);
       panel.add(dCardId2);
       
       dAmountField = new JTextField();
       dAmountField.setColumns(10);
       dAmountField.setBounds(315, 370, 130, 26);
       panel.add(dAmountField);
       
       d2PinNumberField = new JTextField();
       d2PinNumberField.setColumns(10);
       d2PinNumberField.setBounds(176, 370, 130, 26);
       panel.add(d2PinNumberField);
       
       d2CardId = new JLabel("Card ID");
       d2CardId.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       d2CardId.setBounds(34, 355, 109, 16);
       panel.add(d2CardId);
       
       d2pinlabel = new JLabel("Pin number");
       d2pinlabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       d2pinlabel.setBounds(176, 354, 109, 16);
       panel.add(d2pinlabel);
       
       dWithdrawlAmountlabel = new JLabel("Withdrawl Amount");
       dWithdrawlAmountlabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       dWithdrawlAmountlabel.setBounds(313, 355, 109, 16);
       panel.add(dWithdrawlAmountlabel);
       
       JComboBox dayComboBoxField = new JComboBox(Date);
       dayComboBoxField.setBounds(28, 436, 58, 27);
       panel.add(dayComboBoxField);
       
       JComboBox monthComboBoxField = new JComboBox(Date1);
       monthComboBoxField.setBounds(83, 436, 75, 27);
       panel.add(monthComboBoxField);
       
       JComboBox yearComboBoxField = new JComboBox(Date2);
       yearComboBoxField.setBounds(155, 436, 116, 27);
       panel.add(yearComboBoxField);
       
       JLabel labelDate = new JLabel("Date of Withdrawl");
       labelDate.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       labelDate.setBounds(28, 408, 109, 16);
       panel.add(labelDate);
       
       withdrawsButton = new JButton("Withdraw");
       withdrawsButton.setForeground(new Color(255, 38, 0));
       withdrawsButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       withdrawsButton.setBounds(26, 475, 419, 50);
       panel.add(withdrawsButton);
        
       withdrawsButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               int selectedIndex=-1;
               try{
                   int cardId=Integer.parseInt(dCardId2.getText());
               boolean found = false;
               BankCard bankCard1=null;
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
                       
                        JOptionPane.showMessageDialog(null, "NO card found of given id please input correct ID.", "Error", JOptionPane.ERROR_MESSAGE);
                       
                   }
                   else {
                       int pin = ((DebitCard) bankCard1).getPinNumber();
                       int inputPin=Integer.parseInt(d2PinNumberField.getText());
                       if(pin!=inputPin)
                       {
               
                            JOptionPane.showMessageDialog(null, "InValid Pin", "Error", JOptionPane.ERROR_MESSAGE);
                           
                       
                       }
                       else
                       {
                           double amount=Double.parseDouble(dAmountField.getText());
                           double balance=bankCard1.getBalanceAmount();
                           if(amount>balance)
                           {
                                
                                JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.ERROR_MESSAGE);
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
     
         JOptionPane.showMessageDialog(null, "Not a valid input.", "Error", JOptionPane.ERROR_MESSAGE);
        
     } catch (Exception error) {
        
         JOptionPane.showMessageDialog(null, "Something went wrong. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
     }
               
                       

           }
       });
       
       panel_1 = new JPanel();
       panel_1.setBackground(new Color(176, 241, 245));
       panel_1.setLayout(null);
       panel_1.setBounds(474, 6, 528, 559);
       panel.add(panel_1);
       
       cClientNamefield = new JTextField();
       cClientNamefield.setColumns(10);
       cClientNamefield.setBounds(42, 93, 130, 26);
       panel_1.add(cClientNamefield);
       
       cBankAccountField = new JTextField();
       cBankAccountField.setColumns(10);
       cBankAccountField.setBounds(331, 89, 130, 26);
       panel_1.add(cBankAccountField);
       
       clientNameLabel = new JLabel("Client name");
       clientNameLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       clientNameLabel.setBounds(46, 77, 88, 16);
       panel_1.add(clientNameLabel);
       
       lblNewLabel_10 = new JLabel("Bank Account");
       lblNewLabel_10.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       lblNewLabel_10.setBounds(331, 77, 92, 16);
       panel_1.add(lblNewLabel_10);
       
       cCardID1 = new JTextField();
       cCardID1.setColumns(10);
       cCardID1.setBounds(184, 93, 130, 26);
       panel_1.add(cCardID1);
       
       lblNewLabel_1_2 = new JLabel("Card ID");
       lblNewLabel_1_2.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       lblNewLabel_1_2.setBounds(196, 77, 88, 16);
       panel_1.add(lblNewLabel_1_2);
       
       cIssueBankField = new JTextField();
       cIssueBankField.setColumns(10);
       cIssueBankField.setBounds(42, 132, 130, 26);
       panel_1.add(cIssueBankField);
       
       cIssueBanklabel = new JLabel("Issue Bank");
       cIssueBanklabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cIssueBanklabel.setBounds(42, 120, 92, 16);
       panel_1.add(cIssueBanklabel);
       
       cBalanceAmountField = new JTextField();
       cBalanceAmountField.setColumns(10);
       cBalanceAmountField.setBounds(189, 132, 130, 26);
       panel_1.add(cBalanceAmountField);
       
       cbalanceAmountlabel = new JLabel("Balance Amount");
       cbalanceAmountlabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cbalanceAmountlabel.setBounds(189, 120, 109, 16);
       panel_1.add(cbalanceAmountlabel);
       
       cCvcNumberField = new JTextField();
       cCvcNumberField.setColumns(10);
       cCvcNumberField.setBounds(331, 132, 130, 26);
       panel_1.add(cCvcNumberField);
       
       lblNewLabel_13 = new JLabel("Cvc number");
       lblNewLabel_13.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       lblNewLabel_13.setBounds(331, 120, 92, 16);
       panel_1.add(lblNewLabel_13);
       
       addToCreditCard = new JButton("ADD CREDIT CARD");
       addToCreditCard.setForeground(new Color(255, 146, 0));
       addToCreditCard.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       addToCreditCard.setBounds(30, 229, 431, 60);
       panel_1.add(addToCreditCard);
       
       
       
       lblNewLabel_14 = new JLabel("Credit Card");
       lblNewLabel_14.setFont(new Font("Lucida Grande", Font.BOLD, 16));
       lblNewLabel_14.setBounds(43, 20, 184, 45);
       panel_1.add(lblNewLabel_14);
       
       cCardId2 = new JTextField();
       cCardId2.setColumns(10);
       cCardId2.setBounds(53, 346, 130, 26);
       panel_1.add(cCardId2);
       
       cCreditLimitField = new JTextField();
       cCreditLimitField.setColumns(10);
       cCreditLimitField.setBounds(350, 344, 130, 26);
       panel_1.add(cCreditLimitField);
       
       cNewGraceField = new JTextField();
       cNewGraceField.setColumns(10);
       cNewGraceField.setBounds(196, 346, 130, 26);
       panel_1.add(cNewGraceField);
       
       cCardlabel = new JLabel("Card ID");
       cCardlabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cCardlabel.setBounds(53, 331, 109, 16);
       panel_1.add(cCardlabel);
       
       cGracePeriod = new JLabel("New Grace Period");
       cGracePeriod.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cGracePeriod.setBounds(206, 331, 109, 16);
       panel_1.add(cGracePeriod);
       
       creditLimitlabel = new JLabel("New Credit Limit");
       creditLimitlabel.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       creditLimitlabel.setBounds(350, 329, 109, 16);
       panel_1.add(creditLimitlabel);
       
       cancleCreditButton = new JButton("cancel credit card");
       cancleCreditButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               int cardId=Integer.parseInt(cCardId2.getText());
               boolean found = false;
               int foundIndex=-1;
                int i = 0;
                        while (i < bankCard.size()) {
                            BankCard bankCard1;
                            bankCard1 = bankCard.get(i);
                            int bankCardId = bankCard1.getCardId();
                            if (bankCard1 instanceof Creditcard && cardId == bankCardId) {
                                foundIndex = i;
                                found = true;
                                break;
                            }
                            i++;
                        }
                   if(!found)
                   {                       
                       JOptionPane.showMessageDialog(null, "No card found for the given ID", "Error", JOptionPane.ERROR_MESSAGE);

                   }
                   else{
                       bankCard.remove(foundIndex);     
                                              JOptionPane.showMessageDialog(null, "Credit Card canceled", "Error", JOptionPane.ERROR_MESSAGE);
                   }
                   
           }
       });
       cancleCreditButton.setForeground(new Color(255, 38, 0));
       cancleCreditButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cancleCreditButton.setBounds(48, 490, 447, 51);
       panel_1.add(cancleCreditButton);
       
       cInterestRateField = new JTextField();
       cInterestRateField.setColumns(10);
       cInterestRateField.setBounds(42, 182, 130, 26);
       panel_1.add(cInterestRateField);
       
       lblNewLabel_18 = new JLabel("Interest Rate");
       lblNewLabel_18.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       lblNewLabel_18.setBounds(42, 170, 109, 16);
       panel_1.add(lblNewLabel_18);
       
       expirationDateField = new JLabel("Expiration Date");
       expirationDateField.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       expirationDateField.setBounds(184, 159, 92, 16);
       panel_1.add(expirationDateField);
       
       cSetButton = new JButton("Set");
       cSetButton.setForeground(new Color(255, 146, 0));
       cSetButton.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cSetButton.setBounds(46, 381, 452, 45);
       panel_1.add(cSetButton);
       
       JComboBox cDayComboBox = new JComboBox(Date);
       cDayComboBox.setBounds(184, 181, 58, 27);
       panel_1.add(cDayComboBox);
       
       JComboBox cMonthComboBox = new JComboBox(Date1);
       cMonthComboBox.setBounds(239, 181, 75, 27);
       panel_1.add(cMonthComboBox);
       JComboBox cYearComboBox_1 = new JComboBox(Date2);
       cYearComboBox_1.setBounds(310, 181, 116, 27);
       panel_1.add(cYearComboBox_1);
       cCardId3Field = new JTextField();
       cCardId3Field.setColumns(10);
       cCardId3Field.setBounds(53, 450, 438, 37);
       panel_1.add(cCardId3Field);
       
       JLabel cCardIdlabe = new JLabel("Card ID");
       cCardIdlabe.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
       cCardIdlabe.setBounds(53, 435, 109, 16);
       panel_1.add(cCardIdlabe);
       cSetButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              
               
                try{
                   int cardId=Integer.parseInt(cCardId2.getText());
              
                int caseValue=0;
               int foundIndex=-1;
                int i = 0;
                    while (i < bankCard.size()) {
                        BankCard bankCard1 = bankCard.get(i);
                        int bankCardId = bankCard1.getCardId();
                        if (bankCard1 instanceof Creditcard && cardId == bankCardId) {
                            foundIndex = i;
                            caseValue = 1;
                            break;
                        }
                        i++;
                    }
                    
      switch (caseValue) {
        case 0:
            JOptionPane.showMessageDialog(null, "No card found for the given ID", "Error", JOptionPane.ERROR_MESSAGE);
            break;
        case 1:
            int gracePeriod = Integer.parseInt(cNewGraceField.getText());
            double creditLimit = Double.parseDouble(cCreditLimitField.getText());
            ((Creditcard) bankCard.get(foundIndex)).setCreditLimit(creditLimit, gracePeriod);
            JOptionPane.showMessageDialog(null, "Credit limit set");
            break;
        default:
            JOptionPane.showMessageDialog(null, "Unexpected value of caseValue: " + caseValue, "Error", JOptionPane.ERROR_MESSAGE);
            break;
    }


                  
                   }
                       catch (NumberFormatException error) {
        JOptionPane.showMessageDialog(null, "Not a valid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        
     } catch (Exception error) {

        JOptionPane.showMessageDialog(null, "Something went Wrong. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
     }
                   
                   
               
           }
    });
    addToCreditCard.addActionListener(new ActionListener() {
       
           public void actionPerformed(ActionEvent e) {
             try {
        int cardId = Integer.parseInt(cCardID1.getText());
        boolean found = false;
        for (int i = 0; i < bankCard.size(); i++) {
            BankCard bankCard1;
            bankCard1 = bankCard.get(i);
            int bankCardId = bankCard1.getCardId();
            if (bankCard1 instanceof Creditcard && cardId == bankCardId) {
                found = true;
                break;
            }
        }
        switch (found ? 1 : 0) {
            case 0:
                int cvcNumber = Integer.parseInt(cCvcNumberField.getText());
                String clientName = cClientNamefield.getText();
                String issuerBank = cIssueBankField.getText();
                String bankAccount = cBankAccountField.getText();
                double balanceAmount = Double.parseDouble(cBalanceAmountField.getText());
                double interestRate = Double.parseDouble(cInterestRateField.getText());
                String expiryDate = cDayComboBox.getSelectedItem() + "/" + cMonthComboBox.getSelectedItem() + "/" + cYearComboBox_1.getSelectedItem();
                Creditcard creditCard = new Creditcard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expiryDate);
                bankCard.add(creditCard);
                JOptionPane.showMessageDialog(null, "Successfully created Card");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Id is already taken", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    } catch (NumberFormatException error) {
        System.out.println(error);
        JOptionPane.showMessageDialog(null, "Not a valid input. Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception error) {
        JOptionPane.showMessageDialog(null, "Something went Wrong. Please try again later.", "Error", JOptionPane.ERROR_MESSAGE);
    }
         
           }
       });
       
    }

}
