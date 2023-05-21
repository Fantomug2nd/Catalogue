package kpi.koshovets.Catalogue.dto;

import java.util.List;
import java.util.Objects;

public class ToolTO {
    private String name;
    private String description;
    private List<TagTO> tags;

    private List<AutomationTypeTO> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TagTO> getTags() {
        return tags;
    }

    public void setTags(List<TagTO> tags) {
        this.tags = tags;
    }

    public List<AutomationTypeTO> getTypes() {
        return types;
    }

    public void setTypes(List<AutomationTypeTO> types) {
        this.types = types;
    }

    public ToolTO() {
    }

    public ToolTO(String name, String description, List<TagTO> tags, List<AutomationTypeTO> types) {
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ToolTO toolTO)) return false;

        if (!Objects.equals(name, toolTO.name)) return false;
        if (!Objects.equals(description, toolTO.description)) return false;
        if (!Objects.equals(tags, toolTO.tags)) return false;
        return Objects.equals(types, toolTO.types);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (types != null ? types.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ToolTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                ", types=" + types +
                '}';
    }
}
