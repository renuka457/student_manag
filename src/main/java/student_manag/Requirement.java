package student_manag;

public class Requirement {
    private String description;
    private boolean isMandatory;

    public Requirement() {
    }

    public Requirement(String description, boolean isMandatory) {
        this.description = description;
        this.isMandatory = isMandatory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    @Override
    public String toString() {
        return "Requirement{description='" + description + "', isMandatory=" + isMandatory + "}";
    }
}