package teda.uz.tokenProjectServer.repository.rest.projection;

import org.springframework.data.rest.core.config.Projection;
import teda.uz.tokenProjectServer.entity.Country;

@Projection(name = "customCountry", types = Country.class)
public interface CustomCountry {
    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();
}
