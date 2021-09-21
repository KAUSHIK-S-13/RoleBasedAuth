package com.sales.management.DTO;

import com.sales.management.Model.UserRole;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter

public class UserRoleDTO {

    private Integer id;

    private String userName;

    private String jwtToken;

    private String password;

    private List<UserRole> roleList;

}
