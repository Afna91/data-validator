package com.test.incoming.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.test.incoming.entity.IncomingData;

@Repository
public interface IncomingRepository extends MongoRepository<IncomingData, Integer> {

}
