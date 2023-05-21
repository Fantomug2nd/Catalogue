package kpi.koshovets.Catalogue.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name= "Threshold")
public class Threshold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "good")
    private String good;

    @Column(name = "bad")
    private String bad;

    @Column(name = "optimal")
    private String optimal;

    public Threshold(Long id, String good, String bad, String optimal) {
        this.id = id;
        this.good = good;
        this.bad = bad;
        this.optimal = optimal;
    }

    public Threshold() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGood() {
        return good;
    }

    public void setGood(String good) {
        this.good = good;
    }

    public String getBad() {
        return bad;
    }

    public void setBad(String bad) {
        this.bad = bad;
    }

    public String getOptimal() {
        return optimal;
    }

    public void setOptimal(String optimal) {
        this.optimal = optimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Threshold threshold)) return false;

        return Objects.equals(id, threshold.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
