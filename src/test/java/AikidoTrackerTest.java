import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AikidoTrackerTest {
    public static AikidoTracker aikidoTracker = new AikidoTracker("John Doe");
    @Test
    void isEligibleForKyu() {


    }

    @Test
    void addSession() {
        aikidoTracker.addSession("2021-01-01", "60");

    }

    @Test
    void advanceDate() {

    }

    @Test
    void getTotalTime() {
        assertEquals(60,aikidoTracker.getTotalTime());
    }
}