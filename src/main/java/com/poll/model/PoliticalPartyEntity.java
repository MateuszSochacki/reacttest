package com.poll.model;

import javax.persistence.*;

@Entity
@Table(name = "politicalparty")
public class PoliticalPartyEntity {
    private long idPoliticalParty;
    private String name;
    private String description;
    private CoordinatesEntity coordinates;

    @Id
    @Column(name = "idPoliticalParty")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getIdPoliticalParty() {
        return idPoliticalParty;
    }

    public void setIdPoliticalParty(long idPoliticalParty) {
        this.idPoliticalParty = idPoliticalParty;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PoliticalPartyEntity that = (PoliticalPartyEntity) o;

        if (idPoliticalParty != that.idPoliticalParty) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) idPoliticalParty;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Coordinates_idCoordinates", referencedColumnName = "idCoordinates", nullable = false)
    public CoordinatesEntity getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(CoordinatesEntity coordinatesEntity) {
        this.coordinates = coordinatesEntity;
    }
}
