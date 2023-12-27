package com.hackerrank.demo.resources;

public class Teams {
    Integer memberOneSkill;
    Integer memberTwoSkill;

    public Teams(Integer memberOneSkill, Integer memberTwoSkill) {
        this.memberOneSkill = memberOneSkill;
        this.memberTwoSkill = memberTwoSkill;
    }

    public Integer getSumOfSkills() {
        return this.memberOneSkill + this.memberTwoSkill;
    }

    public Integer getEfficiency() {
        return this.memberOneSkill * this.memberTwoSkill;
    }

    public void showTeam() {
        System.out.println("Team: " + this.memberOneSkill + " - " + this.memberTwoSkill);
        System.out.println("Sum of skills: " + this.getSumOfSkills());
        System.out.println("Efficiency: " + this.getEfficiency());
    }
}
