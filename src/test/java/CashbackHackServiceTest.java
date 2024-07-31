import org.junit.Test;
import ru.netology.service.CashbackHackService;
import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashBack() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashBackIfAmountLess1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateCashBackSIfAmount1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }
}