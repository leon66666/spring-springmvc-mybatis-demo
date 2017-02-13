package zhongqiu.spring_springmvc_mybatis_demo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import zhongqiu.spring_springmvc_mybatis_demo.po.User;
import zhongqiu.spring_springmvc_mybatis_demo.po.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}