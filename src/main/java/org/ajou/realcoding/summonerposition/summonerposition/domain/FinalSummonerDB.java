package org.ajou.realcoding.summonerposition.summonerposition.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
public class FinalSummonerDB {
    Set<SummonerPosition> summonerPositions;

    @Id
    String SummonerName;


}
