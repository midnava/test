package com.ubs.fixserver.tool.xml.marshaller;


public interface ModelXMLMarshaller<T> {

    T convertFromXML(String xml);

}
