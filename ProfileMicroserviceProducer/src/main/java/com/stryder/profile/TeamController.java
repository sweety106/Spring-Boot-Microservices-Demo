package com.stryder.profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;
	
	@RequestMapping("/teams")
	public Team[] all() {
		List<Team> teams = teamRepository.getAllTeams();
		return teams.toArray(new Team[teams.size()]);
	}
	
	@RequestMapping("/teams/{id}")
	public Team byId(@PathVariable("id") String teamId) {
		Team team = teamRepository.getTeam(teamId);
		return team;
	}
}