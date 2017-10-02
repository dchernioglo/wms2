package wms;

public class Transaction {
    private int transID;
    private FinancialInstrument what;
    private enum transactionType{
        BUYNOW, BUYLATER, SELLNOW, SELLLATER
    };    
}
