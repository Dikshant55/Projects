package com.lirary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRegistrationRepo extends JpaRepository<User_Registration, Integer> {




}
