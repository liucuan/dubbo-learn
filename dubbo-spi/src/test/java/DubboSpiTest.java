import com.tone.spi.Robot;
import java.util.ServiceLoader;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class DubboSpiTest {

    @Test
    public void test() {
        ExtensionLoader<Robot> extensionLoader = ExtensionLoader.getExtensionLoader(Robot.class);
        final Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        final Robot bumblebee = extensionLoader.getExtension("optimusPrime");
        bumblebee.sayHello();
    }
}
