package teda.uz.tokenProjectServer.repository.rest.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import teda.uz.tokenProjectServer.entity.District;
import teda.uz.tokenProjectServer.entity.Region;

@Projection(name = "customDistrict", types = District.class)
public interface CustomDistrict {

    Integer getId();

    String getNameUz();

    String getNameRu();

    String getNameEn();

    Region getRegion();

    @Value("#{target.region?.id?:null}")
    Integer getRegionId();
}
