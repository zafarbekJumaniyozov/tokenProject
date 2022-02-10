package teda.uz.tokenProjectServer.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import teda.uz.tokenProjectServer.entity.absEntity.AbsNameEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class District extends AbsNameEntity {

    @ManyToOne
    private Region region;
}
