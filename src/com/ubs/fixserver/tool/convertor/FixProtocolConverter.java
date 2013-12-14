package com.ubs.fixserver.tool.convertor;

import java.util.Map;

/**
 * @author : Novobranchenko Oleksandr
 */
public interface FixProtocolConverter {

    Map<String, String> convertStringToTags(String value);

}
