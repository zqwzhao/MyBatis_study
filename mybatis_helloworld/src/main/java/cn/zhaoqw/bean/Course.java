package cn.zhaoqw.bean;

/**
 * 课程bean
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-11 18:13]
 */
public class Course {
    private Integer courseTypeNo; //课程类型Id
    private String courseNo;//课程id
    private String courseName;//课程名称
    private Double credit;
    private Integer ctime;
    private Integer openTeam;
    private String isRequire;
    private String deptNo;
    private String remark;

    public Course() {
    }

    public Course(Integer courseTypeNo, String courseNo, String courseName, Double credit, Integer ctime, Integer openTeam, String isRequire, String deptNo, String remark) {
        this.courseTypeNo = courseTypeNo;
        this.courseNo = courseNo;
        this.courseName = courseName;
        this.credit = credit;
        this.ctime = ctime;
        this.openTeam = openTeam;
        this.isRequire = isRequire;
        this.deptNo = deptNo;
        this.remark = remark;
    }

    public Integer getCourseTypeNo() {
        return courseTypeNo;
    }

    public void setCourseTypeNo(Integer courseTypeNo) {
        this.courseTypeNo = courseTypeNo;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(String courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public Integer getOpenTeam() {
        return openTeam;
    }

    public void setOpenTeam(Integer openTeam) {
        this.openTeam = openTeam;
    }

    public String getIsRequire() {
        return isRequire;
    }

    public void setIsRequire(String isRequire) {
        this.isRequire = isRequire;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseTypeNo=" + courseTypeNo +
                ", courseNo='" + courseNo + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credit=" + credit +
                ", ctime=" + ctime +
                ", openTeam=" + openTeam +
                ", isRequire='" + isRequire + '\'' +
                ", deptNo='" + deptNo + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
