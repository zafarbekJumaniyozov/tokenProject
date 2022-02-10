package teda.uz.tokenProjectServer.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import teda.uz.tokenProjectServer.entity.absEntity.AbsNameEntity;

import javax.persistence.Entity;


@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Country extends AbsNameEntity {
}
