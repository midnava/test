package com.ubs.fixserver.tool.xml.marshaller;


/**
 * @author : Novobranchenko Oleksandr
 */
public interface ModelXMLMarshaller<T> {

    T convertFromXML(String xml);

}
