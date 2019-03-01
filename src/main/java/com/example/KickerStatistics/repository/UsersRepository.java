package com.example.KickerStatistics.repository;

import com.example.KickerStatistics.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
