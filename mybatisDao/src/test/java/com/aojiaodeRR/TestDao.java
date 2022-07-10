package com.aojiaodeRR;

import com.aojiaodeRR.dao.StudentDao;
import com.aojiaodeRR.domain.student;
import com.aojiaodeRR.utils.MyBatisUtils;
import com.aojiaodeRR.vo.ssj;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDao {
//    动态代理使用getMapper方法
    @Test
    public void tests_student(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<student> students = dao.s_student();
        for (student s : students){
            System.out.println(s);
        }
        sqlSession.close();
    }
    @Test
    public  void testssname(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        student ssname = dao.ssname("WangWei");
        System.out.println(ssname);
        sqlSession.close();
    }
    @Test
    public void testsIA(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        List<student> students = dao.sIA(2,22);
        for (student s : students){
            System.out.println(s);
        }
        sqlSession.close();
    }
    @Test
    public void testsjava(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        ssj sj = new ssj();
        sj.setSelectid(1);
        sj.setSelectage(18);
        List<student> students = dao.selectobject(sj);
        for (student s : students){
            System.out.println(s);
        }
        sqlSession.close();
    }
}
