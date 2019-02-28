package com.ghaien.pattern.prototype.resume;

import java.time.LocalDate;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/28 13:38
 */
public class Test {

    public static void main(String[] args) {
        WorkExperience workExperience = new WorkExperience(
                LocalDate.parse("2018-01-01"),
                LocalDate.parse("2019-01-01"),
                "某某公司");
        Resume resume = new Resume("张三", "男", 22, workExperience);
        System.out.println(resume);

        Resume copyResume = (Resume) resume.clone();
        System.out.println(copyResume);

        resume.getWorkExperience().setEndWorkDate(LocalDate.parse("2020-01-01"));
        System.out.println(resume);
        System.out.println(copyResume);
    }
}
