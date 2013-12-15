package com.ubs.fixserver.tool.client;


import com.ubs.fixserver.tool.model.FixClientMessage;

import java.util.List;
import java.util.Map;

public interface FixGateWayClient {

    void startClient();

    void stopClient();

    boolean sendMessage(FixClientMessage message);

    Map<String, String> receiveMessage(long timeout);

    List<FixClientMessage> receiveAllMessages();

}
