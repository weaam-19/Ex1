import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex1Test {
    @Test
    void computeNumberTest() {
        // test converting a binary string "1011b2" to an integer
        String s2 = "1011b2";
        int v = Ex1.number2Int(s2);
        assertEquals(v, 11);
        // test converting a base-10 string "1011bA" to an integer
        String s10 = "1011bA";
        v = Ex1.number2Int(s10);
        // convert the result back to binary (base 2)
        s2 = Ex1.int2Number(v,2);
        int v2= Ex1.number2Int(s2);
        // verify that the two integer values are equal
        assertEquals(v,v2);
        assertTrue(Ex1.equals(s10, s2));
    }


    @Test
        void isBasisNumberTest() {
        // array of valid numbers with different bases
        String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok); // each string should be recognized as a valid number
            }
        // array of invalid numbers with incorrect formats
        String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);// each string should be recognized as an invalid number
            }
        }

        @Test
        void int2NumberTest() {
            // test converting integers to string representations in different bases
            assertEquals("1011b2", Ex1.int2Number(11, 2));
            assertEquals("13b8", Ex1.int2Number(11, 8));
            assertEquals("BbG", Ex1.int2Number(11, 16));
            assertEquals("FbG", Ex1.int2Number(15, 16));
            assertEquals("12b8", Ex1.int2Number(10, 8));
            assertEquals("100b2", Ex1.int2Number(4, 2));
            assertEquals("1b2", Ex1.int2Number(1, 2));
            assertEquals("BbC", Ex1.int2Number(11, 12));
            assertEquals("AbB", Ex1.int2Number(10, 11));
            assertEquals("0", Ex1.int2Number(0, 2));
            assertEquals("EbG", Ex1.int2Number(14, 16));
            assertEquals("10bA", Ex1.int2Number(10, 10));
        }


        @Test
        void maxIndexTest() {
            // test finding the index of the largest number in the array
            String[] arr1 = {"100bA", "101bA", "101bB", "110bB"};
            assertEquals(3, Ex1.maxIndex(arr1));
            String[] arr2 = {"1000b2", "101b2", "11bA", "110b2"};
            assertEquals(2, Ex1.maxIndex(arr2));
            String[] arr3 = {"123bA", "AbB", "1011b2", "101b2"};
            assertEquals(0, Ex1.maxIndex(arr3));
            String[] arr4 = {"1b2", "10bA", "1bG", "F"};
            assertEquals(3, Ex1.maxIndex(arr1));
            String[] arr5 = {"001b2", "010bA", "0001bG", "00F"};
            assertEquals(2, Ex1.maxIndex(arr2));
            String[] arr6 = {"10", "abc", "101b2", "110b2"};
            assertEquals(0, Ex1.maxIndex(arr3));

        }
    @Test
    void equalsTest() {
        // test if two numbers represented as strings are equal
        assertTrue(Ex1.equals("11b2", "11b2"));
        assertFalse(Ex1.equals("1011b2", "1111b2"));
        assertFalse(Ex1.equals("10bA", "100bA"));
        assertTrue(Ex1.equals("1bA","1b2"));
        assertTrue(Ex1.equals("AbG","1010b2"));
        assertTrue(Ex1.equals("1000b3","11011b2"));
        assertFalse(Ex1.equals("1111111b2", "11110000b3"));
        assertFalse(Ex1.equals("111b2", "111b7"));
    }
}
