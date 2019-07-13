package org.ajou.realcoding.summonerposition.summonerposition.service;

import org.ajou.realcoding.summonerposition.summonerposition.api.OpenSummonerPositionApiClient;
import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerId;
import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.ajou.realcoding.summonerposition.summonerposition.repository.SummonerPositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Set;

@Service
public class SummonerService {
    @Autowired
    OpenSummonerPositionApiClient openSummonerPositionApiClient;
    @Autowired
    SummonerPositionRepository summonerPositionRepository;

    public Set<SummonerPosition> getSummonerPositionByName(String summonerName) {
        SummonerId summonerId = openSummonerPositionApiClient.getSummonerId(summonerName);
        Set<SummonerPosition> summonerPositionSet = openSummonerPositionApiClient.getSummonerPosition(summonerId.getId());

        Iterator<SummonerPosition> IterSummonerPosition = summonerPositionSet.iterator();
        while(IterSummonerPosition.hasNext()){
            summonerPositionRepository.insertSummonerPosition(IterSummonerPosition.next());
        }

        return summonerPositionSet;
    }
}
