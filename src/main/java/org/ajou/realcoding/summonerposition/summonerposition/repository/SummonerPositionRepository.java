package org.ajou.realcoding.summonerposition.summonerposition.repository;

import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Query;

public class SummonerPositionRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public SummonerPosition insertSummonerPosition(SummonerPosition summonerPosition){
        return mongoTemplate.save(summonerPosition);
    }










}
