package com.ubs.fixserver.tool.comparator;


import java.util.Map;

/**
 * @author : Novobranchenko Oleksandr
 */
public interface TagComparator {

    boolean compareTags(Map<String, String> tags1, Map<String, String> tags2);

}
