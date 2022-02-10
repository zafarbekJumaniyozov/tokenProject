package teda.uz.tokenProjectServer.repository.rest.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import teda.uz.tokenProjectServer.entity.Country;
import teda.uz.tokenProjectServer.entity.Region;

@Projection(name = "customRegion", types = Region.class)
public interface CustomRegion {
    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();

    Country getCountry();

    @Value("#{target.country.id}")
    Integer getCountryId();
}
