package ym.tmp.com.server.spring_boot_local.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ym.tmp.com.server.spring_boot_local.dto.UserDTO;
import ym.tmp.com.server.spring_boot_local.entity.UserEntity;
import ym.tmp.com.server.spring_boot_local.mapper.UserMapper;
import ym.tmp.com.server.spring_boot_local.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    public UserDTO getUserInfo() {

        List<UserEntity> users = userRepository.findAll();
        UserDTO userDTO = userMapper.toUserDTO(users.get(0));
        return userDTO;
    }
}
