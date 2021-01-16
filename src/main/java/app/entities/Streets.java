package app.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "public", name = "streets")
public class Streets {
    @Id
    @Column(name = "street_id")
    private int street_id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "street_id", cascade = CascadeType.ALL)
    private List<Houses> housesList = new ArrayList<>();

    public Streets() {}

    public int getStreet_id() {
        return street_id;
    }

    public void setStreet_id(int street_id) {
        this.street_id = street_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Houses> getHousesList() {
        return housesList;
    }

    public void setHousesList(List<Houses> housesList) {
        this.housesList = housesList;
    }
}
