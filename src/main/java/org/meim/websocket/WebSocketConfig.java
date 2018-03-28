package org.meim.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.meim.websocket.handler.ChatMessageHandler;

/**
 * 注册websocket
 */
@Configuration
@EnableWebMvc
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(chatMessageHandler(),"/webSocketServer").addInterceptors(new ChatHandshakeInterceptor());
        //提供SockJS支持(主要是兼容ie8)
        registry.addHandler(chatMessageHandler(), "/sockjs/webSocketServer").addInterceptors(new ChatHandshakeInterceptor()).withSockJS();
    }

    public TextWebSocketHandler chatMessageHandler() {
        return new ChatMessageHandler();
    }

}
