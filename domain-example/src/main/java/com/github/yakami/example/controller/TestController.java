package com.github.yakami.example.controller;

import com.github.yakami.library.infrastructure.common.dto.ResultBean;
import com.github.yakami.library.infrastructure.rpc.user.api.UserGrpcService;
import com.github.yakami.library.infrastructure.rpc.user.dto.UserDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alan on 2023/2/8.
 */
@RestController
public class TestController {

    @DubboReference
    private UserGrpcService userGrpcService;

    @GetMapping("/test01")
    public ResultBean test() {
        final UserDTO user = userGrpcService.getUser("z");
        return ResultBean.succeed(user);
    }

}
