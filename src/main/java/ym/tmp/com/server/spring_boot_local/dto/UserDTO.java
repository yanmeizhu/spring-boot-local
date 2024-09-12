package ym.tmp.com.server.spring_boot_local.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class UserDTO {
    private Long userId;
    private String loginName;
    private LocalDateTime lastLoginTime;
    private String status;
    private String last_modified_by;
    private LocalDateTime lastModifiedDate;
    private Boolean isDelete;
}
