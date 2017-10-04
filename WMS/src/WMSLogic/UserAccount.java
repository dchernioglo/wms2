
package WMSLogic;

import java.util.LinkedList;

public class UserAccount {
    
    //Attributes
    private static int numAcct = 0;
    private int acctID;
    private String name;
    private String phone;
    private String email;
    private String SSN;
    private String[] address = new String[4];
    private String DOB;
    private String userName;
    private char[] password;
    private double balance;
    private static LinkedList<InstrumentBucket> buckets = new LinkedList<InstrumentBucket>();
    
    //Constructors
    public UserAccount(){};
    
    public UserAccount(String inName, String inPhone, String inEmail, String inSSN, String[] inAddress, String inDOB, String inUserName, char[] inPassword)
    {
        acctID = numAcct++; //Creating unique account ID
        name = inName;
        phone = inPhone;
        email = inEmail;
        SSN = inSSN;
        
        for (int i = 0; i < address.length; i++) 
            address[i] = inAddress[i];
        
        DOB = inDOB;
        userName = inUserName;
        password = inPassword;
        balance = 0;
       
    }
    
    //Methods
    public String getUserName(){return userName;}
    public char[] getPassword(){return password;}
    public String getName() { return name; }
    public double getBalance() { return balance;}
    public int getUserAcctID() { return acctID;}
    public String getPortName(int index) { return buckets.get(index).getName(); }
    public int getNumPort() { return buckets.size(); }
    
    
    public void addPortfolioToList(String inName, String inRisk){
        buckets.add(new Portfolio(inName, inRisk));
        //return (Portfolio)buckets.get(InstrumentBucket.getNumBucket() - 1);
    }
    
    public void addFunds(double inMoney)
    {
        balance += inMoney;
    }  
    
}
