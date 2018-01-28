import com.jgbemu.core.memory.MemoryMap;
import org.junit.Test;

public class MemoryMapTest {
    public static void main(String[] args) {
        MemoryMap map = new MemoryMap("/misc/blargg-gb-tests/halt_bug.gb");
        map.getDataFromAddress((short) 0xFEFF);
    }
}
