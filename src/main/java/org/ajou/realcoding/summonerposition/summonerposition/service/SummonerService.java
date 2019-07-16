package org.ajou.realcoding.summonerposition.summonerposition.service;

import org.ajou.realcoding.summonerposition.summonerposition.api.OpenSummonerPositionApiClient;
import org.ajou.realcoding.summonerposition.summonerposition.domain.FinalSummonerDB;
import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerId;
import org.ajou.realcoding.summonerposition.summonerposition.repository.SummonerPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SummonerService {
    @Autowired
    OpenSummonerPositionApiClient openSummonerPositionApiClient;
    @Autowired
    SummonerPositionRepository summonerPositionRepository;


    public FinalSummonerDB getSummonerPositionByName(String summonerName) {
        SummonerId summonerId = openSummonerPositionApiClient.getSummonerId(summonerName);
        FinalSummonerDB finalSummonerDB1 = new FinalSummonerDB();
        finalSummonerDB1.setSummonerName(summonerName);
        finalSummonerDB1.setSummonerPositions(openSummonerPositionApiClient.getSummonerPosition(summonerId.getId()));


         summonerPositionRepository.insertOrUpdateSummonerPosition(finalSummonerDB1);

        return finalSummonerDB1;
    }
}
