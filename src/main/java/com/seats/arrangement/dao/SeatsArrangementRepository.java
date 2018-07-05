package com.seats.arrangement.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.seats.arrangement.dto.BayDTO;

public interface SeatsArrangementRepository extends MongoRepository<BayDTO, String> {

}
