import org.junit.Test;

import static org.junit.Assert.*;

public class CheckingAccountTest {

    @Test
    public void testGetBalance() throws Exception {
        CheckingAccount c = new CheckingAccount();
        double balance = c.getBalance();
        double expected = 0.0;
        assertEquals(expected, balance, 1E-5);
    }

    @Test
    public void testDeposit() throws Exception {
        CheckingAccount c = new CheckingAccount();
        c.deposit(10.0);
        double expected = 10.0;
        assertEquals(expected, c.getBalance(), 1E-5);
    }

    @Test
    public void testWithdraw() throws Exception {
        CheckingAccount c = new CheckingAccount();
        c.deposit(11.0);
        c.withdraw(10.0);
        double expected = 1.0;
        assertEquals(expected, c.getBalance(), 1E-5);
    }

    @Test
    public void testWithdraw2() throws Exception {
        CheckingAccount c = new CheckingAccount(50.0, 123);
        c.withdraw(40.0);
        double expected = 10.0;
        assertEquals(expected, c.getBalance(), 1E-5);
    }
}