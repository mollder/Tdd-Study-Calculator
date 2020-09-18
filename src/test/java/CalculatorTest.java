import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Junit5 동작 테스트")
    public void simpleTest() {
        Assertions.assertEquals(1, 1);
    }
}
