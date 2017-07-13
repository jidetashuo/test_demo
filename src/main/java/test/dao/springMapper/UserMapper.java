package test.dao.springMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 王猛
 * @Date 2017/4/13 16:46
 * @Discribe:
 */
@Mapper
public interface UserMapper {



    @Select("select email from t_user where username = #{name}")
    String findUserByName(@Param("name") String name);

}
