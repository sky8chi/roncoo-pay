package com.roncoo.pay.controller.keepalive;

import com.roncoo.pay.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 心跳
 * @author by tianxiang.chi
 * @date 2020/12/1 10:14 AM
 */
@Controller
@RequestMapping(value = "/keepalive")
public class KeepaliveController extends BaseController {
    @GetMapping("ping")
    public void ping(HttpServletResponse httpServletResponse, HttpServletRequest httpServletRequest) {
        write(httpServletResponse, "ping");
    }
}
