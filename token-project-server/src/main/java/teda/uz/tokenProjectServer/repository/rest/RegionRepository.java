package teda.uz.tokenProjectServer.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import teda.uz.tokenProjectServer.entity.Region;
import teda.uz.tokenProjectServer.repository.rest.projection.CustomRegion;

@CrossOrigin
@RepositoryRestResource(path = "/region", excerptProjection = CustomRegion.class)
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
