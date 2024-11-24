import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class L2022112452_17_Test {

    @Test
    void testFindRepeatedDnaSequences() {
        Solution1 sol = new Solution1();

        // Test case 1: General case with multiple repeated sequences
        String input1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected1 = new ArrayList<>();
        expected1.add("AAAAACCCCC");
        expected1.add("CCCCCAAAAA");
        List<String> output1 = sol.findRepeatedDnaSequences(input1);
        assertTrue(compareLists(output1, expected1), "Test case 1 failed.");

        // Test case 2: All characters are the same, only one repeated sequence
        String input2 = "AAAAAAAAAAAAA";
        List<String> expected2 = new ArrayList<>();
        expected2.add("AAAAAAAAAA");
        List<String> output2 = sol.findRepeatedDnaSequences(input2);
        assertTrue(compareLists(output2, expected2), "Test case 2 failed.");

        // Test case 3: No repeated sequences
        String input3 = "ACGTACGTAC";
        List<String> expected3 = Collections.emptyList();
        List<String> output3 = sol.findRepeatedDnaSequences(input3);
        assertTrue(compareLists(output3, expected3), "Test case 3 failed.");

        // Test case 4: Input string shorter than 10 characters
        String input4 = "ACGT";
        List<String> expected4 = Collections.emptyList();
        List<String> output4 = sol.findRepeatedDnaSequences(input4);
        assertTrue(compareLists(output4, expected4), "Test case 4 failed.");

        // Test case 5: Input string exactly 10 characters with no repeats
        String input5 = "ACGTACGTAG";
        List<String> expected5 = Collections.emptyList();
        List<String> output5 = sol.findRepeatedDnaSequences(input5);
        assertTrue(compareLists(output5, expected5), "Test case 5 failed.");

        // Test case 6: Edge case, input string exactly 10 characters, with repeats
        String input6 = "ACGTACGTAC";
        List<String> expected6 = Collections.emptyList(); // No repetition
        List<String> output6 = sol.findRepeatedDnaSequences(input6);
        assertTrue(compareLists(output6, expected6), "Test case 6 failed.");
    }

    /**
     * Helper method to compare two lists regardless of order.
     *
     * @param list1 First list.
     * @param list2 Second list.
     * @return True if both lists contain the same elements, regardless of order.
     */
    private boolean compareLists(List<String> list1, List<String> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        List<String> temp1 = new ArrayList<>(list1);
        List<String> temp2 = new ArrayList<>(list2);
        Collections.sort(temp1);
        Collections.sort(temp2);
        return temp1.equals(temp2);
    }
}
