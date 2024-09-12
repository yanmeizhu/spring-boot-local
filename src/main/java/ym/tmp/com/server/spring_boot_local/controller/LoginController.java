package ym.tmp.com.server.spring_boot_local.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ym.tmp.com.server.spring_boot_local.dto.MyData;
import ym.tmp.com.server.spring_boot_local.dto.UserDTO;
import ym.tmp.com.server.spring_boot_local.service.UserService;

@RestController
@RequestMapping("api/login")
public class LoginController {

    @Autowired
    private UserService userService;
    @PostMapping
    public ResponseEntity<UserDTO> login() {
        MyData myData = new MyData();
        myData.setContent("success");
        return ResponseEntity.ok(userService.getUserInfo());
    }
}
