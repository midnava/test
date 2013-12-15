package com.ubs.fixserver.tool.comparator;


import com.ubs.fixserver.tool.model.FixClientMessage;

/**
 * @author : Novobranchenko Oleksandr
 */
public interface TagsComparator {

    boolean equalsTags(FixClientMessage fixClientMessage1, FixClientMessage fixClientMessage2);

}
