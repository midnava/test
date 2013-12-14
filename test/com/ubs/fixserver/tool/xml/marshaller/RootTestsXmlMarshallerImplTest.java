package com.ubs.fixserver.tool.xml.marshaller;

import com.ubs.fixserver.tool.util.XmlUtil;
import com.ubs.fixserver.tool.xml.model.Stage;
import com.ubs.fixserver.tool.xml.model.Test;
import com.ubs.fixserver.tool.xml.model.TestPlan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class RootTestsXmlMarshallerImplTest {

    @org.junit.Test
    public void testConvertXMLToModel() throws Exception {
        // initialize variable inputs
        //TEST 1
        Stage stage11 = new Stage("Login Stage", 20, 0,
                Arrays.asList("login"),
                Arrays.asList("success"));
        Stage stage12 = new Stage("Logout Stage", 20, 5,
                Arrays.asList("logout"),
                Arrays.asList("success"));
        Test test = new Test("Test Login", 0, 0, Arrays.asList(stage11, stage12));

        Stage stage21 = new Stage("Buy bonds Stage", 20, 0,
                Arrays.asList("buy 100 bonds"),
                Arrays.asList("success"));
        //TEST 2
        Stage stage22 = new Stage("Sell bonds Stage", 20, 0,
                Arrays.asList("sell 100 bonds"),
                Arrays.asList("success"));
        Test testMode2 = new Test("Test Order", 0, 0, Arrays.asList(stage21, stage22));

        List<Test> tests = Arrays.asList(test, testMode2);

        TestPlan expectedTestPlan = new TestPlan(tests);

        String xml = XmlUtil.readXMLFromResource("testExample.xml");

        // initialize class to test
        RootTestsXmlMarshallerImpl marshaller = new RootTestsXmlMarshallerImpl();

        // invoke method on class to test
        TestPlan returnValue = marshaller.convertFromXML(xml);

        // assert return value
        assertEquals(expectedTestPlan, returnValue);
    }

    @org.junit.Test
    public void testConvertXMLToModel_emptyStages() throws Exception {
        // initialize variable inputs
        Test test = new Test("Test Login", 0, 0, Collections.<Stage>emptyList());
        Test testMode2 = new Test("Test Order", 0, 0, null);
        List<Test> tests = Arrays.asList(test, testMode2);

        TestPlan expectedTestPlan = new TestPlan(tests);

        String xml = XmlUtil.readXMLFromResource("emptyStages.xml");

        // initialize class to test
        RootTestsXmlMarshallerImpl marshaller = new RootTestsXmlMarshallerImpl();

        // invoke method on class to test
        TestPlan returnValue = marshaller.convertFromXML(xml);

        // assert return value
        assertEquals(expectedTestPlan, returnValue);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testConvertXMLToModel_InvalidXML() throws Exception {
        // initialize variable inputs

        String xml = XmlUtil.readXMLFromResource("invalidXML.xml");

        // initialize class to test
        RootTestsXmlMarshallerImpl marshaller = new RootTestsXmlMarshallerImpl();

        // invoke method on class to test
        TestPlan returnValue = marshaller.convertFromXML(xml);

        // assert return value
    }
}
