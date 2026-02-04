package de.wmfinals.service;

import de.wmfinals.entity.Country;
import de.wmfinals.entity.Match;
import de.wmfinals.entity.MatchTeam;
import de.wmfinals.repository.CountryRepository;
import de.wmfinals.repository.MatchRepository;
import de.wmfinals.repository.MatchTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WMService {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private MatchTeamRepository matchTeamRepository;

    /*public WMService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }
    public WMService(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }
    public WMService(MatchTeamRepository matchTeamRepository) {
        this.matchTeamRepository = matchTeamRepository;
    }*/
    //------------------------------------------------------------------------------------------------------------------
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    public Country getCountryByName(String name){
        return countryRepository.findByName(name);
    }
    public void deleteCountryById(int id) {
        countryRepository.deleteById(id);
    }
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }
    //------------------------------------------------------------------------------------------------------------------
    public List<Match> getAllMatches(){
        return matchRepository.findAll();
    }
    public List<Match> getAllPenalty(){
        return matchRepository.findByPenaltyShootout(true);
    }
    public List<Match> getLocation(Match location){
        return matchRepository.findByLocation(location);
    }
    public Match getDate(Date date){
        return matchRepository.findByDate(date);
    }
    public void deleteMatch(Match match){
        matchRepository.delete(match);
    }
    public Match saveMatch(Match match){
        return matchRepository.save(match);
    }
    //------------------------------------------------------------------------------------------------------------------
    public List<MatchTeam> getAllTeams(){
        return matchTeamRepository.findAll();
    }
    public void deleteTeam(MatchTeam team){
        matchTeamRepository.delete(team);
    }
    public MatchTeam saveTeam(MatchTeam team){
        return matchTeamRepository.save(team);
    }
}