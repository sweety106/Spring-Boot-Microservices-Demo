package com.stryder.profile;

import java.util.List;

public interface TeamRepository {
	List<Team> getAllTeams();
	Team getTeam(String teamId);
}
