package cn.zhaoqw.dao;

import cn.zhaoqw.bean.Emp;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface EmpDao {

    public Integer save(Emp emp);
    public Integer insertEmp(String ename);
    public Integer update(Emp emp);
    public Integer delete(Integer empno);
    public Emp selectEmpEmpno(Integer empno);

    @MapKey("empno")   //指定返回值Map的key
    Map<Integer,Emp> getAllEmpReturnMap();
}
