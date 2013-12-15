package com.ubs.fixserver.tool.comparator;


import com.ubs.fixserver.tool.annotations.VisibilityChangedForTestingOnly;

import java.util.Map;

/**
 * @author : Novobranchenko Oleksandr
 */
public class TagsComparatorImpl implements TagComparator {

    private static final String ANY_VALUE = "%any%";


    @Override
    public boolean equalsTags(Map<String, String> tags1, Map<String, String> tags2) {
        if (tags1 != null && tags2 != null && tags1.size() == tags2.size()) {
            for (String key : tags1.keySet()) {
                boolean result = compareTagValues(tags1.get(key), tags2.get(key));
                if (!result) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @VisibilityChangedForTestingOnly
    boolean compareTagValues(String value1, String value2) {
        if (ANY_VALUE.equals(value1) || ANY_VALUE.equals(value2)) {
            return true;
        } else if (value1 != null && value2 != null) {
            return value1.equals(value2);
        }
        return false;
    }
}