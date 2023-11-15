package com.abm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abm.entity.Users;

@Repository
public interface UsersRepository  extends JpaRepository<Users, Integer>{

	Users findByUserNameAndPassword(String userName, String password);
      
	@Query("select count(c) from Users c where c.userName = ?1")
	Long findIfUserExists(String userName);

}
