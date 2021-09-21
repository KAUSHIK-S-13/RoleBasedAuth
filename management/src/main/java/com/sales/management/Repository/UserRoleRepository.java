package com.sales.management.Repository;

import com.sales.management.Model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {



    List<UserRole> findByUserId(int id);
}
