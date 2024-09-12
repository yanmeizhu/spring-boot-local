package ym.tmp.com.server.spring_boot_local.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "t_user")
@Getter
@Setter
public class UserEntity {

    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private Long userId;


    @Column(name = "login_name")
    private String loginName;

    @Column(name = "last_login_time")
    private LocalDateTime lastLoginTime;

    @Column(name = "status")
    private String status;

    @Column(name = "last_modified_by")
    private String last_modified_by;

    @Column(name = "last_modified_date")
    private LocalDateTime lastModifiedDate;

    @Column(name = "is_deleted")
    private Boolean isDelete;

}
