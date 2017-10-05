package WMSLogic;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class FinancialInstrument {
    
    //Attributes
    private InstrumentBucket bucket;
    private double currentPrice;
    private String symbol; 
    private double beta;
    
    //Contructors
    public FinancialInstrument () {} 
    public FinancialInstrument(String inName, String inSymbol, String inMax, String inMin, String inBeta)
    {
        symbol = inSymbol;
        currentPrice = Math.random() * Double.parseDouble(inMax) + Double.parseDouble(inMin);
        beta = Integer.parseInt(inBeta);    
    }
    
    //Methods
    public static LinkedList<FinancialInstrument> getListOfFinInstr()
    {
        LinkedList<FinancialInstrument> fi = new LinkedList<FinancialInstrument>();
          try {
            File f1 = new File("stockdata.csv");
            Scanner s1 = new Scanner(f1);
            
            while(s1.hasNextLine() && fi.size() < 4) {
                String line = s1.nextLine();
                String[] fis = line.split(",");
                
                fi.add(new FinancialInstrument(fis[0], fis[1], fis[2],fis[3], fis[4]));         
            }
            
//            File f2 = new File("items.txt");
//            Scanner s2 = new Scanner(f2);
//            
//            while(s2.hasNextLine()) {
//                String line = s2.nextLine();
//                String[] cInfo = line.split(",");
//                
//                if(cInfo[0].equals("V")) {
//                    RentalSystem.addVideo(cInfo[2], cInfo[3], cInfo[9], Integer.parseInt(cInfo[4]), Integer.parseInt(cInfo[5]), Double.parseDouble(cInfo[6]), Double.parseDouble(cInfo[7]));
//                } else {
//                    RentalSystem.addGame(cInfo[2], cInfo[3], cInfo[9], Integer.parseInt(cInfo[4]), Integer.parseInt(cInfo[5]), Double.parseDouble(cInfo[6]), Double.parseDouble(cInfo[7]));
//                }
//                     
//                }
            }
          catch (Exception e) {
            System.out.print(e.toString());
            }
            return fi;  
          }
    
    }


