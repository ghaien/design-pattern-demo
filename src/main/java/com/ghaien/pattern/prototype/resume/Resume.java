package com.ghaien.pattern.prototype.resume;

/**
 * 简历类
 *
 * @author guo.haien
 * @date 2019/2/28 13:35
 */
public class Resume implements Cloneable {

    private String name;

    private String sex;

    private Integer age;

    private WorkExperience workExperience;

    public Resume() {
    }

    public Resume(String name, String sex, Integer age, WorkExperience workExperience) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.workExperience = workExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    @Override
    protected Object clone() {
        try {
            Resume resume = (Resume) super.clone();
            resume.setWorkExperience((WorkExperience) workExperience.clone());
            return resume;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", workExperience=" + workExperience +
                '}';
    }
}
