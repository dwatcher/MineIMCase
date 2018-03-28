package org.meim.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/meim")
public class BaseView {

    @RequestMapping(value = "/page/websocket/test", method = RequestMethod.GET)
    public String webSocketTestPage() {
        return "index";
    }

}
