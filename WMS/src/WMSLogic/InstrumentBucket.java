package WMSLogic;

public class InstrumentBucket {
    //attributes
    private static int numBucket = 0;
    private int bucketID;
    private FinancialInstrument[] arrayFI;
    private double currentWorth;
    private double userFunds;
    private String name;
    private UserAccount user;
    
    //constructors
    public InstrumentBucket() { };
    public InstrumentBucket(String inName, UserAccount inUserAccount){
        user = inUserAccount;
        bucketID = numBucket++;
        name = inName;
    }
    
    //method
    public static int getNumBucket() { return numBucket; }
    
}
