package at.gradwohl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {

    @Test
    public void test_calculateUptime_correctly () {

        /*Assertions.fail();*/

        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String acutalValue = controller.calculateUptime(99.95);

        //Assert
        Assertions.assertEquals("43178,40", acutalValue);

    }

}
