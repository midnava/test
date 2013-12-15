package com.ubs.fixserver.tool.convertor;

import com.ubs.fixserver.tool.annotations.VisibilityChangedForTestingUseOnly;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author : Novobranchenko Oleksandr
 */
public class FixProtocolConverterImpl implements FixProtocolConverter {

    private static final String TAGS_SPLITTER = ";";
    private static final String PAIR_TAG_SPLITTER = "=";
    private Pattern tagPattern = Pattern.compile("((\\d*)=(\\S*))");

    @Override
    public Map<String, String> convertStringToTags(String value) {
        Map<String, String> result = new LinkedHashMap<String, String>();
        if (value != null) {
            List<String> pairTags = new ArrayList<String>();
            Collections.addAll(pairTags, value.split(TAGS_SPLITTER));
            result = createTags(pairTags);
        }
        return result;
    }

    @VisibilityChangedForTestingUseOnly
    Map<String, String> createTags(List<String> pairTags) {
        Map<String, String> result = new LinkedHashMap<String, String>();
        for (String pairTag : pairTags) {
            String[] splitPairTag = splitPairTag(pairTag);
            result.put(splitPairTag[0], splitPairTag[1]);
        }
        return result;
    }

    @VisibilityChangedForTestingUseOnly
    String[] splitPairTag(String pairTag) {
        checkTag(pairTag);
        int position = pairTag.indexOf(PAIR_TAG_SPLITTER);
        String[] result = new String[2];
        result[0] = pairTag.substring(0, position);
        result[1] = pairTag.substring(position + 1, pairTag.length()).trim();
        return result;
    }

    @VisibilityChangedForTestingUseOnly
    void checkTag(String pairTag) {
        if (!tagPattern.matcher(pairTag).matches()) {
            throw new IllegalArgumentException(String.format("Failed to split str [%s] with pattern %s", pairTag, tagPattern.pattern()));
        }
    }


}

