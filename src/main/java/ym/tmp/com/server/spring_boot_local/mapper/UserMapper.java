package ym.tmp.com.server.spring_boot_local.mapper;

import org.mapstruct.Mapper;
import ym.tmp.com.server.spring_boot_local.dto.UserDTO;
import ym.tmp.com.server.spring_boot_local.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toUserDTO(UserEntity user);
}
