package org.ajou.realcoding.summonerposition.summonerposition.api;

import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerId;
import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenSummonerPositionApiClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String apiKey = "RGAPI-e26ebe1f-6b0b-4c0c-ae06-59b67400db95";
    private final String SummonerIdByNameUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private final String SummonerPositionByIdUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{encryptedSummonerId}?api_key={apiKey}";


    public SummonerId getSummonerId(String SummonerName){
        return restTemplate.exchange(SummonerIdByNameUrl, HttpMethod.GET,null,SummonerId.class,SummonerName,apiKey).getBody();
    }

    public SummonerPosition getSummonerPosition(String encryptedSummonerId){
        return restTemplate.exchange(SummonerPositionByIdUrl, HttpMethod.GET,null,SummonerPosition.class,encryptedSummonerId,apiKey).getBody();
    }
}