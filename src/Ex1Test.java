
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
    @Test
    void computeNumberTest() {
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        s2 = Ex1.int2Number(v,10);
        int v2= Ex1.number2Int(s2);
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10, s2));
    }


    @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }
        @Test
        void int2NumberTest() {
            assertEquals("1011", Ex1.int2Number(11, 2));
            assertEquals("13", Ex1.int2Number(11, 8));
            assertEquals("B", Ex1.int2Number(11, 16));
            assertEquals("F", Ex1.int2Number(15, 16));
            assertEquals("12", Ex1.int2Number(10, 8));
            assertEquals("100", Ex1.int2Number(4, 2));
        }
        @Test
        void maxIndexTest() {
            String[] arr1 = {"100bA", "101bA", "101bB", "110bB"};
            assertEquals(3, Ex1.maxIndex(arr1));

            String[] arr2 = {"1000b2", "101b2", "11bA", "110b2"};
            assertEquals(2, Ex1.maxIndex(arr2));

            String[] arr3 = {"123bA", "110bB", "1011b2", "12bG"};
            assertEquals(1, Ex1.maxIndex(arr3));

        }
    @Test
    void equalsTest() {
        assertTrue(Ex1.equals("11b2", "11b2"));

        assertFalse(Ex1.equals("111b2", "1111b2"));

        assertFalse(Ex1.equals("10bA", "100bA"));

        }
}
