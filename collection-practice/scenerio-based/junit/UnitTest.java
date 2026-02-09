import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

    // 1. Test valid deposit
    @Test
    public void Test_Deposit_ValidAmount() {
        Program account = new Program(1000);

        account.Deposit(500);

        assertEquals(1500, account.getBalance());
    }

    // 2. Test negative deposit
    @Test
    public void Test_Deposit_NegativeAmount() {
        Program account = new Program(1000);

        Exception ex = assertThrows(Exception.class, () -> {
            account.Deposit(-100);
        });

        assertEquals("Deposit amount cannot be negative", ex.getMessage());
    }

    // 3. Test valid withdraw
    @Test
    public void Test_Withdraw_ValidAmount() {
        Program account = new Program(1000);

        account.Withdraw(400);

        assertEquals(600, account.getBalance());
    }

    // 4. Test insufficient funds
    @Test
    public void Test_Withdraw_InsufficientFunds() {
        Program account = new Program(1000);

        Exception ex = assertThrows(Exception.class, () -> {
            account.Withdraw(2000);
        });

        assertEquals("Insufficient funds.", ex.getMessage());
    }
}
