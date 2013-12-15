package com.ubs.fixserver.tool.comparator;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author : Novobranchenko Oleksandr
 */
public class TagsComparatorImplTest {

    private final static TagsComparatorImpl testClass = new TagsComparatorImpl();

    @Test
    public void testEqualsTags() throws Exception {

    }

    @Test
    public void testCompareTags() throws Exception {
        assertTrue(testClass.compareTagValues("23", "23"));
        assertTrue(testClass.compareTagValues("test", "test"));
        assertTrue(testClass.compareTagValues("%any%", "23"));
        assertTrue(testClass.compareTagValues("good", "%any%"));
        assertFalse(testClass.compareTagValues("test", "any"));
        assertFalse(testClass.compareTagValues("any", "test"));
        assertFalse(testClass.compareTagValues(null, "test"));
        assertFalse(testClass.compareTagValues("test", null));
        assertFalse(testClass.compareTagValues(null, null));
    }
}
