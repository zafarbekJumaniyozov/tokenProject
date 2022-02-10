package teda.uz.tokenProjectServer.repository.rest.projection;

import org.springframework.data.rest.core.config.Projection;
import teda.uz.tokenProjectServer.entity.Role;
import teda.uz.tokenProjectServer.entity.enums.RoleName;

@Projection(name = "/customRole", types = Role.class)
public interface CustomRole {
    Integer getId();

    RoleName getName();
}
