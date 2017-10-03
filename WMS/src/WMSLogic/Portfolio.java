package WMSLogic;
public class Portfolio extends InstrumentBucket {
    //attributes
    
    private String risk;
    private double ROI;    
    
    //constructor
    public Portfolio () { };
    public Portfolio (String inName, String inRisk, UserAccount inUser){
        super(inName, inUser);
        risk = inRisk;
    }
    
    
}
