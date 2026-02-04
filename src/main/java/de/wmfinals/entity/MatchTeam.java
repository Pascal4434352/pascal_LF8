package de.wmfinals.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "match_team")
public class MatchTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matchId;

    private Integer countryId;
    private Integer score;
    private Integer isWinner;

    public Integer getMatchId() { return matchId; }
    public void setMatchId(Integer matchId) { this.matchId = matchId; }

    public Integer getCountryId() { return countryId; }
    public void setCountryId(Integer countryId) { this.countryId = countryId; }

    public Integer getScore() { return score; }
    public void setScore(Integer score) { this.score = score; }

    public Integer getIsWinner() { return isWinner; }
    public void setIsWinner(Integer isWinner) { this.isWinner = isWinner; }
}
