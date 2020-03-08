package com.stryder.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;
	
	/*
	 * @RequestMapping("/") public String home(){ return "index"; }
	 */
	
	@RequestMapping("/teamProfiles")
	public String profileList(Model model) {
		model.addAttribute("teams", teamRepository.getAllTeams());
		return "teamProfiles";
	}
	
	@RequestMapping("/teamDetails")
	public String teamDetails(@RequestParam("id") String teamId, Model model) {
		model.addAttribute("team", teamRepository.getTeam(teamId));
		return "teamDetails";
	}
}
