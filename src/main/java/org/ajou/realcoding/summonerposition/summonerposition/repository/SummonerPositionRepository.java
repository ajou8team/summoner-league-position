package org.ajou.realcoding.summonerposition.summonerposition.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

public class SummonerPositionRepository {

    @Autowired
    MongoTemplate mongoTemplate;



}
