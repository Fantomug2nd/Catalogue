package kpi.koshovets.Catalogue.dto;

import java.util.Objects;

public class TagTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagTO() {
    }

    public TagTO(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TagTO tagTO)) return false;

        return Objects.equals(name, tagTO.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "TagTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
