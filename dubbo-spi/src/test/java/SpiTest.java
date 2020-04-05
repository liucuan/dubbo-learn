import com.tone.spi.Robot;
import java.util.ServiceLoader;
import org.junit.Test;

public class SpiTest {

    @Test
    public void test() {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
}
