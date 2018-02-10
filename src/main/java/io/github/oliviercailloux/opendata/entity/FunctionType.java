package io.github.oliviercailloux.opendata.entity;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by Ziad on 03/12/2017.
 *
 * enumeration of function types in the directory
 *
 * (non-exhaustive list on 03/12/2017
 */
//@Entity

public enum FunctionType {
    MAITRE_DE_CONFERENCES,
    ENS_VAC,
    PROFESSEUR_DES_UNIVERSITES
}
