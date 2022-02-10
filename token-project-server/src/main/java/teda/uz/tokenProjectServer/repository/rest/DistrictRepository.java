package teda.uz.tokenProjectServer.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import teda.uz.tokenProjectServer.entity.District;
import teda.uz.tokenProjectServer.repository.rest.projection.CustomDistrict;

@CrossOrigin
@RepositoryRestResource(path = "/district", collectionResourceRel = "list", excerptProjection = CustomDistrict.class)
public interface DistrictRepository extends JpaRepository<District, Integer> {
}
