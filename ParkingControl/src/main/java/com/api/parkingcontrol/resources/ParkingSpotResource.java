package com.api.parkingcontrol.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.parkingcontrol.services.ParkingSpotService;

@RestController
@CrossOrigin(origins="*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotResource {
	
	@Autowired
	ParkingSpotService pss;
	
	
	
	

}
