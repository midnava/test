package com.ubs.fixserver.tool.xml.marshaller;

import com.ubs.fixserver.tool.util.XmlUtil;
import com.ubs.fixserver.tool.xml.model.RootTestModel;
import com.ubs.fixserver.tool.xml.model.StageModel;
import com.ubs.fixserver.tool.xml.model.TestModel;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class RootTestsXmlMarshallerImplTest {

    @Test
    public void testConvertXMLToModel() throws Exception {
        // initialize variable inputs
        StageModel stage1 = new StageModel();
        StageModel stage2 = new StageModel();
        List<StageModel> stages = Arrays.asList(stage1, stage2);
        TestModel testModel = new TestModel("Test Login", 0, 0, stages);
        TestModel testMode2 = new TestModel("Test Order", 0, 0, stages);
        List<TestModel> testModels = Arrays.asList(testModel, testMode2);

        RootTestModel expectedRootTestModel = new RootTestModel(testModels);

        String xml = XmlUtil.readXMLFromResource("testExample.xml");

        // initialize class to test
        RootTestsXmlMarshallerImpl marshaller = new RootTestsXmlMarshallerImpl();

        // invoke method on class to test
        RootTestModel returnValue = marshaller.convertFromXML(xml);

        // assert return value
        assertEquals(expectedRootTestModel, returnValue);
    }

    @Test
    public void testConvertXMLToModel_emptyStages() throws Exception {
        // initialize variable inputs
        TestModel testModel = new TestModel("Test Login", 0, 0, Collections.<StageModel>emptyList());
        TestModel testMode2 = new TestModel("Test Order", 0, 0, null);
        List<TestModel> testModels = Arrays.asList(testModel, testMode2);

        RootTestModel expectedRootTestModel = new RootTestModel(testModels);

        String xml = XmlUtil.readXMLFromResource("emptyStages.xml");

        // initialize class to test
        RootTestsXmlMarshallerImpl marshaller = new RootTestsXmlMarshallerImpl();

        // invoke method on class to test
        RootTestModel returnValue = marshaller.convertFromXML(xml);

        // assert return value
        assertEquals(expectedRootTestModel, returnValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertXMLToModel_InvalidXML() throws Exception {
        // initialize variable inputs

        String xml = XmlUtil.readXMLFromResource("invalidXML.xml");

        // initialize class to test
        RootTestsXmlMarshallerImpl marshaller = new RootTestsXmlMarshallerImpl();

        // invoke method on class to test
        RootTestModel returnValue = marshaller.convertFromXML(xml);

        // assert return value
    }
}
