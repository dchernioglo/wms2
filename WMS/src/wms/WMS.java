/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wms;

import java.util.Date;
import java.util.LinkedList;

public class WMS {
    
     //atributes
    private Date systemDate;
    private InstrumentBucket from = null;
    private InstrumentBucket to;
    private FinancialInstrument what;
    private int quantity;
    private static LinkedList<UserAccount> users = new LinkedList<UserAccount>();
    
    //Constructors
    public WMS(){} //Argumentless Constructor
    
    //Methods
    //public boolean submitNewCustomerRegistration(int inAcctID, String inName, String inPhone, String inEmail, String inSSN, String[] inAddress, String inDOB, String inUserName, String inPassword){};
    
    public static boolean addUserAccount(String inName, String inPhone, String inEmail, String inSSN, String[] inAddress, String inDOB, String inUserName, String inPassword)
    {
        users.add(new UserAccount(inName, inPhone, inEmail, inSSN, inAddress, inDOB, inUserName, inPassword));
        return true;
    }
    
    
    public static void main(String[] args) {
        WMS c = new WMS();
        WelcomeScreen ws = new WelcomeScreen();
        ws.setVisible(true);
    }
    
}
