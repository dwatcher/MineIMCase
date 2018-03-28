package org.meim.websocket;

import org.meim.config.Constants;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import javax.servlet.http.HttpSession;
import java.util.Map;

public class ChatHandshakeInterceptor extends HttpSessionHandshakeInterceptor {

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
                                   Map<String, Object> attributes) throws Exception {
        System.out.println("握手前");
        if (request instanceof ServletServerHttpRequest) {

            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest) request;

            String user = servletRequest.getServletRequest().getParameter("user");
            attributes.put(Constants.WEBSOCKET_USERNAME, user);
        }
        return true;
//        if (request instanceof ServletServerHttpRequest) {
//            ServletServerHttpRequest servletRequest = (ServletServerHttpRequest)
//                    request;
//            HttpSession session = servletRequest.getServletRequest().getSession(false);
//            if (session != null) { //使用userName区分WebSocketHandler，以便定向发送消息
//                String userName = (String) session.getAttribute(Constants.SESSION_USERNAME);
//                if (userName == null) {
//                    userName = "default-system";
//                }
//                attributes.put(Constants.WEBSOCKET_USERNAME, userName);
//
//            }
//        }

        //使用userName区分WebSocketHandler，以便定向发送消息(使用shiro获取session,或是使用上面的方式)
//        String userName = (String) SecurityUtils.getSubject().getSession().getAttribute(Constants.SESSION_USERNAME);
//        if (userName == null) {
//            userName = "default-system";
//        }
//        attributes.put(Constants.WEBSOCKET_USERNAME, userName);
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler,
                               Exception ex) {
        System.out.println("握手后");
    }

}
