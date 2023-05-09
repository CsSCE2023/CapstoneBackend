package com.capstone.capstone.auth.repositories;

import com.capstone.capstone.auth.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}