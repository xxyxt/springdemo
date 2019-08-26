package com.example.demospring.controller;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ServerEndpoint(value="/page_room/{username}")
public class WsByTomcate {
    private static List<Session> sessions = new ArrayList<Session>();
    @OnOpen
    public void OnOpen(Session session, @PathParam("username") String username) throws IOException{
        sessions.add(session);
        sendTextMsg("好友 [" + username + "]加入群聊");
    }
    @OnMessage
    public void OnMsg(String msg,@PathParam("username") String username) throws IOException{
        sendTextMsg(username + ":\r\n" +msg);
    }
    @OnClose
    public void OnClose(Session session, @PathParam("username") String username) throws IOException {
        sessions.remove(session);
        sendTextMsg("好友 ["+ username + "] 退出群聊");
    }
    @OnError
    public void OnError(Throwable e) {
        e.printStackTrace();
    }
    private void sendTextMsg(String msg) {
        for (Session session : sessions) {
            session.getAsyncRemote().sendText(msg);
        }
    }
}
