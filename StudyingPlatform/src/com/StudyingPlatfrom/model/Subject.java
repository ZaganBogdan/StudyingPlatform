package com.StudyingPlatfrom.model;


import java.sql.Date;
import java.time.DayOfWeek;

public class Subject {
    private int id;
    private String name;
    private String description;
    private boolean hasLecture;
    private boolean hasSeminar;
    private boolean hasLab;
    private Date dateStart;
    private Date dateEnd;

    public Subject(int id, String name, String description, boolean hasLecture,
                   boolean hasSeminar, boolean hasLab, Date dateStart, Date dateEnd) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hasLecture = hasLecture;
        this.hasSeminar = hasSeminar;
        this.hasLab = hasLab;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean isHasLecture() {
        return hasLecture;
    }

    public void setHasLecture(boolean hasLecture) {
        this.hasLecture = hasLecture;
    }

    public boolean isHasSeminar() {
        return hasSeminar;
    }

    public void setHasSeminar(boolean hasSeminar) {
        this.hasSeminar = hasSeminar;
    }

    public boolean isHasLab() {
        return hasLab;
    }

    public void setHasLab(boolean hasLab) {
        this.hasLab = hasLab;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}
