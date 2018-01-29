import com.jgbemu.core.memory.MemoryMap;

public class MemoryMapTest {
    public static void main(String[] args) {
        MemoryMap map = new MemoryMap("/misc/blargg-gb-tests/halt_bug.gb");
        map.readDataFromAddress((short) 0xFEFF);
    }
}
