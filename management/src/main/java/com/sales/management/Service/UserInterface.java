package com.sales.management.Service;

import com.sales.management.BaseResponse.APIResponse;
import com.sales.management.DTO.UserDTO;
import com.sales.management.DTO.UserRoleDTO;
import com.sales.management.Model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public interface UserInterface {


    APIResponse<User> GetUserWithPagination(int offset, int pageSize, String name);

    Optional<User> updateUser(UserDTO userDTO);

    Optional<User> FindByUserId(int id);

    Optional<User> deletesoft(UserDTO userDTO);

    User Saveuser(UserDTO userDTO);

    UserRoleDTO logOfUser(UserRoleDTO userRoleDTO);
}
