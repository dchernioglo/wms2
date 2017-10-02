package WMSLogic;
public class Portfolio extends InstrumentBucket {
    //attributes  
    private String risk;
    private double ROI;    
    
    //constructor
    public Portfolio () { };
    public Portfolio (String inRisk, double inROI){
        risk = inRisk;
        ROI = inROI;
    }
    
    
}
