package WMSLogic;

public class InstrumentBucket {
    //attributes
    private static int numBucket = 0;
    private int bucketID;
    private FinancialInstrument[] arrayFI;
    private double currentWorth;
    private double userFunds;
    private String name;
    
    //constructors
    public InstrumentBucket() { };
    public InstrumentBucket(String inName){
        bucketID = numBucket++;
        name = inName;
    }
    
}
