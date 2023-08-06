package User.Mapper;

import User.entity.templates;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
public interface templatesMapper {

    @Select({
            "<script>"+
                    "SELECT *" +
                    "from lezao" +
                    "<where>" +
                    "<if test= 'name != null'>" +
                    " name = #{name}" +
                    "</if>" +
                    "<if test ='type != null'>" +
                    "and type = #{name}" +
                    "</if>" +
                    " <if test ='state !=null'>"+
                    "and state = #{state}" +
                    "</if>"+
                    "</where>" +
                    "</script>"
    })
    List<templates> getCount(@Param("name") String name,@Param("type") String type,@Param("state") String state);

    @Select("select * from lezao  ")
    List<templates> getAllTemplates();

    @Select("select * from lezao limit #{pageBegin},#{pageSize}")
    List<templates> findByPage(@Param("pageBegin")Integer PageBegin,@Param("pageSize") Integer PageSize);


    @Select("select * from lezao where name =#{name}")
    List<templates> getAllTemplatesByNamelike( @PathVariable String name);

    @Select("select * from lezao where type =#{type}")
    List<templates> getAllTemplatesByType(@PathVariable String type);
    @Select("select * from lezao where state =#{state}")
    List<templates> getAllTemplatesByState(@PathVariable String state);

    /**
     * 多条件查询
     * @param type
     * @param name
     * @param state
     * @return
     */
    @Select("select * from lezao where   name=#{name} and state =#{state} and type=#{type}")
    List<templates> getAllTemplatesByOrder(@PathVariable String type, @PathVariable String name, @PathVariable String state);


    @Delete("delete from lezao where number=#{number}")
    boolean deleteAllTemplatesbynum(@PathVariable int number );

    @Insert("insert into lezao(id,number,name,type,founder,modifier,create_time,modified_time,state) values(#{id},#{number},#{name},#{type},#{founder},#{modifier},#{create_time},#{modified_time},#{state})")
    int insert(@RequestBody templates t  );

    @Update("UPDATE lezao SET number = #{number},name = #{name},type =#{type},founder =#{founder},modifier=#{modifier},create_time=#{create_time},modified_time=#{modified_time} ,state=#{state}WHERE id=#{id}")
    boolean update(@RequestBody  templates t);

}
