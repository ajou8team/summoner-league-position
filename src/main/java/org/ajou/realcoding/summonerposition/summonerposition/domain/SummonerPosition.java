package org.ajou.realcoding.summonerposition.summonerposition.domain;

import lombok.Data;

/*
[
    {
        "queueType": "RANKED_SOLO_5x5",
        "summonerName": "Hide on bush",
        "hotStreak": true,
        "wins": 332,
        "veteran": true,
        "losses": 337,
        "rank": "I",
        "tier": "CHALLENGER",
        "inactive": false,
        "freshBlood": false,
        "leagueId": "ba73b86b-97c9-3dfc-856e-88777fec7e56",
        "summonerId": "CZxLcXLabbMmg35pSK7Qsl9QPkDaIAavSuQij8_9SY2x9g",
        "leaguePoints": 817
    }
]
 */

@Data
public class SummonerPosition {

        private String summonerName;
        private String summonerId;
        private String leagueId;

        private String tier;
        private String rank;

        private int wins;
        private int losses;
        private int leaguePoints;

        private boolean hotStreak;
        private boolean veteran;
        private boolean inactive;
        private boolean freshBlood;

}
