package ym.tmp.com.server.spring_boot_local.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ym.tmp.com.server.spring_boot_local.dto.MyData;

@RestController
@RequestMapping("api/search")
public class SearchController {

    @PostMapping
    public ResponseEntity<MyData> search() {
        MyData myData = new MyData();
        myData.setContent("success");
        return ResponseEntity.ok(myData);
    }
}
