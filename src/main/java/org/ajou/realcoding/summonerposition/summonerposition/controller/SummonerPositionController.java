package org.ajou.realcoding.summonerposition.summonerposition.controller;

import org.ajou.realcoding.summonerposition.summonerposition.domain.FinalSummonerDB;
import org.ajou.realcoding.summonerposition.summonerposition.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerPositionController {

    @Autowired
    SummonerService summonerService;

    @GetMapping("/summonerPositionByName/{summonerName}")
    public FinalSummonerDB getSummonerPosition(@PathVariable String summonerName){
        return summonerService.getSummonerPositionByName(summonerName);

    }



}
