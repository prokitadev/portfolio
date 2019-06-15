package pl.prokita.portfolio.mongo.model;

import org.bson.types.ObjectId;

public class Projects {

    private ObjectId id;
    private String name;
    private String description;
    private String startdate;
    private boolean finished;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

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

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    @Override
    public String toString() {
        return "Projects{" +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startdate='" + startdate + '\'' +
                ", finished=" + finished +
                '}';
    }

    public Projects() {
    }

    public Projects(String name, String descritpion, String startDate, boolean finished) {
        this.name = name;
        this.description = descritpion;
        this.startdate = startDate;
        this.finished = finished;
    }
}
