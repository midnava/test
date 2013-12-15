package com.ubs.fixserver.tool.complementer;

import com.ubs.fixserver.tool.xml.model.Test;

/**
 * Changed not set values to default(timeout, wait)
 *
 * @author : Novobranchenko Oleksandr
 */
public class DefaultValueTestTestComplementer implements TestComplementer {

    @Override
    public Test doComplement(Test test) {
        return null;
    }
}
