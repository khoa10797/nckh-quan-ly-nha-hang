package com.nckh.quanlynhahang.repositories;

import com.nckh.quanlynhahang.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

    User findByUserName(String userName);

}
