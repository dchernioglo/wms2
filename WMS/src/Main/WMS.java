package Main;

import UserInterface.WelcomeScreen;
import UserInterface.WelcomeScreen;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JFrame;
import WMSLogic.FinancialInstrument;
import WMSLogic.FinancialInstrument;
import WMSLogic.InstrumentBucket;
import WMSLogic.InstrumentBucket;
import WMSLogic.UserAccount;
import WMSLogic.UserAccount;

public class WMS {
    
     //atributes
    private Date systemDate;
    private InstrumentBucket from = null;
    private InstrumentBucket to;
    private FinancialInstrument what;
    private int quantity;
    private static LinkedList<UserAccount> users = new LinkedList<UserAccount>();
    
    //Constructors
    //public WMS(){} //Argumentless Constructor
    
    //Methods
    //public boolean submitNewCustomerRegistration(int inAcctID, String inName, String inPhone, String inEmail, String inSSN, String[] inAddress, String inDOB, String inUserName, String inPassword){};
    
    public static boolean addUserAccount(String inName, String inPhone, String inEmail, String inSSN, String[] inAddress, String inDOB, String inUserName, char[] inPassword)
    {
        users.add(new UserAccount(inName, inPhone, inEmail, inSSN, inAddress, inDOB, inUserName, inPassword));
        return true;
    }

    public static UserAccount login(String inUserName, char[] inPassword)
    {   
        for (int i = 0; i < users.size(); i ++)
        {
            if ((inUserName.equals(users.get(i).getUserName())) && (Arrays.equals(inPassword,users.get(i).getPassword()))){return users.get(i);}
        }
        return null;
    }
     
    public static void main(String[] args) {
        WMS c = new WMS();
        WelcomeScreen ws = new WelcomeScreen();
        ws.setVisible(true);
    }
    
}
