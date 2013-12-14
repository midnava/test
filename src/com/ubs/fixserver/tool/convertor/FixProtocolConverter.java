package com.ubs.fixserver.tool.convertor;

import java.util.Map;

public interface FixProtocolConverter {

    Map<String, String> convertStringToTags(String value);

}
