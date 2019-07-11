package org.ajou.realcoding.summonerposition.summonerposition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class SummonerPositionController {

    @Autowired
    SummonerService summonerService;

    @GetMapping("")
    public SummonerPosition getSummonerPositionName(@PathVariable String summonerPosotionByName){
        return summonerService.getSummonerPositionName(summonerPosotionByName);

    }



}
