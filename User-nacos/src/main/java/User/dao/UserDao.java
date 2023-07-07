package User.dao;

import User.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


import java.util.*;
@Repository
@Mapper
public interface UserDao  {
     @Select("select * from user ")
     List<User> getAll();

     @Delete("delete * from user where id=#{id}")
     int deleteUserById(int id);




    @Update("update user  set  name=#{name},age=#{age},address=#{address},phone=#{phone},create_time=#{create_time}  where id=#{id}" )
     int updateUserById(int id);

    @Select("Select * from user where id=#{id}")
       User getUserById(int id);

      @Insert("Insert into user(id,name,age,address,phone,create_time) values(#{id}, #{name}, #{age}, #{address}, #{phone}, #{create_time})")
      int  InsertUser(User user);




}
