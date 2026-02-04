package de.wmfinals.repository;

import de.wmfinals.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer> {
    // NICHT nötig zu definieren:
    // save(entity), saveAll(entities)
    // findById(id), findAll(), findAllById(ids)
    // delete(entity), deleteById(id), deleteAll()
    // existsById(id), count()

    List<Match> findByPenaltyShootout(Boolean penaltyShootout);
    List<Match> findByLocation(Match location);
    Match findByDate(Date date);
}
