package com.hpeu.oa.entity;

import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class Course {

    private int id;

    private String title;

    private String abs;

    private String content;

    private Timestamp putDate;

    private int resourceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs;
    }

    public Timestamp getPutDate() {
        return putDate;
    }

    public void setPutDate(Timestamp putDate) {
        this.putDate = putDate;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}

