package com.ubs.fixserver.tool.convertor;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author : Novobranchenko Oleksandr
 */
public class FixProtocolConverterImpl implements FixProtocolConverter {

    private static final String TAG_SPLITTER = ";";
    private static final String VALUE_SPLITTER = "=";
    private Pattern tagPattern = Pattern.compile("^((\\d*)=(\\S*))$");

    @Override
    public Map<String, String> convertStringToTags(String value) {
        Map<String, String> result = new LinkedHashMap<String, String>();
        if (value != null) {
            List<String> pairTags = new ArrayList<String>();
            Collections.addAll(pairTags, value.split(TAG_SPLITTER));
            result = createTags(pairTags);
        }
        return result;
    }

    Map<String, String> createTags(List<String> pairTags) {
        Map<String, String> result = new LinkedHashMap<String, String>();
        for (String str : pairTags) {
            checkTag(str);
            String[] pair = str.split(VALUE_SPLITTER);
            result.put(pair[0].trim(), pair[1].trim());
        }
        return result;
    }

    void checkTag(String tags) {
        if (!tagPattern.matcher(tags).matches()) {
            throw new IllegalArgumentException(String.format("Failed to split str [%s] with pattern %s", tags, tagPattern.pattern()));
        }
    }


}

