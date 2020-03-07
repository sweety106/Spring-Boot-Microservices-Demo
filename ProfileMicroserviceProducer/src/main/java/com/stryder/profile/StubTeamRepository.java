package com.stryder.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubTeamRepository implements TeamRepository {
	
	private Map<String, Team> teamData = new HashMap<String, Team>();
	
	public StubTeamRepository() {
		Team team = new Team("999", "Dev-Ops Team");
		teamData.put("999", team);
		team = new Team("1999", "Developer Team");
		teamData.put("1999", team);
		team = new Team("2999", "QA Team");
		teamData.put("2999", team);
	}
	
	@Override
	public List<Team> getAllTeams() {
		return new ArrayList<Team>(teamData.values());
	}

	@Override
	public Team getTeam(String teamId) {
		return teamData.get(teamId);
	}

}
