package com.ubs.fixserver.tool.xml.marshaller;


import com.ubs.fixserver.tool.xml.model.RootTestModel;
import com.ubs.fixserver.tool.xml.model.TestModel;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class RootTestsXmlMarshallerImpl implements ModelXMLMarshaller<RootTestModel> {
    private static final Logger logger = Logger.getLogger(RootTestsXmlMarshallerImpl.class);

    @Override
    public RootTestModel convertFromXML(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(RootTestModel.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (RootTestModel) unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            String errorMessage = String.format("Failed to convert model [%s] from xml:\n [%s]", TestModel.class.getSimpleName(), xml);
            logger.error(errorMessage, e);
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
