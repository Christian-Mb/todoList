package entity;

import java.util.Date;

public class Task {

    private int id;
    private String description;
    private Date createdAt;
    private Date endedAt;
    private Boolean status;

    public Task() {
    }

    public Task(int id, String description, Date createdAt, Date endedAt, Boolean status) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.endedAt = endedAt;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
