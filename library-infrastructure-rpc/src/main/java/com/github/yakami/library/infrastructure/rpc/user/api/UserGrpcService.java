package com.github.yakami.library.infrastructure.rpc.user.api;

import com.github.yakami.library.infrastructure.rpc.user.dto.UserDTO;

import java.util.List;

/**
 * Created by alan on 2023/2/8.
 */
public interface UserGrpcService {

    UserDTO getUser(String name);

    List<UserDTO> list();

}
