package com.seats.arrangement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.seats.arrangement.dao.SeatsArrangementRepository;
import com.seats.arrangement.dto.BayDTO;
import com.seats.arrangement.dto.SeatDTO;

@RestController
@CrossOrigin(maxAge = 3600)
@EnableMongoRepositories("com.seats.arrangement.dao")
@RequestMapping(value = "/api", method = RequestMethod.GET)
public class SaveTemplateServices {

	@Autowired
	private SeatsArrangementRepository seatsArrangementRepository;

	@RequestMapping(value = "saveSeatingTemplate", method = RequestMethod.POST)
	public void saveTemplate(@RequestParam("floorId") String floorId, @RequestParam("wingId") String wingId,
			@RequestParam("bayName") String bayName, @RequestBody List<List<SeatDTO>> listOfSeatsList) {
		BayDTO bayDTO = new BayDTO();
		bayDTO.setFloorId(floorId);
		bayDTO.setWingId(wingId);
		bayDTO.setBayName(bayName);
		bayDTO.setListOfSeatsList(listOfSeatsList);
		seatsArrangementRepository.save(bayDTO);
	}

	@RequestMapping("/save")
	public String fetchString() {
		System.out.println("Meeeeeezdi");
		return "Hello";
	}

}
