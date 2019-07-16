package org.ajou.realcoding.summonerposition.summonerposition.api;

import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerId;
import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Set;

@Service
public class OpenSummonerPositionApiClient {

    @Autowired
    private RestTemplate restTemplate;

    private final String apiKey = "RGAPI-8113f098-5de9-4a61-9838-4e708f28dd0d";
    private final String SummonerIdByNameUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={apiKey}";
    private final String SummonerPositionByIdUrl = "https://kr.api.riotgames.com/lol/league/v4/entries/by-summoner/{encryptedSummonerId}?api_key={apiKey}";


    public SummonerId getSummonerId(String SummonerName){
        return restTemplate.exchange(SummonerIdByNameUrl, HttpMethod.GET,null,SummonerId.class,SummonerName,apiKey).getBody();
    }

    public Set<SummonerPosition> getSummonerPosition(String encryptedSummonerId){
        return restTemplate.exchange(SummonerPositionByIdUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<Set<SummonerPosition>>() {}, encryptedSummonerId, apiKey).getBody();
    }
}