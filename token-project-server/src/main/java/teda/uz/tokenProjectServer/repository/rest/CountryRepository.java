package teda.uz.tokenProjectServer.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import teda.uz.tokenProjectServer.entity.Country;
import teda.uz.tokenProjectServer.repository.rest.projection.CustomCountry;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(path = "/country", excerptProjection = CustomCountry.class)
public interface CountryRepository extends JpaRepository<Country, Integer> {
    @RestResource(path = "/getByName")
    List<Country> findAllByNameUzContainsIgnoreCaseOrNameRuContainsIgnoreCaseOrNameEnContainsIgnoreCase(String nameUz, String nameRu, String nameEn);
}
