package com.springcore.dependencyInjection;

public class Family {
    private Integer totalMember;

    public Integer getTotalMember() {
        return totalMember;
    }

    public void setTotalMember(Integer totalMember) {
        this.totalMember = totalMember;
    }

    @Override
    public String toString() {
        return "Family{" +
                "totalMember=" + totalMember +
                '}';
    }
}
