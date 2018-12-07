package com.dimple.controller;

import com.dimple.bean.server.Server;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: ServerController
 * @Description: 服务器信息
 * @Auther: Owenb
 * @Date: 12/07/18 10:27
 * @Version: 1.0
 */
@Controller
public class ServerController {

    @RequestMapping("/server/serverInfo")
    public String serverInfo(Model model) {
        Server server = new Server();
        server.init();
        model.addAttribute("server", server);
        return "server/serverInfo";
    }

}