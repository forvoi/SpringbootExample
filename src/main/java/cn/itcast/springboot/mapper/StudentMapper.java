package cn.itcast.springboot.mapper;

import cn.itcast.springboot.empty.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * 学生mapper----操作数据库相关
 */

@Mapper
@Repository
public interface StudentMapper {

    @Select("select * from students where id=#{id}")//mapper层书写对应的sql语句
    Student findById(Integer id);
    //返回实体类Student
}
