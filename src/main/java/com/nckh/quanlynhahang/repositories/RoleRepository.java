package com.nckh.quanlynhahang.repositories;

import com.nckh.quanlynhahang.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {

    Role findByName(String name);

}
