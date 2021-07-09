package com.dlrfdnwkd.testspringboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.dlrfdnwkd.testspringboot.model.User;

@Repository
@Mapper
public interface UserMapper {
	List<User> find();
}
