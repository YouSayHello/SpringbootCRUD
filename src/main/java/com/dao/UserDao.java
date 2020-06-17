package com.dao;

import com.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper @Repository
public interface UserDao {

	@Select("select * from user where id = #{id}")
	public User findById(Integer id);

	@Select("select * from user")
	public List<User> findAll();

	//@Insert("insert into user value=(#{name},#{age},#{address},#{birthday})") 
	@Insert("insert into user(name,age,address,birthday) values(#{name},#{age},#{address},#{birthday})") 
	//@Options(keyProperty = "id" , useGeneratedKeys = true)id自增长
	public boolean add(User user);
	
	@Update("update user set name=#{name},age=#{age},address=#{address},birthday=#{birthday} where id=#{id}") 
	public boolean update(User user);
	 
	@Delete("delete from user where id=#{id}")
	public boolean delete(Integer id);

}
