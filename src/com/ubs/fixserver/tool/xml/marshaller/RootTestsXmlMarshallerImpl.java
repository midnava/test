package com.ubs.fixserver.tool.xml.marshaller;


import com.ubs.fixserver.tool.xml.model.Root;
import com.ubs.fixserver.tool.xml.model.Test;
import org.apache.log4j.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class RootTestsXmlMarshallerImpl implements ModelXMLMarshaller<Root> {
    private static final Logger logger = Logger.getLogger(RootTestsXmlMarshallerImpl.class);

    @Override
    public Root convertFromXML(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Root) unmarshaller.unmarshal(new StringReader(xml));
        } catch (Exception e) {
            String errorMessage = String.format("Failed to convert model [%s] from xml:\n [%s]", Test.class.getSimpleName(), xml);
            logger.error(errorMessage, e);
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
