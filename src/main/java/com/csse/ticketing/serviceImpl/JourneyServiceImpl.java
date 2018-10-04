package com.csse.ticketing.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csse.ticketing.models.JourneyModel;
import com.csse.ticketing.models.UserModel;
import com.csse.ticketing.repository.JourneyRepository;
import com.csse.ticketing.services.JourneyService;

/**
 * 
 * @author Charuni
 *
 */

@Service
public class JourneyServiceImpl implements JourneyService{
	
	@Autowired 
	private JourneyRepository journeyRepo;

	@Override
	public JourneyModel createJourney(JourneyModel journey) {
		// TODO Auto-generated method stub
		journey.setKey(UUID.randomUUID().toString());
		return journeyRepo.save(journey);
	}

	@Override
	public JourneyModel updateJourney(JourneyModel journey) {
		// TODO Auto-generated method stub
		return journeyRepo.save(journey);
	}

	@Override
	public JourneyModel retriveJourney(String id) {
		// TODO Auto-generated method stub
		return journeyRepo.findOne(id);
	}

	@Override
	public List<JourneyModel> listJourney(String user) {
		// TODO Auto-generated method stub
		return journeyRepo.findAll();
	}
	

}
