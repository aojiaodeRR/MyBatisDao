package com.aojiaodeRR.dao;

import com.aojiaodeRR.domain.student;
import com.aojiaodeRR.vo.ssj;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    public List<student> s_student();
    public int insertstudent(student s);
//    简单传值#{任意字符}
    public student ssname(String name);
//    多参数传值，方法一命名参数,在参数前+@Param
    public List<student> sIA(@Param("sid") Integer id , @Param("sage") Integer age);
//    多参数传值，java对象
    public List<student> selectobject(ssj sj);
}
