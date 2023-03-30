package com.github.yakami.user.service.grpc;

import com.github.yakami.library.infrastructure.rpc.user.api.UserGrpcService;
import com.github.yakami.library.infrastructure.rpc.user.dto.UserDTO;
import com.google.common.collect.ImmutableList;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * Created by alan on 2023/2/8.
 */
@Slf4j
@DubboService
public class UserGrpcServiceImpl implements UserGrpcService {

    @Override
    public UserDTO getUser(String name) {
        log.info("[BIZ] run getUser");
        return UserDTO
                .builder()
                .name(name)
                .age(18)
                .build();
    }

    @Override
    public List<UserDTO> list() {
        log.info("[BIZ] run list");
        return ImmutableList.of(UserDTO
                .builder()
                .name("test")
                .age(18)
                .build());
    }
}
