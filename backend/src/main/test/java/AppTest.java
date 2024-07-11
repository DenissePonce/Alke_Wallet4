import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testDeposit() {
        Account account = new Account();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    public void testCurrencyConversion() {
        double usd = 100;
        double eur = CurrencyConverter.convertToEuros(usd);
        assertEquals(85, eur);
    }
}
