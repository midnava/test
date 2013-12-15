package com.ubs.fixserver.tool.comparator;


import com.ubs.fixserver.tool.annotations.VisibilityChangedForTestingUseOnly;
import com.ubs.fixserver.tool.model.FixClientMessage;

import java.util.Map;

/**
 * @author : Novobranchenko Oleksandr
 */
public class TagsComparatorImpl implements TagsComparator {

    private static final String ANY_VALUE = "%any%";

    @Override
    public boolean equalsTags(FixClientMessage fixClientMessage1, FixClientMessage fixClientMessage2) {

        if (fixClientMessage1 != null && fixClientMessage2 != null
                && fixClientMessage1.getMessages().size() == fixClientMessage2.getMessages().size()) {

            Map<String, String> messages1 = fixClientMessage1.getMessages();
            Map<String, String> messages2 = fixClientMessage2.getMessages();
            for (String key : messages1.keySet()) {
                if (!compareTagValues(messages1.get(key), messages2.get(key))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @VisibilityChangedForTestingUseOnly
    boolean compareTagValues(String value1, String value2) {
        if (ANY_VALUE.equals(value1) || ANY_VALUE.equals(value2)) {
            return true;
        } else if (value1 != null && value2 != null) {
            return value1.equals(value2);
        }
        return false;
    }
}
