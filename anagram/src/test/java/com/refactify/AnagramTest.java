package com.refactify;

import java.util.Collections;
import java.util.Map;
import org.junit.Test;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;


public class AnagramTest {

    @Test
    public void testEmptyWordListHasNoAnagrams() {
        assertEquals(Collections.<String, Integer>emptyMap(), Anagrams.compute(Collections.<String>emptyList()));
    }

    @Test
    public void testSingleWordListHasNoAnagrams() {
        assertEquals(Collections.<String, Integer>emptyMap(), Anagrams.compute(asList("arm")));
    }

    @Test
    public void testTwoWordListWithDifferentCharactersHasNoAnagrams() {
        assertEquals(Collections.<String, Integer>emptyMap(), Anagrams.compute(asList("arm", "bob")));
    }

    @Test
    public void testTwoWordListWithSameCharactersHasOneAnagrams() {
        Map<String, Integer> anagrams = Anagrams.compute(asList("arm", "ram"));
        assertEquals(1, anagrams.size());
        assertEquals(2, anagrams.get("amr").intValue());
    }

    @Test
    public void testThreeWordListWithOneDifferingWordHasOneAnagramOfTwoWords() {
        Map<String, Integer> anagrams = Anagrams.compute(asList("arm", "ram", "farm"));
        assertEquals(1, anagrams.size());
        assertEquals(2, anagrams.get("amr").intValue());
    }

    @Test
    public void testThreeWordListWithAllSameCharactersHasOneAnagramOfThreeWords() {
        Map<String, Integer> anagrams = Anagrams.compute(asList("arm", "ram", "mar"));
        assertEquals(1, anagrams.size());
        assertEquals(3, anagrams.get("amr").intValue());
    }

    @Test
    public void testFourWordListWithTwoAnagrams() {
        Map<String, Integer> anagrams = Anagrams.compute(asList("arm", "ram", "car", "arc"));
        assertEquals(2, anagrams.size());
        assertEquals(2, anagrams.get("amr").intValue());
        assertEquals(2, anagrams.get("acr").intValue());
    }

    @Test
    public void testThreeAnagrams() {
        Map<String, Integer> anagrams = Anagrams.compute(asList("star", "arm", "ram", "car", "mar", "arc", "rats", "arts"));
        assertEquals(3, anagrams.size());
        assertEquals(3, anagrams.get("amr").intValue());
        assertEquals(2, anagrams.get("acr").intValue());
        assertEquals(3, anagrams.get("arst").intValue());
    }
}
