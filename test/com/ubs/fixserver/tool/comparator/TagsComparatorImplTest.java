package com.ubs.fixserver.tool.comparator;

import com.ubs.fixserver.tool.model.FixClientMessage;
import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author : Novobranchenko Oleksandr
 */
public class TagsComparatorImplTest {

    @Test
    public void testEqualsTags() throws Exception {
        // initialize variable inputs
        Map<String, String> tags1 = new LinkedHashMap<String, String>();
        tags1.put("tag1", "value1");
        tags1.put("tag2", "value2");
        tags1.put("tag3", "value3");

        Map<String, String> tags2 = new LinkedHashMap<String, String>();
        tags2.put("tag1", "value1");
        tags2.put("tag2", "value2");
        tags2.put("tag3", "value3");

        Map<String, String> tags3 = new LinkedHashMap<String, String>(tags1);
        tags3.put("tag4", "value4");

        Map<String, String> tags4 = new LinkedHashMap<String, String>();
        tags4.put("tag1", "value1");
        tags4.put("tag2", "value2");
        tags4.put("tag4", "value4");

        FixClientMessage clientMessage1 = new FixClientMessage(tags1);
        FixClientMessage clientMessage2 = new FixClientMessage(tags2);
        FixClientMessage clientMessage3 = new FixClientMessage(tags3);
        FixClientMessage clientMessage4 = new FixClientMessage(tags4);

        // initialize class to test
        TagsComparatorImpl testClass = new TagsComparatorImpl();

        // invoke method on class to test
        boolean result1 = testClass.equalsTags(clientMessage1, clientMessage2);
        boolean result2 = testClass.equalsTags(clientMessage1, clientMessage3);
        boolean result3 = testClass.equalsTags(clientMessage2, clientMessage3);
        boolean result4 = testClass.equalsTags(clientMessage4, clientMessage1);
        boolean result5 = testClass.equalsTags(clientMessage4, clientMessage2);
        boolean result6 = testClass.equalsTags(clientMessage4, clientMessage3);
        boolean result7 = testClass.equalsTags(clientMessage4, clientMessage4);

        // assert return value
        Assert.assertTrue(result1);
        Assert.assertFalse(result2);
        Assert.assertFalse(result3);
        Assert.assertFalse(result4);
        Assert.assertFalse(result5);
        Assert.assertFalse(result6);
        Assert.assertTrue(result7);

    }

    @Test
    public void testCompareTags() throws Exception {
        // initialize class to test
        TagsComparatorImpl testClass = new TagsComparatorImpl();

        // assert return value
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
