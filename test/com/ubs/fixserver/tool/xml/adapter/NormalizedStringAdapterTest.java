package com.ubs.fixserver.tool.xml.adapter;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class NormalizedStringAdapterTest {
    private final NormalizedStringAdapter adapter = new NormalizedStringAdapter();

    @Test
    public void testMarshal() throws Exception {
        assertEquals("dsd", adapter.marshal("  dsd "));
        assertEquals("dsd", adapter.marshal("\n  dsd \n"));
        assertEquals("dsd", adapter.marshal("\t  dsd "));
        assertEquals("dsd", adapter.marshal("\t\n\n \t  dsd "));
        assertEquals(null, adapter.marshal(null));
    }

    @Test
    public void testUnmarshal() throws Exception {
        assertEquals("dsd", adapter.unmarshal("  dsd "));
        assertEquals("dsd", adapter.unmarshal("\n  dsd \n"));
        assertEquals("dsd", adapter.unmarshal("\t  dsd "));
        assertEquals("dsd", adapter.unmarshal("\t\n\n \t  dsd "));
        assertEquals(null, adapter.unmarshal(null));
    }
}
