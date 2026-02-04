import de.wmfinals.entity.Country;
import de.wmfinals.repository.CountryRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

class ServiceTest {

    @Autowired
    private CountryRepository countryRepository;

    @Test
    void testSaveCountry() {
        Country country = new Country();
        country.setName("Germany");

        Country saved = countryRepository.save(country);

    }
}
