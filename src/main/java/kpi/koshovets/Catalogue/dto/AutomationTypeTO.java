package kpi.koshovets.Catalogue.dto;

import java.util.Objects;

public class AutomationTypeTO {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutomationTypeTO() {
    }

    public AutomationTypeTO(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AutomationTypeTO that)) return false;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "AutomationTypeTO{" +
                "name='" + name + '\'' +
                '}';
    }
}
