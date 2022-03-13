package com.pemawa.User.Registration.and.Login.Repository;

import com.pemawa.User.Registration.and.Login.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {

}
