package com.ubs.fixserver.tool.convertor;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * @author : Novobranchenko Oleksandr
 */
public class FixProtocolConverterImplTest {

    private final FixProtocolConverterImpl converter = new FixProtocolConverterImpl();

    @Test
    public void testConvertStringToTags() throws Exception {
        // initialize variable inputs
        String testValue = "5=rerer;342=32esds";
        Map<String, String> expectedResult = new HashMap<String, String>();
        expectedResult.put("5", "rerer");
        expectedResult.put("342", "32esds");
        // initialize class to test

        // invoke method on class to test
        Map<String, String> result = converter.convertStringToTags(testValue);

        // assert return value
        assertEquals(expectedResult, result);

    }

    @Test
    public void tesCheckTag() throws Exception {
        // assert return value
        converter.checkTag("45=fff");
        converter.checkTag("35=fffdsd");
        converter.checkTag("45=_sa@#@");
        converter.checkTag("445=_+323fdfs!@#%^&**");

    }

    @Test
    public void tesCheckTag_failed() throws Exception {
        // assert return value
        checkFailedValue("45dd=fff");
        checkFailedValue("E#$d45dd=ewe");
        checkFailedValue("45===fff");
        checkFailedValue("dd==55");
        checkFailedValue("dd=5 5 ");

    }

    private void checkFailedValue(String str) {
        try {
            converter.checkTag(str);
            fail(String.format("Correct value [%s], must be invalid", str));
        } catch (RuntimeException e) {

        }
    }
}
