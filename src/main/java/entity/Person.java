package entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by Ziad & sofian on 03/12/2017.
 */
public class Person {


    /**
     * id of a person ( length = 8 )
     * (not null)
     * we need to add pattern @pattern when
     * we have more information about the ID
     */
    @NotNull
    @Size(min = 8,max=8)
    String identifiant;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;


    /**
     * Function type in directory
     */
    @Enumerated(EnumType.STRING)
    FunctionTypes function;

    /**
     * number which can be null
     */
    String number;

    /**
     * fax number can be null
     */
    String fax;

    /**
     *  name of the office
     */
    String office;

    /**
     * email of a person
     * a person can have multiple email addresses
     * exemple :
     *
     * Courriel
     *    tristan.cazenave@lamsade.dauphine.fr
     * Courriel
     *   tristan.cazenave@dauphine.fr
     *
     *
     */
    List<String> emails;

    /**
     * groups of which the user is a part
     */
    List<String> structures;


    public Person() {
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public FunctionTypes getFunction() {
        return function;
    }

    public void setFunction(FunctionTypes function) {
        this.function = function;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getStructures() {
        return structures;
    }

    public void setStructures(List<String> structures) {
        this.structures = structures;
    }
}
