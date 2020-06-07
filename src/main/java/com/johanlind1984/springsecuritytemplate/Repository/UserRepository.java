package com.johanlind1984.springsecuritytemplate.Repository;

import com.johanlind1984.springsecuritytemplate.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
