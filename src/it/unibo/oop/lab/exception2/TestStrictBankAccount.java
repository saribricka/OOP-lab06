package it.unibo.oop.lab.exception2;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccount assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         */
    	
    	AccountHolder account1 = new AccountHolder("Sara", "Briccoli", 44);
    	AccountHolder account2 = new AccountHolder("Matteo", "Cicognani", 57);
    	StrictBankAccount bank1 = new StrictBankAccount(44, 10000, 10);
    	StrictBankAccount bank2 = new StrictBankAccount(57, 10000, 10);
    	
         /* 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	
    	try {
    		for(int i=0; i<15; i++) {
    		bank1.withdrawFromATM(44, 150);
    		}
    		fail();
    	} catch(TransactionsOVerQuotaException e) {
    		assertNotNull(e);
    	} catch (NotEnoughFoundsException e) {
			assertNotNull(e);
		} catch (WrongAccountHolderException e) {
			assertNotNull(e);
		}
    	
    	try {
    		bank2.withdraw(57, 20000);
    		fail();
    	} catch (NotEnoughFoundsException e) {
    		assertNotNull(e);
    	} catch (WrongAccountHolderException e) {
    		assertNotNull(e);
		}
    	
    }
}
