package trainTicket;

import org.junit.jupiter.api.Test;
import trainTicket.exception.NegativeNumberException;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void priceCalculator() {

            Ticket minor = new Ticket(100, 17);
            Ticket major = new Ticket(100, 20);
            Ticket grandPa = new Ticket(100, 65);
            assertThrows(NegativeNumberException.class, () -> {
                Ticket exceptionTicket = new Ticket(100, -22);
                    });
            assertEquals(16.8F, minor.priceCalculator());
            assertEquals(21, major.priceCalculator());
            assertEquals(12.599999f, grandPa.priceCalculator());
    }
}