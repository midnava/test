package com.ubs.fixserver.tool.xml.adapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class NormalizedStringAdapter extends XmlAdapter<String, String> {

    @Override
    public String marshal(String text) {
        return text == null ? null : text.trim();
    }

    @Override
    public String unmarshal(String v) throws Exception {
        return v == null ? null : v.trim();
    }
}
