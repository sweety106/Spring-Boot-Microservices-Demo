package com.stryder.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteTeamRepository implements TeamRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteTeamRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	@Override
	public List<Team> getAllTeams() {
		Team[] teams = restTemplate.getForObject(serviceUrl+"/teams", Team[].class);
		return Arrays.asList(teams);
	}

	@Override
	public Team getTeam(String teamId) {
		return restTemplate.getForObject(serviceUrl + "/teams/{id}",
				Team.class, teamId);
	}

}
