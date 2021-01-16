package app.entities;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "houses")
public class Houses {
    @Id
    @Column(name = "house_id")
    private String house_id;

    @ManyToOne
    @JoinColumn(name="street_id")
    private Streets street_id;

    @Column(name = "number")
    private String number;

    @Column(name = "liter")
    private String liter;

    @Column(name = "korpus")
    private String korpus;

    public Houses() {}

    public void setHouse_id(String house_id) {
        this.house_id = house_id;
    }

    public void setStreet_id(Streets street_id) {
        this.street_id = street_id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public void setKorpus(String korpus) {
        this.korpus = korpus;
    }

    public String getHouse_id() {
        return house_id;
    }

    public Streets getStreet_id() {
        return street_id;
    }

    public String getNumber() {
        return number;
    }

    public String getLiter() {
        return liter;
    }

    public String getKorpus() {
        return korpus;
    }
}
