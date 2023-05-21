package kpi.koshovets.Catalogue.entity;

import jakarta.persistence.*;

@Entity
@Table( name = "Metric_measurement")
public class Measurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "unitt")
    private String unit;

    @Column(name = "ranger")
    private String ranger;

    @Enumerated(EnumType.ORDINAL)
    private Scale scaler;

    @OneToOne(mappedBy = "measurementt")
    private Metric metric;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRanger() {
        return ranger;
    }

    public void setRanger(String range) {
        this.ranger = range;
    }

    public Scale getScaler() {
        return scaler;
    }

    public void setScaler(Scale scale) {
        this.scaler = scale;
    }

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Measurement that)) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
