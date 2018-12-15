package com.hrg.demospringjpa.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hrg.demospringjpa.controller.dto.UserDto;
import com.hrg.demospringjpa.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
	@Query(value="SELECT * FROM USER u WHERE u.username LIKE CONCAT('%',:userName,'%')",nativeQuery=true)
	List<UserEntity> findList(@Param("userName") String userName);
	
	@Query(value="SELECT u.username,u.nickname, u.password, u.roles FROM USER u WHERE u.username LIKE CONCAT('%',:userName,'%')",nativeQuery=true)
	List<Map<String, Object>> findListPart(@Param("userName") String userName);
	
	
	@Query(value="SELECT u.username, u.password FROM USER u WHERE u.username LIKE CONCAT('%',:userName,'%')",nativeQuery=true)
	List<UserEntity> findListPart2(@Param("userName") String userName);
	

}
