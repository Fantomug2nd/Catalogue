package kpi.koshovets.Catalogue.dto;

import java.util.List;

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
}
