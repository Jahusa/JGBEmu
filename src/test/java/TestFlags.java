import com.jgbemu.core.cpu.Flags;
import org.junit.Test;

public class TestFlags {
    @Test
    public void testFlags() {
        Flags flags = new Flags();
        flags.resetZFlags();
        flags.resetNFlags();
        flags.resetHFlags();
        flags.resetCFlags();

        System.out.println(flags.toString());
    }
}
