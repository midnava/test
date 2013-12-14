package com.ubs.fixserver.tool.xml.marshaller;


import com.ubs.fixserver.tool.xml.model.Test;
import com.ubs.fixserver.tool.xml.model.TestPlan;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * @author : Novobranchenko Oleksandr
 */
public class RootTestsXmlMarshallerImpl implements ModelXMLMarshaller<TestPlan> {
    private static final Logger logger = Logger.getLogger(RootTestsXmlMarshallerImpl.class);

    @Override
    public TestPlan convertFromXML(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(TestPlan.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (TestPlan) unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            String errorMessage = String.format("Failed to convert model [%s] from xml:\n [%s]", Test.class.getSimpleName(), xml);
            logger.error(errorMessage, e);
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
