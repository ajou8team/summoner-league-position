package org.ajou.realcoding.summonerposition.summonerposition.repository;

import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class SummonerPositionRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public SummonerPosition insertSummonerPosition(SummonerPosition summonerPosition){
        return mongoTemplate.save(summonerPosition);
    }

    public Boolean findSummonerPositionBySummornerName(String summornerName){

        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(summornerName));

        if(mongoTemplate.findOne(query, SummonerPosition.class) != null){
            return true;
        }
        else
            return false;
    }

}
