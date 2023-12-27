package com.hackerrank.demo;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hackerrank.demo.resources.Teams;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ArrayList<Integer> skills = new ArrayList<Integer>();
		skills.add(1);
		skills.add(5);
		skills.add(3);
		skills.add(3);
		skills.add(4);
		skills.add(2);
		skills.add(6);
		skills.add(0);

		Long totalEfficiency = getTotalEfficiency(skills);

		System.out.println("Total efficiency: " + totalEfficiency);

	}

	private static Long getTotalEfficiency(ArrayList<Integer> skills) {
		// Sort the skills in descending order using sort method
		ArrayList<Integer> orderedSkills = skills;
		Long totalEfficiency = 0L;
		orderedSkills.sort((a, b) -> b - a);

		// Split the skills into teams of two members
		ArrayList<Teams> teams = new ArrayList<Teams>();
		for (int i = 0; i < orderedSkills.size(); i += 2) {
			teams.add(new Teams(orderedSkills.get(i), orderedSkills.get(orderedSkills.size()-i-1)));
		}

		// Get the first team sum of skills
		Integer sumOfSkillsForFirstTeam = teams.get(0).getSumOfSkills();
		Boolean itsPosibleToCreateTeams = true;

		for(Teams team : teams) {
			if (team.getSumOfSkills() != sumOfSkillsForFirstTeam) {
				System.out.println("The teams don't have the same sum of skills");
				itsPosibleToCreateTeams = false;		
			}
		}

		if (itsPosibleToCreateTeams) {
			System.out.println("Teams: ");
			for(Teams team : teams) {
				team.showTeam();
				totalEfficiency += team.getEfficiency();
			}
			return totalEfficiency;
		} else {
			totalEfficiency = -1L;
		}
		return totalEfficiency;
	}

}
