package com.stryder.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class StubProfileRepository implements ProfileRepository {
	
	private Map<String, Profile> profileData = new HashMap<String, Profile>();
	
	public StubProfileRepository() {
		Profile profile = new Profile("1000", "Ganesh");
		profileData.put("1000", profile);
		profile = new Profile("2000", "Siddheshwar");
		profileData.put("2000", profile);
		profile = new Profile("3000", "Mahimane");
		profileData.put("3000", profile);
	}
	
	@Override
	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profileData.values());
	}

	@Override
	public Profile getProfile(String userId) {
		return profileData.get(userId);
	}

}