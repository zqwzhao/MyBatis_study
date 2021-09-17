package cn.zhaoqw.dto;

import cn.zhaoqw.bean.Emp;

import java.util.Date;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-14 23:02]
 */
public class EmpDto {
    private Emp emp = new Emp();
    private String dname;
    private String loc;

    public EmpDto() {
    }

    public EmpDto(Emp emp, String dname, String loc) {
        this.emp = emp;
        this.dname = dname;
        this.loc = loc;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "EmpDto{" +
                "emp=" + emp +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
