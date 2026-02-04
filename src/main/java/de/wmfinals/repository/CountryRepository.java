package de.wmfinals.repository;

import de.wmfinals.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    // NICHT nötig zu definieren:
    // save(entity), saveAll(entities)
    // findById(id), findAll(), findAllById(ids)
    // delete(entity), deleteById(id), deleteAll()
    // existsById(id), count()

    Country findByName(String name);
}
