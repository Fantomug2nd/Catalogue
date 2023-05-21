package kpi.koshovets.Catalogue.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Metric")
public class Metric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "goal")
    private String goal;

    @Column(name = "definition")
    private String definition;

    @Column(name = "trend")
    private String trend;

    @ElementCollection(targetClass=Phase.class)
    @Enumerated(EnumType.STRING) // Possibly optional (I'm not sure) but defaults to ORDINAL.
    @CollectionTable(name="metric_phase")
    @Column(name="phase") // Column name in person_interest
    private Set<Phase> phases;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "threshold_id", referencedColumnName = "id")
    private Threshold threshold;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "metric_measurement_id", referencedColumnName = "id")
    private Measurement measurementt;

    @Enumerated(EnumType.ORDINAL)
    private Level level;



    @ManyToMany
    @JoinTable(
            name = "Metrics_tools",
            joinColumns = @JoinColumn(name = "metric_id"),
            inverseJoinColumns = @JoinColumn(name = "tool_id"))
    private Set<Tool> tools;

    @OneToMany(mappedBy = "metric")
    private Set<Consequence> consequences;

    @OneToMany(mappedBy = "metric")
    private Set<Normalization> normalizations;

    @OneToMany(mappedBy = "metric")
    private Set<Usecase> usecases;

    @Enumerated(EnumType.ORDINAL)
    private Classification classification;

    @OneToMany(mappedBy = "metric")
    private Set<Limitation> limitations;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entity_id", referencedColumnName = "id")
    private MetricEntity entity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attribute_id", referencedColumnName = "id")
    private Attribute attribute;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Threshold getThreshold() {
        return threshold;
    }

    public void setThreshold(Threshold threshold) {
        this.threshold = threshold;
    }

    public Measurement getMeasurementt() {
        return measurementt;
    }

    public void setMeasurementt(Measurement measurement) {
        this.measurementt = measurement;
    }

    public Set<Tool> getTools() {
        return tools;
    }

    public void setTools(Set<Tool> tools) {
        this.tools = tools;
    }

    public Set<Consequence> getConsequences() {
        return consequences;
    }

    public void setConsequences(Set<Consequence> consequences) {
        this.consequences = consequences;
    }

    public Set<Normalization> getNormalizations() {
        return normalizations;
    }

    public void setNormalizations(Set<Normalization> normalizations) {
        this.normalizations = normalizations;
    }

    public Set<Usecase> getUsecases() {
        return usecases;
    }

    public void setUsecases(Set<Usecase> usecases) {
        this.usecases = usecases;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public Set<Limitation> getLimitations() {
        return limitations;
    }

    public void setLimitations(Set<Limitation> limitations) {
        this.limitations = limitations;
    }

    public MetricEntity getEntity() {
        return entity;
    }

    public void setEntity(MetricEntity entity) {
        this.entity = entity;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Metric metric)) return false;

        return id.equals(metric.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
