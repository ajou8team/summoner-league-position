package org.ajou.realcoding.summonerposition.summonerposition.repository;

import org.ajou.realcoding.summonerposition.summonerposition.domain.FinalSummonerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SummonerPositionRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public FinalSummonerDB insertOrUpdateSummonerPosition(FinalSummonerDB summonerPositions){
        return mongoTemplate.save(summonerPositions);
    }

}
