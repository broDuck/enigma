package com.broduck.enigma.model;

/**
 * Created by broduck on 2017. 4. 26..
 */
public class VoteOpenSetting {
    private Boolean ageOpenYn;
    private Boolean sexOpenYn;
    private Boolean privateOpenYn;

    public Boolean getAgeOpenYn() {
        return ageOpenYn;
    }

    public void setAgeOpenYn(Boolean ageOpenYn) {
        this.ageOpenYn = ageOpenYn;
    }

    public Boolean getSexOpenYn() {
        return sexOpenYn;
    }

    public void setSexOpenYn(Boolean sexOpenYn) {
        this.sexOpenYn = sexOpenYn;
    }

    public Boolean getPrivateOpenYn() {
        return privateOpenYn;
    }

    public void setPrivateOpenYn(Boolean privateOpenYn) {
        this.privateOpenYn = privateOpenYn;
    }
}
