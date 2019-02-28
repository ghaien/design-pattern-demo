package com.ghaien.pattern.prototype.resume;

import java.time.LocalDate;

/**
 * 工作经验类
 *
 * @author guo.haien
 * @date 2019/2/28 13:32
 */
public class WorkExperience implements Cloneable {

    private LocalDate startWorkDate;

    private LocalDate endWorkDate;

    private String companyName;

    public WorkExperience() {
    }

    public WorkExperience(LocalDate startWorkDate, LocalDate endWorkDate, String companyName) {
        this.startWorkDate = startWorkDate;
        this.endWorkDate = endWorkDate;
        this.companyName = companyName;
    }

    public LocalDate getStartWorkDate() {
        return startWorkDate;
    }

    public void setStartWorkDate(LocalDate startWorkDate) {
        this.startWorkDate = startWorkDate;
    }

    public LocalDate getEndWorkDate() {
        return endWorkDate;
    }

    public void setEndWorkDate(LocalDate endWorkDate) {
        this.endWorkDate = endWorkDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "startWorkDate=" + startWorkDate +
                ", endWorkDate=" + endWorkDate +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
