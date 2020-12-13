package it.unibo.oop.lab.exception2;

/**
 * Models a generic bank account.
 * 
 */
public interface BankAccount {

    /**
     * @param usrID
     *            id of the user requesting this operation
     * @param amount
     *            amount to be withdrawn
     * @throws NotEnoughFoundsException 
     * @throws WrongAccountHolderException 
     */
    void withdraw(int usrID, double amount) throws NotEnoughFoundsException, WrongAccountHolderException;

    /**
     * 
     * @param usrID
     *            id of the user requesting this operation
     * @param amount
     *            amount to be credited
     * @throws WrongAccountHolderException 
     */
    void deposit(int usrID, double amount) throws WrongAccountHolderException;

    /**
     * 
     * @param usrID
     *            id of the user requesting this opera
     * @param amount
     *            amount to be deposited via ATM
     * @throws WrongAccountHolderException 
     * @throws TransactionsOVerQuotaException 
     */
    void depositFromATM(int usrID, double amount) throws WrongAccountHolderException, TransactionsOVerQuotaException;

    /**
     * 
     * @param usrID
     *            id of the user requesting this opera
     * @param amount
     *            amount to be withdrawn via AT
     * @throws TransactionsOVerQuotaException 
     * @throws WrongAccountHolderException 
     * @throws NotEnoughFoundsException 
     */
    void withdrawFromATM(int usrID, double amount) throws TransactionsOVerQuotaException, NotEnoughFoundsException, WrongAccountHolderException;

    /**
     * 
     * @return The current balance
     */
    double getBalance();

    /**
     * 
     * @return The total number of transaction for the account
     */
    int getTransactionCount();
}
