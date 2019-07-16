package org.ajou.realcoding.summonerposition.summonerposition.domain;

import lombok.Data;

/*
LeagueEntryDTO
NAME	DATA TYPE	DESCRIPTION
queueType	    string
summonerName	string
hotStreak	    boolean
miniSeries	    MiniSeriesDTO
wins	        int
veteran	        boolean
losses	        int
rank	        string
leagueId	    string
inactive	    boolean
freshBlood	    boolean
tier	        string
summonerId	    string	Player's summonerId (Encrypted)
leaguePoints	int

miniSeries:
progress	string
losses	int
target	int
wins	int
 */

@Data
public class SummonerPosition {
    private String queueType;
    private String summonerName;
    private boolean hotStreak;
    private miniSeries MiniSeriesDTO;
    private int wins;
    private boolean veteran;
    private int losses;
    private String rank;
    private String leagueId;
    private boolean inactive;
    private boolean freshBlood;
    private String tier;
    private String summonerId;
    private int leaguePoints;

    @Data
    public static class miniSeries{
        private String progress;
        private int losses;
        private int target;
        private int wins;
    }
}
