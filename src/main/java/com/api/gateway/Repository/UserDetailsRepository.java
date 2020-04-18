package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.models.User_Details;

public interface UserDetailsRepository extends JpaRepository<User_Details, Integer> {

}
