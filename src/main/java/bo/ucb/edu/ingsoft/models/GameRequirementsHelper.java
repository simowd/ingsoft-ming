package bo.ucb.edu.ingsoft.models;

public class GameRequirementsHelper {
    private String operatingSystem;
    private String processor;
    private String memory;
    private String graphics;

    @Override
    public String toString() {
        return "GameRequirementsHelper{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", graphics='" + graphics + '\'' +
                '}';
    }

    public GameRequirementsHelper() {
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }
}
