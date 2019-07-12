package com.example.po;

public class User {
    private Integer oppenid;

    private String snakename;

    private String name;

    private Integer classId;

    private String headurl;

    private Byte power;

    public Integer getOppenid() {
        return oppenid;
    }

    public void setOppenid(Integer oppenid) {
        this.oppenid = oppenid;
    }

    public String getSnakename() {
        return snakename;
    }

    public void setSnakename(String snakename) {
        this.snakename = snakename == null ? null : snakename.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    public Byte getPower() {
        return power;
    }

    public void setPower(Byte power) {
        this.power = power;
    }
}