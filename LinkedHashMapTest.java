import org.junit.Test;
import java.util.LinkedHashMap;

public class LinkedHashMapTest{

    @Test
    public void testLinkedHashMap() {

        System.out.println(Boolean.parseBoolean("true"));

        final int MAX_ENTRIES = 5;

        LinkedHashMap lhm = new LinkedHashMap(MAX_ENTRIES + 1, .75F, false) {
		@Override
            	protected boolean removeEldestEntry(Map.Entry eldest) {
                	return size() > MAX_ENTRIES;
            	}
        };
        lhm.put(0, "H");
        lhm.put(1, "E");
        lhm.put(2, "L");
        lhm.put(3, "L");
        lhm.put(4, "O");

        System.out.println("" + lhm);

        lhm.put(5, "T");

        System.out.println("" + lhm);
    }

}
