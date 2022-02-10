package teda.uz.tokenProjectServer.repository.rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import teda.uz.tokenProjectServer.entity.Role;
import teda.uz.tokenProjectServer.entity.enums.RoleName;

@RepositoryRestResource(path = "/role")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByName(RoleName name);
}
