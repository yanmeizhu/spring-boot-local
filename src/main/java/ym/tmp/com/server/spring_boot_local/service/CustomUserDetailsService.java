package ym.tmp.com.server.spring_boot_local.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ym.tmp.com.server.spring_boot_local.entity.UserEntity;
import ym.tmp.com.server.spring_boot_local.repository.UserRepository;

import java.util.Collections;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByLoginName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new User(
                user.getLoginName(),
                "123",
                true,
                true,
                true,
                true,
                Collections.emptyList()
        );
    }
}
