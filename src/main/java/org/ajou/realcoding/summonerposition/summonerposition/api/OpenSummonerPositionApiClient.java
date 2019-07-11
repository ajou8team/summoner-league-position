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

    private final String apiKey = "RGAPI-f149a9a6-f088-43be-bcf7-06657ba35af2g";
    private final String SummonerRequseByNameUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{SummonerName}?api_key={apiKey}";
    private final String SummonerPositionByIdUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{encryptedSummonerId}?api_key={apiKey}";

    private SummonerId summonerId;

    public void getSummonerId(String SummonerName){
       summonerId = restTemplate.exchange(SummonerRequseByNameUrl, HttpMethod.GET,null,SummonerId.class,SummonerName,apiKey).getBody();
       getSummonerPosition(summonerId.getId());
    }

    public SummonerPosition getSummonerPosition(String encryptedSummonerId){
        SummonerPosition summonerPosition = restTemplate.exchange(SummonerRequseByNameUrl, HttpMethod.GET,null,SummonerPosition.class,encryptedSummonerId,apiKey).getBody();
        return summonerPosition;
    }




}