package com.ubs.fixserver.tool.client;


import java.util.List;
import java.util.Map;

public interface FixGateWayClient {

    void startClient();

    void stopClient();

    boolean sendMessage(Map<String, String> tag);

    Map<String, String> receiveMessage(long timeout);

    List<Map<String, String>> receiveAllMessages();

}
