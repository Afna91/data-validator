package com.test.incoming.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.test.incoming.entity.OutGoing;

public interface OutGoingRepository extends MongoRepository<OutGoing, Integer> {

}
