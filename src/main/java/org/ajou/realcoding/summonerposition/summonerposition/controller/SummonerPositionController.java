package org.ajou.realcoding.summonerposition.summonerposition.controller;

import org.ajou.realcoding.summonerposition.summonerposition.domain.SummonerPosition;
import org.ajou.realcoding.summonerposition.summonerposition.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SummonerPositionController {

    @Autowired
    SummonerService summonerService;

    @GetMapping("/summonerPositionByName/{summonerName}")
    public SummonerPosition getSummonerPositionByName(@PathVariable String summonerName){
        return summonerService.getSummonerPositionName(summonerName);

    }



}