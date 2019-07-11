package org.ajou.realcoding.summonerposition.summonerposition.service;

import org.ajou.realcoding.summonerposition.summonerposition.api.OpenSummonerPositionApiClient;
import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.springframework.beans.factory.annotation.Autowired;

public class SummonerService {
    @Autowired
    OpenSummonerPositionApiClient openSummonerPositionApiClient;

    public SummonerPosition getSummonerPositionByName(String summonerName) {

    }
}
