package kpi.koshovets.Catalogue.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "TOOL")
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "tool")
    private Set<AutomationType> automationTypes;

    @OneToMany(mappedBy = "tool")
    private Set<Tag> tags;

    public Tool() {
    }

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

    public Set<AutomationType> getAutomationTypes() {
        return automationTypes;
    }

    public void setAutomationTypes(Set<AutomationType> automationTypes) {
        this.automationTypes = automationTypes;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }
}
