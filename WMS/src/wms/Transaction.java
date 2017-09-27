/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wms;

/**
 *
 * @author mrmor
 */
public class Transaction {
    private int transID;
    private FinancialInstrument what;
    private enum transactionType{
        BUYNOW, BUYLATER, SELLNOW, SELLLATER
    };
    
}
