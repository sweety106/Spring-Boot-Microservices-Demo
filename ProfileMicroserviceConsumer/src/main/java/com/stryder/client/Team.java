package com.stryder.client;

public class Team {
	
	private static final long serialVersionUID = 1L;
	private String teamId;
	private String teamName;
	
	
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + "]";
	}
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String teamId, String teamName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
	}
	
}
