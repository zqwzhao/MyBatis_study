package cn.zhaoqw.bean;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-11 21:14]
 */
public class dept {
    private String deptno;
    private String dname;
    private String loc;

    public dept() {
    }

    public dept(String deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
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
}
