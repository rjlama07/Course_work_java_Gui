
/**
 * Write a description of class BankGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
   *
   *
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
    private JFrame frame;
    private final JPanel panel = new JPanel();
    private JTextField dCardId1;
    private JTextField textField_1;
    private JTextField bankaccountfield;
    private JTextField amountField;
    private JTextField pinNumberField;
    private JTextField issueBankField;
    private JTextField dCardId2;
    private JTextField textField_6;
    private JTextField withdrawAmountField;
    private JTextField cCardId1;
    private JTextField cClientNameField;
    private JTextField cbankAcoountField;
    private JTextField cissueBankField;
    private JTextField cbalanceAmountField;
    private JTextField cCvcNumberField;
    private JTextField cInterestRateField;
    private JTextField cCardId2;
    private JTextField gracePeriodField;
    private JTextField creditLimitField;
    private JTextField cCardId3;

    /**
     * Launch the application.
     */
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

    /**
     * Create the application.
     */
    public BankGui() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        ArrayList<BankCard> bankCard = new ArrayList<BankCard>();
          Integer Date[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
       String Date1[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
       String Date2[] = {"2020","2021","2022"};
        JFrame debitCardFrame = new JFrame();
        JFrame creditCardFrame = new JFrame();
        frame = new JFrame();
        frame.setBounds(100, 100, 600, 375);
        debitCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.getContentPane().setLayout(null);
        panel.setBounds(0, 0, 198, 347);
        panel.setBackground(new Color(234, 76, 62));
        panel.setForeground(new Color(255, 56, 66));
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        JLabel lblBankingApp = new JLabel("Banking app");
        lblBankingApp.setForeground(Color.WHITE);
        lblBankingApp.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        lblBankingApp.setBounds(28, 152, 186, 42);
        panel.add(lblBankingApp);
        JLabel welcome = new JLabel("Welcome");
        welcome.setBounds(334, 0, 82, 42);
        frame.getContentPane().add(welcome);
        welcome.setForeground(Color.BLACK);
        welcome.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        JLabel lblNewLabel = new JLabel("Choose your prefered card type");
        lblNewLabel.setBounds(216, 73, 261, 16);
        frame.getContentPane().add(lblNewLabel);
        JButton debitCardButton = new JButton("Debit card");
        debitCardButton.setBounds(210, 114, 248, 42);
        frame.getContentPane().add(debitCardButton);

        JButton creditCardButton = new JButton("Credit Card");
        creditCardButton.setBounds(210, 168, 248, 42);
        creditCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                creditCardFrame.setVisible(true);
            }
        });

        frame.getContentPane().add(creditCardButton);
        debitCardButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                debitCardFrame.setVisible(true);
            }
        });

        JLabel lblCopyrightanimeshbhattarai = new JLabel("copyright@animeshbhattarai");
        lblCopyrightanimeshbhattarai.setForeground(Color.BLACK);
        lblCopyrightanimeshbhattarai.setFont(new Font("Lucida Grande", Font.PLAIN, 8));
        lblCopyrightanimeshbhattarai.setBounds(487, 315, 113, 42);
        frame.getContentPane().add(lblCopyrightanimeshbhattarai);
        ///// DEbit Frame
        debitCardFrame.getContentPane().setBackground(new Color(204, 248, 253));
        debitCardFrame.setBackground(new Color(0, 252, 255));
        debitCardFrame.setBounds(100, 100, 931, 603);
        debitCardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        debitCardFrame.getContentPane().setLayout(null);
        JPanel panel = new JPanel();
        panel.setBackground(new Color(169, 240, 240));
        panel.setBounds(21, 37, 891, 252);
        debitCardFrame.getContentPane().add(panel);
        panel.setLayout(null);
        JLabel cardidlabel = new JLabel("Card Id");
        cardidlabel.setBounds(28, 37, 73, 16);
        panel.add(cardidlabel);
        dCardId1 = new JTextField();
        dCardId1.setBounds(20, 54, 192, 44);
        panel.add(dCardId1);
        dCardId1.setColumns(10);
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(223, 54, 223, 44);
        panel.add(textField_1);
        JLabel cnamelable_1 = new JLabel("ClientName");
        cnamelable_1.setBounds(223, 37, 73, 16);
        panel.add(cnamelable_1);
        bankaccountfield = new JTextField();
        bankaccountfield.setColumns(10);
        bankaccountfield.setBounds(470, 54, 223, 44);
        panel.add(bankaccountfield);
        JLabel bankaccountlabel = new JLabel("Bank Account");
        bankaccountlabel.setBounds(470, 37, 92, 16);
        panel.add(bankaccountlabel);

        amountField = new JTextField();
        amountField.setColumns(10);
        amountField.setBounds(223, 128, 223, 44);
        panel.add(amountField);

        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setBounds(223, 111, 73, 16);
        panel.add(amountLabel);

        pinNumberField = new JTextField();
        pinNumberField.setColumns(10);
        pinNumberField.setBounds(470, 128, 223, 44);
        panel.add(pinNumberField);

        JLabel pinNumberLabel = new JLabel("Pin Number");
        pinNumberLabel.setBounds(470, 111, 92, 16);
        panel.add(pinNumberLabel);

        issueBankField = new JTextField();
        issueBankField.setColumns(10);
        issueBankField.setBounds(20, 128, 192, 44);
        panel.add(issueBankField);

        JLabel issuebanklabel = new JLabel("Issuer Bank");
        issuebanklabel.setBounds(28, 111, 73, 16);
        panel.add(issuebanklabel);

        JButton addDebitCard = new JButton("Add debit Card");
        addDebitCard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  try {
                  int cardId = Integer.parseInt(dCardId1.getText());
               boolean found = false;
                 for (int i = 0; i < bankCard.size(); i++) {
                      BankCard bankCard1;
                      bankCard1=bankCard.get(i);
                      int bankCardId=bankCard1.getCardID();
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
        String clientName = textField_1.getText();
        
        String bankAccount = bankaccountfield.getText();
        String issuerbank = issueBankField.getText();
        int amount = Integer.parseInt(amountField.getText());
        int pinNumber = Integer.parseInt(pinNumberField.getText());
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
        addDebitCard.setForeground(new Color(255, 146, 0));
        addDebitCard.setBounds(20, 206, 192, 29);
        panel.add(addDebitCard);

        JButton displayButton = new JButton("Display");
        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 String bankAccount = bankaccountfield.getText();
    String clientName = textField_1.getText();
    int cardId = Integer.parseInt(dCardId1.getText());
    String issueBank = issueBankField.getText();
    double bankAmount = Double.parseDouble(amountField.getText());
    int pinNumber = Integer.parseInt(pinNumberField.getText());

    System.out.println("Bank Account: " + bankAccount);
    System.out.println("Client Name: " + clientName);
    System.out.println("Card ID: " + cardId);
    System.out.println("Issuer Bank: " + issueBank);
    System.out.println("Bank Amount: " + bankAmount);
    System.out.println("PIN Number: " + pinNumber);
            }
        });
        displayButton.setForeground(new Color(4, 50, 255));
        displayButton.setBounds(223, 206, 192, 29);
        panel.add(displayButton);

        JButton clearButton = new JButton("clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 bankaccountfield.setText("");
    textField_1.setText("");
    dCardId1.setText("");
    issueBankField.setText("");
    amountField.setText("");
    pinNumberField.setText("");
                
            }
        });
        clearButton.setForeground(new Color(255, 38, 0));
        clearButton.setBounds(427, 206, 192, 29);
        panel.add(clearButton);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(169, 240, 240));
        panel_1.setBounds(21, 330, 875, 239);
        debitCardFrame.getContentPane().add(panel_1);

        JLabel cardidlabel_1 = new JLabel("Card Id");
        cardidlabel_1.setBounds(28, 37, 73, 16);
        panel_1.add(cardidlabel_1);

        dCardId2 = new JTextField();
        dCardId2.setColumns(10);
        dCardId2.setBounds(20, 54, 192, 44);
        panel_1.add(dCardId2);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(223, 54, 223, 44);
        panel_1.add(textField_6);

        withdrawAmountField = new JTextField();
        withdrawAmountField.setColumns(10);
        withdrawAmountField.setBounds(470, 54, 223, 44);
        panel_1.add(withdrawAmountField);

        JLabel withdrawAmountlabel = new JLabel("Withdrawl Amount");
        withdrawAmountlabel.setBounds(470, 37, 125, 16);
        panel_1.add(withdrawAmountlabel);

        JLabel pinlable = new JLabel("Pin Number");
        pinlable.setBounds(223, 37, 92, 16);
        panel_1.add(pinlable);

        JButton withdrawButton = new JButton("Withdraw ");
        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex=-1;
               try{
                   int cardId=Integer.parseInt(dCardId2.getText());
               boolean found = false;
               BankCard bankCard1=null;
                  for (int i = 0; i < bankCard.size(); i++) {
                      
                      bankCard1=bankCard.get(i);
                      
                      int bankCardId=bankCard1.getCardID();
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
                       int pin = ((DebitCard) bankCard1).getPINnumber();
                       int inputPin=Integer.parseInt(textField_6.getText());
                       if(pin!=inputPin)
                       {
               
                            JOptionPane.showMessageDialog(null, "InValid Pin", "Error", JOptionPane.ERROR_MESSAGE);
                           
                       
                       }
                       else
                       {
                           int amount=Integer.parseInt(withdrawAmountField.getText());
                           int balance=bankCard1.getBalanceAmount();
                           if(amount>balance)
                           {
                                
                                JOptionPane.showMessageDialog(null, "Insufficient Balance", "Error", JOptionPane.ERROR_MESSAGE);
                           }
                           else
                           {
                               bankCard.get(selectedIndex).setBalanceAmount(balance-amount);
                               JOptionPane.showMessageDialog(null, "Withdrawn sucessfull");
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
        withdrawButton.setForeground(new Color(255, 38, 0));
        withdrawButton.setBounds(20, 180, 673, 59);
        panel_1.add(withdrawButton);

        JLabel cardidlabel_1_1 = new JLabel("Withdrawl Date");
        cardidlabel_1_1.setBounds(28, 118, 184, 16);
        panel_1.add(cardidlabel_1_1);

        JComboBox dayComboBox = new JComboBox(Date);
        dayComboBox.setBounds(24, 141, 77, 27);
        panel_1.add(dayComboBox);

        JComboBox monthComboBox = new JComboBox(Date1);
        monthComboBox.setBounds(100, 141, 77, 27);
        panel_1.add(monthComboBox);

        JComboBox yearComboBox = new JComboBox(Date2);
        yearComboBox.setBounds(184, 141, 92, 27);
        panel_1.add(yearComboBox);

        JLabel withdraw = new JLabel("WithDraw");
        withdraw.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        withdraw.setBounds(31, 290, 237, 40);
        debitCardFrame.getContentPane().add(withdraw);

        JLabel lblDebitCard = new JLabel("Debit Card");
        lblDebitCard.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        lblDebitCard.setBounds(385, 0, 237, 40);
        debitCardFrame.getContentPane().add(lblDebitCard);

        // Credit Card Frame

        creditCardFrame.getContentPane().setBackground(new Color(204, 248, 253));
        creditCardFrame.setBackground(new Color(0, 252, 255));
        creditCardFrame.setBounds(100, 100, 931, 603);
        creditCardFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        creditCardFrame.getContentPane().setLayout(null);
        JPanel mainCreditPanel1 = new JPanel();
        mainCreditPanel1.setBackground(new Color(169, 240, 240));
        mainCreditPanel1.setBounds(20, 32, 891, 262);
        creditCardFrame.getContentPane().add(mainCreditPanel1);
        mainCreditPanel1.setLayout(null);

        cCardId1 = new JTextField();
        cCardId1.setBounds(24, 56, 187, 39);
        mainCreditPanel1.add(cCardId1);
        cCardId1.setColumns(10);

        JLabel lblCardId = new JLabel("Card Id");
        lblCardId.setBounds(24, 43, 61, 16);
        mainCreditPanel1.add(lblCardId);

        JLabel label2 = new JLabel("Client Name");
        label2.setBounds(231, 43, 141, 16);
        mainCreditPanel1.add(label2);

        cClientNameField = new JTextField();
        cClientNameField.setColumns(10);
        cClientNameField.setBounds(231, 56, 187, 39);
        mainCreditPanel1.add(cClientNameField);

        cbankAcoountField = new JTextField();
        cbankAcoountField.setColumns(10);
        cbankAcoountField.setBounds(441, 56, 187, 39);
        mainCreditPanel1.add(cbankAcoountField);

        JLabel label3 = new JLabel("Bank Account");
        label3.setBounds(443, 43, 101, 16);
        mainCreditPanel1.add(label3);

        JLabel label4 = new JLabel("Issuer bank");
        label4.setBounds(24, 111, 89, 16);
        mainCreditPanel1.add(label4);

        cissueBankField = new JTextField();
        cissueBankField.setColumns(10);
        cissueBankField.setBounds(24, 124, 187, 39);
        mainCreditPanel1.add(cissueBankField);

        JLabel label5 = new JLabel("Balance Amount");
        label5.setBounds(231, 111, 141, 16);
        mainCreditPanel1.add(label5);

        cbalanceAmountField = new JTextField();
        cbalanceAmountField.setColumns(10);
        cbalanceAmountField.setBounds(231, 124, 187, 39);
        mainCreditPanel1.add(cbalanceAmountField);

        JLabel label6 = new JLabel("Cvc Number");
        label6.setBounds(443, 111, 101, 16);
        mainCreditPanel1.add(label6);

        cCvcNumberField = new JTextField();
        cCvcNumberField.setColumns(10);
        cCvcNumberField.setBounds(441, 124, 187, 39);
        mainCreditPanel1.add(cCvcNumberField);

        cInterestRateField = new JTextField();
        cInterestRateField.setColumns(10);
        cInterestRateField.setBounds(24, 182, 187, 39);
        mainCreditPanel1.add(cInterestRateField);

        JLabel label7 = new JLabel("Interest Rate");
        label7.setBounds(26, 169, 101, 16);
        mainCreditPanel1.add(label7);

        JComboBox cDayComboBox = new JComboBox(Date);
        cDayComboBox.setBounds(245, 189, 68, 27);
        mainCreditPanel1.add(cDayComboBox);

        JComboBox cMonthComboField = new JComboBox(Date1);
        cMonthComboField.setBounds(322, 189, 68, 27);
        mainCreditPanel1.add(cMonthComboField);

        JComboBox cYearComboField = new JComboBox(Date2);
        cYearComboField.setBounds(409, 189, 89, 27);
        mainCreditPanel1.add(cYearComboField);

        JLabel labelMonth = new JLabel("DD");
        labelMonth.setBounds(252, 169, 37, 16);
        mainCreditPanel1.add(labelMonth);

        JLabel lblMm = new JLabel("MM");
        lblMm.setBounds(322, 169, 37, 16);
        mainCreditPanel1.add(lblMm);

        JLabel labelYear = new JLabel("YYYY");
        labelYear.setBounds(417, 169, 37, 16);
        mainCreditPanel1.add(labelYear);

        JButton cAddCreditButton = new JButton("Add Credit Card");
        cAddCreditButton.setForeground(new Color(255, 146, 0));
        cAddCreditButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                  try {
        int cardId = Integer.parseInt(cCardId1.getText());
        boolean found = false;
        for (int i = 0; i < bankCard.size(); i++) {
            BankCard bankCard1;
            bankCard1 = bankCard.get(i);
            int bankCardId = bankCard1.getCardID();
            if (bankCard1 instanceof CreditCard && cardId == bankCardId) {
                found = true;
                break;
            }
        }
        switch (found ? 1 : 0) {
            case 0:
                int cvcNumber = Integer.parseInt(cCvcNumberField.getText());
                String clientName = cClientNameField.getText();
                String issuerBank = cissueBankField.getText();
                String bankAccount = cbankAcoountField.getText();
                int balanceAmount = Integer.parseInt(cbalanceAmountField.getText());
                double interestRate = Double.parseDouble(cInterestRateField.getText());
                String expiryDate = cDayComboBox.getSelectedItem() + "/" + cMonthComboField.getSelectedItem() + "/" + cYearComboField.getSelectedItem();
                CreditCard creditCard = new CreditCard(cardId, clientName, issuerBank, bankAccount, balanceAmount, cvcNumber, interestRate, expiryDate);
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
        cAddCreditButton.setBackground(new Color(255, 146, 0));
        cAddCreditButton.setBounds(24, 228, 430, 29);
        mainCreditPanel1.add(cAddCreditButton);

        JPanel mainCreditPanel2 = new JPanel();
        mainCreditPanel2.setLayout(null);
        mainCreditPanel2.setBackground(new Color(169, 240, 240));
        mainCreditPanel2.setBounds(20, 317, 891, 252);
        creditCardFrame.getContentPane().add(mainCreditPanel2);

        JPanel creditPanel3 = new JPanel();
        creditPanel3.setBounds(16, 6, 405, 240);
        mainCreditPanel2.add(creditPanel3);
        creditPanel3.setLayout(null);

        JLabel label9 = new JLabel("Card Id");
        label9.setBounds(6, 52, 45, 16);
        creditPanel3.add(label9);

        JLabel label10 = new JLabel("New Grace Period");
        label10.setBounds(6, 83, 140, 16);
        creditPanel3.add(label10);

        cCardId2 = new JTextField();
        cCardId2.setBounds(158, 47, 130, 26);
        cCardId2.setColumns(10);
        creditPanel3.add(cCardId2);

        gracePeriodField = new JTextField();
        gracePeriodField.setBounds(158, 78, 130, 26);
        gracePeriodField.setColumns(10);
        creditPanel3.add(gracePeriodField);

        JLabel label11 = new JLabel("New Credit Limit");
        label11.setBounds(6, 121, 110, 16);
        creditPanel3.add(label11);

        creditLimitField = new JTextField();
        creditLimitField.setColumns(10);
        creditLimitField.setBounds(158, 116, 130, 26);
        creditPanel3.add(creditLimitField);

        JButton setCreditLimitButton = new JButton("Set Credit Limit");
        setCreditLimitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                try{
                   int cardId=Integer.parseInt(cCardId2.getText());
              
                int caseValue=0;
               int foundIndex=-1;
                int i = 0;
                    while (i < bankCard.size()) {
                        BankCard bankCard1 = bankCard.get(i);
                        int bankCardId = bankCard1.getCardID();
                        if (bankCard1 instanceof CreditCard && cardId == bankCardId) {
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
            int gracePeriod = Integer.parseInt(gracePeriodField.getText());
            double creditLimit = Double.parseDouble(creditLimitField.getText());
            ((CreditCard) bankCard.get(foundIndex)).setCreditLimit(creditLimit, gracePeriod);
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
        setCreditLimitButton.setForeground(new Color(255, 146, 0));
        setCreditLimitButton.setBackground(new Color(255, 146, 0));
        setCreditLimitButton.setBounds(6, 154, 346, 29);
        creditPanel3.add(setCreditLimitButton);

        JLabel lblSetCreditLimit = new JLabel("Set Credit Limit");
        lblSetCreditLimit.setForeground(new Color(147, 32, 146));
        lblSetCreditLimit.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        lblSetCreditLimit.setBounds(6, 6, 158, 28);
        creditPanel3.add(lblSetCreditLimit);

        JPanel creditPanel4 = new JPanel();
        creditPanel4.setBounds(457, 6, 405, 240);
        mainCreditPanel2.add(creditPanel4);
        creditPanel4.setLayout(null);

        JLabel lblCancleCard = new JLabel("Cancle Card");
        lblCancleCard.setForeground(new Color(147, 32, 146));
        lblCancleCard.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
        lblCancleCard.setBounds(6, 6, 158, 28);
        creditPanel4.add(lblCancleCard);

        cCardId3 = new JTextField();
        cCardId3.setColumns(10);
        cCardId3.setBounds(6, 91, 376, 39);
        creditPanel4.add(cCardId3);

        JLabel label12 = new JLabel("Card Id");
        label12.setBounds(6, 63, 376, 16);
        creditPanel4.add(label12);

        JButton cancleButton = new JButton("Cancle");
        cancleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int cardId=Integer.parseInt(cCardId2.getText());
               boolean found = false;
               int foundIndex=-1;
                int i = 0;
                        while (i < bankCard.size()) {
                            BankCard bankCard1;
                            bankCard1 = bankCard.get(i);
                            int bankCardId = bankCard1.getCardID();
                            if (bankCard1 instanceof CreditCard && cardId == bankCardId) {
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
        cancleButton.setForeground(new Color(255, 38, 0));
        cancleButton.setBackground(new Color(255, 38, 0));
        cancleButton.setBounds(6, 150, 346, 29);
        creditPanel4.add(cancleButton);

        JLabel title = new JLabel("Credit Card");
        title.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
        title.setBounds(388, 6, 158, 28);
        creditCardFrame.getContentPane().add(title);

    }
}
